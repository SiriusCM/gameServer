package com.sirius.server.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class HumanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HumanExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("channelid is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelid is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(String value) {
            addCriterion("channelid =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(String value) {
            addCriterion("channelid <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(String value) {
            addCriterion("channelid >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(String value) {
            addCriterion("channelid >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(String value) {
            addCriterion("channelid <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(String value) {
            addCriterion("channelid <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLike(String value) {
            addCriterion("channelid like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotLike(String value) {
            addCriterion("channelid not like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<String> values) {
            addCriterion("channelid in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<String> values) {
            addCriterion("channelid not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(String value1, String value2) {
            addCriterion("channelid between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(String value1, String value2) {
            addCriterion("channelid not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andServeridIsNull() {
            addCriterion("serverId is null");
            return (Criteria) this;
        }

        public Criteria andServeridIsNotNull() {
            addCriterion("serverId is not null");
            return (Criteria) this;
        }

        public Criteria andServeridEqualTo(Integer value) {
            addCriterion("serverId =", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridNotEqualTo(Integer value) {
            addCriterion("serverId <>", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridGreaterThan(Integer value) {
            addCriterion("serverId >", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("serverId >=", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridLessThan(Integer value) {
            addCriterion("serverId <", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridLessThanOrEqualTo(Integer value) {
            addCriterion("serverId <=", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridIn(List<Integer> values) {
            addCriterion("serverId in", values, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridNotIn(List<Integer> values) {
            addCriterion("serverId not in", values, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridBetween(Integer value1, Integer value2) {
            addCriterion("serverId between", value1, value2, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridNotBetween(Integer value1, Integer value2) {
            addCriterion("serverId not between", value1, value2, "serverid");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIsNull() {
            addCriterion("platformName is null");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIsNotNull() {
            addCriterion("platformName is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformnameEqualTo(String value) {
            addCriterion("platformName =", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotEqualTo(String value) {
            addCriterion("platformName <>", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameGreaterThan(String value) {
            addCriterion("platformName >", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameGreaterThanOrEqualTo(String value) {
            addCriterion("platformName >=", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLessThan(String value) {
            addCriterion("platformName <", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLessThanOrEqualTo(String value) {
            addCriterion("platformName <=", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLike(String value) {
            addCriterion("platformName like", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotLike(String value) {
            addCriterion("platformName not like", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIn(List<String> values) {
            addCriterion("platformName in", values, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotIn(List<String> values) {
            addCriterion("platformName not in", values, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameBetween(String value1, String value2) {
            addCriterion("platformName between", value1, value2, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotBetween(String value1, String value2) {
            addCriterion("platformName not between", value1, value2, "platformname");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidIsNull() {
            addCriterion("deviceUniqueId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidIsNotNull() {
            addCriterion("deviceUniqueId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidEqualTo(String value) {
            addCriterion("deviceUniqueId =", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidNotEqualTo(String value) {
            addCriterion("deviceUniqueId <>", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidGreaterThan(String value) {
            addCriterion("deviceUniqueId >", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceUniqueId >=", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidLessThan(String value) {
            addCriterion("deviceUniqueId <", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidLessThanOrEqualTo(String value) {
            addCriterion("deviceUniqueId <=", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidLike(String value) {
            addCriterion("deviceUniqueId like", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidNotLike(String value) {
            addCriterion("deviceUniqueId not like", value, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidIn(List<String> values) {
            addCriterion("deviceUniqueId in", values, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidNotIn(List<String> values) {
            addCriterion("deviceUniqueId not in", values, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidBetween(String value1, String value2) {
            addCriterion("deviceUniqueId between", value1, value2, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andDeviceuniqueidNotBetween(String value1, String value2) {
            addCriterion("deviceUniqueId not between", value1, value2, "deviceuniqueid");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineIsNull() {
            addCriterion("timeSecOnline is null");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineIsNotNull() {
            addCriterion("timeSecOnline is not null");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineEqualTo(Integer value) {
            addCriterion("timeSecOnline =", value, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineNotEqualTo(Integer value) {
            addCriterion("timeSecOnline <>", value, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineGreaterThan(Integer value) {
            addCriterion("timeSecOnline >", value, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeSecOnline >=", value, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineLessThan(Integer value) {
            addCriterion("timeSecOnline <", value, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineLessThanOrEqualTo(Integer value) {
            addCriterion("timeSecOnline <=", value, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineIn(List<Integer> values) {
            addCriterion("timeSecOnline in", values, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineNotIn(List<Integer> values) {
            addCriterion("timeSecOnline not in", values, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineBetween(Integer value1, Integer value2) {
            addCriterion("timeSecOnline between", value1, value2, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeseconlineNotBetween(Integer value1, Integer value2) {
            addCriterion("timeSecOnline not between", value1, value2, "timeseconline");
            return (Criteria) this;
        }

        public Criteria andTimeloginIsNull() {
            addCriterion("timeLogin is null");
            return (Criteria) this;
        }

        public Criteria andTimeloginIsNotNull() {
            addCriterion("timeLogin is not null");
            return (Criteria) this;
        }

        public Criteria andTimeloginEqualTo(Long value) {
            addCriterion("timeLogin =", value, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginNotEqualTo(Long value) {
            addCriterion("timeLogin <>", value, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginGreaterThan(Long value) {
            addCriterion("timeLogin >", value, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginGreaterThanOrEqualTo(Long value) {
            addCriterion("timeLogin >=", value, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginLessThan(Long value) {
            addCriterion("timeLogin <", value, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginLessThanOrEqualTo(Long value) {
            addCriterion("timeLogin <=", value, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginIn(List<Long> values) {
            addCriterion("timeLogin in", values, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginNotIn(List<Long> values) {
            addCriterion("timeLogin not in", values, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginBetween(Long value1, Long value2) {
            addCriterion("timeLogin between", value1, value2, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimeloginNotBetween(Long value1, Long value2) {
            addCriterion("timeLogin not between", value1, value2, "timelogin");
            return (Criteria) this;
        }

        public Criteria andTimelogoutIsNull() {
            addCriterion("timeLogout is null");
            return (Criteria) this;
        }

        public Criteria andTimelogoutIsNotNull() {
            addCriterion("timeLogout is not null");
            return (Criteria) this;
        }

        public Criteria andTimelogoutEqualTo(Long value) {
            addCriterion("timeLogout =", value, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutNotEqualTo(Long value) {
            addCriterion("timeLogout <>", value, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutGreaterThan(Long value) {
            addCriterion("timeLogout >", value, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutGreaterThanOrEqualTo(Long value) {
            addCriterion("timeLogout >=", value, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutLessThan(Long value) {
            addCriterion("timeLogout <", value, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutLessThanOrEqualTo(Long value) {
            addCriterion("timeLogout <=", value, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutIn(List<Long> values) {
            addCriterion("timeLogout in", values, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutNotIn(List<Long> values) {
            addCriterion("timeLogout not in", values, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutBetween(Long value1, Long value2) {
            addCriterion("timeLogout between", value1, value2, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimelogoutNotBetween(Long value1, Long value2) {
            addCriterion("timeLogout not between", value1, value2, "timelogout");
            return (Criteria) this;
        }

        public Criteria andTimecreateIsNull() {
            addCriterion("timeCreate is null");
            return (Criteria) this;
        }

        public Criteria andTimecreateIsNotNull() {
            addCriterion("timeCreate is not null");
            return (Criteria) this;
        }

        public Criteria andTimecreateEqualTo(Long value) {
            addCriterion("timeCreate =", value, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateNotEqualTo(Long value) {
            addCriterion("timeCreate <>", value, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateGreaterThan(Long value) {
            addCriterion("timeCreate >", value, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateGreaterThanOrEqualTo(Long value) {
            addCriterion("timeCreate >=", value, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateLessThan(Long value) {
            addCriterion("timeCreate <", value, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateLessThanOrEqualTo(Long value) {
            addCriterion("timeCreate <=", value, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateIn(List<Long> values) {
            addCriterion("timeCreate in", values, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateNotIn(List<Long> values) {
            addCriterion("timeCreate not in", values, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateBetween(Long value1, Long value2) {
            addCriterion("timeCreate between", value1, value2, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimecreateNotBetween(Long value1, Long value2) {
            addCriterion("timeCreate not between", value1, value2, "timecreate");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeIsNull() {
            addCriterion("timeLvChange is null");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeIsNotNull() {
            addCriterion("timeLvChange is not null");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeEqualTo(Long value) {
            addCriterion("timeLvChange =", value, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeNotEqualTo(Long value) {
            addCriterion("timeLvChange <>", value, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeGreaterThan(Long value) {
            addCriterion("timeLvChange >", value, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeGreaterThanOrEqualTo(Long value) {
            addCriterion("timeLvChange >=", value, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeLessThan(Long value) {
            addCriterion("timeLvChange <", value, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeLessThanOrEqualTo(Long value) {
            addCriterion("timeLvChange <=", value, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeIn(List<Long> values) {
            addCriterion("timeLvChange in", values, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeNotIn(List<Long> values) {
            addCriterion("timeLvChange not in", values, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeBetween(Long value1, Long value2) {
            addCriterion("timeLvChange between", value1, value2, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andTimelvchangeNotBetween(Long value1, Long value2) {
            addCriterion("timeLvChange not between", value1, value2, "timelvchange");
            return (Criteria) this;
        }

        public Criteria andGameoptionsIsNull() {
            addCriterion("gameOptions is null");
            return (Criteria) this;
        }

        public Criteria andGameoptionsIsNotNull() {
            addCriterion("gameOptions is not null");
            return (Criteria) this;
        }

        public Criteria andGameoptionsEqualTo(String value) {
            addCriterion("gameOptions =", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsNotEqualTo(String value) {
            addCriterion("gameOptions <>", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsGreaterThan(String value) {
            addCriterion("gameOptions >", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsGreaterThanOrEqualTo(String value) {
            addCriterion("gameOptions >=", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsLessThan(String value) {
            addCriterion("gameOptions <", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsLessThanOrEqualTo(String value) {
            addCriterion("gameOptions <=", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsLike(String value) {
            addCriterion("gameOptions like", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsNotLike(String value) {
            addCriterion("gameOptions not like", value, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsIn(List<String> values) {
            addCriterion("gameOptions in", values, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsNotIn(List<String> values) {
            addCriterion("gameOptions not in", values, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsBetween(String value1, String value2) {
            addCriterion("gameOptions between", value1, value2, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andGameoptionsNotBetween(String value1, String value2) {
            addCriterion("gameOptions not between", value1, value2, "gameoptions");
            return (Criteria) this;
        }

        public Criteria andInitsnIsNull() {
            addCriterion("initSn is null");
            return (Criteria) this;
        }

        public Criteria andInitsnIsNotNull() {
            addCriterion("initSn is not null");
            return (Criteria) this;
        }

        public Criteria andInitsnEqualTo(Integer value) {
            addCriterion("initSn =", value, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnNotEqualTo(Integer value) {
            addCriterion("initSn <>", value, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnGreaterThan(Integer value) {
            addCriterion("initSn >", value, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnGreaterThanOrEqualTo(Integer value) {
            addCriterion("initSn >=", value, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnLessThan(Integer value) {
            addCriterion("initSn <", value, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnLessThanOrEqualTo(Integer value) {
            addCriterion("initSn <=", value, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnIn(List<Integer> values) {
            addCriterion("initSn in", values, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnNotIn(List<Integer> values) {
            addCriterion("initSn not in", values, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnBetween(Integer value1, Integer value2) {
            addCriterion("initSn between", value1, value2, "initsn");
            return (Criteria) this;
        }

        public Criteria andInitsnNotBetween(Integer value1, Integer value2) {
            addCriterion("initSn not between", value1, value2, "initsn");
            return (Criteria) this;
        }

        public Criteria andGoldIsNull() {
            addCriterion("gold is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion("gold is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(Integer value) {
            addCriterion("gold =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(Integer value) {
            addCriterion("gold <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(Integer value) {
            addCriterion("gold >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(Integer value) {
            addCriterion("gold <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(Integer value) {
            addCriterion("gold <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Integer> values) {
            addCriterion("gold in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Integer> values) {
            addCriterion("gold not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(Integer value1, Integer value2) {
            addCriterion("gold between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("gold not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andDiamondIsNull() {
            addCriterion("diamond is null");
            return (Criteria) this;
        }

        public Criteria andDiamondIsNotNull() {
            addCriterion("diamond is not null");
            return (Criteria) this;
        }

        public Criteria andDiamondEqualTo(Integer value) {
            addCriterion("diamond =", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotEqualTo(Integer value) {
            addCriterion("diamond <>", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondGreaterThan(Integer value) {
            addCriterion("diamond >", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondGreaterThanOrEqualTo(Integer value) {
            addCriterion("diamond >=", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondLessThan(Integer value) {
            addCriterion("diamond <", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondLessThanOrEqualTo(Integer value) {
            addCriterion("diamond <=", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondIn(List<Integer> values) {
            addCriterion("diamond in", values, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotIn(List<Integer> values) {
            addCriterion("diamond not in", values, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondBetween(Integer value1, Integer value2) {
            addCriterion("diamond between", value1, value2, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotBetween(Integer value1, Integer value2) {
            addCriterion("diamond not between", value1, value2, "diamond");
            return (Criteria) this;
        }

        public Criteria andPhyIsNull() {
            addCriterion("phy is null");
            return (Criteria) this;
        }

        public Criteria andPhyIsNotNull() {
            addCriterion("phy is not null");
            return (Criteria) this;
        }

        public Criteria andPhyEqualTo(Integer value) {
            addCriterion("phy =", value, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyNotEqualTo(Integer value) {
            addCriterion("phy <>", value, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyGreaterThan(Integer value) {
            addCriterion("phy >", value, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyGreaterThanOrEqualTo(Integer value) {
            addCriterion("phy >=", value, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyLessThan(Integer value) {
            addCriterion("phy <", value, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyLessThanOrEqualTo(Integer value) {
            addCriterion("phy <=", value, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyIn(List<Integer> values) {
            addCriterion("phy in", values, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyNotIn(List<Integer> values) {
            addCriterion("phy not in", values, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyBetween(Integer value1, Integer value2) {
            addCriterion("phy between", value1, value2, "phy");
            return (Criteria) this;
        }

        public Criteria andPhyNotBetween(Integer value1, Integer value2) {
            addCriterion("phy not between", value1, value2, "phy");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(Integer value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(Integer value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(Integer value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(Integer value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(Integer value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(Integer value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<Integer> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<Integer> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(Integer value1, Integer value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(Integer value1, Integer value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Long value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Long value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Long value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Long value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Long value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Long value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Long> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Long> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Long value1, Long value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Long value1, Long value2) {
            addCriterion("exp not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andLottoIsNull() {
            addCriterion("lotto is null");
            return (Criteria) this;
        }

        public Criteria andLottoIsNotNull() {
            addCriterion("lotto is not null");
            return (Criteria) this;
        }

        public Criteria andLottoEqualTo(Byte value) {
            addCriterion("lotto =", value, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoNotEqualTo(Byte value) {
            addCriterion("lotto <>", value, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoGreaterThan(Byte value) {
            addCriterion("lotto >", value, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoGreaterThanOrEqualTo(Byte value) {
            addCriterion("lotto >=", value, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoLessThan(Byte value) {
            addCriterion("lotto <", value, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoLessThanOrEqualTo(Byte value) {
            addCriterion("lotto <=", value, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoIn(List<Byte> values) {
            addCriterion("lotto in", values, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoNotIn(List<Byte> values) {
            addCriterion("lotto not in", values, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoBetween(Byte value1, Byte value2) {
            addCriterion("lotto between", value1, value2, "lotto");
            return (Criteria) this;
        }

        public Criteria andLottoNotBetween(Byte value1, Byte value2) {
            addCriterion("lotto not between", value1, value2, "lotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoIsNull() {
            addCriterion("tenLotto is null");
            return (Criteria) this;
        }

        public Criteria andTenlottoIsNotNull() {
            addCriterion("tenLotto is not null");
            return (Criteria) this;
        }

        public Criteria andTenlottoEqualTo(Byte value) {
            addCriterion("tenLotto =", value, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoNotEqualTo(Byte value) {
            addCriterion("tenLotto <>", value, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoGreaterThan(Byte value) {
            addCriterion("tenLotto >", value, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoGreaterThanOrEqualTo(Byte value) {
            addCriterion("tenLotto >=", value, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoLessThan(Byte value) {
            addCriterion("tenLotto <", value, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoLessThanOrEqualTo(Byte value) {
            addCriterion("tenLotto <=", value, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoIn(List<Byte> values) {
            addCriterion("tenLotto in", values, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoNotIn(List<Byte> values) {
            addCriterion("tenLotto not in", values, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoBetween(Byte value1, Byte value2) {
            addCriterion("tenLotto between", value1, value2, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andTenlottoNotBetween(Byte value1, Byte value2) {
            addCriterion("tenLotto not between", value1, value2, "tenlotto");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassIsNull() {
            addCriterion("xuZhangPass is null");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassIsNotNull() {
            addCriterion("xuZhangPass is not null");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassEqualTo(Byte value) {
            addCriterion("xuZhangPass =", value, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassNotEqualTo(Byte value) {
            addCriterion("xuZhangPass <>", value, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassGreaterThan(Byte value) {
            addCriterion("xuZhangPass >", value, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassGreaterThanOrEqualTo(Byte value) {
            addCriterion("xuZhangPass >=", value, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassLessThan(Byte value) {
            addCriterion("xuZhangPass <", value, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassLessThanOrEqualTo(Byte value) {
            addCriterion("xuZhangPass <=", value, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassIn(List<Byte> values) {
            addCriterion("xuZhangPass in", values, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassNotIn(List<Byte> values) {
            addCriterion("xuZhangPass not in", values, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassBetween(Byte value1, Byte value2) {
            addCriterion("xuZhangPass between", value1, value2, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andXuzhangpassNotBetween(Byte value1, Byte value2) {
            addCriterion("xuZhangPass not between", value1, value2, "xuzhangpass");
            return (Criteria) this;
        }

        public Criteria andBosslistIsNull() {
            addCriterion("bossList is null");
            return (Criteria) this;
        }

        public Criteria andBosslistIsNotNull() {
            addCriterion("bossList is not null");
            return (Criteria) this;
        }

        public Criteria andBosslistEqualTo(String value) {
            addCriterion("bossList =", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistNotEqualTo(String value) {
            addCriterion("bossList <>", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistGreaterThan(String value) {
            addCriterion("bossList >", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistGreaterThanOrEqualTo(String value) {
            addCriterion("bossList >=", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistLessThan(String value) {
            addCriterion("bossList <", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistLessThanOrEqualTo(String value) {
            addCriterion("bossList <=", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistLike(String value) {
            addCriterion("bossList like", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistNotLike(String value) {
            addCriterion("bossList not like", value, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistIn(List<String> values) {
            addCriterion("bossList in", values, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistNotIn(List<String> values) {
            addCriterion("bossList not in", values, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistBetween(String value1, String value2) {
            addCriterion("bossList between", value1, value2, "bosslist");
            return (Criteria) this;
        }

        public Criteria andBosslistNotBetween(String value1, String value2) {
            addCriterion("bossList not between", value1, value2, "bosslist");
            return (Criteria) this;
        }

        public Criteria andFoodIsNull() {
            addCriterion("food is null");
            return (Criteria) this;
        }

        public Criteria andFoodIsNotNull() {
            addCriterion("food is not null");
            return (Criteria) this;
        }

        public Criteria andFoodEqualTo(Integer value) {
            addCriterion("food =", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotEqualTo(Integer value) {
            addCriterion("food <>", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThan(Integer value) {
            addCriterion("food >", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("food >=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThan(Integer value) {
            addCriterion("food <", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThanOrEqualTo(Integer value) {
            addCriterion("food <=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodIn(List<Integer> values) {
            addCriterion("food in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotIn(List<Integer> values) {
            addCriterion("food not in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodBetween(Integer value1, Integer value2) {
            addCriterion("food between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotBetween(Integer value1, Integer value2) {
            addCriterion("food not between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andSilentIsNull() {
            addCriterion("silent is null");
            return (Criteria) this;
        }

        public Criteria andSilentIsNotNull() {
            addCriterion("silent is not null");
            return (Criteria) this;
        }

        public Criteria andSilentEqualTo(Long value) {
            addCriterion("silent =", value, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentNotEqualTo(Long value) {
            addCriterion("silent <>", value, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentGreaterThan(Long value) {
            addCriterion("silent >", value, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentGreaterThanOrEqualTo(Long value) {
            addCriterion("silent >=", value, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentLessThan(Long value) {
            addCriterion("silent <", value, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentLessThanOrEqualTo(Long value) {
            addCriterion("silent <=", value, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentIn(List<Long> values) {
            addCriterion("silent in", values, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentNotIn(List<Long> values) {
            addCriterion("silent not in", values, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentBetween(Long value1, Long value2) {
            addCriterion("silent between", value1, value2, "silent");
            return (Criteria) this;
        }

        public Criteria andSilentNotBetween(Long value1, Long value2) {
            addCriterion("silent not between", value1, value2, "silent");
            return (Criteria) this;
        }

        public Criteria andBanIsNull() {
            addCriterion("ban is null");
            return (Criteria) this;
        }

        public Criteria andBanIsNotNull() {
            addCriterion("ban is not null");
            return (Criteria) this;
        }

        public Criteria andBanEqualTo(Long value) {
            addCriterion("ban =", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotEqualTo(Long value) {
            addCriterion("ban <>", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanGreaterThan(Long value) {
            addCriterion("ban >", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanGreaterThanOrEqualTo(Long value) {
            addCriterion("ban >=", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanLessThan(Long value) {
            addCriterion("ban <", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanLessThanOrEqualTo(Long value) {
            addCriterion("ban <=", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanIn(List<Long> values) {
            addCriterion("ban in", values, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotIn(List<Long> values) {
            addCriterion("ban not in", values, "ban");
            return (Criteria) this;
        }

        public Criteria andBanBetween(Long value1, Long value2) {
            addCriterion("ban between", value1, value2, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotBetween(Long value1, Long value2) {
            addCriterion("ban not between", value1, value2, "ban");
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