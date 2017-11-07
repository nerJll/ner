package com.aiko.pact.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aiko.pact.dao.AikoContractMapper;
import com.aiko.pact.dto.AikoContract;
import com.aiko.pact.dto.AikoContractExample;
import com.aiko.pactdetail.dao.AikoContractDetailMapper;
import com.aiko.pactdetail.dto.AikoContractDetail;
import com.aiko.pactdetail.dto.AikoContractDetailExample;
import com.aiko.pactdetail.dto.AikoContractDetailExample.Criteria;

/**
 * @author RenBowen
 * @date 2017年10月12日-上午10:31:18
 * @since 1.0.0
 * @aiko-crm
 */
@Service
public class AikoContractService {
	@Autowired
	private AikoContractMapper aikoContractDAO;
	
	@Autowired
	private AikoContractDetailMapper detailDAO;
	
	/**
	 * 新增合同
	 * @param recod 合同对象
	 */
	@Transactional
	public void insertAikoContract(AikoContract recod) {
		recod.setCreateTime(new Date());
		recod.setState("审批中");
		aikoContractDAO.insertSelective(recod);
	}
	
	/**
	 * 修改合同
	 * @param recod 合同对象
	 */
	@Transactional
	public void updateAikoContract(AikoContract recod) {
		aikoContractDAO.updateByPrimaryKeySelective(recod);
	}
	
	/**
	 * 根据id查找合同
	 * @param id 合同id
	 * @return 合同对象
	 */
	public AikoContract findContractById(String id) {
		AikoContract contract = aikoContractDAO.selectByPrimaryKey(id);
		// 外键查询一对多赋值
		AikoContractDetailExample example = new AikoContractDetailExample();
		Criteria cc = example.createCriteria();
		cc.andContractIdEqualTo(id);
		List<AikoContractDetail> detailList = detailDAO.selectByExample(example);
		// 合同标的
		contract.setPactItem(detailList);
		return contract;
	}
	
	/**
	 * 遍历全部合同 
	 * @return 合同集合
	 */
	public List<AikoContract> listAllContract() {
		AikoContractExample example = new AikoContractExample();
		example.setOrderByClause("CREATE_TIME DESC");
		return aikoContractDAO.selectByExample(example);
	}
}
