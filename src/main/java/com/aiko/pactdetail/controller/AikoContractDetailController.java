package com.aiko.pactdetail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.util.AjaxObject;
import com.aiko.pactdetail.service.AikoContractDetailService;

@Controller
@RequestMapping("/detail")
public class AikoContractDetailController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AikoContractDetailService detailService; 
	
	@PostMapping("/deleteDetail")
	@ResponseBody
	public AjaxObject deleteDetail(@RequestParam(name = "ids[]")String[] ids) {
		AjaxObject ajax = new AjaxObject();
		try {
			detailService.deleteDetail(ids);
			ajax.success();
			return ajax;
		} catch (Exception e) {
			ajax.fail();
			return ajax;
		}
	}
}
