package com.project.billmanage.entities.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClientroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientroleExample() {
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

        public Criteria andCridIsNull() {
            addCriterion("crId is null");
            return (Criteria) this;
        }

        public Criteria andCridIsNotNull() {
            addCriterion("crId is not null");
            return (Criteria) this;
        }

        public Criteria andCridEqualTo(Integer value) {
            addCriterion("crId =", value, "crid");
            return (Criteria) this;
        }

        public Criteria andCridNotEqualTo(Integer value) {
            addCriterion("crId <>", value, "crid");
            return (Criteria) this;
        }

        public Criteria andCridGreaterThan(Integer value) {
            addCriterion("crId >", value, "crid");
            return (Criteria) this;
        }

        public Criteria andCridGreaterThanOrEqualTo(Integer value) {
            addCriterion("crId >=", value, "crid");
            return (Criteria) this;
        }

        public Criteria andCridLessThan(Integer value) {
            addCriterion("crId <", value, "crid");
            return (Criteria) this;
        }

        public Criteria andCridLessThanOrEqualTo(Integer value) {
            addCriterion("crId <=", value, "crid");
            return (Criteria) this;
        }

        public Criteria andCridIn(List<Integer> values) {
            addCriterion("crId in", values, "crid");
            return (Criteria) this;
        }

        public Criteria andCridNotIn(List<Integer> values) {
            addCriterion("crId not in", values, "crid");
            return (Criteria) this;
        }

        public Criteria andCridBetween(Integer value1, Integer value2) {
            addCriterion("crId between", value1, value2, "crid");
            return (Criteria) this;
        }

        public Criteria andCridNotBetween(Integer value1, Integer value2) {
            addCriterion("crId not between", value1, value2, "crid");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andRroleidIsNull() {
            addCriterion("rroleId is null");
            return (Criteria) this;
        }

        public Criteria andRroleidIsNotNull() {
            addCriterion("rroleId is not null");
            return (Criteria) this;
        }

        public Criteria andRroleidEqualTo(Integer value) {
            addCriterion("rroleId =", value, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidNotEqualTo(Integer value) {
            addCriterion("rroleId <>", value, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidGreaterThan(Integer value) {
            addCriterion("rroleId >", value, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rroleId >=", value, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidLessThan(Integer value) {
            addCriterion("rroleId <", value, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidLessThanOrEqualTo(Integer value) {
            addCriterion("rroleId <=", value, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidIn(List<Integer> values) {
            addCriterion("rroleId in", values, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidNotIn(List<Integer> values) {
            addCriterion("rroleId not in", values, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidBetween(Integer value1, Integer value2) {
            addCriterion("rroleId between", value1, value2, "rroleid");
            return (Criteria) this;
        }

        public Criteria andRroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("rroleId not between", value1, value2, "rroleid");
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