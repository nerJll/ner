package com.aiko.pactdetail.dto;

public class AikoContractDetail implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private String contractDetailId;

    private String contractDetailNo;

    private String materielNo; //物料编码

    private String materielDes; //物料名称

    private Integer mount; // 数量

    private String unit; // 单位

    private Double unitCost; // 单价

    private Double sum; // 总额

    private String orderState;

    private String deliveryState;//交货状态

    private String billState;//发票状态

    private String silicon; // 硅片

    private String mainGrid; // 主栅

    private String tech; // 工艺

    private String convertRate; // 转化率

    private String grade; // 等级

    private String contractId;

    private String resOne;//工单状态

    private String resTwo;

    private String resThree;

    public String getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(String contractDetailId) {
        this.contractDetailId = contractDetailId == null ? null : contractDetailId.trim();
    }

    public String getContractDetailNo() {
        return contractDetailNo;
    }

    public void setContractDetailNo(String contractDetailNo) {
        this.contractDetailNo = contractDetailNo == null ? null : contractDetailNo.trim();
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

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState == null ? null : deliveryState.trim();
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState == null ? null : billState.trim();
    }

    public String getSilicon() {
        return silicon;
    }

    public void setSilicon(String silicon) {
        this.silicon = silicon == null ? null : silicon.trim();
    }

    public String getMainGrid() {
        return mainGrid;
    }

    public void setMainGrid(String mainGrid) {
        this.mainGrid = mainGrid == null ? null : mainGrid.trim();
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech == null ? null : tech.trim();
    }

    public String getConvertRate() {
        return convertRate;
    }

    public void setConvertRate(String convertRate) {
        this.convertRate = convertRate == null ? null : convertRate.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
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
		return "{\"contractDetailId\":\"" + contractDetailId + "\",\"contractDetailNo\":\"" + contractDetailNo
				+ "\",\"materielNo\":\"" + materielNo + "\",\"materielDes\":\"" + materielDes + "\",\"mount\":\""
				+ mount + "\",\"unit\":\"" + unit + "\",\"unitCost\":\"" + unitCost + "\",\"sum\":\"" + sum
				+ "\",\"orderState\":\"" + orderState + "\",\"deliveryState\":\"" + deliveryState
				+ "\",\"billState\":\"" + billState + "\",\"silicon\":\"" + silicon + "\",\"mainGrid\":\"" + mainGrid
				+ "\",\"tech\":\"" + tech + "\",\"convertRate\":\"" + convertRate + "\",\"grade\":\"" + grade
				+ "\",\"contractId\":\"" + contractId + "\",\"resOne\":\"" + resOne + "\",\"resTwo\":\"" + resTwo
				+ "\",\"resThree\":\"" + resThree + "\"}";
	}

	public AikoContractDetail(String contractDetailId, String contractDetailNo, String materielNo, String materielDes,
			Integer mount, String unit, Double unitCost, Double sum, String orderState, String deliveryState,
			String billState, String silicon, String mainGrid, String tech, String convertRate, String grade,
			String contractId, String resOne, String resTwo, String resThree) {
		this.contractDetailId = contractDetailId;
		this.contractDetailNo = contractDetailNo;
		this.materielNo = materielNo;
		this.materielDes = materielDes;
		this.mount = mount;
		this.unit = unit;
		this.unitCost = unitCost;
		this.sum = sum;
		this.orderState = orderState;
		this.deliveryState = deliveryState;
		this.billState = billState;
		this.silicon = silicon;
		this.mainGrid = mainGrid;
		this.tech = tech;
		this.convertRate = convertRate;
		this.grade = grade;
		this.contractId = contractId;
		this.resOne = resOne;
		this.resTwo = resTwo;
		this.resThree = resThree;
	}

	public AikoContractDetail() {}
	
}