package com.aiko.pact.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.aiko.pactdetail.dto.AikoContractDetail;

public class AikoContract implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private String contractId; 	

    private String contractNo;//合同编码  VBELN

    private String purchaseNo;//纸质合同编码

    private String saleGroup;//销售组 VKGRP

    private String saleOrg;//销售组织 VKORG

    private String customerNo;//客户编码 KUNNR

    private String customerName;//客户名称

    private Double sum;//金额

    private String currency;//货币类型 WAERK

    private String paymentWay;//付款方式 ZLSCH

    private String paymentTerm;//付款条件 ZTERM

    private String employee;//销售雇员 PERNR
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date staTime;//有效期起止日期 GUEBG
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;//有效期终止日期 GUEEN
    
    private String state;//合同状态

    private String contractType;//合同类型

    private String isformate;//格式合同

    private String serviceModel;//业务模式 BSTZD

    private String resOne;// 文件地址

    private String resTwo; // 变更补充说明

    private String resThree; // 空闲

    private Date createTime; // 创建时间 AUDAT

    private String proNo;//产品编码

    private String saleWay;//分销渠道 VTWEG

    private String saleFunc;// 采购合同流程  BSTKD

    private Integer period;// 无用字段

    private String tradeTerm;//贸易条款 INCO1
    
    private List<AikoContractDetail> pactItem;

    public List<AikoContractDetail> getPactItem() {
		return pactItem;
	}

	public void setPactItem(List<AikoContractDetail> pactItem) {
		this.pactItem = pactItem;
	}

	public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo == null ? null : purchaseNo.trim();
    }

    public String getSaleGroup() {
        return saleGroup;
    }

    public void setSaleGroup(String saleGroup) {
        this.saleGroup = saleGroup == null ? null : saleGroup.trim();
    }

    public String getSaleOrg() {
        return saleOrg;
    }

    public void setSaleOrg(String saleOrg) {
        this.saleOrg = saleOrg == null ? null : saleOrg.trim();
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay == null ? null : paymentWay.trim();
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm == null ? null : paymentTerm.trim();
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee == null ? null : employee.trim();
    }

    public Date getStaTime() {
        return staTime;
    }

    public void setStaTime(Date staTime) {
        this.staTime = staTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getIsformate() {
        return isformate;
    }

    public void setIsformate(String isformate) {
        this.isformate = isformate == null ? null : isformate.trim();
    }

    public String getServiceModel() {
        return serviceModel;
    }

    public void setServiceModel(String serviceModel) {
        this.serviceModel = serviceModel == null ? null : serviceModel.trim();
    }

    public String getResOne() {
        return resOne;
    }

    public void setResOne(String resOne) {
        this.resOne = resOne == null ? null : resOne.trim();
    }

    public String getResTwo() {
        return resTwo;
    }

    public void setResTwo(String resTwo) {
        this.resTwo = resTwo == null ? null : resTwo.trim();
    }

    public String getResThree() {
        return resThree;
    }

    public void setResThree(String resThree) {
        this.resThree = resThree == null ? null : resThree.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getSaleWay() {
        return saleWay;
    }

    public void setSaleWay(String saleWay) {
        this.saleWay = saleWay == null ? null : saleWay.trim();
    }

    public String getSaleFunc() {
        return saleFunc;
    }

    public void setSaleFunc(String saleFunc) {
        this.saleFunc = saleFunc == null ? null : saleFunc.trim();
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getTradeTerm() {
        return tradeTerm;
    }

    public void setTradeTerm(String tradeTerm) {
        this.tradeTerm = tradeTerm == null ? null : tradeTerm.trim();
    }
    
	@Override
	public String toString() {
		return "{\"contractId\":\"" + contractId + "\",\"contractNo\":\"" + contractNo + "\",\"purchaseNo\":\""
				+ purchaseNo + "\",\"saleGroup\":\"" + saleGroup + "\",\"saleOrg\":\"" + saleOrg
				+ "\",\"customerNo\":\"" + customerNo + "\",\"customerName\":\"" + customerName + "\",\"sum\":\"" + sum
				+ "\",\"currency\":\"" + currency + "\",\"paymentWay\":\"" + paymentWay + "\",\"paymentTerm\":\""
				+ paymentTerm + "\",\"employee\":\"" + employee + "\",\"staTime\":\"" + staTime + "\",\"endTime\":\""
				+ endTime + "\",\"state\":\"" + state + "\",\"contractType\":\"" + contractType + "\",\"isformate\":\""
				+ isformate + "\",\"serviceModel\":\"" + serviceModel + "\",\"resOne\":\"" + resOne + "\",\"resTwo\":\""
				+ resTwo + "\",\"resThree\":\"" + resThree + "\",\"createTime\":\"" + createTime + "\",\"proNo\":\""
				+ proNo + "\",\"saleWay\":\"" + saleWay + "\",\"saleFunc\":\"" + saleFunc + "\",\"period\":\"" + period
				+ "\",\"tradeTerm\":\"" + tradeTerm + "\"}";
	}
	
	public AikoContract(String contractId, String contractNo, String purchaseNo, String saleGroup, String saleOrg,
			String customerNo, String customerName, Double sum, String currency, String paymentWay, String paymentTerm,
			String employee, Date staTime, Date endTime, String state, String contractType, String isformate,
			String serviceModel, String resOne, String resTwo, String resThree, Date createTime, String proNo,
			String saleWay, String saleFunc, Integer period, String tradeTerm) {
		this.contractId = contractId;
		this.contractNo = contractNo;
		this.purchaseNo = purchaseNo;
		this.saleGroup = saleGroup;
		this.saleOrg = saleOrg;
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.sum = sum;
		this.currency = currency;
		this.paymentWay = paymentWay;
		this.paymentTerm = paymentTerm;
		this.employee = employee;
		this.staTime = staTime;
		this.endTime = endTime;
		this.state = state;
		this.contractType = contractType;
		this.isformate = isformate;
		this.serviceModel = serviceModel;
		this.resOne = resOne;
		this.resTwo = resTwo;
		this.resThree = resThree;
		this.createTime = createTime;
		this.proNo = proNo;
		this.saleWay = saleWay;
		this.saleFunc = saleFunc;
		this.period = period;
		this.tradeTerm = tradeTerm;
	}

	public AikoContract() {}
    
}