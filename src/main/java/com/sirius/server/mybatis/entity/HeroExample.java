package com.sirius.server.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class HeroExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeroExample() {
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

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(Integer value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(Integer value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(Integer value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(Integer value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(Integer value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<Integer> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<Integer> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(Integer value1, Integer value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(Integer value1, Integer value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andHumanidIsNull() {
            addCriterion("humanId is null");
            return (Criteria) this;
        }

        public Criteria andHumanidIsNotNull() {
            addCriterion("humanId is not null");
            return (Criteria) this;
        }

        public Criteria andHumanidEqualTo(Long value) {
            addCriterion("humanId =", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidNotEqualTo(Long value) {
            addCriterion("humanId <>", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidGreaterThan(Long value) {
            addCriterion("humanId >", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidGreaterThanOrEqualTo(Long value) {
            addCriterion("humanId >=", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidLessThan(Long value) {
            addCriterion("humanId <", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidLessThanOrEqualTo(Long value) {
            addCriterion("humanId <=", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidIn(List<Long> values) {
            addCriterion("humanId in", values, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidNotIn(List<Long> values) {
            addCriterion("humanId not in", values, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidBetween(Long value1, Long value2) {
            addCriterion("humanId between", value1, value2, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidNotBetween(Long value1, Long value2) {
            addCriterion("humanId not between", value1, value2, "humanid");
            return (Criteria) this;
        }

        public Criteria andAdvanceIsNull() {
            addCriterion("advance is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceIsNotNull() {
            addCriterion("advance is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceEqualTo(Integer value) {
            addCriterion("advance =", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotEqualTo(Integer value) {
            addCriterion("advance <>", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceGreaterThan(Integer value) {
            addCriterion("advance >", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("advance >=", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLessThan(Integer value) {
            addCriterion("advance <", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLessThanOrEqualTo(Integer value) {
            addCriterion("advance <=", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceIn(List<Integer> values) {
            addCriterion("advance in", values, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotIn(List<Integer> values) {
            addCriterion("advance not in", values, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceBetween(Integer value1, Integer value2) {
            addCriterion("advance between", value1, value2, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotBetween(Integer value1, Integer value2) {
            addCriterion("advance not between", value1, value2, "advance");
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

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Integer value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Integer value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Integer value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Integer value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Integer value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Integer> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Integer> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Integer value1, Integer value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Integer value1, Integer value2) {
            addCriterion("exp not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1IsNull() {
            addCriterion("skillgroup1 is null");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1IsNotNull() {
            addCriterion("skillgroup1 is not null");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1EqualTo(String value) {
            addCriterion("skillgroup1 =", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1NotEqualTo(String value) {
            addCriterion("skillgroup1 <>", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1GreaterThan(String value) {
            addCriterion("skillgroup1 >", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1GreaterThanOrEqualTo(String value) {
            addCriterion("skillgroup1 >=", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1LessThan(String value) {
            addCriterion("skillgroup1 <", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1LessThanOrEqualTo(String value) {
            addCriterion("skillgroup1 <=", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1Like(String value) {
            addCriterion("skillgroup1 like", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1NotLike(String value) {
            addCriterion("skillgroup1 not like", value, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1In(List<String> values) {
            addCriterion("skillgroup1 in", values, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1NotIn(List<String> values) {
            addCriterion("skillgroup1 not in", values, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1Between(String value1, String value2) {
            addCriterion("skillgroup1 between", value1, value2, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup1NotBetween(String value1, String value2) {
            addCriterion("skillgroup1 not between", value1, value2, "skillgroup1");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2IsNull() {
            addCriterion("skillgroup2 is null");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2IsNotNull() {
            addCriterion("skillgroup2 is not null");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2EqualTo(String value) {
            addCriterion("skillgroup2 =", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2NotEqualTo(String value) {
            addCriterion("skillgroup2 <>", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2GreaterThan(String value) {
            addCriterion("skillgroup2 >", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2GreaterThanOrEqualTo(String value) {
            addCriterion("skillgroup2 >=", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2LessThan(String value) {
            addCriterion("skillgroup2 <", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2LessThanOrEqualTo(String value) {
            addCriterion("skillgroup2 <=", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2Like(String value) {
            addCriterion("skillgroup2 like", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2NotLike(String value) {
            addCriterion("skillgroup2 not like", value, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2In(List<String> values) {
            addCriterion("skillgroup2 in", values, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2NotIn(List<String> values) {
            addCriterion("skillgroup2 not in", values, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2Between(String value1, String value2) {
            addCriterion("skillgroup2 between", value1, value2, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup2NotBetween(String value1, String value2) {
            addCriterion("skillgroup2 not between", value1, value2, "skillgroup2");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3IsNull() {
            addCriterion("skillgroup3 is null");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3IsNotNull() {
            addCriterion("skillgroup3 is not null");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3EqualTo(String value) {
            addCriterion("skillgroup3 =", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3NotEqualTo(String value) {
            addCriterion("skillgroup3 <>", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3GreaterThan(String value) {
            addCriterion("skillgroup3 >", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3GreaterThanOrEqualTo(String value) {
            addCriterion("skillgroup3 >=", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3LessThan(String value) {
            addCriterion("skillgroup3 <", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3LessThanOrEqualTo(String value) {
            addCriterion("skillgroup3 <=", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3Like(String value) {
            addCriterion("skillgroup3 like", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3NotLike(String value) {
            addCriterion("skillgroup3 not like", value, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3In(List<String> values) {
            addCriterion("skillgroup3 in", values, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3NotIn(List<String> values) {
            addCriterion("skillgroup3 not in", values, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3Between(String value1, String value2) {
            addCriterion("skillgroup3 between", value1, value2, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andSkillgroup3NotBetween(String value1, String value2) {
            addCriterion("skillgroup3 not between", value1, value2, "skillgroup3");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andEquipsnIsNull() {
            addCriterion("equipSN is null");
            return (Criteria) this;
        }

        public Criteria andEquipsnIsNotNull() {
            addCriterion("equipSN is not null");
            return (Criteria) this;
        }

        public Criteria andEquipsnEqualTo(Integer value) {
            addCriterion("equipSN =", value, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnNotEqualTo(Integer value) {
            addCriterion("equipSN <>", value, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnGreaterThan(Integer value) {
            addCriterion("equipSN >", value, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipSN >=", value, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnLessThan(Integer value) {
            addCriterion("equipSN <", value, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnLessThanOrEqualTo(Integer value) {
            addCriterion("equipSN <=", value, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnIn(List<Integer> values) {
            addCriterion("equipSN in", values, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnNotIn(List<Integer> values) {
            addCriterion("equipSN not in", values, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnBetween(Integer value1, Integer value2) {
            addCriterion("equipSN between", value1, value2, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEquipsnNotBetween(Integer value1, Integer value2) {
            addCriterion("equipSN not between", value1, value2, "equipsn");
            return (Criteria) this;
        }

        public Criteria andEuqipsIsNull() {
            addCriterion("euqips is null");
            return (Criteria) this;
        }

        public Criteria andEuqipsIsNotNull() {
            addCriterion("euqips is not null");
            return (Criteria) this;
        }

        public Criteria andEuqipsEqualTo(String value) {
            addCriterion("euqips =", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsNotEqualTo(String value) {
            addCriterion("euqips <>", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsGreaterThan(String value) {
            addCriterion("euqips >", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsGreaterThanOrEqualTo(String value) {
            addCriterion("euqips >=", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsLessThan(String value) {
            addCriterion("euqips <", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsLessThanOrEqualTo(String value) {
            addCriterion("euqips <=", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsLike(String value) {
            addCriterion("euqips like", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsNotLike(String value) {
            addCriterion("euqips not like", value, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsIn(List<String> values) {
            addCriterion("euqips in", values, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsNotIn(List<String> values) {
            addCriterion("euqips not in", values, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsBetween(String value1, String value2) {
            addCriterion("euqips between", value1, value2, "euqips");
            return (Criteria) this;
        }

        public Criteria andEuqipsNotBetween(String value1, String value2) {
            addCriterion("euqips not between", value1, value2, "euqips");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNull() {
            addCriterion("skills is null");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNotNull() {
            addCriterion("skills is not null");
            return (Criteria) this;
        }

        public Criteria andSkillsEqualTo(String value) {
            addCriterion("skills =", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotEqualTo(String value) {
            addCriterion("skills <>", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThan(String value) {
            addCriterion("skills >", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("skills >=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThan(String value) {
            addCriterion("skills <", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThanOrEqualTo(String value) {
            addCriterion("skills <=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLike(String value) {
            addCriterion("skills like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotLike(String value) {
            addCriterion("skills not like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsIn(List<String> values) {
            addCriterion("skills in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotIn(List<String> values) {
            addCriterion("skills not in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsBetween(String value1, String value2) {
            addCriterion("skills between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotBetween(String value1, String value2) {
            addCriterion("skills not between", value1, value2, "skills");
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