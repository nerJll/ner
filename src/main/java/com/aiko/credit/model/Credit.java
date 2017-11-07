package com.aiko.credit.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 客户信贷模型
 */
public class Credit implements java.io.Serializable {

	private static final long serialVersionUID = 5947604876573955724L;

	private String id;           // 主键(业务无关)
	private String customerCode; // 客户编码(销售合同的客户编码，系统自动带出，显示描述)
	private String customerName; // 客户名称(销售合同的客户名称，系统自动带出，显示描述)
	private BigDecimal amount;   // 信用额度(财务根据往年合作项目或是客户规模评定的可欠款额度)
	private BigDecimal usedAmount;     // 占用金额
	private BigDecimal remainingAmount;// 剩余金额
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	@JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
	private Date startDate;    // 有效日期(开始)
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	@JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
	private Date endDate;      // 有效日期(结束)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone="GMT+8")
	private Date createDate;   // 创建日期
	private String createUser; // 创建人
	private int status = 1;    // 状态(1:启用;0:禁用)
	private int type = 0;      // 是否特批(0:否;1:是)
	private String des;        // 备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(BigDecimal usedAmount) {
		this.usedAmount = usedAmount;
	}

	public BigDecimal getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(BigDecimal remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
}
