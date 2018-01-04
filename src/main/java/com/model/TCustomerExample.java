package com.model;

import java.util.ArrayList;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CustomerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CustomerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CustomerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CustomerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CustomerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CustomerId like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CustomerId not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CustomerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CustomerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CustomerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CustomerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordIsNull() {
            addCriterion("CustomerPassword is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordIsNotNull() {
            addCriterion("CustomerPassword is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordEqualTo(String value) {
            addCriterion("CustomerPassword =", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordNotEqualTo(String value) {
            addCriterion("CustomerPassword <>", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordGreaterThan(String value) {
            addCriterion("CustomerPassword >", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerPassword >=", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordLessThan(String value) {
            addCriterion("CustomerPassword <", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordLessThanOrEqualTo(String value) {
            addCriterion("CustomerPassword <=", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordLike(String value) {
            addCriterion("CustomerPassword like", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordNotLike(String value) {
            addCriterion("CustomerPassword not like", value, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordIn(List<String> values) {
            addCriterion("CustomerPassword in", values, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordNotIn(List<String> values) {
            addCriterion("CustomerPassword not in", values, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordBetween(String value1, String value2) {
            addCriterion("CustomerPassword between", value1, value2, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomerpasswordNotBetween(String value1, String value2) {
            addCriterion("CustomerPassword not between", value1, value2, "customerpassword");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNull() {
            addCriterion("CustomerSex is null");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNotNull() {
            addCriterion("CustomerSex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersexEqualTo(Integer value) {
            addCriterion("CustomerSex =", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotEqualTo(Integer value) {
            addCriterion("CustomerSex <>", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThan(Integer value) {
            addCriterion("CustomerSex >", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerSex >=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThan(Integer value) {
            addCriterion("CustomerSex <", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerSex <=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexIn(List<Integer> values) {
            addCriterion("CustomerSex in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotIn(List<Integer> values) {
            addCriterion("CustomerSex not in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexBetween(Integer value1, Integer value2) {
            addCriterion("CustomerSex between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerSex not between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCustomertelIsNull() {
            addCriterion("CustomerTel is null");
            return (Criteria) this;
        }

        public Criteria andCustomertelIsNotNull() {
            addCriterion("CustomerTel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertelEqualTo(String value) {
            addCriterion("CustomerTel =", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotEqualTo(String value) {
            addCriterion("CustomerTel <>", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelGreaterThan(String value) {
            addCriterion("CustomerTel >", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerTel >=", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLessThan(String value) {
            addCriterion("CustomerTel <", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLessThanOrEqualTo(String value) {
            addCriterion("CustomerTel <=", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLike(String value) {
            addCriterion("CustomerTel like", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotLike(String value) {
            addCriterion("CustomerTel not like", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelIn(List<String> values) {
            addCriterion("CustomerTel in", values, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotIn(List<String> values) {
            addCriterion("CustomerTel not in", values, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelBetween(String value1, String value2) {
            addCriterion("CustomerTel between", value1, value2, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotBetween(String value1, String value2) {
            addCriterion("CustomerTel not between", value1, value2, "customertel");
            return (Criteria) this;
        }

        public Criteria andWorktotalIsNull() {
            addCriterion("WorkTotal is null");
            return (Criteria) this;
        }

        public Criteria andWorktotalIsNotNull() {
            addCriterion("WorkTotal is not null");
            return (Criteria) this;
        }

        public Criteria andWorktotalEqualTo(Integer value) {
            addCriterion("WorkTotal =", value, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalNotEqualTo(Integer value) {
            addCriterion("WorkTotal <>", value, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalGreaterThan(Integer value) {
            addCriterion("WorkTotal >", value, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkTotal >=", value, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalLessThan(Integer value) {
            addCriterion("WorkTotal <", value, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalLessThanOrEqualTo(Integer value) {
            addCriterion("WorkTotal <=", value, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalIn(List<Integer> values) {
            addCriterion("WorkTotal in", values, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalNotIn(List<Integer> values) {
            addCriterion("WorkTotal not in", values, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalBetween(Integer value1, Integer value2) {
            addCriterion("WorkTotal between", value1, value2, "worktotal");
            return (Criteria) this;
        }

        public Criteria andWorktotalNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkTotal not between", value1, value2, "worktotal");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkIsNull() {
            addCriterion("HasApplyWork is null");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkIsNotNull() {
            addCriterion("HasApplyWork is not null");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkEqualTo(Byte value) {
            addCriterion("HasApplyWork =", value, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkNotEqualTo(Byte value) {
            addCriterion("HasApplyWork <>", value, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkGreaterThan(Byte value) {
            addCriterion("HasApplyWork >", value, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkGreaterThanOrEqualTo(Byte value) {
            addCriterion("HasApplyWork >=", value, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkLessThan(Byte value) {
            addCriterion("HasApplyWork <", value, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkLessThanOrEqualTo(Byte value) {
            addCriterion("HasApplyWork <=", value, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkIn(List<Byte> values) {
            addCriterion("HasApplyWork in", values, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkNotIn(List<Byte> values) {
            addCriterion("HasApplyWork not in", values, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkBetween(Byte value1, Byte value2) {
            addCriterion("HasApplyWork between", value1, value2, "hasapplywork");
            return (Criteria) this;
        }

        public Criteria andHasapplyworkNotBetween(Byte value1, Byte value2) {
            addCriterion("HasApplyWork not between", value1, value2, "hasapplywork");
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