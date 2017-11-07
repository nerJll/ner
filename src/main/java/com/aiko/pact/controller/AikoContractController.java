package com.aiko.pact.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.easyui.EasyUI;
import com.aiko.common.util.AjaxObject;
import com.aiko.common.util.DateUtil;
import com.aiko.common.util.IDUtils;
import com.aiko.common.util.OAUtils;
import com.aiko.pact.dao.AikoContractMapper;
import com.aiko.pact.dto.AikoContract;
import com.aiko.pact.dto.AikoContractExample;
import com.aiko.pact.dto.AikoContractExample.Criteria;
import com.aiko.pact.service.AikoContractService;
import com.aiko.pactdetail.dao.AikoContractDetailMapper;
import com.aiko.pactdetail.dto.AikoContractDetail;
import com.aiko.pactdetail.dto.AikoContractDetailExample;
import com.aiko.pactdetail.service.AikoContractDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author RenBowen
 * @date 2017年10月18日-下午1:42:26
 * @since 1.0.0
 * @aiko-crm
 */
@Controller
@RequestMapping("contract")
public class AikoContractController {
	@Autowired
	private AikoContractService contractService;
	@Autowired
	private AikoContractMapper contractDAO;
	@Autowired
	private AikoContractDetailService detailService;
	@Autowired
	private AikoContractDetailMapper detailDao;

	@GetMapping("/listAllContract")
	@ResponseBody
	public EasyUI listAllContract(@RequestParam(name = "page") Integer pageNum,
			@RequestParam(name = "rows") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<AikoContract> list = contractService.listAllContract();
		PageInfo<AikoContract> pageInfo = new PageInfo<AikoContract>(list);
		EasyUI dataGridPage = new EasyUI();
		dataGridPage.setTotal(pageInfo.getTotal());
		dataGridPage.setRows(pageInfo.getList());
		return dataGridPage;
	}

	@GetMapping("/findContractSelective")
	@ResponseBody
	public EasyUI findContractSelective(@RequestParam(name = "saleorg", required = false) String saleorg,
			@RequestParam(name = "pactno", required = false) String pactno,
			@RequestParam(name = "purno", required = false) String purno,
			@RequestParam(name = "prono", required = false) String prono,
			@RequestParam(name = "custom", required = false) String custom,
			@RequestParam(name = "state", required = false) String state,
			@RequestParam(name = "statime", required = false) String statime,
			@RequestParam(name = "endtime", required = false) String endtime,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer pageNum,
			@RequestParam(name = "rows", required = false, defaultValue = "10") Integer pageSize) {
		AikoContractExample example = new AikoContractExample();
		example.setOrderByClause("CREATE_TIME DESC");
		Criteria cc = example.createCriteria();
		// 传参拼接判断
		if (saleorg != null && !saleorg.trim().isEmpty())
			cc.andSaleOrgLike(saleorg);
		if (state != null && !state.trim().isEmpty())
			cc.andStateEqualTo(state);
		if (pactno != null && !pactno.trim().isEmpty())
			cc.andContractNoEqualTo(pactno);
		if (purno != null && !purno.trim().isEmpty())
			cc.andPurchaseNoEqualTo(purno);
		if (prono != null && !prono.trim().isEmpty())
			cc.andProNoEqualTo(prono);
		if (custom != null && !custom.trim().isEmpty())
			cc.andCustomerNameLike(custom);
		if (statime != null && endtime != null && !statime.trim().isEmpty() && !endtime.trim().isEmpty()) {
			if (statime.equals(endtime)) {
				cc.andCreateTimeBetween(DateUtil.getDateFormat(statime + " 00:00:00"),
						DateUtil.getDateFormat(endtime + " 23:59:59"));
			} else {
				cc.andCreateTimeBetween(DateUtil.getDateFormat(statime), DateUtil.getDateFormat(endtime));
			}
		}
		// 分页
		PageHelper.startPage(pageNum, pageSize);
		List<AikoContract> list = contractDAO.selectByExample(example);
		PageInfo<AikoContract> pageInfo = new PageInfo<AikoContract>(list);
		// 设置分页
		EasyUI dataGridPage = new EasyUI();
		dataGridPage.setTotal(pageInfo.getTotal());
		dataGridPage.setRows(pageInfo.getList());
		return dataGridPage;
	}

