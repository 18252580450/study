package com.asiainfo.qm.execution.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkformPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkformPoolExample() {
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

        public Criteria andTouchIdIsNull() {
            addCriterion("TOUCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andTouchIdIsNotNull() {
            addCriterion("TOUCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTouchIdEqualTo(String value) {
            addCriterion("TOUCH_ID =", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotEqualTo(String value) {
            addCriterion("TOUCH_ID <>", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdGreaterThan(String value) {
            addCriterion("TOUCH_ID >", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOUCH_ID >=", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdLessThan(String value) {
            addCriterion("TOUCH_ID <", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdLessThanOrEqualTo(String value) {
            addCriterion("TOUCH_ID <=", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdLike(String value) {
            addCriterion("TOUCH_ID like", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotLike(String value) {
            addCriterion("TOUCH_ID not like", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdIn(List<String> values) {
            addCriterion("TOUCH_ID in", values, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotIn(List<String> values) {
            addCriterion("TOUCH_ID not in", values, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdBetween(String value1, String value2) {
            addCriterion("TOUCH_ID between", value1, value2, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotBetween(String value1, String value2) {
            addCriterion("TOUCH_ID not between", value1, value2, "touchId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(String value) {
            addCriterion("PLAN_ID =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(String value) {
            addCriterion("PLAN_ID <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(String value) {
            addCriterion("PLAN_ID >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_ID >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(String value) {
            addCriterion("PLAN_ID <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(String value) {
            addCriterion("PLAN_ID <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLike(String value) {
            addCriterion("PLAN_ID like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotLike(String value) {
            addCriterion("PLAN_ID not like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<String> values) {
            addCriterion("PLAN_ID in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<String> values) {
            addCriterion("PLAN_ID not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(String value1, String value2) {
            addCriterion("PLAN_ID between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(String value1, String value2) {
            addCriterion("PLAN_ID not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("PROVINCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("PROVINCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("PROVINCE_ID =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("PROVINCE_ID <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("PROVINCE_ID >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_ID >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("PROVINCE_ID <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_ID <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("PROVINCE_ID like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("PROVINCE_ID not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("PROVINCE_ID in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("PROVINCE_ID not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andHandleDurationIsNull() {
            addCriterion("HANDLE_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andHandleDurationIsNotNull() {
            addCriterion("HANDLE_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andHandleDurationEqualTo(Integer value) {
            addCriterion("HANDLE_DURATION =", value, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationNotEqualTo(Integer value) {
            addCriterion("HANDLE_DURATION <>", value, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationGreaterThan(Integer value) {
            addCriterion("HANDLE_DURATION >", value, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_DURATION >=", value, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationLessThan(Integer value) {
            addCriterion("HANDLE_DURATION <", value, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationLessThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_DURATION <=", value, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationIn(List<Integer> values) {
            addCriterion("HANDLE_DURATION in", values, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationNotIn(List<Integer> values) {
            addCriterion("HANDLE_DURATION not in", values, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_DURATION between", value1, value2, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andHandleDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_DURATION not between", value1, value2, "handleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationIsNull() {
            addCriterion("ACTUAL_HANDLE_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationIsNotNull() {
            addCriterion("ACTUAL_HANDLE_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationEqualTo(Integer value) {
            addCriterion("ACTUAL_HANDLE_DURATION =", value, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationNotEqualTo(Integer value) {
            addCriterion("ACTUAL_HANDLE_DURATION <>", value, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationGreaterThan(Integer value) {
            addCriterion("ACTUAL_HANDLE_DURATION >", value, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTUAL_HANDLE_DURATION >=", value, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationLessThan(Integer value) {
            addCriterion("ACTUAL_HANDLE_DURATION <", value, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationLessThanOrEqualTo(Integer value) {
            addCriterion("ACTUAL_HANDLE_DURATION <=", value, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationIn(List<Integer> values) {
            addCriterion("ACTUAL_HANDLE_DURATION in", values, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationNotIn(List<Integer> values) {
            addCriterion("ACTUAL_HANDLE_DURATION not in", values, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationBetween(Integer value1, Integer value2) {
            addCriterion("ACTUAL_HANDLE_DURATION between", value1, value2, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andActualHandleDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTUAL_HANDLE_DURATION not between", value1, value2, "actualHandleDuration");
            return (Criteria) this;
        }

        public Criteria andPoolStatusIsNull() {
            addCriterion("POOL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPoolStatusIsNotNull() {
            addCriterion("POOL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPoolStatusEqualTo(String value) {
            addCriterion("POOL_STATUS =", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusNotEqualTo(String value) {
            addCriterion("POOL_STATUS <>", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusGreaterThan(String value) {
            addCriterion("POOL_STATUS >", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POOL_STATUS >=", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusLessThan(String value) {
            addCriterion("POOL_STATUS <", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusLessThanOrEqualTo(String value) {
            addCriterion("POOL_STATUS <=", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusLike(String value) {
            addCriterion("POOL_STATUS like", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusNotLike(String value) {
            addCriterion("POOL_STATUS not like", value, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusIn(List<String> values) {
            addCriterion("POOL_STATUS in", values, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusNotIn(List<String> values) {
            addCriterion("POOL_STATUS not in", values, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusBetween(String value1, String value2) {
            addCriterion("POOL_STATUS between", value1, value2, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andPoolStatusNotBetween(String value1, String value2) {
            addCriterion("POOL_STATUS not between", value1, value2, "poolStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdIsNull() {
            addCriterion("OPERATE_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdIsNotNull() {
            addCriterion("OPERATE_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdEqualTo(String value) {
            addCriterion("OPERATE_STAFF_ID =", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdNotEqualTo(String value) {
            addCriterion("OPERATE_STAFF_ID <>", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdGreaterThan(String value) {
            addCriterion("OPERATE_STAFF_ID >", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_STAFF_ID >=", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdLessThan(String value) {
            addCriterion("OPERATE_STAFF_ID <", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_STAFF_ID <=", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdLike(String value) {
            addCriterion("OPERATE_STAFF_ID like", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdNotLike(String value) {
            addCriterion("OPERATE_STAFF_ID not like", value, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdIn(List<String> values) {
            addCriterion("OPERATE_STAFF_ID in", values, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdNotIn(List<String> values) {
            addCriterion("OPERATE_STAFF_ID not in", values, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdBetween(String value1, String value2) {
            addCriterion("OPERATE_STAFF_ID between", value1, value2, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateStaffIdNotBetween(String value1, String value2) {
            addCriterion("OPERATE_STAFF_ID not between", value1, value2, "operateStaffId");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("STAFF_ID like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("STAFF_ID not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("DEPART_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("DEPART_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("DEPART_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("DEPART_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("DEPART_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("DEPART_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("DEPART_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("DEPART_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("DEPART_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("DEPART_ID not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCallTypeIsNull() {
            addCriterion("CALL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCallTypeIsNotNull() {
            addCriterion("CALL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCallTypeEqualTo(String value) {
            addCriterion("CALL_TYPE =", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotEqualTo(String value) {
            addCriterion("CALL_TYPE <>", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThan(String value) {
            addCriterion("CALL_TYPE >", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE >=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThan(String value) {
            addCriterion("CALL_TYPE <", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE <=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLike(String value) {
            addCriterion("CALL_TYPE like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotLike(String value) {
            addCriterion("CALL_TYPE not like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeIn(List<String> values) {
            addCriterion("CALL_TYPE in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotIn(List<String> values) {
            addCriterion("CALL_TYPE not in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeBetween(String value1, String value2) {
            addCriterion("CALL_TYPE between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotBetween(String value1, String value2) {
            addCriterion("CALL_TYPE not between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("RECORD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("RECORD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Integer value) {
            addCriterion("RECORD_TIME =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Integer value) {
            addCriterion("RECORD_TIME <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Integer value) {
            addCriterion("RECORD_TIME >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD_TIME >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Integer value) {
            addCriterion("RECORD_TIME <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD_TIME <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Integer> values) {
            addCriterion("RECORD_TIME in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Integer> values) {
            addCriterion("RECORD_TIME not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_TIME between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_TIME not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andCallingNumberIsNull() {
            addCriterion("CALLING_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCallingNumberIsNotNull() {
            addCriterion("CALLING_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCallingNumberEqualTo(String value) {
            addCriterion("CALLING_NUMBER =", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberNotEqualTo(String value) {
            addCriterion("CALLING_NUMBER <>", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberGreaterThan(String value) {
            addCriterion("CALLING_NUMBER >", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CALLING_NUMBER >=", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberLessThan(String value) {
            addCriterion("CALLING_NUMBER <", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberLessThanOrEqualTo(String value) {
            addCriterion("CALLING_NUMBER <=", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberLike(String value) {
            addCriterion("CALLING_NUMBER like", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberNotLike(String value) {
            addCriterion("CALLING_NUMBER not like", value, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberIn(List<String> values) {
            addCriterion("CALLING_NUMBER in", values, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberNotIn(List<String> values) {
            addCriterion("CALLING_NUMBER not in", values, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberBetween(String value1, String value2) {
            addCriterion("CALLING_NUMBER between", value1, value2, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andCallingNumberNotBetween(String value1, String value2) {
            addCriterion("CALLING_NUMBER not between", value1, value2, "callingNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberIsNull() {
            addCriterion("ACCEPT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberIsNotNull() {
            addCriterion("ACCEPT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberEqualTo(String value) {
            addCriterion("ACCEPT_NUMBER =", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotEqualTo(String value) {
            addCriterion("ACCEPT_NUMBER <>", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberGreaterThan(String value) {
            addCriterion("ACCEPT_NUMBER >", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPT_NUMBER >=", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberLessThan(String value) {
            addCriterion("ACCEPT_NUMBER <", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberLessThanOrEqualTo(String value) {
            addCriterion("ACCEPT_NUMBER <=", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberLike(String value) {
            addCriterion("ACCEPT_NUMBER like", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotLike(String value) {
            addCriterion("ACCEPT_NUMBER not like", value, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberIn(List<String> values) {
            addCriterion("ACCEPT_NUMBER in", values, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotIn(List<String> values) {
            addCriterion("ACCEPT_NUMBER not in", values, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberBetween(String value1, String value2) {
            addCriterion("ACCEPT_NUMBER between", value1, value2, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptNumberNotBetween(String value1, String value2) {
            addCriterion("ACCEPT_NUMBER not between", value1, value2, "acceptNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberIsNull() {
            addCriterion("CALLED_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCalledNumberIsNotNull() {
            addCriterion("CALLED_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCalledNumberEqualTo(String value) {
            addCriterion("CALLED_NUMBER =", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberNotEqualTo(String value) {
            addCriterion("CALLED_NUMBER <>", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberGreaterThan(String value) {
            addCriterion("CALLED_NUMBER >", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CALLED_NUMBER >=", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberLessThan(String value) {
            addCriterion("CALLED_NUMBER <", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberLessThanOrEqualTo(String value) {
            addCriterion("CALLED_NUMBER <=", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberLike(String value) {
            addCriterion("CALLED_NUMBER like", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberNotLike(String value) {
            addCriterion("CALLED_NUMBER not like", value, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberIn(List<String> values) {
            addCriterion("CALLED_NUMBER in", values, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberNotIn(List<String> values) {
            addCriterion("CALLED_NUMBER not in", values, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberBetween(String value1, String value2) {
            addCriterion("CALLED_NUMBER between", value1, value2, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCalledNumberNotBetween(String value1, String value2) {
            addCriterion("CALLED_NUMBER not between", value1, value2, "calledNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNull() {
            addCriterion("CUSTOMER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNotNull() {
            addCriterion("CUSTOMER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityEqualTo(String value) {
            addCriterion("CUSTOMER_CITY =", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotEqualTo(String value) {
            addCriterion("CUSTOMER_CITY <>", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThan(String value) {
            addCriterion("CUSTOMER_CITY >", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CITY >=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThan(String value) {
            addCriterion("CUSTOMER_CITY <", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CITY <=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLike(String value) {
            addCriterion("CUSTOMER_CITY like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotLike(String value) {
            addCriterion("CUSTOMER_CITY not like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIn(List<String> values) {
            addCriterion("CUSTOMER_CITY in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotIn(List<String> values) {
            addCriterion("CUSTOMER_CITY not in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CITY between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CITY not between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("CUSTOMER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("CUSTOMER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(String value) {
            addCriterion("CUSTOMER_LEVEL >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(String value) {
            addCriterion("CUSTOMER_LEVEL <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLike(String value) {
            addCriterion("CUSTOMER_LEVEL like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotLike(String value) {
            addCriterion("CUSTOMER_LEVEL not like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<String> values) {
            addCriterion("CUSTOMER_LEVEL in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<String> values) {
            addCriterion("CUSTOMER_LEVEL not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LEVEL between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LEVEL not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andHangupSideIsNull() {
            addCriterion("HANGUP_SIDE is null");
            return (Criteria) this;
        }

        public Criteria andHangupSideIsNotNull() {
            addCriterion("HANGUP_SIDE is not null");
            return (Criteria) this;
        }

        public Criteria andHangupSideEqualTo(String value) {
            addCriterion("HANGUP_SIDE =", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideNotEqualTo(String value) {
            addCriterion("HANGUP_SIDE <>", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideGreaterThan(String value) {
            addCriterion("HANGUP_SIDE >", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideGreaterThanOrEqualTo(String value) {
            addCriterion("HANGUP_SIDE >=", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideLessThan(String value) {
            addCriterion("HANGUP_SIDE <", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideLessThanOrEqualTo(String value) {
            addCriterion("HANGUP_SIDE <=", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideLike(String value) {
            addCriterion("HANGUP_SIDE like", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideNotLike(String value) {
            addCriterion("HANGUP_SIDE not like", value, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideIn(List<String> values) {
            addCriterion("HANGUP_SIDE in", values, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideNotIn(List<String> values) {
            addCriterion("HANGUP_SIDE not in", values, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideBetween(String value1, String value2) {
            addCriterion("HANGUP_SIDE between", value1, value2, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andHangupSideNotBetween(String value1, String value2) {
            addCriterion("HANGUP_SIDE not between", value1, value2, "hangupSide");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andWorkformIdIsNull() {
            addCriterion("WORKFORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkformIdIsNotNull() {
            addCriterion("WORKFORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkformIdEqualTo(String value) {
            addCriterion("WORKFORM_ID =", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdNotEqualTo(String value) {
            addCriterion("WORKFORM_ID <>", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdGreaterThan(String value) {
            addCriterion("WORKFORM_ID >", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORKFORM_ID >=", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdLessThan(String value) {
            addCriterion("WORKFORM_ID <", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdLessThanOrEqualTo(String value) {
            addCriterion("WORKFORM_ID <=", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdLike(String value) {
            addCriterion("WORKFORM_ID like", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdNotLike(String value) {
            addCriterion("WORKFORM_ID not like", value, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdIn(List<String> values) {
            addCriterion("WORKFORM_ID in", values, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdNotIn(List<String> values) {
            addCriterion("WORKFORM_ID not in", values, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdBetween(String value1, String value2) {
            addCriterion("WORKFORM_ID between", value1, value2, "workformId");
            return (Criteria) this;
        }

        public Criteria andWorkformIdNotBetween(String value1, String value2) {
            addCriterion("WORKFORM_ID not between", value1, value2, "workformId");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandIsNull() {
            addCriterion("CUSTOMER_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandIsNotNull() {
            addCriterion("CUSTOMER_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandEqualTo(String value) {
            addCriterion("CUSTOMER_BRAND =", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandNotEqualTo(String value) {
            addCriterion("CUSTOMER_BRAND <>", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandGreaterThan(String value) {
            addCriterion("CUSTOMER_BRAND >", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BRAND >=", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandLessThan(String value) {
            addCriterion("CUSTOMER_BRAND <", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BRAND <=", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandLike(String value) {
            addCriterion("CUSTOMER_BRAND like", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandNotLike(String value) {
            addCriterion("CUSTOMER_BRAND not like", value, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandIn(List<String> values) {
            addCriterion("CUSTOMER_BRAND in", values, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandNotIn(List<String> values) {
            addCriterion("CUSTOMER_BRAND not in", values, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BRAND between", value1, value2, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCustomerBrandNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BRAND not between", value1, value2, "customerBrand");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdIsNull() {
            addCriterion("CHECK_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdIsNotNull() {
            addCriterion("CHECK_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdEqualTo(String value) {
            addCriterion("CHECK_STAFF_ID =", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdNotEqualTo(String value) {
            addCriterion("CHECK_STAFF_ID <>", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdGreaterThan(String value) {
            addCriterion("CHECK_STAFF_ID >", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STAFF_ID >=", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdLessThan(String value) {
            addCriterion("CHECK_STAFF_ID <", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STAFF_ID <=", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdLike(String value) {
            addCriterion("CHECK_STAFF_ID like", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdNotLike(String value) {
            addCriterion("CHECK_STAFF_ID not like", value, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdIn(List<String> values) {
            addCriterion("CHECK_STAFF_ID in", values, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdNotIn(List<String> values) {
            addCriterion("CHECK_STAFF_ID not in", values, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdBetween(String value1, String value2) {
            addCriterion("CHECK_STAFF_ID between", value1, value2, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIdNotBetween(String value1, String value2) {
            addCriterion("CHECK_STAFF_ID not between", value1, value2, "checkStaffId");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameIsNull() {
            addCriterion("CHECK_STAFF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameIsNotNull() {
            addCriterion("CHECK_STAFF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameEqualTo(String value) {
            addCriterion("CHECK_STAFF_NAME =", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotEqualTo(String value) {
            addCriterion("CHECK_STAFF_NAME <>", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameGreaterThan(String value) {
            addCriterion("CHECK_STAFF_NAME >", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STAFF_NAME >=", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameLessThan(String value) {
            addCriterion("CHECK_STAFF_NAME <", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STAFF_NAME <=", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameLike(String value) {
            addCriterion("CHECK_STAFF_NAME like", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotLike(String value) {
            addCriterion("CHECK_STAFF_NAME not like", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameIn(List<String> values) {
            addCriterion("CHECK_STAFF_NAME in", values, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotIn(List<String> values) {
            addCriterion("CHECK_STAFF_NAME not in", values, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameBetween(String value1, String value2) {
            addCriterion("CHECK_STAFF_NAME between", value1, value2, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotBetween(String value1, String value2) {
            addCriterion("CHECK_STAFF_NAME not between", value1, value2, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andRecordPathIsNull() {
            addCriterion("RECORD_PATH is null");
            return (Criteria) this;
        }

        public Criteria andRecordPathIsNotNull() {
            addCriterion("RECORD_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPathEqualTo(String value) {
            addCriterion("RECORD_PATH =", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotEqualTo(String value) {
            addCriterion("RECORD_PATH <>", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathGreaterThan(String value) {
            addCriterion("RECORD_PATH >", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_PATH >=", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathLessThan(String value) {
            addCriterion("RECORD_PATH <", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathLessThanOrEqualTo(String value) {
            addCriterion("RECORD_PATH <=", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathLike(String value) {
            addCriterion("RECORD_PATH like", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotLike(String value) {
            addCriterion("RECORD_PATH not like", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathIn(List<String> values) {
            addCriterion("RECORD_PATH in", values, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotIn(List<String> values) {
            addCriterion("RECORD_PATH not in", values, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathBetween(String value1, String value2) {
            addCriterion("RECORD_PATH between", value1, value2, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotBetween(String value1, String value2) {
            addCriterion("RECORD_PATH not between", value1, value2, "recordPath");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("TEMPLATE_ID like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("TEMPLATE_ID not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentIsNull() {
            addCriterion("SATISFY_EXTENT is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentIsNotNull() {
            addCriterion("SATISFY_EXTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentEqualTo(String value) {
            addCriterion("SATISFY_EXTENT =", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentNotEqualTo(String value) {
            addCriterion("SATISFY_EXTENT <>", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentGreaterThan(String value) {
            addCriterion("SATISFY_EXTENT >", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentGreaterThanOrEqualTo(String value) {
            addCriterion("SATISFY_EXTENT >=", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentLessThan(String value) {
            addCriterion("SATISFY_EXTENT <", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentLessThanOrEqualTo(String value) {
            addCriterion("SATISFY_EXTENT <=", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentLike(String value) {
            addCriterion("SATISFY_EXTENT like", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentNotLike(String value) {
            addCriterion("SATISFY_EXTENT not like", value, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentIn(List<String> values) {
            addCriterion("SATISFY_EXTENT in", values, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentNotIn(List<String> values) {
            addCriterion("SATISFY_EXTENT not in", values, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentBetween(String value1, String value2) {
            addCriterion("SATISFY_EXTENT between", value1, value2, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andSatisfyExtentNotBetween(String value1, String value2) {
            addCriterion("SATISFY_EXTENT not between", value1, value2, "satisfyExtent");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonIsNull() {
            addCriterion("DISCONTENT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonIsNotNull() {
            addCriterion("DISCONTENT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonEqualTo(String value) {
            addCriterion("DISCONTENT_REASON =", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonNotEqualTo(String value) {
            addCriterion("DISCONTENT_REASON <>", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonGreaterThan(String value) {
            addCriterion("DISCONTENT_REASON >", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonGreaterThanOrEqualTo(String value) {
            addCriterion("DISCONTENT_REASON >=", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonLessThan(String value) {
            addCriterion("DISCONTENT_REASON <", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonLessThanOrEqualTo(String value) {
            addCriterion("DISCONTENT_REASON <=", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonLike(String value) {
            addCriterion("DISCONTENT_REASON like", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonNotLike(String value) {
            addCriterion("DISCONTENT_REASON not like", value, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonIn(List<String> values) {
            addCriterion("DISCONTENT_REASON in", values, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonNotIn(List<String> values) {
            addCriterion("DISCONTENT_REASON not in", values, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonBetween(String value1, String value2) {
            addCriterion("DISCONTENT_REASON between", value1, value2, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andDiscontentReasonNotBetween(String value1, String value2) {
            addCriterion("DISCONTENT_REASON not between", value1, value2, "discontentReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonIsNull() {
            addCriterion("CALL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCallReasonIsNotNull() {
            addCriterion("CALL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCallReasonEqualTo(String value) {
            addCriterion("CALL_REASON =", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonNotEqualTo(String value) {
            addCriterion("CALL_REASON <>", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonGreaterThan(String value) {
            addCriterion("CALL_REASON >", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_REASON >=", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonLessThan(String value) {
            addCriterion("CALL_REASON <", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonLessThanOrEqualTo(String value) {
            addCriterion("CALL_REASON <=", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonLike(String value) {
            addCriterion("CALL_REASON like", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonNotLike(String value) {
            addCriterion("CALL_REASON not like", value, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonIn(List<String> values) {
            addCriterion("CALL_REASON in", values, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonNotIn(List<String> values) {
            addCriterion("CALL_REASON not in", values, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonBetween(String value1, String value2) {
            addCriterion("CALL_REASON between", value1, value2, "callReason");
            return (Criteria) this;
        }

        public Criteria andCallReasonNotBetween(String value1, String value2) {
            addCriterion("CALL_REASON not between", value1, value2, "callReason");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("PROJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("PROJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("PROJECT_TYPE =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("PROJECT_TYPE <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("PROJECT_TYPE >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_TYPE >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("PROJECT_TYPE <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_TYPE <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("PROJECT_TYPE like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("PROJECT_TYPE not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("PROJECT_TYPE in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("PROJECT_TYPE not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("PROJECT_TYPE between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("PROJECT_TYPE not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andMarketingResultIsNull() {
            addCriterion("MARKETING_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andMarketingResultIsNotNull() {
            addCriterion("MARKETING_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingResultEqualTo(String value) {
            addCriterion("MARKETING_RESULT =", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultNotEqualTo(String value) {
            addCriterion("MARKETING_RESULT <>", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultGreaterThan(String value) {
            addCriterion("MARKETING_RESULT >", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETING_RESULT >=", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultLessThan(String value) {
            addCriterion("MARKETING_RESULT <", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultLessThanOrEqualTo(String value) {
            addCriterion("MARKETING_RESULT <=", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultLike(String value) {
            addCriterion("MARKETING_RESULT like", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultNotLike(String value) {
            addCriterion("MARKETING_RESULT not like", value, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultIn(List<String> values) {
            addCriterion("MARKETING_RESULT in", values, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultNotIn(List<String> values) {
            addCriterion("MARKETING_RESULT not in", values, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultBetween(String value1, String value2) {
            addCriterion("MARKETING_RESULT between", value1, value2, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andMarketingResultNotBetween(String value1, String value2) {
            addCriterion("MARKETING_RESULT not between", value1, value2, "marketingResult");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsIsNull() {
            addCriterion("REPEAT_CALLS is null");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsIsNotNull() {
            addCriterion("REPEAT_CALLS is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsEqualTo(Byte value) {
            addCriterion("REPEAT_CALLS =", value, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsNotEqualTo(Byte value) {
            addCriterion("REPEAT_CALLS <>", value, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsGreaterThan(Byte value) {
            addCriterion("REPEAT_CALLS >", value, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsGreaterThanOrEqualTo(Byte value) {
            addCriterion("REPEAT_CALLS >=", value, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsLessThan(Byte value) {
            addCriterion("REPEAT_CALLS <", value, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsLessThanOrEqualTo(Byte value) {
            addCriterion("REPEAT_CALLS <=", value, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsIn(List<Byte> values) {
            addCriterion("REPEAT_CALLS in", values, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsNotIn(List<Byte> values) {
            addCriterion("REPEAT_CALLS not in", values, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsBetween(Byte value1, Byte value2) {
            addCriterion("REPEAT_CALLS between", value1, value2, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andRepeatCallsNotBetween(Byte value1, Byte value2) {
            addCriterion("REPEAT_CALLS not between", value1, value2, "repeatCalls");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeIsNull() {
            addCriterion("MODF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModfTimeIsNotNull() {
            addCriterion("MODF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModfTimeEqualTo(Date value) {
            addCriterion("MODF_TIME =", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeNotEqualTo(Date value) {
            addCriterion("MODF_TIME <>", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeGreaterThan(Date value) {
            addCriterion("MODF_TIME >", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODF_TIME >=", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeLessThan(Date value) {
            addCriterion("MODF_TIME <", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODF_TIME <=", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeIn(List<Date> values) {
            addCriterion("MODF_TIME in", values, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeNotIn(List<Date> values) {
            addCriterion("MODF_TIME not in", values, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeBetween(Date value1, Date value2) {
            addCriterion("MODF_TIME between", value1, value2, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODF_TIME not between", value1, value2, "modfTime");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdIsNull() {
            addCriterion("SRV_REQST_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdIsNotNull() {
            addCriterion("SRV_REQST_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_ID =", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdNotEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_ID <>", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdGreaterThan(String value) {
            addCriterion("SRV_REQST_TYPE_ID >", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_ID >=", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdLessThan(String value) {
            addCriterion("SRV_REQST_TYPE_ID <", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_ID <=", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdLike(String value) {
            addCriterion("SRV_REQST_TYPE_ID like", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdNotLike(String value) {
            addCriterion("SRV_REQST_TYPE_ID not like", value, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdIn(List<String> values) {
            addCriterion("SRV_REQST_TYPE_ID in", values, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdNotIn(List<String> values) {
            addCriterion("SRV_REQST_TYPE_ID not in", values, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdBetween(String value1, String value2) {
            addCriterion("SRV_REQST_TYPE_ID between", value1, value2, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeIdNotBetween(String value1, String value2) {
            addCriterion("SRV_REQST_TYPE_ID not between", value1, value2, "srvReqstTypeId");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmIsNull() {
            addCriterion("SRV_REQST_TYPE_NM is null");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmIsNotNull() {
            addCriterion("SRV_REQST_TYPE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_NM =", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmNotEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_NM <>", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmGreaterThan(String value) {
            addCriterion("SRV_REQST_TYPE_NM >", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_NM >=", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmLessThan(String value) {
            addCriterion("SRV_REQST_TYPE_NM <", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmLessThanOrEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_NM <=", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmLike(String value) {
            addCriterion("SRV_REQST_TYPE_NM like", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmNotLike(String value) {
            addCriterion("SRV_REQST_TYPE_NM not like", value, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmIn(List<String> values) {
            addCriterion("SRV_REQST_TYPE_NM in", values, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmNotIn(List<String> values) {
            addCriterion("SRV_REQST_TYPE_NM not in", values, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmBetween(String value1, String value2) {
            addCriterion("SRV_REQST_TYPE_NM between", value1, value2, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeNmNotBetween(String value1, String value2) {
            addCriterion("SRV_REQST_TYPE_NM not between", value1, value2, "srvReqstTypeNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmIsNull() {
            addCriterion("SRV_REQST_TYPE_FULL_NM is null");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmIsNotNull() {
            addCriterion("SRV_REQST_TYPE_FULL_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM =", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmNotEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM <>", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmGreaterThan(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM >", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM >=", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmLessThan(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM <", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmLessThanOrEqualTo(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM <=", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmLike(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM like", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmNotLike(String value) {
            addCriterion("SRV_REQST_TYPE_FULL_NM not like", value, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmIn(List<String> values) {
            addCriterion("SRV_REQST_TYPE_FULL_NM in", values, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmNotIn(List<String> values) {
            addCriterion("SRV_REQST_TYPE_FULL_NM not in", values, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmBetween(String value1, String value2) {
            addCriterion("SRV_REQST_TYPE_FULL_NM between", value1, value2, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andSrvReqstTypeFullNmNotBetween(String value1, String value2) {
            addCriterion("SRV_REQST_TYPE_FULL_NM not between", value1, value2, "srvReqstTypeFullNm");
            return (Criteria) this;
        }

        public Criteria andCheckLinkIsNull() {
            addCriterion("CHECK_LINK is null");
            return (Criteria) this;
        }

        public Criteria andCheckLinkIsNotNull() {
            addCriterion("CHECK_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andCheckLinkEqualTo(String value) {
            addCriterion("CHECK_LINK =", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkNotEqualTo(String value) {
            addCriterion("CHECK_LINK <>", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkGreaterThan(String value) {
            addCriterion("CHECK_LINK >", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_LINK >=", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkLessThan(String value) {
            addCriterion("CHECK_LINK <", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkLessThanOrEqualTo(String value) {
            addCriterion("CHECK_LINK <=", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkLike(String value) {
            addCriterion("CHECK_LINK like", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkNotLike(String value) {
            addCriterion("CHECK_LINK not like", value, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkIn(List<String> values) {
            addCriterion("CHECK_LINK in", values, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkNotIn(List<String> values) {
            addCriterion("CHECK_LINK not in", values, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkBetween(String value1, String value2) {
            addCriterion("CHECK_LINK between", value1, value2, "checkLink");
            return (Criteria) this;
        }

        public Criteria andCheckLinkNotBetween(String value1, String value2) {
            addCriterion("CHECK_LINK not between", value1, value2, "checkLink");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNull() {
            addCriterion("RESERVE_1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("RESERVE_1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("RESERVE_1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("RESERVE_1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("RESERVE_1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("RESERVE_1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("RESERVE_1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("RESERVE_1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("RESERVE_1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("RESERVE_1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("RESERVE_1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("RESERVE_1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("RESERVE_1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("RESERVE_2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("RESERVE_2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("RESERVE_2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("RESERVE_2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("RESERVE_2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("RESERVE_2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("RESERVE_2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("RESERVE_2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("RESERVE_2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("RESERVE_2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("RESERVE_2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("RESERVE_2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("RESERVE_2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("RESERVE_3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("RESERVE_3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("RESERVE_3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("RESERVE_3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("RESERVE_3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("RESERVE_3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("RESERVE_3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("RESERVE_3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("RESERVE_3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("RESERVE_3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("RESERVE_3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("RESERVE_3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("RESERVE_3 not between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNull() {
            addCriterion("RESERVE_4 is null");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNotNull() {
            addCriterion("RESERVE_4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve4EqualTo(String value) {
            addCriterion("RESERVE_4 =", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotEqualTo(String value) {
            addCriterion("RESERVE_4 <>", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThan(String value) {
            addCriterion("RESERVE_4 >", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_4 >=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThan(String value) {
            addCriterion("RESERVE_4 <", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThanOrEqualTo(String value) {
            addCriterion("RESERVE_4 <=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Like(String value) {
            addCriterion("RESERVE_4 like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotLike(String value) {
            addCriterion("RESERVE_4 not like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4In(List<String> values) {
            addCriterion("RESERVE_4 in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotIn(List<String> values) {
            addCriterion("RESERVE_4 not in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Between(String value1, String value2) {
            addCriterion("RESERVE_4 between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotBetween(String value1, String value2) {
            addCriterion("RESERVE_4 not between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNull() {
            addCriterion("RESERVE_5 is null");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNotNull() {
            addCriterion("RESERVE_5 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve5EqualTo(String value) {
            addCriterion("RESERVE_5 =", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotEqualTo(String value) {
            addCriterion("RESERVE_5 <>", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThan(String value) {
            addCriterion("RESERVE_5 >", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_5 >=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThan(String value) {
            addCriterion("RESERVE_5 <", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThanOrEqualTo(String value) {
            addCriterion("RESERVE_5 <=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Like(String value) {
            addCriterion("RESERVE_5 like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotLike(String value) {
            addCriterion("RESERVE_5 not like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5In(List<String> values) {
            addCriterion("RESERVE_5 in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotIn(List<String> values) {
            addCriterion("RESERVE_5 not in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Between(String value1, String value2) {
            addCriterion("RESERVE_5 between", value1, value2, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotBetween(String value1, String value2) {
            addCriterion("RESERVE_5 not between", value1, value2, "reserve5");
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