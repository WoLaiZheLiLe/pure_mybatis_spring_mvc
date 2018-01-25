package com.fj.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfosExample {
    /**
     * order_infos
     */
    protected String orderByClause;

    /**
     * order_infos
     */
    protected boolean distinct;

    /**
     * order_infos
     */
    protected List<Criteria> oredCriteria;

    public OrderInfosExample() {
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

    /**
     * order_infos 2018-01-25
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNull() {
            addCriterion("model_code is null");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNotNull() {
            addCriterion("model_code is not null");
            return (Criteria) this;
        }

        public Criteria andModelCodeEqualTo(String value) {
            addCriterion("model_code =", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotEqualTo(String value) {
            addCriterion("model_code <>", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThan(String value) {
            addCriterion("model_code >", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("model_code >=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThan(String value) {
            addCriterion("model_code <", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThanOrEqualTo(String value) {
            addCriterion("model_code <=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLike(String value) {
            addCriterion("model_code like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotLike(String value) {
            addCriterion("model_code not like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeIn(List<String> values) {
            addCriterion("model_code in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotIn(List<String> values) {
            addCriterion("model_code not in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeBetween(String value1, String value2) {
            addCriterion("model_code between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotBetween(String value1, String value2) {
            addCriterion("model_code not between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andReserveModelIsNull() {
            addCriterion("reserve_model is null");
            return (Criteria) this;
        }

        public Criteria andReserveModelIsNotNull() {
            addCriterion("reserve_model is not null");
            return (Criteria) this;
        }

        public Criteria andReserveModelEqualTo(String value) {
            addCriterion("reserve_model =", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelNotEqualTo(String value) {
            addCriterion("reserve_model <>", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelGreaterThan(String value) {
            addCriterion("reserve_model >", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_model >=", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelLessThan(String value) {
            addCriterion("reserve_model <", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelLessThanOrEqualTo(String value) {
            addCriterion("reserve_model <=", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelLike(String value) {
            addCriterion("reserve_model like", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelNotLike(String value) {
            addCriterion("reserve_model not like", value, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelIn(List<String> values) {
            addCriterion("reserve_model in", values, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelNotIn(List<String> values) {
            addCriterion("reserve_model not in", values, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelBetween(String value1, String value2) {
            addCriterion("reserve_model between", value1, value2, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andReserveModelNotBetween(String value1, String value2) {
            addCriterion("reserve_model not between", value1, value2, "reserveModel");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(BigDecimal value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(BigDecimal value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(BigDecimal value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(BigDecimal value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<BigDecimal> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<BigDecimal> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNull() {
            addCriterion("actual_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNotNull() {
            addCriterion("actual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualAmountEqualTo(BigDecimal value) {
            addCriterion("actual_amount =", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotEqualTo(BigDecimal value) {
            addCriterion("actual_amount <>", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThan(BigDecimal value) {
            addCriterion("actual_amount >", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount >=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThan(BigDecimal value) {
            addCriterion("actual_amount <", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount <=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIn(List<BigDecimal> values) {
            addCriterion("actual_amount in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotIn(List<BigDecimal> values) {
            addCriterion("actual_amount not in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount not between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountIsNull() {
            addCriterion("illegal_freeze_amount is null");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountIsNotNull() {
            addCriterion("illegal_freeze_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountEqualTo(BigDecimal value) {
            addCriterion("illegal_freeze_amount =", value, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountNotEqualTo(BigDecimal value) {
            addCriterion("illegal_freeze_amount <>", value, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountGreaterThan(BigDecimal value) {
            addCriterion("illegal_freeze_amount >", value, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("illegal_freeze_amount >=", value, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountLessThan(BigDecimal value) {
            addCriterion("illegal_freeze_amount <", value, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("illegal_freeze_amount <=", value, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountIn(List<BigDecimal> values) {
            addCriterion("illegal_freeze_amount in", values, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountNotIn(List<BigDecimal> values) {
            addCriterion("illegal_freeze_amount not in", values, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("illegal_freeze_amount between", value1, value2, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("illegal_freeze_amount not between", value1, value2, "illegalFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountIsNull() {
            addCriterion("other_freeze_amount is null");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountIsNotNull() {
            addCriterion("other_freeze_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountEqualTo(BigDecimal value) {
            addCriterion("other_freeze_amount =", value, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountNotEqualTo(BigDecimal value) {
            addCriterion("other_freeze_amount <>", value, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountGreaterThan(BigDecimal value) {
            addCriterion("other_freeze_amount >", value, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_freeze_amount >=", value, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountLessThan(BigDecimal value) {
            addCriterion("other_freeze_amount <", value, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_freeze_amount <=", value, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountIn(List<BigDecimal> values) {
            addCriterion("other_freeze_amount in", values, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountNotIn(List<BigDecimal> values) {
            addCriterion("other_freeze_amount not in", values, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_freeze_amount between", value1, value2, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_freeze_amount not between", value1, value2, "otherFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountIsNull() {
            addCriterion("additional_amount is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountIsNotNull() {
            addCriterion("additional_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountEqualTo(BigDecimal value) {
            addCriterion("additional_amount =", value, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountNotEqualTo(BigDecimal value) {
            addCriterion("additional_amount <>", value, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountGreaterThan(BigDecimal value) {
            addCriterion("additional_amount >", value, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_amount >=", value, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountLessThan(BigDecimal value) {
            addCriterion("additional_amount <", value, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_amount <=", value, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountIn(List<BigDecimal> values) {
            addCriterion("additional_amount in", values, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountNotIn(List<BigDecimal> values) {
            addCriterion("additional_amount not in", values, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_amount between", value1, value2, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_amount not between", value1, value2, "additionalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnRentIsNull() {
            addCriterion("return_rent is null");
            return (Criteria) this;
        }

        public Criteria andReturnRentIsNotNull() {
            addCriterion("return_rent is not null");
            return (Criteria) this;
        }

        public Criteria andReturnRentEqualTo(Integer value) {
            addCriterion("return_rent =", value, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentNotEqualTo(Integer value) {
            addCriterion("return_rent <>", value, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentGreaterThan(Integer value) {
            addCriterion("return_rent >", value, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_rent >=", value, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentLessThan(Integer value) {
            addCriterion("return_rent <", value, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentLessThanOrEqualTo(Integer value) {
            addCriterion("return_rent <=", value, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentIn(List<Integer> values) {
            addCriterion("return_rent in", values, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentNotIn(List<Integer> values) {
            addCriterion("return_rent not in", values, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentBetween(Integer value1, Integer value2) {
            addCriterion("return_rent between", value1, value2, "returnRent");
            return (Criteria) this;
        }

        public Criteria andReturnRentNotBetween(Integer value1, Integer value2) {
            addCriterion("return_rent not between", value1, value2, "returnRent");
            return (Criteria) this;
        }

        public Criteria andMarginIsNull() {
            addCriterion("margin is null");
            return (Criteria) this;
        }

        public Criteria andMarginIsNotNull() {
            addCriterion("margin is not null");
            return (Criteria) this;
        }

        public Criteria andMarginEqualTo(BigDecimal value) {
            addCriterion("margin =", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotEqualTo(BigDecimal value) {
            addCriterion("margin <>", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThan(BigDecimal value) {
            addCriterion("margin >", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("margin >=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThan(BigDecimal value) {
            addCriterion("margin <", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("margin <=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginIn(List<BigDecimal> values) {
            addCriterion("margin in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotIn(List<BigDecimal> values) {
            addCriterion("margin not in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin not between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginIsNull() {
            addCriterion("return_margin is null");
            return (Criteria) this;
        }

        public Criteria andReturnMarginIsNotNull() {
            addCriterion("return_margin is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMarginEqualTo(Integer value) {
            addCriterion("return_margin =", value, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginNotEqualTo(Integer value) {
            addCriterion("return_margin <>", value, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginGreaterThan(Integer value) {
            addCriterion("return_margin >", value, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_margin >=", value, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginLessThan(Integer value) {
            addCriterion("return_margin <", value, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginLessThanOrEqualTo(Integer value) {
            addCriterion("return_margin <=", value, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginIn(List<Integer> values) {
            addCriterion("return_margin in", values, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginNotIn(List<Integer> values) {
            addCriterion("return_margin not in", values, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginBetween(Integer value1, Integer value2) {
            addCriterion("return_margin between", value1, value2, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginNotBetween(Integer value1, Integer value2) {
            addCriterion("return_margin not between", value1, value2, "returnMargin");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeIsNull() {
            addCriterion("return_margin_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeIsNotNull() {
            addCriterion("return_margin_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeEqualTo(Date value) {
            addCriterion("return_margin_time =", value, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeNotEqualTo(Date value) {
            addCriterion("return_margin_time <>", value, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeGreaterThan(Date value) {
            addCriterion("return_margin_time >", value, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("return_margin_time >=", value, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeLessThan(Date value) {
            addCriterion("return_margin_time <", value, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeLessThanOrEqualTo(Date value) {
            addCriterion("return_margin_time <=", value, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeIn(List<Date> values) {
            addCriterion("return_margin_time in", values, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeNotIn(List<Date> values) {
            addCriterion("return_margin_time not in", values, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeBetween(Date value1, Date value2) {
            addCriterion("return_margin_time between", value1, value2, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andReturnMarginTimeNotBetween(Date value1, Date value2) {
            addCriterion("return_margin_time not between", value1, value2, "returnMarginTime");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeIsNull() {
            addCriterion("drive_shop_code is null");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeIsNotNull() {
            addCriterion("drive_shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeEqualTo(String value) {
            addCriterion("drive_shop_code =", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeNotEqualTo(String value) {
            addCriterion("drive_shop_code <>", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeGreaterThan(String value) {
            addCriterion("drive_shop_code >", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("drive_shop_code >=", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeLessThan(String value) {
            addCriterion("drive_shop_code <", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeLessThanOrEqualTo(String value) {
            addCriterion("drive_shop_code <=", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeLike(String value) {
            addCriterion("drive_shop_code like", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeNotLike(String value) {
            addCriterion("drive_shop_code not like", value, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeIn(List<String> values) {
            addCriterion("drive_shop_code in", values, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeNotIn(List<String> values) {
            addCriterion("drive_shop_code not in", values, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeBetween(String value1, String value2) {
            addCriterion("drive_shop_code between", value1, value2, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopCodeNotBetween(String value1, String value2) {
            addCriterion("drive_shop_code not between", value1, value2, "driveShopCode");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameIsNull() {
            addCriterion("drive_shop_name is null");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameIsNotNull() {
            addCriterion("drive_shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameEqualTo(String value) {
            addCriterion("drive_shop_name =", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameNotEqualTo(String value) {
            addCriterion("drive_shop_name <>", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameGreaterThan(String value) {
            addCriterion("drive_shop_name >", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("drive_shop_name >=", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameLessThan(String value) {
            addCriterion("drive_shop_name <", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameLessThanOrEqualTo(String value) {
            addCriterion("drive_shop_name <=", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameLike(String value) {
            addCriterion("drive_shop_name like", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameNotLike(String value) {
            addCriterion("drive_shop_name not like", value, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameIn(List<String> values) {
            addCriterion("drive_shop_name in", values, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameNotIn(List<String> values) {
            addCriterion("drive_shop_name not in", values, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameBetween(String value1, String value2) {
            addCriterion("drive_shop_name between", value1, value2, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andDriveShopNameNotBetween(String value1, String value2) {
            addCriterion("drive_shop_name not between", value1, value2, "driveShopName");
            return (Criteria) this;
        }

        public Criteria andPickAddressIsNull() {
            addCriterion("pick_address is null");
            return (Criteria) this;
        }

        public Criteria andPickAddressIsNotNull() {
            addCriterion("pick_address is not null");
            return (Criteria) this;
        }

        public Criteria andPickAddressEqualTo(String value) {
            addCriterion("pick_address =", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressNotEqualTo(String value) {
            addCriterion("pick_address <>", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressGreaterThan(String value) {
            addCriterion("pick_address >", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pick_address >=", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressLessThan(String value) {
            addCriterion("pick_address <", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressLessThanOrEqualTo(String value) {
            addCriterion("pick_address <=", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressLike(String value) {
            addCriterion("pick_address like", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressNotLike(String value) {
            addCriterion("pick_address not like", value, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressIn(List<String> values) {
            addCriterion("pick_address in", values, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressNotIn(List<String> values) {
            addCriterion("pick_address not in", values, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressBetween(String value1, String value2) {
            addCriterion("pick_address between", value1, value2, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andPickAddressNotBetween(String value1, String value2) {
            addCriterion("pick_address not between", value1, value2, "pickAddress");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeIsNull() {
            addCriterion("return_shop_code is null");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeIsNotNull() {
            addCriterion("return_shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeEqualTo(String value) {
            addCriterion("return_shop_code =", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeNotEqualTo(String value) {
            addCriterion("return_shop_code <>", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeGreaterThan(String value) {
            addCriterion("return_shop_code >", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("return_shop_code >=", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeLessThan(String value) {
            addCriterion("return_shop_code <", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeLessThanOrEqualTo(String value) {
            addCriterion("return_shop_code <=", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeLike(String value) {
            addCriterion("return_shop_code like", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeNotLike(String value) {
            addCriterion("return_shop_code not like", value, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeIn(List<String> values) {
            addCriterion("return_shop_code in", values, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeNotIn(List<String> values) {
            addCriterion("return_shop_code not in", values, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeBetween(String value1, String value2) {
            addCriterion("return_shop_code between", value1, value2, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopCodeNotBetween(String value1, String value2) {
            addCriterion("return_shop_code not between", value1, value2, "returnShopCode");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameIsNull() {
            addCriterion("return_shop_name is null");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameIsNotNull() {
            addCriterion("return_shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameEqualTo(String value) {
            addCriterion("return_shop_name =", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameNotEqualTo(String value) {
            addCriterion("return_shop_name <>", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameGreaterThan(String value) {
            addCriterion("return_shop_name >", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("return_shop_name >=", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameLessThan(String value) {
            addCriterion("return_shop_name <", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameLessThanOrEqualTo(String value) {
            addCriterion("return_shop_name <=", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameLike(String value) {
            addCriterion("return_shop_name like", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameNotLike(String value) {
            addCriterion("return_shop_name not like", value, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameIn(List<String> values) {
            addCriterion("return_shop_name in", values, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameNotIn(List<String> values) {
            addCriterion("return_shop_name not in", values, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameBetween(String value1, String value2) {
            addCriterion("return_shop_name between", value1, value2, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnShopNameNotBetween(String value1, String value2) {
            addCriterion("return_shop_name not between", value1, value2, "returnShopName");
            return (Criteria) this;
        }

        public Criteria andReturnAddressIsNull() {
            addCriterion("return_address is null");
            return (Criteria) this;
        }

        public Criteria andReturnAddressIsNotNull() {
            addCriterion("return_address is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAddressEqualTo(String value) {
            addCriterion("return_address =", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotEqualTo(String value) {
            addCriterion("return_address <>", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressGreaterThan(String value) {
            addCriterion("return_address >", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressGreaterThanOrEqualTo(String value) {
            addCriterion("return_address >=", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressLessThan(String value) {
            addCriterion("return_address <", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressLessThanOrEqualTo(String value) {
            addCriterion("return_address <=", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressLike(String value) {
            addCriterion("return_address like", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotLike(String value) {
            addCriterion("return_address not like", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressIn(List<String> values) {
            addCriterion("return_address in", values, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotIn(List<String> values) {
            addCriterion("return_address not in", values, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressBetween(String value1, String value2) {
            addCriterion("return_address between", value1, value2, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotBetween(String value1, String value2) {
            addCriterion("return_address not between", value1, value2, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNull() {
            addCriterion("license_plate is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNotNull() {
            addCriterion("license_plate is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateEqualTo(String value) {
            addCriterion("license_plate =", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotEqualTo(String value) {
            addCriterion("license_plate <>", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThan(String value) {
            addCriterion("license_plate >", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate >=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThan(String value) {
            addCriterion("license_plate <", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThanOrEqualTo(String value) {
            addCriterion("license_plate <=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLike(String value) {
            addCriterion("license_plate like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotLike(String value) {
            addCriterion("license_plate not like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIn(List<String> values) {
            addCriterion("license_plate in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotIn(List<String> values) {
            addCriterion("license_plate not in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateBetween(String value1, String value2) {
            addCriterion("license_plate between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotBetween(String value1, String value2) {
            addCriterion("license_plate not between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andParkPlaceIsNull() {
            addCriterion("park_place is null");
            return (Criteria) this;
        }

        public Criteria andParkPlaceIsNotNull() {
            addCriterion("park_place is not null");
            return (Criteria) this;
        }

        public Criteria andParkPlaceEqualTo(String value) {
            addCriterion("park_place =", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceNotEqualTo(String value) {
            addCriterion("park_place <>", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceGreaterThan(String value) {
            addCriterion("park_place >", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("park_place >=", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceLessThan(String value) {
            addCriterion("park_place <", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceLessThanOrEqualTo(String value) {
            addCriterion("park_place <=", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceLike(String value) {
            addCriterion("park_place like", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceNotLike(String value) {
            addCriterion("park_place not like", value, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceIn(List<String> values) {
            addCriterion("park_place in", values, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceNotIn(List<String> values) {
            addCriterion("park_place not in", values, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceBetween(String value1, String value2) {
            addCriterion("park_place between", value1, value2, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andParkPlaceNotBetween(String value1, String value2) {
            addCriterion("park_place not between", value1, value2, "parkPlace");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeIsNull() {
            addCriterion("key_drawer_code is null");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeIsNotNull() {
            addCriterion("key_drawer_code is not null");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeEqualTo(String value) {
            addCriterion("key_drawer_code =", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeNotEqualTo(String value) {
            addCriterion("key_drawer_code <>", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeGreaterThan(String value) {
            addCriterion("key_drawer_code >", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("key_drawer_code >=", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeLessThan(String value) {
            addCriterion("key_drawer_code <", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeLessThanOrEqualTo(String value) {
            addCriterion("key_drawer_code <=", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeLike(String value) {
            addCriterion("key_drawer_code like", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeNotLike(String value) {
            addCriterion("key_drawer_code not like", value, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeIn(List<String> values) {
            addCriterion("key_drawer_code in", values, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeNotIn(List<String> values) {
            addCriterion("key_drawer_code not in", values, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeBetween(String value1, String value2) {
            addCriterion("key_drawer_code between", value1, value2, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyDrawerCodeNotBetween(String value1, String value2) {
            addCriterion("key_drawer_code not between", value1, value2, "keyDrawerCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeIsNull() {
            addCriterion("key_cabinet_code is null");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeIsNotNull() {
            addCriterion("key_cabinet_code is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeEqualTo(String value) {
            addCriterion("key_cabinet_code =", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeNotEqualTo(String value) {
            addCriterion("key_cabinet_code <>", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeGreaterThan(String value) {
            addCriterion("key_cabinet_code >", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("key_cabinet_code >=", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeLessThan(String value) {
            addCriterion("key_cabinet_code <", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeLessThanOrEqualTo(String value) {
            addCriterion("key_cabinet_code <=", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeLike(String value) {
            addCriterion("key_cabinet_code like", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeNotLike(String value) {
            addCriterion("key_cabinet_code not like", value, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeIn(List<String> values) {
            addCriterion("key_cabinet_code in", values, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeNotIn(List<String> values) {
            addCriterion("key_cabinet_code not in", values, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeBetween(String value1, String value2) {
            addCriterion("key_cabinet_code between", value1, value2, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andKeyCabinetCodeNotBetween(String value1, String value2) {
            addCriterion("key_cabinet_code not between", value1, value2, "keyCabinetCode");
            return (Criteria) this;
        }

        public Criteria andPickDayIsNull() {
            addCriterion("pick_day is null");
            return (Criteria) this;
        }

        public Criteria andPickDayIsNotNull() {
            addCriterion("pick_day is not null");
            return (Criteria) this;
        }

        public Criteria andPickDayEqualTo(Date value) {
            addCriterion("pick_day =", value, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayNotEqualTo(Date value) {
            addCriterion("pick_day <>", value, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayGreaterThan(Date value) {
            addCriterion("pick_day >", value, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayGreaterThanOrEqualTo(Date value) {
            addCriterion("pick_day >=", value, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayLessThan(Date value) {
            addCriterion("pick_day <", value, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayLessThanOrEqualTo(Date value) {
            addCriterion("pick_day <=", value, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayIn(List<Date> values) {
            addCriterion("pick_day in", values, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayNotIn(List<Date> values) {
            addCriterion("pick_day not in", values, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayBetween(Date value1, Date value2) {
            addCriterion("pick_day between", value1, value2, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickDayNotBetween(Date value1, Date value2) {
            addCriterion("pick_day not between", value1, value2, "pickDay");
            return (Criteria) this;
        }

        public Criteria andPickTimeIsNull() {
            addCriterion("pick_time is null");
            return (Criteria) this;
        }

        public Criteria andPickTimeIsNotNull() {
            addCriterion("pick_time is not null");
            return (Criteria) this;
        }

        public Criteria andPickTimeEqualTo(String value) {
            addCriterion("pick_time =", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotEqualTo(String value) {
            addCriterion("pick_time <>", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeGreaterThan(String value) {
            addCriterion("pick_time >", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pick_time >=", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLessThan(String value) {
            addCriterion("pick_time <", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLessThanOrEqualTo(String value) {
            addCriterion("pick_time <=", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLike(String value) {
            addCriterion("pick_time like", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotLike(String value) {
            addCriterion("pick_time not like", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeIn(List<String> values) {
            addCriterion("pick_time in", values, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotIn(List<String> values) {
            addCriterion("pick_time not in", values, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeBetween(String value1, String value2) {
            addCriterion("pick_time between", value1, value2, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotBetween(String value1, String value2) {
            addCriterion("pick_time not between", value1, value2, "pickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeIsNull() {
            addCriterion("real_pick_time is null");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeIsNotNull() {
            addCriterion("real_pick_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeEqualTo(Date value) {
            addCriterion("real_pick_time =", value, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeNotEqualTo(Date value) {
            addCriterion("real_pick_time <>", value, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeGreaterThan(Date value) {
            addCriterion("real_pick_time >", value, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_pick_time >=", value, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeLessThan(Date value) {
            addCriterion("real_pick_time <", value, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_pick_time <=", value, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeIn(List<Date> values) {
            addCriterion("real_pick_time in", values, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeNotIn(List<Date> values) {
            addCriterion("real_pick_time not in", values, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeBetween(Date value1, Date value2) {
            addCriterion("real_pick_time between", value1, value2, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andRealPickTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_pick_time not between", value1, value2, "realPickTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(Date value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(Date value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(Date value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(Date value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<Date> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<Date> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(Date value1, Date value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeIsNull() {
            addCriterion("real_return_time is null");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeIsNotNull() {
            addCriterion("real_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeEqualTo(Date value) {
            addCriterion("real_return_time =", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeNotEqualTo(Date value) {
            addCriterion("real_return_time <>", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeGreaterThan(Date value) {
            addCriterion("real_return_time >", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_return_time >=", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeLessThan(Date value) {
            addCriterion("real_return_time <", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_return_time <=", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeIn(List<Date> values) {
            addCriterion("real_return_time in", values, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeNotIn(List<Date> values) {
            addCriterion("real_return_time not in", values, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeBetween(Date value1, Date value2) {
            addCriterion("real_return_time between", value1, value2, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_return_time not between", value1, value2, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFromEqualTo(Integer value) {
            addCriterion("order_from =", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotEqualTo(Integer value) {
            addCriterion("order_from <>", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThan(Integer value) {
            addCriterion("order_from >", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_from >=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThan(Integer value) {
            addCriterion("order_from <", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThanOrEqualTo(Integer value) {
            addCriterion("order_from <=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromIn(List<Integer> values) {
            addCriterion("order_from in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotIn(List<Integer> values) {
            addCriterion("order_from not in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromBetween(Integer value1, Integer value2) {
            addCriterion("order_from between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotBetween(Integer value1, Integer value2) {
            addCriterion("order_from not between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andDateCreateIsNull() {
            addCriterion("date_create is null");
            return (Criteria) this;
        }

        public Criteria andDateCreateIsNotNull() {
            addCriterion("date_create is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreateEqualTo(Date value) {
            addCriterion("date_create =", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotEqualTo(Date value) {
            addCriterion("date_create <>", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateGreaterThan(Date value) {
            addCriterion("date_create >", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("date_create >=", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateLessThan(Date value) {
            addCriterion("date_create <", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateLessThanOrEqualTo(Date value) {
            addCriterion("date_create <=", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateIn(List<Date> values) {
            addCriterion("date_create in", values, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotIn(List<Date> values) {
            addCriterion("date_create not in", values, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateBetween(Date value1, Date value2) {
            addCriterion("date_create between", value1, value2, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotBetween(Date value1, Date value2) {
            addCriterion("date_create not between", value1, value2, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIsNull() {
            addCriterion("date_update is null");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIsNotNull() {
            addCriterion("date_update is not null");
            return (Criteria) this;
        }

        public Criteria andDateUpdateEqualTo(Date value) {
            addCriterion("date_update =", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotEqualTo(Date value) {
            addCriterion("date_update <>", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateGreaterThan(Date value) {
            addCriterion("date_update >", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("date_update >=", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateLessThan(Date value) {
            addCriterion("date_update <", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateLessThanOrEqualTo(Date value) {
            addCriterion("date_update <=", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIn(List<Date> values) {
            addCriterion("date_update in", values, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotIn(List<Date> values) {
            addCriterion("date_update not in", values, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateBetween(Date value1, Date value2) {
            addCriterion("date_update between", value1, value2, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotBetween(Date value1, Date value2) {
            addCriterion("date_update not between", value1, value2, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateDeleteIsNull() {
            addCriterion("date_delete is null");
            return (Criteria) this;
        }

        public Criteria andDateDeleteIsNotNull() {
            addCriterion("date_delete is not null");
            return (Criteria) this;
        }

        public Criteria andDateDeleteEqualTo(Date value) {
            addCriterion("date_delete =", value, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteNotEqualTo(Date value) {
            addCriterion("date_delete <>", value, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteGreaterThan(Date value) {
            addCriterion("date_delete >", value, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteGreaterThanOrEqualTo(Date value) {
            addCriterion("date_delete >=", value, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteLessThan(Date value) {
            addCriterion("date_delete <", value, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteLessThanOrEqualTo(Date value) {
            addCriterion("date_delete <=", value, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteIn(List<Date> values) {
            addCriterion("date_delete in", values, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteNotIn(List<Date> values) {
            addCriterion("date_delete not in", values, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteBetween(Date value1, Date value2) {
            addCriterion("date_delete between", value1, value2, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andDateDeleteNotBetween(Date value1, Date value2) {
            addCriterion("date_delete not between", value1, value2, "dateDelete");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoIsNull() {
            addCriterion("order_request_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoIsNotNull() {
            addCriterion("order_request_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoEqualTo(String value) {
            addCriterion("order_request_no =", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoNotEqualTo(String value) {
            addCriterion("order_request_no <>", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoGreaterThan(String value) {
            addCriterion("order_request_no >", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_request_no >=", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoLessThan(String value) {
            addCriterion("order_request_no <", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoLessThanOrEqualTo(String value) {
            addCriterion("order_request_no <=", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoLike(String value) {
            addCriterion("order_request_no like", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoNotLike(String value) {
            addCriterion("order_request_no not like", value, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoIn(List<String> values) {
            addCriterion("order_request_no in", values, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoNotIn(List<String> values) {
            addCriterion("order_request_no not in", values, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoBetween(String value1, String value2) {
            addCriterion("order_request_no between", value1, value2, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andOrderRequestNoNotBetween(String value1, String value2) {
            addCriterion("order_request_no not between", value1, value2, "orderRequestNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeIsNull() {
            addCriterion("begin_auth_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeIsNotNull() {
            addCriterion("begin_auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeEqualTo(Date value) {
            addCriterion("begin_auth_time =", value, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeNotEqualTo(Date value) {
            addCriterion("begin_auth_time <>", value, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeGreaterThan(Date value) {
            addCriterion("begin_auth_time >", value, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_auth_time >=", value, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeLessThan(Date value) {
            addCriterion("begin_auth_time <", value, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_auth_time <=", value, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeIn(List<Date> values) {
            addCriterion("begin_auth_time in", values, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeNotIn(List<Date> values) {
            addCriterion("begin_auth_time not in", values, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeBetween(Date value1, Date value2) {
            addCriterion("begin_auth_time between", value1, value2, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andBeginAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_auth_time not between", value1, value2, "beginAuthTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeIsNull() {
            addCriterion("pay_valid_time is null");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeIsNotNull() {
            addCriterion("pay_valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeEqualTo(Date value) {
            addCriterion("pay_valid_time =", value, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeNotEqualTo(Date value) {
            addCriterion("pay_valid_time <>", value, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeGreaterThan(Date value) {
            addCriterion("pay_valid_time >", value, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_valid_time >=", value, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeLessThan(Date value) {
            addCriterion("pay_valid_time <", value, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_valid_time <=", value, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeIn(List<Date> values) {
            addCriterion("pay_valid_time in", values, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeNotIn(List<Date> values) {
            addCriterion("pay_valid_time not in", values, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeBetween(Date value1, Date value2) {
            addCriterion("pay_valid_time between", value1, value2, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andPayValidTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_valid_time not between", value1, value2, "payValidTime");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusIsNull() {
            addCriterion("other_freeze_amount_status is null");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusIsNotNull() {
            addCriterion("other_freeze_amount_status is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusEqualTo(String value) {
            addCriterion("other_freeze_amount_status =", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusNotEqualTo(String value) {
            addCriterion("other_freeze_amount_status <>", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusGreaterThan(String value) {
            addCriterion("other_freeze_amount_status >", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("other_freeze_amount_status >=", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusLessThan(String value) {
            addCriterion("other_freeze_amount_status <", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusLessThanOrEqualTo(String value) {
            addCriterion("other_freeze_amount_status <=", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusLike(String value) {
            addCriterion("other_freeze_amount_status like", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusNotLike(String value) {
            addCriterion("other_freeze_amount_status not like", value, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusIn(List<String> values) {
            addCriterion("other_freeze_amount_status in", values, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusNotIn(List<String> values) {
            addCriterion("other_freeze_amount_status not in", values, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusBetween(String value1, String value2) {
            addCriterion("other_freeze_amount_status between", value1, value2, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andOtherFreezeAmountStatusNotBetween(String value1, String value2) {
            addCriterion("other_freeze_amount_status not between", value1, value2, "otherFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusIsNull() {
            addCriterion("illegal_freeze_amount_status is null");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusIsNotNull() {
            addCriterion("illegal_freeze_amount_status is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusEqualTo(String value) {
            addCriterion("illegal_freeze_amount_status =", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusNotEqualTo(String value) {
            addCriterion("illegal_freeze_amount_status <>", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusGreaterThan(String value) {
            addCriterion("illegal_freeze_amount_status >", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("illegal_freeze_amount_status >=", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusLessThan(String value) {
            addCriterion("illegal_freeze_amount_status <", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusLessThanOrEqualTo(String value) {
            addCriterion("illegal_freeze_amount_status <=", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusLike(String value) {
            addCriterion("illegal_freeze_amount_status like", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusNotLike(String value) {
            addCriterion("illegal_freeze_amount_status not like", value, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusIn(List<String> values) {
            addCriterion("illegal_freeze_amount_status in", values, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusNotIn(List<String> values) {
            addCriterion("illegal_freeze_amount_status not in", values, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusBetween(String value1, String value2) {
            addCriterion("illegal_freeze_amount_status between", value1, value2, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andIllegalFreezeAmountStatusNotBetween(String value1, String value2) {
            addCriterion("illegal_freeze_amount_status not between", value1, value2, "illegalFreezeAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusIsNull() {
            addCriterion("additional_amount_status is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusIsNotNull() {
            addCriterion("additional_amount_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusEqualTo(String value) {
            addCriterion("additional_amount_status =", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusNotEqualTo(String value) {
            addCriterion("additional_amount_status <>", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusGreaterThan(String value) {
            addCriterion("additional_amount_status >", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("additional_amount_status >=", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusLessThan(String value) {
            addCriterion("additional_amount_status <", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusLessThanOrEqualTo(String value) {
            addCriterion("additional_amount_status <=", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusLike(String value) {
            addCriterion("additional_amount_status like", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusNotLike(String value) {
            addCriterion("additional_amount_status not like", value, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusIn(List<String> values) {
            addCriterion("additional_amount_status in", values, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusNotIn(List<String> values) {
            addCriterion("additional_amount_status not in", values, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusBetween(String value1, String value2) {
            addCriterion("additional_amount_status between", value1, value2, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andAdditionalAmountStatusNotBetween(String value1, String value2) {
            addCriterion("additional_amount_status not between", value1, value2, "additionalAmountStatus");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffIsNull() {
            addCriterion("return_car_inspection_staff is null");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffIsNotNull() {
            addCriterion("return_car_inspection_staff is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffEqualTo(String value) {
            addCriterion("return_car_inspection_staff =", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffNotEqualTo(String value) {
            addCriterion("return_car_inspection_staff <>", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffGreaterThan(String value) {
            addCriterion("return_car_inspection_staff >", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffGreaterThanOrEqualTo(String value) {
            addCriterion("return_car_inspection_staff >=", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffLessThan(String value) {
            addCriterion("return_car_inspection_staff <", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffLessThanOrEqualTo(String value) {
            addCriterion("return_car_inspection_staff <=", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffLike(String value) {
            addCriterion("return_car_inspection_staff like", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffNotLike(String value) {
            addCriterion("return_car_inspection_staff not like", value, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffIn(List<String> values) {
            addCriterion("return_car_inspection_staff in", values, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffNotIn(List<String> values) {
            addCriterion("return_car_inspection_staff not in", values, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffBetween(String value1, String value2) {
            addCriterion("return_car_inspection_staff between", value1, value2, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andReturnCarInspectionStaffNotBetween(String value1, String value2) {
            addCriterion("return_car_inspection_staff not between", value1, value2, "returnCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffIsNull() {
            addCriterion("pick_car_inspection_staff is null");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffIsNotNull() {
            addCriterion("pick_car_inspection_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffEqualTo(String value) {
            addCriterion("pick_car_inspection_staff =", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffNotEqualTo(String value) {
            addCriterion("pick_car_inspection_staff <>", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffGreaterThan(String value) {
            addCriterion("pick_car_inspection_staff >", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffGreaterThanOrEqualTo(String value) {
            addCriterion("pick_car_inspection_staff >=", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffLessThan(String value) {
            addCriterion("pick_car_inspection_staff <", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffLessThanOrEqualTo(String value) {
            addCriterion("pick_car_inspection_staff <=", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffLike(String value) {
            addCriterion("pick_car_inspection_staff like", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffNotLike(String value) {
            addCriterion("pick_car_inspection_staff not like", value, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffIn(List<String> values) {
            addCriterion("pick_car_inspection_staff in", values, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffNotIn(List<String> values) {
            addCriterion("pick_car_inspection_staff not in", values, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffBetween(String value1, String value2) {
            addCriterion("pick_car_inspection_staff between", value1, value2, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andPickCarInspectionStaffNotBetween(String value1, String value2) {
            addCriterion("pick_car_inspection_staff not between", value1, value2, "pickCarInspectionStaff");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarIsNull() {
            addCriterion("is_willing_buy_car is null");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarIsNotNull() {
            addCriterion("is_willing_buy_car is not null");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarEqualTo(String value) {
            addCriterion("is_willing_buy_car =", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarNotEqualTo(String value) {
            addCriterion("is_willing_buy_car <>", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarGreaterThan(String value) {
            addCriterion("is_willing_buy_car >", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarGreaterThanOrEqualTo(String value) {
            addCriterion("is_willing_buy_car >=", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarLessThan(String value) {
            addCriterion("is_willing_buy_car <", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarLessThanOrEqualTo(String value) {
            addCriterion("is_willing_buy_car <=", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarLike(String value) {
            addCriterion("is_willing_buy_car like", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarNotLike(String value) {
            addCriterion("is_willing_buy_car not like", value, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarIn(List<String> values) {
            addCriterion("is_willing_buy_car in", values, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarNotIn(List<String> values) {
            addCriterion("is_willing_buy_car not in", values, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarBetween(String value1, String value2) {
            addCriterion("is_willing_buy_car between", value1, value2, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andIsWillingBuyCarNotBetween(String value1, String value2) {
            addCriterion("is_willing_buy_car not between", value1, value2, "isWillingBuyCar");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellIsNull() {
            addCriterion("return_car_oil_mass_cell is null");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellIsNotNull() {
            addCriterion("return_car_oil_mass_cell is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellEqualTo(Integer value) {
            addCriterion("return_car_oil_mass_cell =", value, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellNotEqualTo(Integer value) {
            addCriterion("return_car_oil_mass_cell <>", value, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellGreaterThan(Integer value) {
            addCriterion("return_car_oil_mass_cell >", value, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_car_oil_mass_cell >=", value, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellLessThan(Integer value) {
            addCriterion("return_car_oil_mass_cell <", value, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellLessThanOrEqualTo(Integer value) {
            addCriterion("return_car_oil_mass_cell <=", value, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellIn(List<Integer> values) {
            addCriterion("return_car_oil_mass_cell in", values, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellNotIn(List<Integer> values) {
            addCriterion("return_car_oil_mass_cell not in", values, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellBetween(Integer value1, Integer value2) {
            addCriterion("return_car_oil_mass_cell between", value1, value2, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andReturnCarOilMassCellNotBetween(Integer value1, Integer value2) {
            addCriterion("return_car_oil_mass_cell not between", value1, value2, "returnCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellIsNull() {
            addCriterion("pick_car_oil_mass_cell is null");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellIsNotNull() {
            addCriterion("pick_car_oil_mass_cell is not null");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellEqualTo(Integer value) {
            addCriterion("pick_car_oil_mass_cell =", value, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellNotEqualTo(Integer value) {
            addCriterion("pick_car_oil_mass_cell <>", value, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellGreaterThan(Integer value) {
            addCriterion("pick_car_oil_mass_cell >", value, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellGreaterThanOrEqualTo(Integer value) {
            addCriterion("pick_car_oil_mass_cell >=", value, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellLessThan(Integer value) {
            addCriterion("pick_car_oil_mass_cell <", value, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellLessThanOrEqualTo(Integer value) {
            addCriterion("pick_car_oil_mass_cell <=", value, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellIn(List<Integer> values) {
            addCriterion("pick_car_oil_mass_cell in", values, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellNotIn(List<Integer> values) {
            addCriterion("pick_car_oil_mass_cell not in", values, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellBetween(Integer value1, Integer value2) {
            addCriterion("pick_car_oil_mass_cell between", value1, value2, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andPickCarOilMassCellNotBetween(Integer value1, Integer value2) {
            addCriterion("pick_car_oil_mass_cell not between", value1, value2, "pickCarOilMassCell");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionIsNull() {
            addCriterion("is_face_recognition is null");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionIsNotNull() {
            addCriterion("is_face_recognition is not null");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionEqualTo(String value) {
            addCriterion("is_face_recognition =", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionNotEqualTo(String value) {
            addCriterion("is_face_recognition <>", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionGreaterThan(String value) {
            addCriterion("is_face_recognition >", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionGreaterThanOrEqualTo(String value) {
            addCriterion("is_face_recognition >=", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionLessThan(String value) {
            addCriterion("is_face_recognition <", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionLessThanOrEqualTo(String value) {
            addCriterion("is_face_recognition <=", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionLike(String value) {
            addCriterion("is_face_recognition like", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionNotLike(String value) {
            addCriterion("is_face_recognition not like", value, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionIn(List<String> values) {
            addCriterion("is_face_recognition in", values, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionNotIn(List<String> values) {
            addCriterion("is_face_recognition not in", values, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionBetween(String value1, String value2) {
            addCriterion("is_face_recognition between", value1, value2, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andIsFaceRecognitionNotBetween(String value1, String value2) {
            addCriterion("is_face_recognition not between", value1, value2, "isFaceRecognition");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceIsNull() {
            addCriterion("return_park_place is null");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceIsNotNull() {
            addCriterion("return_park_place is not null");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceEqualTo(String value) {
            addCriterion("return_park_place =", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceNotEqualTo(String value) {
            addCriterion("return_park_place <>", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceGreaterThan(String value) {
            addCriterion("return_park_place >", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("return_park_place >=", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceLessThan(String value) {
            addCriterion("return_park_place <", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceLessThanOrEqualTo(String value) {
            addCriterion("return_park_place <=", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceLike(String value) {
            addCriterion("return_park_place like", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceNotLike(String value) {
            addCriterion("return_park_place not like", value, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceIn(List<String> values) {
            addCriterion("return_park_place in", values, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceNotIn(List<String> values) {
            addCriterion("return_park_place not in", values, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceBetween(String value1, String value2) {
            addCriterion("return_park_place between", value1, value2, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andReturnParkPlaceNotBetween(String value1, String value2) {
            addCriterion("return_park_place not between", value1, value2, "returnParkPlace");
            return (Criteria) this;
        }

        public Criteria andActualMarginIsNull() {
            addCriterion("actual_margin is null");
            return (Criteria) this;
        }

        public Criteria andActualMarginIsNotNull() {
            addCriterion("actual_margin is not null");
            return (Criteria) this;
        }

        public Criteria andActualMarginEqualTo(BigDecimal value) {
            addCriterion("actual_margin =", value, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginNotEqualTo(BigDecimal value) {
            addCriterion("actual_margin <>", value, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginGreaterThan(BigDecimal value) {
            addCriterion("actual_margin >", value, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_margin >=", value, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginLessThan(BigDecimal value) {
            addCriterion("actual_margin <", value, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_margin <=", value, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginIn(List<BigDecimal> values) {
            addCriterion("actual_margin in", values, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginNotIn(List<BigDecimal> values) {
            addCriterion("actual_margin not in", values, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_margin between", value1, value2, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_margin not between", value1, value2, "actualMargin");
            return (Criteria) this;
        }

        public Criteria andActualRentIsNull() {
            addCriterion("actual_rent is null");
            return (Criteria) this;
        }

        public Criteria andActualRentIsNotNull() {
            addCriterion("actual_rent is not null");
            return (Criteria) this;
        }

        public Criteria andActualRentEqualTo(BigDecimal value) {
            addCriterion("actual_rent =", value, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentNotEqualTo(BigDecimal value) {
            addCriterion("actual_rent <>", value, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentGreaterThan(BigDecimal value) {
            addCriterion("actual_rent >", value, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_rent >=", value, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentLessThan(BigDecimal value) {
            addCriterion("actual_rent <", value, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_rent <=", value, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentIn(List<BigDecimal> values) {
            addCriterion("actual_rent in", values, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentNotIn(List<BigDecimal> values) {
            addCriterion("actual_rent not in", values, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_rent between", value1, value2, "actualRent");
            return (Criteria) this;
        }

        public Criteria andActualRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_rent not between", value1, value2, "actualRent");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNull() {
            addCriterion("zhima_score is null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNotNull() {
            addCriterion("zhima_score is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreEqualTo(Integer value) {
            addCriterion("zhima_score =", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotEqualTo(Integer value) {
            addCriterion("zhima_score <>", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThan(Integer value) {
            addCriterion("zhima_score >", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhima_score >=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThan(Integer value) {
            addCriterion("zhima_score <", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zhima_score <=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIn(List<Integer> values) {
            addCriterion("zhima_score in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotIn(List<Integer> values) {
            addCriterion("zhima_score not in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreBetween(Integer value1, Integer value2) {
            addCriterion("zhima_score between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zhima_score not between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }
    }

    /**
     * order_infos
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * order_infos 2018-01-25
     */
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