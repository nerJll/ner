/**
 * 
 */
/**
 * @author aknb206
 *
 */
package com.aiko.payin.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aiko.common.exception.ServiceException;
import com.aiko.common.util.CommonUtils;
import com.aiko.common.util.SystemApi;
import com.aiko.pact.dto.AikoContract;
import com.aiko.payplan.model.PayPlan;
import com.aiko.payin.dao.PayInDao;
import com.aiko.payin.model.PayIn;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PayInService{
	@Autowired
	private PayInDao payInDao;

	public PageInfo<AikoContract> findContractList(Map<String, Object> params,int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<AikoContract> contract=payInDao.findContractList(params);
		
		return new PageInfo<AikoContract>(contract);
	}

	public PageInfo<PayPlan> findPayPlanList(Map<String, Object> params,int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<PayPlan> payplan=payInDao.findPayPlanList(params);
		return new PageInfo<PayPlan>(payplan);
	}

	public PageInfo<PayIn> findPayInList(Map<String, Object> params,
			int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<PayIn> payin=payInDao.findPayInList(params);
		return new PageInfo<PayIn>(payin);
	}

	@Transactional
	public void addPayIn(PayIn payin) {
		/*Map<Object, Object> user=SystemApi.getCurrentUser();
		String username=user.get("name").toString();
		String userid=user.get("userid").toString();*/
		payin.setCreate_user_id("1013608"); 
		payin.setCreate_user_name("谢锦伟");
		payin.setStatus("待确认");
		payin.setId(CommonUtils.getSequence());
		payin.setPay_in_no("JK"+payin.getId());
		payInDao.addPayIn(payin);
	}
	
	@Transactional
	public void deletePayin(String id){
		payInDao.deletePayin(id);
	}
	
	@Transactional
	public void deletePayin(String[] ids) {
		for (int i = 0, len = (ids == null ? 0 : ids.length); i < len; i++) {
			deletePayin(ids[i]);
		}		
	}

	@Transactional
	public void auditPayin(String[] ids,String oper) {
		//获取当前登录人
		/*Map<Object, Object> user=SystemApi.getCurrentUser();
		String username=user.get("name").toString();
		String userid=user.get("userid").toString();*/
		//查询所有待确认的解款单
		Map<String, Object> params = new HashMap<String, Object>(4);
		params.put("ids", ids);
		params.put("status","待确认");
		List<PayIn> list=payInDao.findPayInByIds(params);
		params.clear();
		String operStatus="已拒绝";
		if("confirm".equals(oper)){
			operStatus="已确认";
		}
		String userid="1013608";
		String username="谢锦伟";
		Date now=new Date();
		int row=0;
		for(PayIn payin:list){				
			payin.setStatus(operStatus);
			payin.setAudit_user_id(userid);
			payin.setAudit_user_name(username);
			payin.setAudit_dt(now);
			row=payInDao.updatePayInAudit(payin);
			if(1==row && "confirm".equals(oper)){//确认成功,
				//1.更新还款计划
				//查询该合同号 下等于大于该计划号的没冲销完成(未收金额>0)的所有还款计划
				params.put("contract_no",payin.getContract_no());
				params.put("where"," plan_num>="+payin.getPlan_num()+" and rest_amount>0");				
				List<PayPlan> planList=payInDao.findPayPlanList(params);
				
				if(planList==null||planList.isEmpty()){
					throw new ServiceException("解款单"+payin.getPay_in_no()+"没有对应的还款计划");
				}
				BigDecimal curReceiptAmount= payin.getReceipt_amount();//回款金额
				BigDecimal realReceiptAmount=curReceiptAmount;
				boolean firstStation=false;
				for(int i=0;i<planList.size();i++){
					PayPlan payplan=planList.get(i);
					BigDecimal paidAmount=payplan.getPaid_amount();//实收金额
					BigDecimal restAmount=payplan.getRest_amount();//未收金额
					//优先对当前计划号的还款计划冲销，
					//第一种场景：回款金额小于等于未收金额
					if(curReceiptAmount.compareTo(restAmount)<=0){
						//更新实收金额+=回款金额，未收金额-=回款金额，						
						payplan.setPaid_amount(paidAmount.add(curReceiptAmount));
						payplan.setRest_amount(restAmount.subtract(curReceiptAmount));						
						row=payInDao.updatePayPlanAudit(payplan);
						if(0==row){
							throw new ServiceException("还款计划（计划号："+payplan.getPlan_num()+"，计划编码："+payplan.getPlan_no()+"）不能同一时间被解款，请稍后再尝试");
						}
						//2.还款计划为分期付款,则更新客户信贷
						if("分期款".equals(payplan.getPayment_type())){
							
						}
						break;
					}else{//第二种场景：回款金额大于未收金额,
						//没有下一条还款计划
						if(i==planList.size()-1){							
							//更新实收金额+=回款金额,未收金额=0
							payplan.setPaid_amount(paidAmount.add(curReceiptAmount));
							payplan.setRest_amount(new BigDecimal(0));
							row=payInDao.updatePayPlanAudit(payplan);
							if(0==row){
								throw new ServiceException("还款计划（计划号："+payplan.getPlan_num()+"，计划编码："+payplan.getPlan_no()+"）不能同一时间被解款，请稍后再尝试");
							}
							//2.还款计划为分期付款,则更新客户信贷
							if("分期款".equals(payplan.getPayment_type())){
								
							}
						}else{//还有下一条还款计划
							//更新实收金额+=未收金额，回款金额-=未收金额，未收金额=0
							payplan.setPaid_amount(paidAmount.add(restAmount));
							payplan.setRest_amount(new BigDecimal(0));
							row=payInDao.updatePayPlanAudit(payplan);
							if(0==row){
								throw new ServiceException("还款计划（计划号："+payplan.getPlan_num()+"，计划编码："+payplan.getPlan_no()+"）不能同一时间被解款，请稍后再尝试");
							}
							//2.还款计划为分期付款,则更新客户信贷
							if("分期款".equals(payplan.getPayment_type())){
								
							}
							//实际回款金额=未收金额，剩余回款金额冲销到下一条还款计划
							realReceiptAmount=restAmount;
							curReceiptAmount=curReceiptAmount.subtract(restAmount);
							
						}											
						
					}
					
					//增加一条对应的冲销记录到表aiko_jk_to_hk_real
				}
				
				
				
				
				
				 
			}
		}
	}
	
}