	@PostMapping("insertContract")
	@ResponseBody
	public AjaxObject insertContract(AikoContract recod, HttpServletRequest req) {
		String cId = IDUtils.getUuid(true);
		recod.setContractId(cId);
		AjaxObject ajax = new AjaxObject();
		String[] silicons = req.getParameterValues("silicon");
		String[] mainGrids = req.getParameterValues("mainGrid");
		String[] techs = req.getParameterValues("tech");
		String[] convertRates = req.getParameterValues("convertRate");
		String[] grades = req.getParameterValues("grade");
		String[] mounts = req.getParameterValues("mount");
		String[] units = req.getParameterValues("unit");
		String[] unitCosts = req.getParameterValues("unitCost");
		String[] sums = req.getParameterValues("sum");
		String[] detailNos = req.getParameterValues("materielNo");

		// 一对多插入
		if (silicons != null) {
			for (int i = 0; i < silicons.length; i++) {
				AikoContractDetail detail = new AikoContractDetail();
				detail.setContractId(cId);
				detail.setSilicon(silicons[i]);
				detail.setMainGrid(mainGrids[i]);
				detail.setTech(techs[i]);
				detail.setConvertRate(convertRates[i]);
				detail.setGrade(grades[i]);
				detail.setMount(Integer.valueOf(mounts[i]));
				detail.setUnit(units[i]);
				detail.setUnitCost(Double.valueOf(unitCosts[i]));
				detail.setSum(Double.valueOf(sums[i]));
				detail.setContractDetailNo(detailNos[i]);
				detailService.insertContractDetail(detail);
			}
		}
		// 总金额
		Double allSum = 0.0;
		if (sums != null) {
			for (int i = 0; i < sums.length; i++) {
				allSum += Double.valueOf(sums[i]); // Double.valueOf(unitCosts[i])
			}
		}

		recod.setSum(allSum);
		try {
			String[] cn = recod.getCustomerName().split(" ");
			recod.setCustomerNo(cn[0]);
			recod.setCustomerName(cn[1]);
			contractService.insertAikoContract(recod);

			AikoContract con1 = contractService.findContractById(cId);
			if (con1.getContractType().equals("框架协议")) {
				OAUtils.kJXY(con1);
			} else {
				AikoContractDetailExample exap = new AikoContractDetailExample();
				exap.createCriteria().andContractIdEqualTo(cId);
				List<AikoContractDetail> details1 = detailDao.selectByExample(exap);
				OAUtils.chuFaOA(con1, details1);
			}

			ajax.set("1", "插入成功", null);
			return ajax;
		} catch (Exception e) {
			ajax.set("0", "插入失败", null);
			return ajax;
		}
	}

	/**
	 * 根据Id查询合同
	 * 
	 * @param id
	 *            合同Id
	 * @return 合同Obj
	 */
	@RequestMapping("to-update/{id}")
	@ResponseBody
	public AjaxObject toUpdate(@PathVariable(name = "id") String id) {
		AjaxObject ajax = new AjaxObject();
		try {
			AikoContract findContractById = contractService.findContractById(id);
			ajax.success(findContractById);
			return ajax;
		} catch (Exception e) {
			ajax.fail();
			return ajax;
		}
	}

	/**
	 * 更新方法
	 * 
	 * @param recod
	 * @return
	 */
	@RequestMapping("updateContract")
	@ResponseBody
	public AjaxObject updateContract(AikoContract recod, HttpServletRequest req) {
		String cId = recod.getContractId();
		AjaxObject ajax = new AjaxObject();
		String[] silicons = req.getParameterValues("silicon");
		String[] mainGrids = req.getParameterValues("mainGrid");
		String[] techs = req.getParameterValues("tech");
		String[] convertRates = req.getParameterValues("convertRate");
		String[] grades = req.getParameterValues("grade");
		String[] mounts = req.getParameterValues("mount");
		String[] units = req.getParameterValues("unit");
		String[] unitCosts = req.getParameterValues("unitCost");
		String[] sums = req.getParameterValues("sum");
		String[] ids = req.getParameterValues("contractDetailId");
		String[] detailNos = req.getParameterValues("materielNo");
		Double allSum = 0.0;
		if (sums != null) {
			for (int i = 0; i < sums.length; i++) {
				allSum += Double.valueOf(sums[i]); // Double.valueOf(unitCosts[i])
			}
		}
		if (silicons != null) {
			for (int i = 0; i < silicons.length; i++) {
				AikoContractDetail detail = new AikoContractDetail();
				detail.setContractId(cId);
				detail.setContractDetailId(ids[i]);
				detail.setSilicon(silicons[i]);
				detail.setMainGrid(mainGrids[i]);
				detail.setTech(techs[i]);
				detail.setConvertRate(convertRates[i]);
				detail.setGrade(grades[i]);
				detail.setMount(Integer.valueOf(mounts[i]));
				detail.setUnit(units[i]);
				detail.setUnitCost(Double.valueOf(unitCosts[i]));
				detail.setSum(Double.valueOf(sums[i]));
				detail.setContractDetailNo(detailNos[i]);
				// 累加总金额
				allSum += Double.valueOf(sums[i]);
				// id为空则新增,否则条件更新
				if (ids[i].equals("ooo")) {
					detailService.insertContractDetail(detail);
				} else {
					detailService.updateContractDetail(detail);
				}
			}
		}
		recod.setSum(allSum);
		try {
			String[] cn = recod.getCustomerName().split(" ");
			recod.setCustomerNo(cn[0]);
			recod.setCustomerName(cn[1]);
			contractService.updateAikoContract(recod);

			// 出发OA流
			AikoContract con1 = contractService.findContractById(cId);
			AikoContractDetailExample exap = new AikoContractDetailExample();
			exap.createCriteria().andContractIdEqualTo(cId);
			List<AikoContractDetail> details1 = detailDao.selectByExample(exap);
			OAUtils.buChongBG(con1, details1);

			ajax.success();
			return ajax;
		} catch (Exception e) {
			ajax.fail();
			return ajax;
		}
	}
}
