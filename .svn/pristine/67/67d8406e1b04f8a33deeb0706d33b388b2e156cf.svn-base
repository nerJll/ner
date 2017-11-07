package com.aiko.credit.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aiko.common.util.CommonUtils;
import com.aiko.common.util.SystemApi;
import com.aiko.credit.dao.CreditDao;
import com.aiko.credit.model.Credit;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CreditService {

	@Autowired
	private CreditDao creditDao;
	
	/**
	 * 获取登录用户的账号
	 */
	public String getCurrentUserid(){
		Map<Object, Object> user = SystemApi.getCurrentUser();
		return user == null ? null : (String)user.get("userid");
	}
	
	/**
	 * 根据ID客户信贷信息
	 * @param id 
	 */
	public Credit getCredit(String id){
		return creditDao.getCredit(id);
	}
	
	/**
	 * 根据客户端的查询条件分页查询相关的客户信贷信息
	 * @param params      查询条件
	 * @param currentPage 当前页码
	 * @param pageSize    每页记录数
	 * @return            
	 */
	public PageInfo<Credit> findCredit(Map<String, Object> params, int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<Credit> objs = creditDao.findCredit(params);
		return new PageInfo<Credit>(objs);
	}
	
	/**
	 * 添加客户信贷信息
	 * @param obj
	 */
	@Transactional
	public void addCredit(Credit obj){
		
		// ID
		obj.setId(CommonUtils.getSequence());
		
		// 创建人工号
		obj.setCreateUser(getCurrentUserid());
		
		// 创建时间
		obj.setCreateDate(new Date());
		
		creditDao.addCredit(obj);
	}
	
	/**
	 * 修改客户信贷信息
	 * @param obj
	 */
	@Transactional
	public void updateCredit(Credit obj){
		creditDao.updateCredit(obj);
	}
	
	/**
	 * 根据ID删除客户信贷信息
	 * @param id
	 */
	@Transactional
	public void deleteCredit(String id) {
		creditDao.deleteCredit(id);
	}

	/**
	 * 根据ID数组删除客户信贷信息
	 * @param ids
	 */
	@Transactional
	public void deleteCredit(String[] ids) {
		for (int i = 0, len = (ids == null ? 0 : ids.length); i < len; i++) {
			if (ids[i] != null) {
				deleteCredit(ids[i]);
			}
		}
	}
	
}
