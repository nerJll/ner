package com.aiko.payin.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.ajax.AjaxObject;
import com.aiko.common.easyui.EasyUI;
import com.aiko.common.exception.ServiceException;
import com.aiko.pact.dto.AikoContract;
import com.aiko.payin.model.PayIn;
import com.aiko.payin.service.PayInService;
import com.aiko.payplan.model.PayPlan;
import com.github.pagehelper.PageInfo;

/** 
 * @author 作者 : aknb206
 * @version 创建时间：2017年10月24日 上午8:29:41 
 * 类说明 
 */
@Controller
public class PayInController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PayInService payInService;
	
	@RequestMapping(value="/payin/main-view")
	public String jkMainView(){
		return "/aiko-crm/payin/main-view";
	}
	
	@RequestMapping(value="/payin/add-view")
	public String addView(){
		return "/aiko-crm/payin/add-view";
	}
	
	@RequestMapping(value="/payin/list-view")
	public String listView(){
		return "/aiko-crm/payin/list-view";
	}
	
	@RequestMapping(value="/payin/add")
	@ResponseBody
	public AjaxObject add(PayIn payin){
		AjaxObject returnVal = new AjaxObject();
		try{
			payInService.addPayIn(payin);
			
			returnVal.success();
		}catch(Throwable e){
			logger.error("添加解款单过程中出现异常", e);
			returnVal.fail();
		}
		return returnVal;
	}
	
	@RequestMapping(value="/payin/contract-list")
	@ResponseBody
	public AjaxObject contractList(
			@RequestParam(name="customerCode",required=false) String customerCode,
			@RequestParam(name = "customerName", required = false) String customerName,
			@RequestParam(name = "contractNo", required = false) String contractNo,
			@RequestParam(name = "startDate", required = false) String startDate,
			@RequestParam(name = "endDate", required = false) String endDate,
			@RequestParam(name = "page", defaultValue = "1", required = false) int currentPage,
			@RequestParam(name = "rows", defaultValue = "10", required = false) int pageSize
		){
			AjaxObject returnVal = new AjaxObject();
		try{
			//查询参数
			Map<String, Object> params = new HashMap<String, Object>(4);
			params.put("customerCode", customerCode);
			params.put("customerName", customerName);
			params.put("contractNo", contractNo);
			params.put("startDate", startDate);
			params.put("endDate", endDate);
			
			//查询结果
			PageInfo<AikoContract> contract=payInService.findContractList(params,currentPage,pageSize);
			EasyUI easy = new EasyUI();
			easy.setTotal(contract.getTotal());
			easy.setRows(contract.getList());
			
			//返回结果
			Map<String, Object> data = new HashMap<String, Object>(4);
			data.put("params", params);
			data.put("webp", easy);
			
			returnVal.success(data);
		} catch(ServiceException e){
			returnVal.fail(e.getMessage(), null);
		}catch (Throwable e) {
			returnVal.fail("销售合同信息加载失败!", null);
			logger.error("销售合同信息加载失败!", e);
		}				
		
		return returnVal;		
	}
	
	@RequestMapping(value="/payin/payplan-list")
	@ResponseBody
	public AjaxObject payPlanList(
			@RequestParam(name = "contract_no", required = false) String contract_no,
			@RequestParam(name = "page", defaultValue = "1", required = false) int currentPage,
			@RequestParam(name = "rows", defaultValue = "10", required = false) int pageSize
		){
			//Map<String,Object> returnVal=new HashMap<String,Object>();
			AjaxObject returnVal = new AjaxObject();
		try{
			//查询参数
			Map<String, Object> params = new HashMap<String, Object>(4);
			params.put("contract_no", contract_no);
			
			//查询结果
			PageInfo<PayPlan> payplan=payInService.findPayPlanList(params,currentPage,pageSize);
			EasyUI easy = new EasyUI();
			easy.setTotal(payplan.getTotal());
			easy.setRows(payplan.getList());
			
			//返回结果
			//Map<String, Object> data = new HashMap<String, Object>(4);
			/*returnVal.put("status", 1);
			returnVal.put("message","操作成功");
			returnVal.put("total",payplan.getTotal());
			returnVal.put("data",payplan.getList());*/
			Map<String, Object> data = new HashMap<String, Object>(4);
			data.put("params", params);
			data.put("webp", easy);			
			returnVal.success(data);
		}catch(ServiceException e){
			returnVal.fail(e.getMessage(), null);
		}catch (Throwable e) {
			returnVal.fail("还款计划信息加载失败!", null);
			logger.error("还款计划信息加载失败!", e);
		}				
		
		return returnVal;		
	}
	
	@RequestMapping(value="/payin/payin-list")
	@ResponseBody
	public AjaxObject payInList(			
			@RequestParam(name="customer_no",required=false) String customer_no,			
			@RequestParam(name="customer_name",required=false) String customer_name,			
			@RequestParam(name="contract_no",required=false) String contract_no,			
			@RequestParam(name="pro_no",required=false) String pro_no,
			@RequestParam(name="employee",required=false) String employee,
			@RequestParam(name="plan_no",required=false) String plan_no,
			@RequestParam(name = "plan_num", required = false) String plan_num,
			@RequestParam(name = "page", defaultValue = "1", required = false) int currentPage,
			@RequestParam(name = "rows", defaultValue = "10", required = false) int pageSize
		){
			AjaxObject returnVal = new AjaxObject();
		try{
			//查询参数
			Map<String, Object> params = new HashMap<String, Object>(4);
			params.put("plan_no", plan_no);
			params.put("plan_num", plan_num);
			params.put("customer_no", customer_no);
			params.put("customer_name", customer_name);
			params.put("contract_no", contract_no);
			params.put("pro_no", pro_no);
			params.put("employee", employee);
			
			//查询结果
			PageInfo<PayIn> contract=payInService.findPayInList(params,currentPage,pageSize);
			EasyUI easy = new EasyUI();
			easy.setTotal(contract.getTotal());
			easy.setRows(contract.getList());
			
			//返回结果
			Map<String, Object> data = new HashMap<String, Object>(4);
			data.put("params", params);
			data.put("webp", easy);
			
			returnVal.success(data);
		}catch(ServiceException e){
			returnVal.fail(e.getMessage(), null);
		}catch (Throwable e) {
			returnVal.fail("解款单信息加载失败!", null);
			logger.error("解款单信息加载失败!", e);
		}				
		
		return returnVal;		
	}
	
	@RequestMapping(value="/payin/delete")
	@ResponseBody
	public AjaxObject payInDelete(@RequestParam(value = "ids[]") String ids[]){
		AjaxObject returnVal = new AjaxObject();
		try{			
			payInService.deletePayin(ids);
			returnVal.success();
		}catch(ServiceException e){
			returnVal.fail(e.getMessage(), null);
		}catch (Throwable e) {
			returnVal.fail("解款单删除失败!", null);
			logger.error("解款单删除失败!", e);
		}						
		return returnVal;			
	}
	
	@RequestMapping(value="/payin/aduit")
	@ResponseBody
	public AjaxObject payInAudit(
			@RequestParam(value = "ids[]") String ids[],
			@RequestParam(name = "oper") String oper
			){
		AjaxObject returnVal = new AjaxObject();
		try{
			payInService.auditPayin(ids,oper);
			
			returnVal.success();
		}catch(ServiceException e){
			returnVal.fail(e.getMessage(), null);
		}catch (Throwable e) {
			returnVal.fail("解款单确认失败!", null);
			logger.error("解款单确认失败!", e);
		}						
		return returnVal;			
	}
	
}
