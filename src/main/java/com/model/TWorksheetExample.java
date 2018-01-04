package com.model;

import java.util.ArrayList;
import java.util.List;

public class TWorksheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWorksheetExample() {
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

        public Criteria andSheetidIsNull() {
            addCriterion("SheetId is null");
            return (Criteria) this;
        }

        public Criteria andSheetidIsNotNull() {
            addCriterion("SheetId is not null");
            return (Criteria) this;
        }

        public Criteria andSheetidEqualTo(Integer value) {
            addCriterion("SheetId =", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotEqualTo(Integer value) {
            addCriterion("SheetId <>", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidGreaterThan(Integer value) {
            addCriterion("SheetId >", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SheetId >=", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLessThan(Integer value) {
            addCriterion("SheetId <", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLessThanOrEqualTo(Integer value) {
            addCriterion("SheetId <=", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidIn(List<Integer> values) {
            addCriterion("SheetId in", values, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotIn(List<Integer> values) {
            addCriterion("SheetId not in", values, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidBetween(Integer value1, Integer value2) {
            addCriterion("SheetId between", value1, value2, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotBetween(Integer value1, Integer value2) {
            addCriterion("SheetId not between", value1, value2, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetnameIsNull() {
            addCriterion("SheetName is null");
            return (Criteria) this;
        }

        public Criteria andSheetnameIsNotNull() {
            addCriterion("SheetName is not null");
            return (Criteria) this;
        }

        public Criteria andSheetnameEqualTo(String value) {
            addCriterion("SheetName =", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameNotEqualTo(String value) {
            addCriterion("SheetName <>", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameGreaterThan(String value) {
            addCriterion("SheetName >", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameGreaterThanOrEqualTo(String value) {
            addCriterion("SheetName >=", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameLessThan(String value) {
            addCriterion("SheetName <", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameLessThanOrEqualTo(String value) {
            addCriterion("SheetName <=", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameLike(String value) {
            addCriterion("SheetName like", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameNotLike(String value) {
            addCriterion("SheetName not like", value, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameIn(List<String> values) {
            addCriterion("SheetName in", values, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameNotIn(List<String> values) {
            addCriterion("SheetName not in", values, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameBetween(String value1, String value2) {
            addCriterion("SheetName between", value1, value2, "sheetname");
            return (Criteria) this;
        }

        public Criteria andSheetnameNotBetween(String value1, String value2) {
            addCriterion("SheetName not between", value1, value2, "sheetname");
            return (Criteria) this;
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

        public Criteria andAuthuseridIsNull() {
            addCriterion("AuthUserId is null");
            return (Criteria) this;
        }

        public Criteria andAuthuseridIsNotNull() {
            addCriterion("AuthUserId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthuseridEqualTo(String value) {
            addCriterion("AuthUserId =", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotEqualTo(String value) {
            addCriterion("AuthUserId <>", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridGreaterThan(String value) {
            addCriterion("AuthUserId >", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridGreaterThanOrEqualTo(String value) {
            addCriterion("AuthUserId >=", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridLessThan(String value) {
            addCriterion("AuthUserId <", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridLessThanOrEqualTo(String value) {
            addCriterion("AuthUserId <=", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridLike(String value) {
            addCriterion("AuthUserId like", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotLike(String value) {
            addCriterion("AuthUserId not like", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridIn(List<String> values) {
            addCriterion("AuthUserId in", values, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotIn(List<String> values) {
            addCriterion("AuthUserId not in", values, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridBetween(String value1, String value2) {
            addCriterion("AuthUserId between", value1, value2, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotBetween(String value1, String value2) {
            addCriterion("AuthUserId not between", value1, value2, "authuserid");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("Process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("Process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(Integer value) {
            addCriterion("Process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(Integer value) {
            addCriterion("Process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(Integer value) {
            addCriterion("Process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("Process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(Integer value) {
            addCriterion("Process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(Integer value) {
            addCriterion("Process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<Integer> values) {
            addCriterion("Process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<Integer> values) {
            addCriterion("Process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(Integer value1, Integer value2) {
            addCriterion("Process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("Process not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andComsumeIsNull() {
            addCriterion("Comsume is null");
            return (Criteria) this;
        }

        public Criteria andComsumeIsNotNull() {
            addCriterion("Comsume is not null");
            return (Criteria) this;
        }

        public Criteria andComsumeEqualTo(Integer value) {
            addCriterion("Comsume =", value, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeNotEqualTo(Integer value) {
            addCriterion("Comsume <>", value, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeGreaterThan(Integer value) {
            addCriterion("Comsume >", value, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Comsume >=", value, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeLessThan(Integer value) {
            addCriterion("Comsume <", value, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeLessThanOrEqualTo(Integer value) {
            addCriterion("Comsume <=", value, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeIn(List<Integer> values) {
            addCriterion("Comsume in", values, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeNotIn(List<Integer> values) {
            addCriterion("Comsume not in", values, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeBetween(Integer value1, Integer value2) {
            addCriterion("Comsume between", value1, value2, "comsume");
            return (Criteria) this;
        }

        public Criteria andComsumeNotBetween(Integer value1, Integer value2) {
            addCriterion("Comsume not between", value1, value2, "comsume");
            return (Criteria) this;
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