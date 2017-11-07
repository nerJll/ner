package com.aiko.deliveryplan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aiko.common.util.IDUtils;
import com.aiko.deliveryplan.dao.AikoDeliveryPlanMapper;
import com.aiko.deliveryplan.dto.AikoDeliveryPlan;
import com.aiko.deliveryplan.dto.AikoDeliveryPlanExample;
import com.aiko.deliveryplan.dto.AikoDeliveryPlanExample.Criteria;

@Service
public class DeliveryPlanService {
	@Autowired
	private AikoDeliveryPlanMapper planDAO;
	
	/**
	 * 新增交货计划
	 * @param plan 计划Obj
	 */
	@Transactional
	public void savePlan(AikoDeliveryPlan plan) {
		// 赋初值
		String id = IDUtils.getUuid(true);
		plan.setDeliveryPlanId(id);
		planDAO.insertSelective(plan);
	}
	
	/**
	 * 根据标的Id查询所有交货计划
	 * @param dId 合同标的Id
	 * @return 交货计划合集
	 */
	public List<AikoDeliveryPlan> getPlanList(String dId) {
		 AikoDeliveryPlanExample example = new AikoDeliveryPlanExample();
		 example.createCriteria().andResOneEqualTo(dId);
		 return planDAO.selectByExample(example);
	}
	
}
