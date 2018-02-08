package com.hdliu.wxems.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTeacherClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TTeacherClassExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTeacherSubjectIdIsNull() {
            addCriterion("teacher_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdIsNotNull() {
            addCriterion("teacher_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdEqualTo(Integer value) {
            addCriterion("teacher_subject_id =", value, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdNotEqualTo(Integer value) {
            addCriterion("teacher_subject_id <>", value, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdGreaterThan(Integer value) {
            addCriterion("teacher_subject_id >", value, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_subject_id >=", value, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdLessThan(Integer value) {
            addCriterion("teacher_subject_id <", value, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_subject_id <=", value, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdIn(List<Integer> values) {
            addCriterion("teacher_subject_id in", values, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdNotIn(List<Integer> values) {
            addCriterion("teacher_subject_id not in", values, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_subject_id between", value1, value2, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andTeacherSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_subject_id not between", value1, value2, "teacherSubjectId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andPushSwitchIsNull() {
            addCriterion("push_switch is null");
            return (Criteria) this;
        }

        public Criteria andPushSwitchIsNotNull() {
            addCriterion("push_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPushSwitchEqualTo(Boolean value) {
            addCriterion("push_switch =", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchNotEqualTo(Boolean value) {
            addCriterion("push_switch <>", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchGreaterThan(Boolean value) {
            addCriterion("push_switch >", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_switch >=", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchLessThan(Boolean value) {
            addCriterion("push_switch <", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("push_switch <=", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchIn(List<Boolean> values) {
            addCriterion("push_switch in", values, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchNotIn(List<Boolean> values) {
            addCriterion("push_switch not in", values, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("push_switch between", value1, value2, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_switch not between", value1, value2, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPassagewayIsNull() {
            addCriterion("passageway is null");
            return (Criteria) this;
        }

        public Criteria andPassagewayIsNotNull() {
            addCriterion("passageway is not null");
            return (Criteria) this;
        }

        public Criteria andPassagewayEqualTo(String value) {
            addCriterion("passageway =", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayNotEqualTo(String value) {
            addCriterion("passageway <>", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayGreaterThan(String value) {
            addCriterion("passageway >", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayGreaterThanOrEqualTo(String value) {
            addCriterion("passageway >=", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayLessThan(String value) {
            addCriterion("passageway <", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayLessThanOrEqualTo(String value) {
            addCriterion("passageway <=", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayLike(String value) {
            addCriterion("passageway like", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayNotLike(String value) {
            addCriterion("passageway not like", value, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayIn(List<String> values) {
            addCriterion("passageway in", values, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayNotIn(List<String> values) {
            addCriterion("passageway not in", values, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayBetween(String value1, String value2) {
            addCriterion("passageway between", value1, value2, "passageway");
            return (Criteria) this;
        }

        public Criteria andPassagewayNotBetween(String value1, String value2) {
            addCriterion("passageway not between", value1, value2, "passageway");
            return (Criteria) this;
        }

        public Criteria andSendkeyIsNull() {
            addCriterion("sendkey is null");
            return (Criteria) this;
        }

        public Criteria andSendkeyIsNotNull() {
            addCriterion("sendkey is not null");
            return (Criteria) this;
        }

        public Criteria andSendkeyEqualTo(String value) {
            addCriterion("sendkey =", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyNotEqualTo(String value) {
            addCriterion("sendkey <>", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyGreaterThan(String value) {
            addCriterion("sendkey >", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyGreaterThanOrEqualTo(String value) {
            addCriterion("sendkey >=", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyLessThan(String value) {
            addCriterion("sendkey <", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyLessThanOrEqualTo(String value) {
            addCriterion("sendkey <=", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyLike(String value) {
            addCriterion("sendkey like", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyNotLike(String value) {
            addCriterion("sendkey not like", value, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyIn(List<String> values) {
            addCriterion("sendkey in", values, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyNotIn(List<String> values) {
            addCriterion("sendkey not in", values, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyBetween(String value1, String value2) {
            addCriterion("sendkey between", value1, value2, "sendkey");
            return (Criteria) this;
        }

        public Criteria andSendkeyNotBetween(String value1, String value2) {
            addCriterion("sendkey not between", value1, value2, "sendkey");
            return (Criteria) this;
        }

        public Criteria andLastPushIsNull() {
            addCriterion("last_push is null");
            return (Criteria) this;
        }

        public Criteria andLastPushIsNotNull() {
            addCriterion("last_push is not null");
            return (Criteria) this;
        }

        public Criteria andLastPushEqualTo(Date value) {
            addCriterion("last_push =", value, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushNotEqualTo(Date value) {
            addCriterion("last_push <>", value, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushGreaterThan(Date value) {
            addCriterion("last_push >", value, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushGreaterThanOrEqualTo(Date value) {
            addCriterion("last_push >=", value, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushLessThan(Date value) {
            addCriterion("last_push <", value, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushLessThanOrEqualTo(Date value) {
            addCriterion("last_push <=", value, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushIn(List<Date> values) {
            addCriterion("last_push in", values, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushNotIn(List<Date> values) {
            addCriterion("last_push not in", values, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushBetween(Date value1, Date value2) {
            addCriterion("last_push between", value1, value2, "lastPush");
            return (Criteria) this;
        }

        public Criteria andLastPushNotBetween(Date value1, Date value2) {
            addCriterion("last_push not between", value1, value2, "lastPush");
            return (Criteria) this;
        }
    }

    /**
     */
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