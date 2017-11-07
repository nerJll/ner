/**
 * 
 */
/**
 * @author aknb206
 *
 */
package com.aiko.payplan.model;

import java.math.BigDecimal;

public class PayPlan{
	private String id;
	private String contract_no; //合同呈
	private int plan_num;//计划号
	private String plan_no;//计划编码
	private String plan_date;//计划日期
	private String payment_type;//货款类别
	private String materiel_no;//物料编码
	private String materiel_des;//物理描述
	private BigDecimal amount;//金额
	private String sales_order_no;//销售订单
	private int interval_month;//间隔月
	private String payment_date;//还款日期
	private BigDecimal paid_amount;//实收金额
	private BigDecimal rest_amount;//未收金额
	private String is_overdue;//是否逾期
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContract_no() {
		return contract_no;
	}
	public void setContract_no(String contract_no) {
		this.contract_no = contract_no;
	}
	public int getPlan_num() {
		return plan_num;
	}
	public void setPlan_num(int plan_num) {
		this.plan_num = plan_num;
	}
	
	public String getPlan_no() {
		return plan_no;
	}
	public void setPlan_no(String plan_no) {
		this.plan_no = plan_no;
	}
	public String getPlan_date() {
		return plan_date;
	}
	public void setPlan_date(String plan_date) {
		this.plan_date = plan_date;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getMateriel_no() {
		return materiel_no;
	}
	public void setMateriel_no(String materiel_no) {
		this.materiel_no = materiel_no;
	}
	public String getMateriel_des() {
		return materiel_des;
	}
	public void setMateriel_des(String materiel_des) {
		this.materiel_des = materiel_des;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getSales_order_no() {
		return sales_order_no;
	}
	public void setSales_order_no(String sales_order_no) {
		this.sales_order_no = sales_order_no;
	}
	public int getInterval_month() {
		return interval_month;
	}
	public void setInterval_month(int interval_month) {
		this.interval_month = interval_month;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public BigDecimal getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(BigDecimal paid_amount) {
		this.paid_amount = paid_amount;
	}
	public BigDecimal getRest_amount() {
		return rest_amount;
	}
	public void setRest_amount(BigDecimal rest_amount) {
		this.rest_amount = rest_amount;
	}
	public String getIs_overdue() {
		return is_overdue;
	}
	public void setIs_overdue(String is_overdue) {
		this.is_overdue = is_overdue;
	}
	
	
}