package com.aiko.credit.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.aiko.credit.model.Credit;

@Mapper
public interface CreditDao {

	public Credit getCredit(String id);
	
	public List<Credit> findCredit(Map<String, Object> params);
	
	public void addCredit(Credit obj);

	public void updateCredit(Credit obj);
	
	public void deleteCredit(String id);
}
