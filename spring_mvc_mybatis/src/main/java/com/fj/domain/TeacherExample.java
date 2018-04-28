package com.fj.domain;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaidIsNull() {
            addCriterion("teaId is null");
            return (Criteria) this;
        }

        public Criteria andTeaidIsNotNull() {
            addCriterion("teaId is not null");
            return (Criteria) this;
        }

        public Criteria andTeaidEqualTo(String value) {
            addCriterion("teaId =", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotEqualTo(String value) {
            addCriterion("teaId <>", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThan(String value) {
            addCriterion("teaId >", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThanOrEqualTo(String value) {
            addCriterion("teaId >=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThan(String value) {
            addCriterion("teaId <", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThanOrEqualTo(String value) {
            addCriterion("teaId <=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLike(String value) {
            addCriterion("teaId like", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotLike(String value) {
            addCriterion("teaId not like", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidIn(List<String> values) {
            addCriterion("teaId in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotIn(List<String> values) {
            addCriterion("teaId not in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidBetween(String value1, String value2) {
            addCriterion("teaId between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotBetween(String value1, String value2) {
            addCriterion("teaId not between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNull() {
            addCriterion("teaName is null");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNotNull() {
            addCriterion("teaName is not null");
            return (Criteria) this;
        }

        public Criteria andTeanameEqualTo(String value) {
            addCriterion("teaName =", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotEqualTo(String value) {
            addCriterion("teaName <>", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThan(String value) {
            addCriterion("teaName >", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThanOrEqualTo(String value) {
            addCriterion("teaName >=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThan(String value) {
            addCriterion("teaName <", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThanOrEqualTo(String value) {
            addCriterion("teaName <=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLike(String value) {
            addCriterion("teaName like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotLike(String value) {
            addCriterion("teaName not like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameIn(List<String> values) {
            addCriterion("teaName in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotIn(List<String> values) {
            addCriterion("teaName not in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameBetween(String value1, String value2) {
            addCriterion("teaName between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotBetween(String value1, String value2) {
            addCriterion("teaName not between", value1, value2, "teaname");
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