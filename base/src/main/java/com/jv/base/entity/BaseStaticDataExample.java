package com.jv.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseStaticDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseStaticDataExample() {
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

        public Criteria andStaticcodeIsNull() {
            addCriterion("StaticCode is null");
            return (Criteria) this;
        }

        public Criteria andStaticcodeIsNotNull() {
            addCriterion("StaticCode is not null");
            return (Criteria) this;
        }

        public Criteria andStaticcodeEqualTo(String value) {
            addCriterion("StaticCode =", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeNotEqualTo(String value) {
            addCriterion("StaticCode <>", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeGreaterThan(String value) {
            addCriterion("StaticCode >", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeGreaterThanOrEqualTo(String value) {
            addCriterion("StaticCode >=", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeLessThan(String value) {
            addCriterion("StaticCode <", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeLessThanOrEqualTo(String value) {
            addCriterion("StaticCode <=", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeLike(String value) {
            addCriterion("StaticCode like", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeNotLike(String value) {
            addCriterion("StaticCode not like", value, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeIn(List<String> values) {
            addCriterion("StaticCode in", values, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeNotIn(List<String> values) {
            addCriterion("StaticCode not in", values, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeBetween(String value1, String value2) {
            addCriterion("StaticCode between", value1, value2, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticcodeNotBetween(String value1, String value2) {
            addCriterion("StaticCode not between", value1, value2, "staticcode");
            return (Criteria) this;
        }

        public Criteria andStaticnameIsNull() {
            addCriterion("StaticName is null");
            return (Criteria) this;
        }

        public Criteria andStaticnameIsNotNull() {
            addCriterion("StaticName is not null");
            return (Criteria) this;
        }

        public Criteria andStaticnameEqualTo(String value) {
            addCriterion("StaticName =", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameNotEqualTo(String value) {
            addCriterion("StaticName <>", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameGreaterThan(String value) {
            addCriterion("StaticName >", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameGreaterThanOrEqualTo(String value) {
            addCriterion("StaticName >=", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameLessThan(String value) {
            addCriterion("StaticName <", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameLessThanOrEqualTo(String value) {
            addCriterion("StaticName <=", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameLike(String value) {
            addCriterion("StaticName like", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameNotLike(String value) {
            addCriterion("StaticName not like", value, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameIn(List<String> values) {
            addCriterion("StaticName in", values, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameNotIn(List<String> values) {
            addCriterion("StaticName not in", values, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameBetween(String value1, String value2) {
            addCriterion("StaticName between", value1, value2, "staticname");
            return (Criteria) this;
        }

        public Criteria andStaticnameNotBetween(String value1, String value2) {
            addCriterion("StaticName not between", value1, value2, "staticname");
            return (Criteria) this;
        }

        public Criteria andStatictypeIsNull() {
            addCriterion("StaticType is null");
            return (Criteria) this;
        }

        public Criteria andStatictypeIsNotNull() {
            addCriterion("StaticType is not null");
            return (Criteria) this;
        }

        public Criteria andStatictypeEqualTo(Integer value) {
            addCriterion("StaticType =", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeNotEqualTo(Integer value) {
            addCriterion("StaticType <>", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeGreaterThan(Integer value) {
            addCriterion("StaticType >", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("StaticType >=", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeLessThan(Integer value) {
            addCriterion("StaticType <", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeLessThanOrEqualTo(Integer value) {
            addCriterion("StaticType <=", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeIn(List<Integer> values) {
            addCriterion("StaticType in", values, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeNotIn(List<Integer> values) {
            addCriterion("StaticType not in", values, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeBetween(Integer value1, Integer value2) {
            addCriterion("StaticType between", value1, value2, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeNotBetween(Integer value1, Integer value2) {
            addCriterion("StaticType not between", value1, value2, "statictype");
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

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andStaticvalueIsNull() {
            addCriterion("StaticValue is null");
            return (Criteria) this;
        }

        public Criteria andStaticvalueIsNotNull() {
            addCriterion("StaticValue is not null");
            return (Criteria) this;
        }

        public Criteria andStaticvalueEqualTo(String value) {
            addCriterion("StaticValue =", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueNotEqualTo(String value) {
            addCriterion("StaticValue <>", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueGreaterThan(String value) {
            addCriterion("StaticValue >", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueGreaterThanOrEqualTo(String value) {
            addCriterion("StaticValue >=", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueLessThan(String value) {
            addCriterion("StaticValue <", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueLessThanOrEqualTo(String value) {
            addCriterion("StaticValue <=", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueLike(String value) {
            addCriterion("StaticValue like", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueNotLike(String value) {
            addCriterion("StaticValue not like", value, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueIn(List<String> values) {
            addCriterion("StaticValue in", values, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueNotIn(List<String> values) {
            addCriterion("StaticValue not in", values, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueBetween(String value1, String value2) {
            addCriterion("StaticValue between", value1, value2, "staticvalue");
            return (Criteria) this;
        }

        public Criteria andStaticvalueNotBetween(String value1, String value2) {
            addCriterion("StaticValue not between", value1, value2, "staticvalue");
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