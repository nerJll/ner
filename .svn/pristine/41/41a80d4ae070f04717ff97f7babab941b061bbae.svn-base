package com.aiko.pact.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AikoContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AikoContractExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("CONTRACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("CONTRACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("CONTRACT_NO =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("CONTRACT_NO <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("CONTRACT_NO >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("CONTRACT_NO <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("CONTRACT_NO like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("CONTRACT_NO not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("CONTRACT_NO in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("CONTRACT_NO not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoIsNull() {
            addCriterion("PURCHASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoIsNotNull() {
            addCriterion("PURCHASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoEqualTo(String value) {
            addCriterion("PURCHASE_NO =", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoNotEqualTo(String value) {
            addCriterion("PURCHASE_NO <>", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoGreaterThan(String value) {
            addCriterion("PURCHASE_NO >", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NO >=", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoLessThan(String value) {
            addCriterion("PURCHASE_NO <", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NO <=", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoLike(String value) {
            addCriterion("PURCHASE_NO like", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoNotLike(String value) {
            addCriterion("PURCHASE_NO not like", value, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoIn(List<String> values) {
            addCriterion("PURCHASE_NO in", values, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoNotIn(List<String> values) {
            addCriterion("PURCHASE_NO not in", values, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoBetween(String value1, String value2) {
            addCriterion("PURCHASE_NO between", value1, value2, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseNoNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_NO not between", value1, value2, "purchaseNo");
            return (Criteria) this;
        }

        public Criteria andSaleGroupIsNull() {
            addCriterion("SALE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andSaleGroupIsNotNull() {
            addCriterion("SALE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andSaleGroupEqualTo(String value) {
            addCriterion("SALE_GROUP =", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupNotEqualTo(String value) {
            addCriterion("SALE_GROUP <>", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupGreaterThan(String value) {
            addCriterion("SALE_GROUP >", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_GROUP >=", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupLessThan(String value) {
            addCriterion("SALE_GROUP <", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupLessThanOrEqualTo(String value) {
            addCriterion("SALE_GROUP <=", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupLike(String value) {
            addCriterion("SALE_GROUP like", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupNotLike(String value) {
            addCriterion("SALE_GROUP not like", value, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupIn(List<String> values) {
            addCriterion("SALE_GROUP in", values, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupNotIn(List<String> values) {
            addCriterion("SALE_GROUP not in", values, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupBetween(String value1, String value2) {
            addCriterion("SALE_GROUP between", value1, value2, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleGroupNotBetween(String value1, String value2) {
            addCriterion("SALE_GROUP not between", value1, value2, "saleGroup");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIsNull() {
            addCriterion("SALE_ORG is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIsNotNull() {
            addCriterion("SALE_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrgEqualTo(String value) {
            addCriterion("SALE_ORG =", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotEqualTo(String value) {
            addCriterion("SALE_ORG <>", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgGreaterThan(String value) {
            addCriterion("SALE_ORG >", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_ORG >=", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLessThan(String value) {
            addCriterion("SALE_ORG <", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLessThanOrEqualTo(String value) {
            addCriterion("SALE_ORG <=", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLike(String value) {
            addCriterion("SALE_ORG like", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotLike(String value) {
            addCriterion("SALE_ORG not like", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIn(List<String> values) {
            addCriterion("SALE_ORG in", values, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotIn(List<String> values) {
            addCriterion("SALE_ORG not in", values, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgBetween(String value1, String value2) {
            addCriterion("SALE_ORG between", value1, value2, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotBetween(String value1, String value2) {
            addCriterion("SALE_ORG not between", value1, value2, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNull() {
            addCriterion("CUSTOMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("CUSTOMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("CUSTOMER_NO =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("CUSTOMER_NO <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("CUSTOMER_NO >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("CUSTOMER_NO <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("CUSTOMER_NO like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("CUSTOMER_NO not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("CUSTOMER_NO in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("CUSTOMER_NO not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("SUM is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Double value) {
            addCriterion("SUM =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Double value) {
            addCriterion("SUM <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Double value) {
            addCriterion("SUM >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Double value) {
            addCriterion("SUM >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Double value) {
            addCriterion("SUM <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Double value) {
            addCriterion("SUM <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Double> values) {
            addCriterion("SUM in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Double> values) {
            addCriterion("SUM not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Double value1, Double value2) {
            addCriterion("SUM between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Double value1, Double value2) {
            addCriterion("SUM not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIsNull() {
            addCriterion("PAYMENT_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIsNotNull() {
            addCriterion("PAYMENT_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentWayEqualTo(String value) {
            addCriterion("PAYMENT_WAY =", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotEqualTo(String value) {
            addCriterion("PAYMENT_WAY <>", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayGreaterThan(String value) {
            addCriterion("PAYMENT_WAY >", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_WAY >=", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLessThan(String value) {
            addCriterion("PAYMENT_WAY <", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_WAY <=", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLike(String value) {
            addCriterion("PAYMENT_WAY like", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotLike(String value) {
            addCriterion("PAYMENT_WAY not like", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIn(List<String> values) {
            addCriterion("PAYMENT_WAY in", values, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotIn(List<String> values) {
            addCriterion("PAYMENT_WAY not in", values, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayBetween(String value1, String value2) {
            addCriterion("PAYMENT_WAY between", value1, value2, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_WAY not between", value1, value2, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIsNull() {
            addCriterion("PAYMENT_TERM is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIsNotNull() {
            addCriterion("PAYMENT_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermEqualTo(String value) {
            addCriterion("PAYMENT_TERM =", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermNotEqualTo(String value) {
            addCriterion("PAYMENT_TERM <>", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermGreaterThan(String value) {
            addCriterion("PAYMENT_TERM >", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TERM >=", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermLessThan(String value) {
            addCriterion("PAYMENT_TERM <", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TERM <=", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermLike(String value) {
            addCriterion("PAYMENT_TERM like", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermNotLike(String value) {
            addCriterion("PAYMENT_TERM not like", value, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIn(List<String> values) {
            addCriterion("PAYMENT_TERM in", values, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermNotIn(List<String> values) {
            addCriterion("PAYMENT_TERM not in", values, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermBetween(String value1, String value2) {
            addCriterion("PAYMENT_TERM between", value1, value2, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andPaymentTermNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TERM not between", value1, value2, "paymentTerm");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNull() {
            addCriterion("EMPLOYEE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNotNull() {
            addCriterion("EMPLOYEE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEqualTo(String value) {
            addCriterion("EMPLOYEE =", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotEqualTo(String value) {
            addCriterion("EMPLOYEE <>", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThan(String value) {
            addCriterion("EMPLOYEE >", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE >=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThan(String value) {
            addCriterion("EMPLOYEE <", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE <=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLike(String value) {
            addCriterion("EMPLOYEE like", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotLike(String value) {
            addCriterion("EMPLOYEE not like", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeIn(List<String> values) {
            addCriterion("EMPLOYEE in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotIn(List<String> values) {
            addCriterion("EMPLOYEE not in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeBetween(String value1, String value2) {
            addCriterion("EMPLOYEE between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE not between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andStaTimeIsNull() {
            addCriterion("STA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStaTimeIsNotNull() {
            addCriterion("STA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStaTimeEqualTo(Date value) {
            addCriterionForJDBCDate("STA_TIME =", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STA_TIME <>", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STA_TIME >", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STA_TIME >=", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeLessThan(Date value) {
            addCriterionForJDBCDate("STA_TIME <", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STA_TIME <=", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeIn(List<Date> values) {
            addCriterionForJDBCDate("STA_TIME in", values, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STA_TIME not in", values, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STA_TIME between", value1, value2, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STA_TIME not between", value1, value2, "staTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("CONTRACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("CONTRACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("CONTRACT_TYPE =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("CONTRACT_TYPE >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("CONTRACT_TYPE <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("CONTRACT_TYPE like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("CONTRACT_TYPE not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("CONTRACT_TYPE in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("CONTRACT_TYPE not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andIsformateIsNull() {
            addCriterion("ISFORMATE is null");
            return (Criteria) this;
        }

        public Criteria andIsformateIsNotNull() {
            addCriterion("ISFORMATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsformateEqualTo(String value) {
            addCriterion("ISFORMATE =", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateNotEqualTo(String value) {
            addCriterion("ISFORMATE <>", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateGreaterThan(String value) {
            addCriterion("ISFORMATE >", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateGreaterThanOrEqualTo(String value) {
            addCriterion("ISFORMATE >=", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateLessThan(String value) {
            addCriterion("ISFORMATE <", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateLessThanOrEqualTo(String value) {
            addCriterion("ISFORMATE <=", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateLike(String value) {
            addCriterion("ISFORMATE like", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateNotLike(String value) {
            addCriterion("ISFORMATE not like", value, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateIn(List<String> values) {
            addCriterion("ISFORMATE in", values, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateNotIn(List<String> values) {
            addCriterion("ISFORMATE not in", values, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateBetween(String value1, String value2) {
            addCriterion("ISFORMATE between", value1, value2, "isformate");
            return (Criteria) this;
        }

        public Criteria andIsformateNotBetween(String value1, String value2) {
            addCriterion("ISFORMATE not between", value1, value2, "isformate");
            return (Criteria) this;
        }

        public Criteria andServiceModelIsNull() {
            addCriterion("SERVICE_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andServiceModelIsNotNull() {
            addCriterion("SERVICE_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceModelEqualTo(String value) {
            addCriterion("SERVICE_MODEL =", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelNotEqualTo(String value) {
            addCriterion("SERVICE_MODEL <>", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelGreaterThan(String value) {
            addCriterion("SERVICE_MODEL >", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_MODEL >=", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelLessThan(String value) {
            addCriterion("SERVICE_MODEL <", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_MODEL <=", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelLike(String value) {
            addCriterion("SERVICE_MODEL like", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelNotLike(String value) {
            addCriterion("SERVICE_MODEL not like", value, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelIn(List<String> values) {
            addCriterion("SERVICE_MODEL in", values, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelNotIn(List<String> values) {
            addCriterion("SERVICE_MODEL not in", values, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelBetween(String value1, String value2) {
            addCriterion("SERVICE_MODEL between", value1, value2, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andServiceModelNotBetween(String value1, String value2) {
            addCriterion("SERVICE_MODEL not between", value1, value2, "serviceModel");
            return (Criteria) this;
        }

        public Criteria andResOneIsNull() {
            addCriterion("RES_ONE is null");
            return (Criteria) this;
        }

        public Criteria andResOneIsNotNull() {
            addCriterion("RES_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andResOneEqualTo(String value) {
            addCriterion("RES_ONE =", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotEqualTo(String value) {
            addCriterion("RES_ONE <>", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThan(String value) {
            addCriterion("RES_ONE >", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThanOrEqualTo(String value) {
            addCriterion("RES_ONE >=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThan(String value) {
            addCriterion("RES_ONE <", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThanOrEqualTo(String value) {
            addCriterion("RES_ONE <=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLike(String value) {
            addCriterion("RES_ONE like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotLike(String value) {
            addCriterion("RES_ONE not like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneIn(List<String> values) {
            addCriterion("RES_ONE in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotIn(List<String> values) {
            addCriterion("RES_ONE not in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneBetween(String value1, String value2) {
            addCriterion("RES_ONE between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotBetween(String value1, String value2) {
            addCriterion("RES_ONE not between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNull() {
            addCriterion("RES_TWO is null");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNotNull() {
            addCriterion("RES_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andResTwoEqualTo(String value) {
            addCriterion("RES_TWO =", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotEqualTo(String value) {
            addCriterion("RES_TWO <>", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThan(String value) {
            addCriterion("RES_TWO >", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThanOrEqualTo(String value) {
            addCriterion("RES_TWO >=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThan(String value) {
            addCriterion("RES_TWO <", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThanOrEqualTo(String value) {
            addCriterion("RES_TWO <=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLike(String value) {
            addCriterion("RES_TWO like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotLike(String value) {
            addCriterion("RES_TWO not like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoIn(List<String> values) {
            addCriterion("RES_TWO in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotIn(List<String> values) {
            addCriterion("RES_TWO not in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoBetween(String value1, String value2) {
            addCriterion("RES_TWO between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotBetween(String value1, String value2) {
            addCriterion("RES_TWO not between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResThreeIsNull() {
            addCriterion("RES_THREE is null");
            return (Criteria) this;
        }

        public Criteria andResThreeIsNotNull() {
            addCriterion("RES_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andResThreeEqualTo(String value) {
            addCriterion("RES_THREE =", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotEqualTo(String value) {
            addCriterion("RES_THREE <>", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeGreaterThan(String value) {
            addCriterion("RES_THREE >", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_THREE >=", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLessThan(String value) {
            addCriterion("RES_THREE <", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLessThanOrEqualTo(String value) {
            addCriterion("RES_THREE <=", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLike(String value) {
            addCriterion("RES_THREE like", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotLike(String value) {
            addCriterion("RES_THREE not like", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeIn(List<String> values) {
            addCriterion("RES_THREE in", values, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotIn(List<String> values) {
            addCriterion("RES_THREE not in", values, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeBetween(String value1, String value2) {
            addCriterion("RES_THREE between", value1, value2, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotBetween(String value1, String value2) {
            addCriterion("RES_THREE not between", value1, value2, "resThree");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andProNoIsNull() {
            addCriterion("PRO_NO is null");
            return (Criteria) this;
        }

        public Criteria andProNoIsNotNull() {
            addCriterion("PRO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProNoEqualTo(String value) {
            addCriterion("PRO_NO =", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotEqualTo(String value) {
            addCriterion("PRO_NO <>", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThan(String value) {
            addCriterion("PRO_NO >", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NO >=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThan(String value) {
            addCriterion("PRO_NO <", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThanOrEqualTo(String value) {
            addCriterion("PRO_NO <=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLike(String value) {
            addCriterion("PRO_NO like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotLike(String value) {
            addCriterion("PRO_NO not like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoIn(List<String> values) {
            addCriterion("PRO_NO in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotIn(List<String> values) {
            addCriterion("PRO_NO not in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoBetween(String value1, String value2) {
            addCriterion("PRO_NO between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotBetween(String value1, String value2) {
            addCriterion("PRO_NO not between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andSaleWayIsNull() {
            addCriterion("SALE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andSaleWayIsNotNull() {
            addCriterion("SALE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andSaleWayEqualTo(String value) {
            addCriterion("SALE_WAY =", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayNotEqualTo(String value) {
            addCriterion("SALE_WAY <>", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayGreaterThan(String value) {
            addCriterion("SALE_WAY >", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_WAY >=", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayLessThan(String value) {
            addCriterion("SALE_WAY <", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayLessThanOrEqualTo(String value) {
            addCriterion("SALE_WAY <=", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayLike(String value) {
            addCriterion("SALE_WAY like", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayNotLike(String value) {
            addCriterion("SALE_WAY not like", value, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayIn(List<String> values) {
            addCriterion("SALE_WAY in", values, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayNotIn(List<String> values) {
            addCriterion("SALE_WAY not in", values, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayBetween(String value1, String value2) {
            addCriterion("SALE_WAY between", value1, value2, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleWayNotBetween(String value1, String value2) {
            addCriterion("SALE_WAY not between", value1, value2, "saleWay");
            return (Criteria) this;
        }

        public Criteria andSaleFuncIsNull() {
            addCriterion("SALE_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andSaleFuncIsNotNull() {
            addCriterion("SALE_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andSaleFuncEqualTo(String value) {
            addCriterion("SALE_FUNC =", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncNotEqualTo(String value) {
            addCriterion("SALE_FUNC <>", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncGreaterThan(String value) {
            addCriterion("SALE_FUNC >", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_FUNC >=", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncLessThan(String value) {
            addCriterion("SALE_FUNC <", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncLessThanOrEqualTo(String value) {
            addCriterion("SALE_FUNC <=", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncLike(String value) {
            addCriterion("SALE_FUNC like", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncNotLike(String value) {
            addCriterion("SALE_FUNC not like", value, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncIn(List<String> values) {
            addCriterion("SALE_FUNC in", values, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncNotIn(List<String> values) {
            addCriterion("SALE_FUNC not in", values, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncBetween(String value1, String value2) {
            addCriterion("SALE_FUNC between", value1, value2, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andSaleFuncNotBetween(String value1, String value2) {
            addCriterion("SALE_FUNC not between", value1, value2, "saleFunc");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andTradeTermIsNull() {
            addCriterion("TRADE_TERM is null");
            return (Criteria) this;
        }

        public Criteria andTradeTermIsNotNull() {
            addCriterion("TRADE_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTermEqualTo(String value) {
            addCriterion("TRADE_TERM =", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermNotEqualTo(String value) {
            addCriterion("TRADE_TERM <>", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermGreaterThan(String value) {
            addCriterion("TRADE_TERM >", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TERM >=", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermLessThan(String value) {
            addCriterion("TRADE_TERM <", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TERM <=", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermLike(String value) {
            addCriterion("TRADE_TERM like", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermNotLike(String value) {
            addCriterion("TRADE_TERM not like", value, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermIn(List<String> values) {
            addCriterion("TRADE_TERM in", values, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermNotIn(List<String> values) {
            addCriterion("TRADE_TERM not in", values, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermBetween(String value1, String value2) {
            addCriterion("TRADE_TERM between", value1, value2, "tradeTerm");
            return (Criteria) this;
        }

        public Criteria andTradeTermNotBetween(String value1, String value2) {
            addCriterion("TRADE_TERM not between", value1, value2, "tradeTerm");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}