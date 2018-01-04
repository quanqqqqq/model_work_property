package com.model;

import java.util.ArrayList;
import java.util.List;

public class TWorkersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWorkersExample() {
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

        public Criteria andWorkeridIsNull() {
            addCriterion("WorkerId is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("WorkerId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(String value) {
            addCriterion("WorkerId =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(String value) {
            addCriterion("WorkerId <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(String value) {
            addCriterion("WorkerId >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerId >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(String value) {
            addCriterion("WorkerId <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(String value) {
            addCriterion("WorkerId <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLike(String value) {
            addCriterion("WorkerId like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotLike(String value) {
            addCriterion("WorkerId not like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<String> values) {
            addCriterion("WorkerId in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<String> values) {
            addCriterion("WorkerId not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(String value1, String value2) {
            addCriterion("WorkerId between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(String value1, String value2) {
            addCriterion("WorkerId not between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNull() {
            addCriterion("WorkerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("WorkerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("WorkerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("WorkerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("WorkerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("WorkerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("WorkerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("WorkerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("WorkerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("WorkerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("WorkerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("WorkerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("WorkerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordIsNull() {
            addCriterion("WorkerPassword is null");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordIsNotNull() {
            addCriterion("WorkerPassword is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordEqualTo(String value) {
            addCriterion("WorkerPassword =", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotEqualTo(String value) {
            addCriterion("WorkerPassword <>", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordGreaterThan(String value) {
            addCriterion("WorkerPassword >", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerPassword >=", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordLessThan(String value) {
            addCriterion("WorkerPassword <", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordLessThanOrEqualTo(String value) {
            addCriterion("WorkerPassword <=", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordLike(String value) {
            addCriterion("WorkerPassword like", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotLike(String value) {
            addCriterion("WorkerPassword not like", value, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordIn(List<String> values) {
            addCriterion("WorkerPassword in", values, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotIn(List<String> values) {
            addCriterion("WorkerPassword not in", values, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordBetween(String value1, String value2) {
            addCriterion("WorkerPassword between", value1, value2, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkerpasswordNotBetween(String value1, String value2) {
            addCriterion("WorkerPassword not between", value1, value2, "workerpassword");
            return (Criteria) this;
        }

        public Criteria andWorkertelIsNull() {
            addCriterion("WorkerTel is null");
            return (Criteria) this;
        }

        public Criteria andWorkertelIsNotNull() {
            addCriterion("WorkerTel is not null");
            return (Criteria) this;
        }

        public Criteria andWorkertelEqualTo(String value) {
            addCriterion("WorkerTel =", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelNotEqualTo(String value) {
            addCriterion("WorkerTel <>", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelGreaterThan(String value) {
            addCriterion("WorkerTel >", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerTel >=", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelLessThan(String value) {
            addCriterion("WorkerTel <", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelLessThanOrEqualTo(String value) {
            addCriterion("WorkerTel <=", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelLike(String value) {
            addCriterion("WorkerTel like", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelNotLike(String value) {
            addCriterion("WorkerTel not like", value, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelIn(List<String> values) {
            addCriterion("WorkerTel in", values, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelNotIn(List<String> values) {
            addCriterion("WorkerTel not in", values, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelBetween(String value1, String value2) {
            addCriterion("WorkerTel between", value1, value2, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkertelNotBetween(String value1, String value2) {
            addCriterion("WorkerTel not between", value1, value2, "workertel");
            return (Criteria) this;
        }

        public Criteria andWorkeremailIsNull() {
            addCriterion("WorkerEmail is null");
            return (Criteria) this;
        }

        public Criteria andWorkeremailIsNotNull() {
            addCriterion("WorkerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeremailEqualTo(String value) {
            addCriterion("WorkerEmail =", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailNotEqualTo(String value) {
            addCriterion("WorkerEmail <>", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailGreaterThan(String value) {
            addCriterion("WorkerEmail >", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerEmail >=", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailLessThan(String value) {
            addCriterion("WorkerEmail <", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailLessThanOrEqualTo(String value) {
            addCriterion("WorkerEmail <=", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailLike(String value) {
            addCriterion("WorkerEmail like", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailNotLike(String value) {
            addCriterion("WorkerEmail not like", value, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailIn(List<String> values) {
            addCriterion("WorkerEmail in", values, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailNotIn(List<String> values) {
            addCriterion("WorkerEmail not in", values, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailBetween(String value1, String value2) {
            addCriterion("WorkerEmail between", value1, value2, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeremailNotBetween(String value1, String value2) {
            addCriterion("WorkerEmail not between", value1, value2, "workeremail");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressIsNull() {
            addCriterion("WorkerAddress is null");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressIsNotNull() {
            addCriterion("WorkerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressEqualTo(String value) {
            addCriterion("WorkerAddress =", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressNotEqualTo(String value) {
            addCriterion("WorkerAddress <>", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressGreaterThan(String value) {
            addCriterion("WorkerAddress >", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerAddress >=", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressLessThan(String value) {
            addCriterion("WorkerAddress <", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressLessThanOrEqualTo(String value) {
            addCriterion("WorkerAddress <=", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressLike(String value) {
            addCriterion("WorkerAddress like", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressNotLike(String value) {
            addCriterion("WorkerAddress not like", value, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressIn(List<String> values) {
            addCriterion("WorkerAddress in", values, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressNotIn(List<String> values) {
            addCriterion("WorkerAddress not in", values, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressBetween(String value1, String value2) {
            addCriterion("WorkerAddress between", value1, value2, "workeraddress");
            return (Criteria) this;
        }

        public Criteria andWorkeraddressNotBetween(String value1, String value2) {
            addCriterion("WorkerAddress not between", value1, value2, "workeraddress");
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