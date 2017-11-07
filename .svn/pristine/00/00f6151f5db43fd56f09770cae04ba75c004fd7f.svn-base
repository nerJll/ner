package com.aiko.credit.controller;


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
import com.aiko.credit.model.Credit;
import com.aiko.credit.service.CreditService;
import com.github.pagehelper.PageInfo;

@Controller
public class CreditController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private CreditService creditService;
	
	@RequestMapping(value = "/credit/get")
	@ResponseBody
	public AjaxObject get(@RequestParam(name = "id", required = true) String id) {
		AjaxObject returnVal = new AjaxObject();
		try {
			returnVal.success(creditService.getCredit(id));
		} catch (ServiceException e) {
			returnVal.fail(e.getMessage(), null);
		} catch (Throwable e) {
			returnVal.fail();
			logger.error("加载[id=" + id + "]客户信贷信息过程中出现异常", e);
		}
		return returnVal;
	}

	@RequestMapping(value = "/credit/list-view")
	public String listView() {
		return "aiko-crm/credit/list-view";
	}

	@RequestMapping("/credit/list")
	@ResponseBody
	public AjaxObject list(
		@RequestParam(name = "customerCode", required = false) String customerCode,
		@RequestParam(name = "customerName", required = false) String customerName,
		@RequestParam(name = "startDate", required = false) String startDate,
		@RequestParam(name = "endDate", required = false) String endDate,
		@RequestParam(name = "page", defaultValue = "1", required = false) int currentPage,
		@RequestParam(name = "rows", defaultValue = "10", required = false) int pageSize) {
		AjaxObject returnVal = new AjaxObject();
		try {
			/*
			 * 查询参数
			 */
			Map<String, Object> params = new HashMap<String, Object>(4);
			params.put("customerCode", customerCode);
			params.put("customerName", customerName);

			/*
			 * 查询结果
			 */
			PageInfo<Credit> webp = creditService.findCredit(params, currentPage, pageSize);
			EasyUI easy = new EasyUI();
			easy.setTotal(webp.getTotal());
			easy.setRows(webp.getList());
			
			/*
			 * 返回结果
			 */
			Map<String, Object> data = new HashMap<String, Object>(4);
			data.put("params", params);
			data.put("webp", easy);
			
			returnVal.success(data);
		} catch (ServiceException e) { 
			returnVal.fail(e.getMessage(), null);
		} catch (Throwable e) {
			returnVal.fail("客户信贷信息加载失败!", null);
			logger.error("客户信贷信息加载失败!", e);
		}
		return returnVal;
	}
	
	@RequestMapping(value = "/credit/add-view")
	public String addView() {
		return "aiko-crm/credit/add-view";
	}

	@RequestMapping(value = "/credit/add")
	@ResponseBody
	public AjaxObject add(Credit obj) {
		AjaxObject returnVal = new AjaxObject();
		try {
			creditService.addCredit(obj);
			returnVal.success();
		} catch (ServiceException e) { 
			returnVal.fail(e.getMessage(), null);
		} catch (Throwable e) {
			returnVal.fail("客户信贷信息添加失败!", null);
			logger.error("客户信贷信息添加失败!", e);
		}
		return returnVal;
	}
	
	@RequestMapping(value="/credit/update-view")
	public String updateView(@RequestParam(name="id") String id) {
		return "aiko-crm/credit/update-view";
	}
	
	@RequestMapping(value = "/credit/update")
	@ResponseBody
	public AjaxObject update(Credit obj) {
		AjaxObject returnVal = new AjaxObject();
		try {
			creditService.updateCredit(obj);
			returnVal.success();
		} catch (ServiceException e) {
			returnVal.fail(e.getMessage(), null);
		} catch (Throwable e) {
			returnVal.fail("客户信贷信息修改失败!", null);
			logger.error("客户信贷信息修改失败!", e);
		}
		return returnVal;
	}
	
	@RequestMapping(value="/credit/delete")
	@ResponseBody
	public AjaxObject delete(@RequestParam(value = "ids[]") String ids[]) {
		AjaxObject returnVal = new AjaxObject();
		try {
			creditService.deleteCredit(ids);
			returnVal.success();
		} catch (ServiceException e) {
			returnVal.fail(e.getMessage(), null);
		} catch (Throwable e) {
			returnVal.fail();
			logger.error("批量删除客户信贷信息过程中出现异常", e);
		}
		return returnVal;
	}
}