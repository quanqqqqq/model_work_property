package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TAuthuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAuthuserExample() {
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

        public Criteria andAuthusernameIsNull() {
            addCriterion("AuthUserName is null");
            return (Criteria) this;
        }

        public Criteria andAuthusernameIsNotNull() {
            addCriterion("AuthUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAuthusernameEqualTo(String value) {
            addCriterion("AuthUserName =", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameNotEqualTo(String value) {
            addCriterion("AuthUserName <>", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameGreaterThan(String value) {
            addCriterion("AuthUserName >", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameGreaterThanOrEqualTo(String value) {
            addCriterion("AuthUserName >=", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameLessThan(String value) {
            addCriterion("AuthUserName <", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameLessThanOrEqualTo(String value) {
            addCriterion("AuthUserName <=", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameLike(String value) {
            addCriterion("AuthUserName like", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameNotLike(String value) {
            addCriterion("AuthUserName not like", value, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameIn(List<String> values) {
            addCriterion("AuthUserName in", values, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameNotIn(List<String> values) {
            addCriterion("AuthUserName not in", values, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameBetween(String value1, String value2) {
            addCriterion("AuthUserName between", value1, value2, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusernameNotBetween(String value1, String value2) {
            addCriterion("AuthUserName not between", value1, value2, "authusername");
            return (Criteria) this;
        }

        public Criteria andAuthusersexIsNull() {
            addCriterion("AuthUserSex is null");
            return (Criteria) this;
        }

        public Criteria andAuthusersexIsNotNull() {
            addCriterion("AuthUserSex is not null");
            return (Criteria) this;
        }

        public Criteria andAuthusersexEqualTo(Integer value) {
            addCriterion("AuthUserSex =", value, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexNotEqualTo(Integer value) {
            addCriterion("AuthUserSex <>", value, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexGreaterThan(Integer value) {
            addCriterion("AuthUserSex >", value, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuthUserSex >=", value, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexLessThan(Integer value) {
            addCriterion("AuthUserSex <", value, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexLessThanOrEqualTo(Integer value) {
            addCriterion("AuthUserSex <=", value, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexIn(List<Integer> values) {
            addCriterion("AuthUserSex in", values, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexNotIn(List<Integer> values) {
            addCriterion("AuthUserSex not in", values, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexBetween(Integer value1, Integer value2) {
            addCriterion("AuthUserSex between", value1, value2, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthusersexNotBetween(Integer value1, Integer value2) {
            addCriterion("AuthUserSex not between", value1, value2, "authusersex");
            return (Criteria) this;
        }

        public Criteria andAuthpowerIsNull() {
            addCriterion("AuthPower is null");
            return (Criteria) this;
        }

        public Criteria andAuthpowerIsNotNull() {
            addCriterion("AuthPower is not null");
            return (Criteria) this;
        }

        public Criteria andAuthpowerEqualTo(Integer value) {
            addCriterion("AuthPower =", value, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerNotEqualTo(Integer value) {
            addCriterion("AuthPower <>", value, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerGreaterThan(Integer value) {
            addCriterion("AuthPower >", value, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuthPower >=", value, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerLessThan(Integer value) {
            addCriterion("AuthPower <", value, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerLessThanOrEqualTo(Integer value) {
            addCriterion("AuthPower <=", value, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerIn(List<Integer> values) {
            addCriterion("AuthPower in", values, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerNotIn(List<Integer> values) {
            addCriterion("AuthPower not in", values, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerBetween(Integer value1, Integer value2) {
            addCriterion("AuthPower between", value1, value2, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("AuthPower not between", value1, value2, "authpower");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailIsNull() {
            addCriterion("AuthUserEmail is null");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailIsNotNull() {
            addCriterion("AuthUserEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailEqualTo(String value) {
            addCriterion("AuthUserEmail =", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailNotEqualTo(String value) {
            addCriterion("AuthUserEmail <>", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailGreaterThan(String value) {
            addCriterion("AuthUserEmail >", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailGreaterThanOrEqualTo(String value) {
            addCriterion("AuthUserEmail >=", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailLessThan(String value) {
            addCriterion("AuthUserEmail <", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailLessThanOrEqualTo(String value) {
            addCriterion("AuthUserEmail <=", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailLike(String value) {
            addCriterion("AuthUserEmail like", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailNotLike(String value) {
            addCriterion("AuthUserEmail not like", value, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailIn(List<String> values) {
            addCriterion("AuthUserEmail in", values, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailNotIn(List<String> values) {
            addCriterion("AuthUserEmail not in", values, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailBetween(String value1, String value2) {
            addCriterion("AuthUserEmail between", value1, value2, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthuseremailNotBetween(String value1, String value2) {
            addCriterion("AuthUserEmail not between", value1, value2, "authuseremail");
            return (Criteria) this;
        }

        public Criteria andAuthusertelIsNull() {
            addCriterion("AuthUserTel is null");
            return (Criteria) this;
        }

        public Criteria andAuthusertelIsNotNull() {
            addCriterion("AuthUserTel is not null");
            return (Criteria) this;
        }

        public Criteria andAuthusertelEqualTo(String value) {
            addCriterion("AuthUserTel =", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelNotEqualTo(String value) {
            addCriterion("AuthUserTel <>", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelGreaterThan(String value) {
            addCriterion("AuthUserTel >", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelGreaterThanOrEqualTo(String value) {
            addCriterion("AuthUserTel >=", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelLessThan(String value) {
            addCriterion("AuthUserTel <", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelLessThanOrEqualTo(String value) {
            addCriterion("AuthUserTel <=", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelLike(String value) {
            addCriterion("AuthUserTel like", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelNotLike(String value) {
            addCriterion("AuthUserTel not like", value, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelIn(List<String> values) {
            addCriterion("AuthUserTel in", values, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelNotIn(List<String> values) {
            addCriterion("AuthUserTel not in", values, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelBetween(String value1, String value2) {
            addCriterion("AuthUserTel between", value1, value2, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthusertelNotBetween(String value1, String value2) {
            addCriterion("AuthUserTel not between", value1, value2, "authusertel");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordIsNull() {
            addCriterion("AuthUserPassword is null");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordIsNotNull() {
            addCriterion("AuthUserPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordEqualTo(String value) {
            addCriterion("AuthUserPassword =", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordNotEqualTo(String value) {
            addCriterion("AuthUserPassword <>", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordGreaterThan(String value) {
            addCriterion("AuthUserPassword >", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AuthUserPassword >=", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordLessThan(String value) {
            addCriterion("AuthUserPassword <", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordLessThanOrEqualTo(String value) {
            addCriterion("AuthUserPassword <=", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordLike(String value) {
            addCriterion("AuthUserPassword like", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordNotLike(String value) {
            addCriterion("AuthUserPassword not like", value, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordIn(List<String> values) {
            addCriterion("AuthUserPassword in", values, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordNotIn(List<String> values) {
            addCriterion("AuthUserPassword not in", values, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordBetween(String value1, String value2) {
            addCriterion("AuthUserPassword between", value1, value2, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andAuthuserpasswordNotBetween(String value1, String value2) {
            addCriterion("AuthUserPassword not between", value1, value2, "authuserpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNull() {
            addCriterion("LastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNotNull() {
            addCriterion("LastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateEqualTo(Date value) {
            addCriterionForJDBCDate("LastLoginDate =", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LastLoginDate <>", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThan(Date value) {
            addCriterionForJDBCDate("LastLoginDate >", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LastLoginDate >=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThan(Date value) {
            addCriterionForJDBCDate("LastLoginDate <", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LastLoginDate <=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIn(List<Date> values) {
            addCriterionForJDBCDate("LastLoginDate in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LastLoginDate not in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LastLoginDate between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LastLoginDate not between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("LastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("LastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("LastLoginIP =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("LastLoginIP <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("LastLoginIP >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("LastLoginIP >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("LastLoginIP <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("LastLoginIP <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("LastLoginIP like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("LastLoginIP not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("LastLoginIP in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("LastLoginIP not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("LastLoginIP between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("LastLoginIP not between", value1, value2, "lastloginip");
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