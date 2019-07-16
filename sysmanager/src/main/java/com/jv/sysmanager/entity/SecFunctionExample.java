package com.jv.sysmanager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecFunctionExample() {
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

        public Criteria andFunctionidIsNull() {
            addCriterion("FunctionId is null");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNotNull() {
            addCriterion("FunctionId is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionidEqualTo(Integer value) {
            addCriterion("FunctionId =", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotEqualTo(Integer value) {
            addCriterion("FunctionId <>", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThan(Integer value) {
            addCriterion("FunctionId >", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FunctionId >=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThan(Integer value) {
            addCriterion("FunctionId <", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThanOrEqualTo(Integer value) {
            addCriterion("FunctionId <=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIn(List<Integer> values) {
            addCriterion("FunctionId in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotIn(List<Integer> values) {
            addCriterion("FunctionId not in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidBetween(Integer value1, Integer value2) {
            addCriterion("FunctionId between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotBetween(Integer value1, Integer value2) {
            addCriterion("FunctionId not between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunnameIsNull() {
            addCriterion("FunName is null");
            return (Criteria) this;
        }

        public Criteria andFunnameIsNotNull() {
            addCriterion("FunName is not null");
            return (Criteria) this;
        }

        public Criteria andFunnameEqualTo(String value) {
            addCriterion("FunName =", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameNotEqualTo(String value) {
            addCriterion("FunName <>", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameGreaterThan(String value) {
            addCriterion("FunName >", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameGreaterThanOrEqualTo(String value) {
            addCriterion("FunName >=", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameLessThan(String value) {
            addCriterion("FunName <", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameLessThanOrEqualTo(String value) {
            addCriterion("FunName <=", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameLike(String value) {
            addCriterion("FunName like", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameNotLike(String value) {
            addCriterion("FunName not like", value, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameIn(List<String> values) {
            addCriterion("FunName in", values, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameNotIn(List<String> values) {
            addCriterion("FunName not in", values, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameBetween(String value1, String value2) {
            addCriterion("FunName between", value1, value2, "funname");
            return (Criteria) this;
        }

        public Criteria andFunnameNotBetween(String value1, String value2) {
            addCriterion("FunName not between", value1, value2, "funname");
            return (Criteria) this;
        }

        public Criteria andFuntypeIsNull() {
            addCriterion("FunType is null");
            return (Criteria) this;
        }

        public Criteria andFuntypeIsNotNull() {
            addCriterion("FunType is not null");
            return (Criteria) this;
        }

        public Criteria andFuntypeEqualTo(Integer value) {
            addCriterion("FunType =", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotEqualTo(Integer value) {
            addCriterion("FunType <>", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeGreaterThan(Integer value) {
            addCriterion("FunType >", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FunType >=", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLessThan(Integer value) {
            addCriterion("FunType <", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeLessThanOrEqualTo(Integer value) {
            addCriterion("FunType <=", value, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeIn(List<Integer> values) {
            addCriterion("FunType in", values, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotIn(List<Integer> values) {
            addCriterion("FunType not in", values, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeBetween(Integer value1, Integer value2) {
            addCriterion("FunType between", value1, value2, "funtype");
            return (Criteria) this;
        }

        public Criteria andFuntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FunType not between", value1, value2, "funtype");
            return (Criteria) this;
        }

        public Criteria andEffectdateIsNull() {
            addCriterion("EffectDate is null");
            return (Criteria) this;
        }

        public Criteria andEffectdateIsNotNull() {
            addCriterion("EffectDate is not null");
            return (Criteria) this;
        }

        public Criteria andEffectdateEqualTo(Date value) {
            addCriterion("EffectDate =", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateNotEqualTo(Date value) {
            addCriterion("EffectDate <>", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateGreaterThan(Date value) {
            addCriterion("EffectDate >", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EffectDate >=", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateLessThan(Date value) {
            addCriterion("EffectDate <", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateLessThanOrEqualTo(Date value) {
            addCriterion("EffectDate <=", value, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateIn(List<Date> values) {
            addCriterion("EffectDate in", values, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateNotIn(List<Date> values) {
            addCriterion("EffectDate not in", values, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateBetween(Date value1, Date value2) {
            addCriterion("EffectDate between", value1, value2, "effectdate");
            return (Criteria) this;
        }

        public Criteria andEffectdateNotBetween(Date value1, Date value2) {
            addCriterion("EffectDate not between", value1, value2, "effectdate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNull() {
            addCriterion("ExpireDate is null");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNotNull() {
            addCriterion("ExpireDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredateEqualTo(Date value) {
            addCriterion("ExpireDate =", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotEqualTo(Date value) {
            addCriterion("ExpireDate <>", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThan(Date value) {
            addCriterion("ExpireDate >", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpireDate >=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThan(Date value) {
            addCriterion("ExpireDate <", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThanOrEqualTo(Date value) {
            addCriterion("ExpireDate <=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIn(List<Date> values) {
            addCriterion("ExpireDate in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotIn(List<Date> values) {
            addCriterion("ExpireDate not in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateBetween(Date value1, Date value2) {
            addCriterion("ExpireDate between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotBetween(Date value1, Date value2) {
            addCriterion("ExpireDate not between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOpidIsNull() {
            addCriterion("OpId is null");
            return (Criteria) this;
        }

        public Criteria andOpidIsNotNull() {
            addCriterion("OpId is not null");
            return (Criteria) this;
        }

        public Criteria andOpidEqualTo(Integer value) {
            addCriterion("OpId =", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotEqualTo(Integer value) {
            addCriterion("OpId <>", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidGreaterThan(Integer value) {
            addCriterion("OpId >", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OpId >=", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLessThan(Integer value) {
            addCriterion("OpId <", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLessThanOrEqualTo(Integer value) {
            addCriterion("OpId <=", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidIn(List<Integer> values) {
            addCriterion("OpId in", values, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotIn(List<Integer> values) {
            addCriterion("OpId not in", values, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidBetween(Integer value1, Integer value2) {
            addCriterion("OpId between", value1, value2, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotBetween(Integer value1, Integer value2) {
            addCriterion("OpId not between", value1, value2, "opid");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UpdateDate not between", value1, value2, "updatedate");
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