package com.aiko.deliveryplan.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AikoDeliveryPlan implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	private String deliveryPlanId;

    private String contractItem;//合同项目 POSNR

    private Integer planNo;//计划号	 ETENR

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date planDate;//计划日期 EDATU

    private String materielNo;//物料编码

    private String materielDes;//物料描述

    private Integer mount;//数量 WMENG

    private String unit;//单位 VRKME

    private Double unitPrice;//单价 KBETR

    private Double sum;//金额

    private String salesOrderNo;//销售订单

    private String deliveryOrderNo;//交货单

    private String resOne; //合同标的id

    private String resTwo;

    private String resThree;

    public String getDeliveryPlanId() {
        return deliveryPlanId;
    }

    public void setDeliveryPlanId(String deliveryPlanId) {
        this.deliveryPlanId = deliveryPlanId == null ? null : deliveryPlanId.trim();
    }

    public String getContractItem() {
        return contractItem;
    }

    public void setContractItem(String contractItem) {
        this.contractItem = contractItem == null ? null : contractItem.trim();
    }

    public Integer getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Integer planNo) {
        this.planNo = planNo;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getMaterielNo() {
        return materielNo;
    }

    public void setMaterielNo(String materielNo) {
        this.materielNo = materielNo == null ? null : materielNo.trim();
    }

    public String getMaterielDes() {
        return materielDes;
    }

    public void setMaterielDes(String materielDes) {
        this.materielDes = materielDes == null ? null : materielDes.trim();
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getSalesOrderNo() {
        return salesOrderNo;
    }

    public void setSalesOrderNo(String salesOrderNo) {
        this.salesOrderNo = salesOrderNo == null ? null : salesOrderNo.trim();
    }

    public String getDeliveryOrderNo() {
        return deliveryOrderNo;
    }

    public void setDeliveryOrderNo(String deliveryOrderNo) {
        this.deliveryOrderNo = deliveryOrderNo == null ? null : deliveryOrderNo.trim();
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

	@Override
	public String toString() {
		return "{\"deliveryPlanId\":\"" + deliveryPlanId + "\",\"contractItem\":\"" + contractItem + "\",\"planNo\":\""
				+ planNo + "\",\"planDate\":\"" + planDate + "\",\"materielNo\":\"" + materielNo
				+ "\",\"materielDes\":\"" + materielDes + "\",\"mount\":\"" + mount + "\",\"unit\":\"" + unit
				+ "\",\"unitPrice\":\"" + unitPrice + "\",\"sum\":\"" + sum + "\",\"salesOrderNo\":\"" + salesOrderNo
				+ "\",\"deliveryOrderNo\":\"" + deliveryOrderNo + "\",\"resOne\":\"" + resOne + "\",\"resTwo\":\""
				+ resTwo + "\",\"resThree\":\"" + resThree + "\"}";
	}

	public AikoDeliveryPlan(String deliveryPlanId, String contractItem, Integer planNo, Date planDate,
			String materielNo, String materielDes, Integer mount, String unit, Double unitPrice, Double sum,
			String salesOrderNo, String deliveryOrderNo, String resOne, String resTwo, String resThree) {
		this.deliveryPlanId = deliveryPlanId;
		this.contractItem = contractItem;
		this.planNo = planNo;
		this.planDate = planDate;
		this.materielNo = materielNo;
		this.materielDes = materielDes;
		this.mount = mount;
		this.unit = unit;
		this.unitPrice = unitPrice;
		this.sum = sum;
		this.salesOrderNo = salesOrderNo;
		this.deliveryOrderNo = deliveryOrderNo;
		this.resOne = resOne;
		this.resTwo = resTwo;
		this.resThree = resThree;
	}

	public AikoDeliveryPlan() {}
    
}