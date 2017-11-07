/**
 * 
 */
/**
 * @author aknb206
 *
 */
package com.aiko.payin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.aiko.pact.dto.AikoContract;
import com.aiko.payin.model.PayIn;
import com.aiko.payplan.model.PayPlan;

@Mapper
public interface PayInDao{

	List<AikoContract> findContractList(Map<String, Object> params);

	List<PayPlan> findPayPlanList(Map<String, Object> params);

	List<PayIn> findPayInList(Map<String, Object> params);
	
	List<PayIn> findPayInByIds(Map<String, Object> params);

	void addPayIn(PayIn payin);

	void deletePayin(String id);
	
	int updatePayInAudit(PayIn payin);

	int updatePayPlanAudit(PayPlan payplan);
}