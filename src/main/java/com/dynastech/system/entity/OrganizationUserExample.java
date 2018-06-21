package com.dynastech.system.entity;

import java.util.ArrayList;
import java.util.List;

public class OrganizationUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public OrganizationUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
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

        public Criteria andOrganizationidIsNull() {
            addCriterion("ou.OrganizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("ou.OrganizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("ou.OrganizationId =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("ou.OrganizationId <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("ou.OrganizationId >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("ou.OrganizationId >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("ou.OrganizationId <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("ou.OrganizationId <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("ou.OrganizationId like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("ou.OrganizationId not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("ou.OrganizationId in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("ou.OrganizationId not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("ou.OrganizationId between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("ou.OrganizationId not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("ou.UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("ou.UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("ou.UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("ou.UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("ou.UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("ou.UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("ou.UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("ou.UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("ou.UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("ou.UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("ou.UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("ou.UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("ou.UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("ou.UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andExtensiondataIsNull() {
            addCriterion("ou.ExtensionData is null");
            return (Criteria) this;
        }

        public Criteria andExtensiondataIsNotNull() {
            addCriterion("ou.ExtensionData is not null");
            return (Criteria) this;
        }

        public Criteria andExtensiondataEqualTo(String value) {
            addCriterion("ou.ExtensionData =", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataNotEqualTo(String value) {
            addCriterion("ou.ExtensionData <>", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataGreaterThan(String value) {
            addCriterion("ou.ExtensionData >", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataGreaterThanOrEqualTo(String value) {
            addCriterion("ou.ExtensionData >=", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataLessThan(String value) {
            addCriterion("ou.ExtensionData <", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataLessThanOrEqualTo(String value) {
            addCriterion("ou.ExtensionData <=", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataLike(String value) {
            addCriterion("ou.ExtensionData like", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataNotLike(String value) {
            addCriterion("ou.ExtensionData not like", value, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataIn(List<String> values) {
            addCriterion("ou.ExtensionData in", values, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataNotIn(List<String> values) {
            addCriterion("ou.ExtensionData not in", values, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataBetween(String value1, String value2) {
            addCriterion("ou.ExtensionData between", value1, value2, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andExtensiondataNotBetween(String value1, String value2) {
            addCriterion("ou.ExtensionData not between", value1, value2, "extensiondata");
            return (Criteria) this;
        }

        public Criteria andIsprincipalIsNull() {
            addCriterion("ou.IsPrincipal is null");
            return (Criteria) this;
        }

        public Criteria andIsprincipalIsNotNull() {
            addCriterion("ou.IsPrincipal is not null");
            return (Criteria) this;
        }

        public Criteria andIsprincipalEqualTo(Boolean value) {
            addCriterion("ou.IsPrincipal =", value, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalNotEqualTo(Boolean value) {
            addCriterion("ou.IsPrincipal <>", value, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalGreaterThan(Boolean value) {
            addCriterion("ou.IsPrincipal >", value, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ou.IsPrincipal >=", value, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalLessThan(Boolean value) {
            addCriterion("ou.IsPrincipal <", value, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalLessThanOrEqualTo(Boolean value) {
            addCriterion("ou.IsPrincipal <=", value, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalIn(List<Boolean> values) {
            addCriterion("ou.IsPrincipal in", values, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalNotIn(List<Boolean> values) {
            addCriterion("ou.IsPrincipal not in", values, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalBetween(Boolean value1, Boolean value2) {
            addCriterion("ou.IsPrincipal between", value1, value2, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andIsprincipalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ou.IsPrincipal not between", value1, value2, "isprincipal");
            return (Criteria) this;
        }

        public Criteria andOrdinalIsNull() {
            addCriterion("ou.Ordinal is null");
            return (Criteria) this;
        }

        public Criteria andOrdinalIsNotNull() {
            addCriterion("ou.Ordinal is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinalEqualTo(Integer value) {
            addCriterion("ou.Ordinal =", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalNotEqualTo(Integer value) {
            addCriterion("ou.Ordinal <>", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalGreaterThan(Integer value) {
            addCriterion("ou.Ordinal >", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ou.Ordinal >=", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalLessThan(Integer value) {
            addCriterion("ou.Ordinal <", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalLessThanOrEqualTo(Integer value) {
            addCriterion("ou.Ordinal <=", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalIn(List<Integer> values) {
            addCriterion("ou.Ordinal in", values, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalNotIn(List<Integer> values) {
            addCriterion("ou.Ordinal not in", values, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalBetween(Integer value1, Integer value2) {
            addCriterion("ou.Ordinal between", value1, value2, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalNotBetween(Integer value1, Integer value2) {
            addCriterion("ou.Ordinal not between", value1, value2, "ordinal");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("ou.Sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("ou.Sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(Integer value) {
            addCriterion("ou.Sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(Integer value) {
            addCriterion("ou.Sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(Integer value) {
            addCriterion("ou.Sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("ou.Sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(Integer value) {
            addCriterion("ou.Sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(Integer value) {
            addCriterion("ou.Sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<Integer> values) {
            addCriterion("ou.Sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<Integer> values) {
            addCriterion("ou.Sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(Integer value1, Integer value2) {
            addCriterion("ou.Sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(Integer value1, Integer value2) {
            addCriterion("ou.Sn not between", value1, value2, "sn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 16 15:44:37 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_OrganizationUser
     *
     * @mbggenerated Wed Aug 16 15:44:37 CST 2017
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