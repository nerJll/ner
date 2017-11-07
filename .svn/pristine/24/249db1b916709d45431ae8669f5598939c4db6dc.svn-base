package com.aiko.pactdetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aiko.common.util.IDUtils;
import com.aiko.pactdetail.dao.AikoContractDetailMapper;
import com.aiko.pactdetail.dto.AikoContractDetail;
import com.aiko.pactdetail.dto.AikoContractDetailExample;

@Service
public class AikoContractDetailService {
	
	@Autowired
	private AikoContractDetailMapper contractDetailDAO;
	
	/**
	 * 更新合同详情
	 * @param recod 合同详情obj
	 */
	@Transactional
	public void updateContractDetail(AikoContractDetail recod) {
		contractDetailDAO.updateByPrimaryKeySelective(recod);
	}
	
	/**
	 * 增加合同详情
	 * @param recod 合同详情obj
	 */
	@Transactional
	public void insertContractDetail(AikoContractDetail recod) {
		recod.setContractDetailId(IDUtils.getUuid(true));
		recod.setBillState("未执行");
		recod.setDeliveryState("未发货");
		recod.setOrderState("未下单");
		recod.setMaterielDes("");
		// SAP数据这里测试
		recod.setMaterielNo("");
		contractDetailDAO.insertSelective(recod);
	}
	
	/**
	 * 查询合同详情
	 * @param recodQuery 条件查询类
	 * @return 合同详情集合
	 */
	public List<AikoContractDetail> listContractDetail(AikoContractDetailExample recodQuery) {
		return contractDetailDAO.selectByExample(recodQuery);
	}
	
	@Transactional
	public void deleteDetail(String[] ids) {
		for (int i = 0;i < ids.length; i++) {
			contractDetailDAO.deleteByPrimaryKey(ids[i]);
		}
	}
}
