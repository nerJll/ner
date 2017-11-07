package com.aiko.pactdetail.dto;

import java.util.ArrayList;
import java.util.List;

public class AikoContractDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AikoContractDetailExample() {
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

        public Criteria andContractDetailIdIsNull() {
            addCriterion("CONTRACT_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdIsNotNull() {
            addCriterion("CONTRACT_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_ID =", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdNotEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_ID <>", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdGreaterThan(String value) {
            addCriterion("CONTRACT_DETAIL_ID >", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_ID >=", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdLessThan(String value) {
            addCriterion("CONTRACT_DETAIL_ID <", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_ID <=", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdLike(String value) {
            addCriterion("CONTRACT_DETAIL_ID like", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdNotLike(String value) {
            addCriterion("CONTRACT_DETAIL_ID not like", value, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdIn(List<String> values) {
            addCriterion("CONTRACT_DETAIL_ID in", values, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdNotIn(List<String> values) {
            addCriterion("CONTRACT_DETAIL_ID not in", values, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_DETAIL_ID between", value1, value2, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_DETAIL_ID not between", value1, value2, "contractDetailId");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoIsNull() {
            addCriterion("CONTRACT_DETAIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoIsNotNull() {
            addCriterion("CONTRACT_DETAIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_NO =", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoNotEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_NO <>", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoGreaterThan(String value) {
            addCriterion("CONTRACT_DETAIL_NO >", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_NO >=", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoLessThan(String value) {
            addCriterion("CONTRACT_DETAIL_NO <", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DETAIL_NO <=", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoLike(String value) {
            addCriterion("CONTRACT_DETAIL_NO like", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoNotLike(String value) {
            addCriterion("CONTRACT_DETAIL_NO not like", value, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoIn(List<String> values) {
            addCriterion("CONTRACT_DETAIL_NO in", values, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoNotIn(List<String> values) {
            addCriterion("CONTRACT_DETAIL_NO not in", values, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoBetween(String value1, String value2) {
            addCriterion("CONTRACT_DETAIL_NO between", value1, value2, "contractDetailNo");
            return (Criteria) this;
        }

        public Criteria andContractDetailNoNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_DETAIL_NO not between", value1, value2, "contractDetailNo");
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

        public Criteria andUnitCostIsNull() {
            addCriterion("UNIT_COST is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("UNIT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(Double value) {
            addCriterion("UNIT_COST =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(Double value) {
            addCriterion("UNIT_COST <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(Double value) {
            addCriterion("UNIT_COST >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(Double value) {
            addCriterion("UNIT_COST >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(Double value) {
            addCriterion("UNIT_COST <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(Double value) {
            addCriterion("UNIT_COST <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<Double> values) {
            addCriterion("UNIT_COST in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<Double> values) {
            addCriterion("UNIT_COST not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(Double value1, Double value2) {
            addCriterion("UNIT_COST between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(Double value1, Double value2) {
            addCriterion("UNIT_COST not between", value1, value2, "unitCost");
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

        public Criteria andOrderStateIsNull() {
            addCriterion("ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("ORDER_STATE =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("ORDER_STATE <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("ORDER_STATE >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATE >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("ORDER_STATE <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATE <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("ORDER_STATE like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("ORDER_STATE not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("ORDER_STATE in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("ORDER_STATE not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("ORDER_STATE between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATE not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateIsNull() {
            addCriterion("DELIVERY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateIsNotNull() {
            addCriterion("DELIVERY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateEqualTo(String value) {
            addCriterion("DELIVERY_STATE =", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotEqualTo(String value) {
            addCriterion("DELIVERY_STATE <>", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateGreaterThan(String value) {
            addCriterion("DELIVERY_STATE >", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_STATE >=", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateLessThan(String value) {
            addCriterion("DELIVERY_STATE <", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_STATE <=", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateLike(String value) {
            addCriterion("DELIVERY_STATE like", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotLike(String value) {
            addCriterion("DELIVERY_STATE not like", value, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateIn(List<String> values) {
            addCriterion("DELIVERY_STATE in", values, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotIn(List<String> values) {
            addCriterion("DELIVERY_STATE not in", values, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateBetween(String value1, String value2) {
            addCriterion("DELIVERY_STATE between", value1, value2, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andDeliveryStateNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_STATE not between", value1, value2, "deliveryState");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNull() {
            addCriterion("BILL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNotNull() {
            addCriterion("BILL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBillStateEqualTo(String value) {
            addCriterion("BILL_STATE =", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotEqualTo(String value) {
            addCriterion("BILL_STATE <>", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThan(String value) {
            addCriterion("BILL_STATE >", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_STATE >=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThan(String value) {
            addCriterion("BILL_STATE <", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThanOrEqualTo(String value) {
            addCriterion("BILL_STATE <=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLike(String value) {
            addCriterion("BILL_STATE like", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotLike(String value) {
            addCriterion("BILL_STATE not like", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateIn(List<String> values) {
            addCriterion("BILL_STATE in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotIn(List<String> values) {
            addCriterion("BILL_STATE not in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateBetween(String value1, String value2) {
            addCriterion("BILL_STATE between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotBetween(String value1, String value2) {
            addCriterion("BILL_STATE not between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andSiliconIsNull() {
            addCriterion("SILICON is null");
            return (Criteria) this;
        }

        public Criteria andSiliconIsNotNull() {
            addCriterion("SILICON is not null");
            return (Criteria) this;
        }

        public Criteria andSiliconEqualTo(String value) {
            addCriterion("SILICON =", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconNotEqualTo(String value) {
            addCriterion("SILICON <>", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconGreaterThan(String value) {
            addCriterion("SILICON >", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconGreaterThanOrEqualTo(String value) {
            addCriterion("SILICON >=", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconLessThan(String value) {
            addCriterion("SILICON <", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconLessThanOrEqualTo(String value) {
            addCriterion("SILICON <=", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconLike(String value) {
            addCriterion("SILICON like", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconNotLike(String value) {
            addCriterion("SILICON not like", value, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconIn(List<String> values) {
            addCriterion("SILICON in", values, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconNotIn(List<String> values) {
            addCriterion("SILICON not in", values, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconBetween(String value1, String value2) {
            addCriterion("SILICON between", value1, value2, "silicon");
            return (Criteria) this;
        }

        public Criteria andSiliconNotBetween(String value1, String value2) {
            addCriterion("SILICON not between", value1, value2, "silicon");
            return (Criteria) this;
        }

        public Criteria andMainGridIsNull() {
            addCriterion("MAIN_GRID is null");
            return (Criteria) this;
        }

        public Criteria andMainGridIsNotNull() {
            addCriterion("MAIN_GRID is not null");
            return (Criteria) this;
        }

        public Criteria andMainGridEqualTo(String value) {
            addCriterion("MAIN_GRID =", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridNotEqualTo(String value) {
            addCriterion("MAIN_GRID <>", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridGreaterThan(String value) {
            addCriterion("MAIN_GRID >", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_GRID >=", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridLessThan(String value) {
            addCriterion("MAIN_GRID <", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridLessThanOrEqualTo(String value) {
            addCriterion("MAIN_GRID <=", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridLike(String value) {
            addCriterion("MAIN_GRID like", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridNotLike(String value) {
            addCriterion("MAIN_GRID not like", value, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridIn(List<String> values) {
            addCriterion("MAIN_GRID in", values, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridNotIn(List<String> values) {
            addCriterion("MAIN_GRID not in", values, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridBetween(String value1, String value2) {
            addCriterion("MAIN_GRID between", value1, value2, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andMainGridNotBetween(String value1, String value2) {
            addCriterion("MAIN_GRID not between", value1, value2, "mainGrid");
            return (Criteria) this;
        }

        public Criteria andTechIsNull() {
            addCriterion("TECH is null");
            return (Criteria) this;
        }

        public Criteria andTechIsNotNull() {
            addCriterion("TECH is not null");
            return (Criteria) this;
        }

        public Criteria andTechEqualTo(String value) {
            addCriterion("TECH =", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotEqualTo(String value) {
            addCriterion("TECH <>", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechGreaterThan(String value) {
            addCriterion("TECH >", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechGreaterThanOrEqualTo(String value) {
            addCriterion("TECH >=", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechLessThan(String value) {
            addCriterion("TECH <", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechLessThanOrEqualTo(String value) {
            addCriterion("TECH <=", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechLike(String value) {
            addCriterion("TECH like", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotLike(String value) {
            addCriterion("TECH not like", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechIn(List<String> values) {
            addCriterion("TECH in", values, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotIn(List<String> values) {
            addCriterion("TECH not in", values, "tech");
            return (Criteria) this;
        }

        public Criteria andTechBetween(String value1, String value2) {
            addCriterion("TECH between", value1, value2, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotBetween(String value1, String value2) {
            addCriterion("TECH not between", value1, value2, "tech");
            return (Criteria) this;
        }

        public Criteria andConvertRateIsNull() {
            addCriterion("CONVERT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andConvertRateIsNotNull() {
            addCriterion("CONVERT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andConvertRateEqualTo(String value) {
            addCriterion("CONVERT_RATE =", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateNotEqualTo(String value) {
            addCriterion("CONVERT_RATE <>", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateGreaterThan(String value) {
            addCriterion("CONVERT_RATE >", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERT_RATE >=", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateLessThan(String value) {
            addCriterion("CONVERT_RATE <", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateLessThanOrEqualTo(String value) {
            addCriterion("CONVERT_RATE <=", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateLike(String value) {
            addCriterion("CONVERT_RATE like", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateNotLike(String value) {
            addCriterion("CONVERT_RATE not like", value, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateIn(List<String> values) {
            addCriterion("CONVERT_RATE in", values, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateNotIn(List<String> values) {
            addCriterion("CONVERT_RATE not in", values, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateBetween(String value1, String value2) {
            addCriterion("CONVERT_RATE between", value1, value2, "convertRate");
            return (Criteria) this;
        }

        public Criteria andConvertRateNotBetween(String value1, String value2) {
            addCriterion("CONVERT_RATE not between", value1, value2, "convertRate");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
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