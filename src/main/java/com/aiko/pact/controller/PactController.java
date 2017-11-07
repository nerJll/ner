package com.aiko.pact.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.easyui.EasyUI;
import com.aiko.common.util.DateUtil;
import com.aiko.deliveryplan.dto.AikoDeliveryPlan;
import com.aiko.deliveryplan.service.DeliveryPlanService;
import com.aiko.pact.dto.AikoContract;
import com.aiko.pact.service.AikoContractService;
import com.aiko.pactdetail.dto.AikoContractDetail;
import com.aiko.pactdetail.dto.AikoContractDetailExample;
import com.aiko.pactdetail.service.AikoContractDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author 作者 : aknb206
 * @version 创建时间：2017年10月10日 下午3:45:01 合同管理
 */
@Controller
@CrossOrigin("*")
@RequestMapping("/pact")
public class PactController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private static String modiContractID;
	private static String showContractID;
	@Autowired
	private AikoContractService contractService;
	@Autowired
	private AikoContractDetailService detailService; 
	@Autowired
	private DeliveryPlanService planService;
	@Autowired
    private RedisTemplate<String,Object> redisTemplate;

	@RequestMapping("/index")
	public String index() {
		return "pact/index";
	}

	@GetMapping("/getfalseplan")
	@ResponseBody
	public EasyUI getFalsePlan(@RequestParam(name = "page") Integer pageNum,
			@RequestParam(name = "rows") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<AikoDeliveryPlan> pageInfo = new PageInfo<>(getFlasePlan());
		EasyUI dataGridPage = new EasyUI();
		dataGridPage.setTotal(pageInfo.getTotal());
		dataGridPage.setRows(pageInfo.getList());
		return dataGridPage;
	}

	@GetMapping("/toaddpact")
	public String toAddPact() {
		return "pact/addPact";
	}

	@GetMapping("/modipact/{contractId}")
	public String modiPact(@PathVariable("contractId") String contractId) {
		// AikoContract contract = contractService.findContractById(contractId);
		// System.out.println(contract);
		// model.addAttribute("contract",contract);
		modiContractID = contractId;
		return "pact/modiPact";
	}

	@GetMapping("/showModiPact")
	@ResponseBody
	public AikoContract showModiContract() {
		AikoContract contract = contractService.findContractById(modiContractID);
		return contract;
	}

	@GetMapping("/getpact/{contractId}")
	public String getpact(@PathVariable("contractId") String contractId) {
		// AikoContract contract = contractService.findContractById(contractId);
		// System.out.println(contract);
		// model.addAttribute("contract",contract);
		showContractID = contractId;
		return "pact/showPactInfo";
	}

	@GetMapping("/showPact")
	@ResponseBody
	public AikoContract getContract() {
		AikoContract contract = contractService.findContractById(showContractID);
		return contract;
	}

	@GetMapping("/getDetail/{contractId}")
	@ResponseBody
	public EasyUI getDetail(@PathVariable("contractId") String contractId, 
			@RequestParam(name = "page") Integer pageNum,
			@RequestParam(name = "rows") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		AikoContract cons = contractService.findContractById(contractId);
		PageInfo<AikoContractDetail> pageInfo = new PageInfo<>(cons.getPactItem());
		EasyUI dataGridPage = new EasyUI();
		dataGridPage.setTotal(pageInfo.getTotal());
		dataGridPage.setRows(pageInfo.getList());
		return dataGridPage;
	}
	
	@GetMapping("/getDetails/{contractId}")
	@ResponseBody
	public List<AikoContractDetail> getDetails(@PathVariable("contractId") String contractId) {
		AikoContractDetailExample exp = new AikoContractDetailExample();
		exp.createCriteria().andContractIdEqualTo(contractId);
		return detailService.listContractDetail(exp);
	}

	@GetMapping("/getSavePath")
	@ResponseBody
	public String getSavePath(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String datePath = sdf.format(new Date());
		//String path = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "files/";
		String path = "E:\\spring-cloud\\common\\" + datePath +"\\";
		return path;
	}
	
	@RequestMapping(value = "/getSavePathTest")
	public void getSavePath(HttpServletRequest request,@RequestParam(name="requestid", required = false) String requestId,HttpServletResponse response) throws Exception {	
		try {
			System.out.println("============"+requestId);
	        response.setContentType("text/plain");  
	        response.setHeader("Pragma", "No-cache");  
	        response.setHeader("Cache-Control", "no-cache");  
	        response.setDateHeader("Expires", 0);  
	        Map<String,String> map = new HashMap<String,String>();   
	        map.put("result", "success");  
	        map.put("requestId", "返回id:"+requestId);  
	        PrintWriter out = response.getWriter();       
	        JSONObject resultJSON = JSONObject.fromObject(map); //根据需要拼装json  
	        String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数  
	        out.println(jsonpCallback+"("+resultJSON.toString(1,1)+")");//返回jsonp格式数据  
	        out.flush();  
	        out.close();  
	      } catch (IOException e) {  
	       e.printStackTrace();  
	      }  
	}
	
	@GetMapping("/showProNo")
	public String getCustmer(){
		return "pact/showProNo";
	}
	
	@GetMapping("/getfalseplan1")
	@ResponseBody
	public List<AikoDeliveryPlan> getFlasePlan1() {
		List<AikoDeliveryPlan> plans = getFlasePlan();
		return plans;
	}
	
	@RequestMapping(value = "/putPactInfo")
	//@ResponseBody
	//空串 thisaspaciecalpage
	public void putPactInfo(@RequestParam("contractId")String contractId,
			 @RequestParam(name="contractState")String contractState,
			 @RequestParam(name="contractDetailId[]",required=false) String[] ids,
			 @RequestParam(name="contractPlans[]",required=false) String[] plans,
			 HttpServletRequest request,
			 @RequestParam(name="requestid", required = false) String requestId,
			 HttpServletResponse response){
		try{
			/*System.out.println(contractId);
			System.out.println(contractState);
			System.out.println(ids.length);
			System.out.println(plans.length);*/
			AikoContract contract = contractService.findContractById(contractId);
			contract.setState(contractState);
			contractService.updateAikoContract(contract);
			
			if(plans != null){
				AikoDeliveryPlan plan = new AikoDeliveryPlan();
				AikoContractDetailExample dex = new AikoContractDetailExample();
				for(int i=0; i<plans.length; i++){
						String[] aPlan = plans[i].split(",");
						String PlanDate = aPlan[0].equals("thisaspaciecalpage")?"":aPlan[0];
						plan.setPlanDate(PlanDate.equals("")?null:DateUtil.getDateFormat(PlanDate));
						plan.setMount(Integer.parseInt(aPlan[1]));
						plan.setUnit(aPlan[2]);
						plan.setPlanNo(i+1);
						plan.setResOne(ids[Integer.parseInt(aPlan[3])-1]);
						dex.createCriteria().andContractDetailIdEqualTo(ids[Integer.parseInt(aPlan[3])-1]);
						AikoContractDetail dt = detailService.listContractDetail(dex).get(0);
						/*plan.setContractItem(dt.getContractDetailNo());
						plan.setMaterielNo(dt.getMaterielNo());
						plan.setMaterielDes(dt.getMaterielDes());*/
						plan.setUnitPrice(dt.getUnitCost());
						plan.setSum(dt.getSum());
						planService.savePlan(plan);
				}
			}
			 response.setContentType("text/plain");  
		        response.setHeader("Pragma", "No-cache");  
		        response.setHeader("Cache-Control", "no-cache");  
		        response.setDateHeader("Expires", 0);  
		        Map<String,String> map = new HashMap<String,String>();   
		        map.put("result", "success");  
		        map.put("requestId", "返回id:"+requestId);  
		        PrintWriter out = response.getWriter();       
		        JSONObject resultJSON = JSONObject.fromObject(map); //根据需要拼装json  
		        String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数  
		        out.println(jsonpCallback+"("+resultJSON.toString(1,1)+")");//返回jsonp格式数据  
		        out.flush();  
		        out.close();  
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//获取redis数据
	@GetMapping("/getRedisData/{id}")
	@ResponseBody
	public Object getRedisData(@PathVariable("id")String id){
		try{
			ValueOperations<String, Object> operations=redisTemplate.opsForValue();
			Object obj = operations.get(id);
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return "失败";
		}
	}
	
	/*//提交OA
	@GetMapping("/cufaoa")
	public void cuFaOa() throws Exception{
		OAUtils.oaSetContractValue(contract);
	}*/
	
	// 假数据
	private static List<AikoDeliveryPlan> getFlasePlan() {
		AikoDeliveryPlan plan = new AikoDeliveryPlan();
		plan.setContractItem("aaa");
		plan.setDeliveryOrderNo("bbb");
		plan.setDeliveryPlanId("ccc1");
		plan.setMaterielDes("ddd");
		plan.setMaterielNo("eee");
		plan.setMount(11);
		plan.setPlanDate(new Date());
		plan.setPlanNo(22);
		plan.setSalesOrderNo("fff");
		plan.setSum(33.33);
		plan.setUnit("ggg");
		plan.setUnitPrice(44.444);
		List<AikoDeliveryPlan> list = new ArrayList<>();
		list.add(plan);
		for (int i = 2; i < 9; i++) {
			plan.setDeliveryPlanId("ccc" + i);
			plan.setPlanNo(i * 10 + i);
			list.add(plan);
		}
		return list;
	}

	
	
}