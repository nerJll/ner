package com.aiko.system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.ajax.AjaxObject;
import com.aiko.common.util.CacheTree;
import com.aiko.common.util.SystemApi;

@Controller 
public class SystemController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="/system/index")
	public String index() {
		return "system/index";
	}
	
	@RequestMapping(value="/system/indexMobil")
	public String indexMobil() {
		return "system/indexMobil";
	}
	
	//当前登录用户
		@RequestMapping(value = "/system/current-user")
		@ResponseBody
		public AjaxObject getCurrentUser() {
			AjaxObject returnVal = new AjaxObject();
			try {
				Map<String, Object> data = new HashMap<String, Object>(4);
				Map<Object, Object> user=SystemApi.getCurrentUser();
				Map<Object, Object> dept=SystemApi.getCurrentDept();			
				
				data.put("name",user.get("name"));
				data.put("userid",user.get("userid"));
				data.put("deptname",dept.get("name"));
				data.put("roles", SystemApi.getCurrentRoles());
				
				returnVal.success(data);
			} catch (Throwable e) {
				logger.error("加载登录用户信息过程中出现异常", e);
				returnVal.fail();
			}
			return returnVal;
		}
		
	@RequestMapping(value = "/system/menus")
	@ResponseBody
	public AjaxObject menus(@RequestParam(name = "appcode", required = true) String appcode) {
		AjaxObject returnVal = new AjaxObject();
		try {
			/*
			 * 从session中获取登录用户菜单信息
			 */
			List<Map<Object, Object>> menus = SystemApi.getCurrentMenusByAppCode(appcode);
			
			Iterator<Map<Object, Object>> iter = menus.iterator();
			Map<Object, Object> menu = null;
			while (iter.hasNext()) {
				menu = iter.next();
				if("function".equals(menu.get("type"))){
					iter.remove();
				}
			}
			
			// 对菜单信息进行树排序
			CacheTree<Map<Object, Object>> tree = new CacheTree<Map<Object, Object>>("id", "parentid", "sort", menus);
			tree.setChilds("0", "childs");
			menus = tree.getChilds("0");
			returnVal.success(menus);
		} catch (Throwable e) {
			logger.error("登陆后加载菜单树的过程中出现异常", e);
			returnVal.fail();
		}
		return returnVal;
	}

}
