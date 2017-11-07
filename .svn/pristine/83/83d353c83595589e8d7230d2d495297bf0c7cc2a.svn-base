package com.aiko.deliveryplan.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AikoDeliveryPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AikoDeliveryPlanExample() {
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

        public Criteria andDeliveryPlanIdIsNull() {
            addCriterion("DELIVERY_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdIsNotNull() {
            addCriterion("DELIVERY_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdEqualTo(String value) {
            addCriterion("DELIVERY_PLAN_ID =", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdNotEqualTo(String value) {
            addCriterion("DELIVERY_PLAN_ID <>", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdGreaterThan(String value) {
            addCriterion("DELIVERY_PLAN_ID >", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_PLAN_ID >=", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdLessThan(String value) {
            addCriterion("DELIVERY_PLAN_ID <", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_PLAN_ID <=", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdLike(String value) {
            addCriterion("DELIVERY_PLAN_ID like", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdNotLike(String value) {
            addCriterion("DELIVERY_PLAN_ID not like", value, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdIn(List<String> values) {
            addCriterion("DELIVERY_PLAN_ID in", values, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdNotIn(List<String> values) {
            addCriterion("DELIVERY_PLAN_ID not in", values, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdBetween(String value1, String value2) {
            addCriterion("DELIVERY_PLAN_ID between", value1, value2, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlanIdNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_PLAN_ID not between", value1, value2, "deliveryPlanId");
            return (Criteria) this;
        }

        public Criteria andContractItemIsNull() {
            addCriterion("\"CONTRACT _ITEM\" is null");
            return (Criteria) this;
        }

        public Criteria andContractItemIsNotNull() {
            addCriterion("\"CONTRACT _ITEM\" is not null");
            return (Criteria) this;
        }

        public Criteria andContractItemEqualTo(String value) {
            addCriterion("\"CONTRACT _ITEM\" =", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemNotEqualTo(String value) {
            addCriterion("\"CONTRACT _ITEM\" <>", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemGreaterThan(String value) {
            addCriterion("\"CONTRACT _ITEM\" >", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemGreaterThanOrEqualTo(String value) {
            addCriterion("\"CONTRACT _ITEM\" >=", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemLessThan(String value) {
            addCriterion("\"CONTRACT _ITEM\" <", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemLessThanOrEqualTo(String value) {
            addCriterion("\"CONTRACT _ITEM\" <=", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemLike(String value) {
            addCriterion("\"CONTRACT _ITEM\" like", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemNotLike(String value) {
            addCriterion("\"CONTRACT _ITEM\" not like", value, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemIn(List<String> values) {
            addCriterion("\"CONTRACT _ITEM\" in", values, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemNotIn(List<String> values) {
            addCriterion("\"CONTRACT _ITEM\" not in", values, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemBetween(String value1, String value2) {
            addCriterion("\"CONTRACT _ITEM\" between", value1, value2, "contractItem");
            return (Criteria) this;
        }

        public Criteria andContractItemNotBetween(String value1, String value2) {
            addCriterion("\"CONTRACT _ITEM\" not between", value1, value2, "contractItem");
            return (Criteria) this;
        }

        public Criteria andPlanNoIsNull() {
            addCriterion("PLAN_NO is null");
            return (Criteria) this;
        }

        public Criteria andPlanNoIsNotNull() {
            addCriterion("PLAN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNoEqualTo(Integer value) {
            addCriterion("PLAN_NO =", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotEqualTo(Integer value) {
            addCriterion("PLAN_NO <>", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoGreaterThan(Integer value) {
            addCriterion("PLAN_NO >", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_NO >=", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoLessThan(Integer value) {
            addCriterion("PLAN_NO <", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_NO <=", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoIn(List<Integer> values) {
            addCriterion("PLAN_NO in", values, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotIn(List<Integer> values) {
            addCriterion("PLAN_NO not in", values, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_NO between", value1, value2, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_NO not between", value1, value2, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("PLAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("PLAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DATE =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DATE <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PLAN_DATE >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DATE >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterionForJDBCDate("PLAN_DATE <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DATE <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_DATE in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_DATE not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_DATE between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_DATE not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andMaterielNoIsNull() {
            addCriterion("MATERIEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andMaterielNoIsNotNull() {
            addCriterion("MATERIEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielNoEqualTo(String value) {
            addCriterion("MATERIEL_NO =", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoNotEqualTo(String value) {
            addCriterion("MATERIEL_NO <>", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoGreaterThan(String value) {
            addCriterion("MATERIEL_NO >", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIEL_NO >=", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoLessThan(String value) {
            addCriterion("MATERIEL_NO <", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoLessThanOrEqualTo(String value) {
            addCriterion("MATERIEL_NO <=", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoLike(String value) {
            addCriterion("MATERIEL_NO like", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoNotLike(String value) {
            addCriterion("MATERIEL_NO not like", value, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoIn(List<String> values) {
            addCriterion("MATERIEL_NO in", values, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoNotIn(List<String> values) {
            addCriterion("MATERIEL_NO not in", values, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoBetween(String value1, String value2) {
            addCriterion("MATERIEL_NO between", value1, value2, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielNoNotBetween(String value1, String value2) {
            addCriterion("MATERIEL_NO not between", value1, value2, "materielNo");
            return (Criteria) this;
        }

        public Criteria andMaterielDesIsNull() {
            addCriterion("MATERIEL_DES is null");
            return (Criteria) this;
        }

        public Criteria andMaterielDesIsNotNull() {
            addCriterion("MATERIEL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielDesEqualTo(String value) {
            addCriterion("MATERIEL_DES =", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesNotEqualTo(String value) {
            addCriterion("MATERIEL_DES <>", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesGreaterThan(String value) {
            addCriterion("MATERIEL_DES >", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIEL_DES >=", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesLessThan(String value) {
            addCriterion("MATERIEL_DES <", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesLessThanOrEqualTo(String value) {
            addCriterion("MATERIEL_DES <=", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesLike(String value) {
            addCriterion("MATERIEL_DES like", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesNotLike(String value) {
            addCriterion("MATERIEL_DES not like", value, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesIn(List<String> values) {
            addCriterion("MATERIEL_DES in", values, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesNotIn(List<String> values) {
            addCriterion("MATERIEL_DES not in", values, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesBetween(String value1, String value2) {
            addCriterion("MATERIEL_DES between", value1, value2, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMaterielDesNotBetween(String value1, String value2) {
            addCriterion("MATERIEL_DES not between", value1, value2, "materielDes");
            return (Criteria) this;
        }

        public Criteria andMountIsNull() {
            addCriterion("MOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMountIsNotNull() {
            addCriterion("MOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMountEqualTo(Integer value) {
            addCriterion("MOUNT =", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountNotEqualTo(Integer value) {
            addCriterion("MOUNT <>", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountGreaterThan(Integer value) {
            addCriterion("MOUNT >", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOUNT >=", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountLessThan(Integer value) {
            addCriterion("MOUNT <", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountLessThanOrEqualTo(Integer value) {
            addCriterion("MOUNT <=", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountIn(List<Integer> values) {
            addCriterion("MOUNT in", values, "mount");
            return (Criteria) this;
        }

        public Criteria andMountNotIn(List<Integer> values) {
            addCriterion("MOUNT not in", values, "mount");
            return (Criteria) this;
        }

        public Criteria andMountBetween(Integer value1, Integer value2) {
            addCriterion("MOUNT between", value1, value2, "mount");
            return (Criteria) this;
        }

        public Criteria andMountNotBetween(Integer value1, Integer value2) {
            addCriterion("MOUNT not between", value1, value2, "mount");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
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

        public Criteria andSalesOrderNoIsNull() {
            addCriterion("SALES_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoIsNotNull() {
            addCriterion("SALES_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoEqualTo(String value) {
            addCriterion("SALES_ORDER_NO =", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoNotEqualTo(String value) {
            addCriterion("SALES_ORDER_NO <>", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoGreaterThan(String value) {
            addCriterion("SALES_ORDER_NO >", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_ORDER_NO >=", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoLessThan(String value) {
            addCriterion("SALES_ORDER_NO <", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoLessThanOrEqualTo(String value) {
            addCriterion("SALES_ORDER_NO <=", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoLike(String value) {
            addCriterion("SALES_ORDER_NO like", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoNotLike(String value) {
            addCriterion("SALES_ORDER_NO not like", value, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoIn(List<String> values) {
            addCriterion("SALES_ORDER_NO in", values, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoNotIn(List<String> values) {
            addCriterion("SALES_ORDER_NO not in", values, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoBetween(String value1, String value2) {
            addCriterion("SALES_ORDER_NO between", value1, value2, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNoNotBetween(String value1, String value2) {
            addCriterion("SALES_ORDER_NO not between", value1, value2, "salesOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoIsNull() {
            addCriterion("DELIVERY_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoIsNotNull() {
            addCriterion("DELIVERY_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoEqualTo(String value) {
            addCriterion("DELIVERY_ORDER_NO =", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotEqualTo(String value) {
            addCriterion("DELIVERY_ORDER_NO <>", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoGreaterThan(String value) {
            addCriterion("DELIVERY_ORDER_NO >", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ORDER_NO >=", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoLessThan(String value) {
            addCriterion("DELIVERY_ORDER_NO <", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ORDER_NO <=", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoLike(String value) {
            addCriterion("DELIVERY_ORDER_NO like", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotLike(String value) {
            addCriterion("DELIVERY_ORDER_NO not like", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoIn(List<String> values) {
            addCriterion("DELIVERY_ORDER_NO in", values, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotIn(List<String> values) {
            addCriterion("DELIVERY_ORDER_NO not in", values, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoBetween(String value1, String value2) {
            addCriterion("DELIVERY_ORDER_NO between", value1, value2, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_ORDER_NO not between", value1, value2, "deliveryOrderNo");
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