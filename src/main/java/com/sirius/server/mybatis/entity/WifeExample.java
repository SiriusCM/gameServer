package com.sirius.server.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class WifeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WifeExample() {
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

        public Criteria andWifesnIsNull() {
            addCriterion("wifeSn is null");
            return (Criteria) this;
        }

        public Criteria andWifesnIsNotNull() {
            addCriterion("wifeSn is not null");
            return (Criteria) this;
        }

        public Criteria andWifesnEqualTo(Integer value) {
            addCriterion("wifeSn =", value, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnNotEqualTo(Integer value) {
            addCriterion("wifeSn <>", value, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnGreaterThan(Integer value) {
            addCriterion("wifeSn >", value, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnGreaterThanOrEqualTo(Integer value) {
            addCriterion("wifeSn >=", value, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnLessThan(Integer value) {
            addCriterion("wifeSn <", value, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnLessThanOrEqualTo(Integer value) {
            addCriterion("wifeSn <=", value, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnIn(List<Integer> values) {
            addCriterion("wifeSn in", values, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnNotIn(List<Integer> values) {
            addCriterion("wifeSn not in", values, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnBetween(Integer value1, Integer value2) {
            addCriterion("wifeSn between", value1, value2, "wifesn");
            return (Criteria) this;
        }

        public Criteria andWifesnNotBetween(Integer value1, Integer value2) {
            addCriterion("wifeSn not between", value1, value2, "wifesn");
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

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andUltskillIsNull() {
            addCriterion("ultSkill is null");
            return (Criteria) this;
        }

        public Criteria andUltskillIsNotNull() {
            addCriterion("ultSkill is not null");
            return (Criteria) this;
        }

        public Criteria andUltskillEqualTo(String value) {
            addCriterion("ultSkill =", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillNotEqualTo(String value) {
            addCriterion("ultSkill <>", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillGreaterThan(String value) {
            addCriterion("ultSkill >", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillGreaterThanOrEqualTo(String value) {
            addCriterion("ultSkill >=", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillLessThan(String value) {
            addCriterion("ultSkill <", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillLessThanOrEqualTo(String value) {
            addCriterion("ultSkill <=", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillLike(String value) {
            addCriterion("ultSkill like", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillNotLike(String value) {
            addCriterion("ultSkill not like", value, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillIn(List<String> values) {
            addCriterion("ultSkill in", values, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillNotIn(List<String> values) {
            addCriterion("ultSkill not in", values, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillBetween(String value1, String value2) {
            addCriterion("ultSkill between", value1, value2, "ultskill");
            return (Criteria) this;
        }

        public Criteria andUltskillNotBetween(String value1, String value2) {
            addCriterion("ultSkill not between", value1, value2, "ultskill");
            return (Criteria) this;
        }

        public Criteria andSkilllistIsNull() {
            addCriterion("skillList is null");
            return (Criteria) this;
        }

        public Criteria andSkilllistIsNotNull() {
            addCriterion("skillList is not null");
            return (Criteria) this;
        }

        public Criteria andSkilllistEqualTo(String value) {
            addCriterion("skillList =", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistNotEqualTo(String value) {
            addCriterion("skillList <>", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistGreaterThan(String value) {
            addCriterion("skillList >", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistGreaterThanOrEqualTo(String value) {
            addCriterion("skillList >=", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistLessThan(String value) {
            addCriterion("skillList <", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistLessThanOrEqualTo(String value) {
            addCriterion("skillList <=", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistLike(String value) {
            addCriterion("skillList like", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistNotLike(String value) {
            addCriterion("skillList not like", value, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistIn(List<String> values) {
            addCriterion("skillList in", values, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistNotIn(List<String> values) {
            addCriterion("skillList not in", values, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistBetween(String value1, String value2) {
            addCriterion("skillList between", value1, value2, "skilllist");
            return (Criteria) this;
        }

        public Criteria andSkilllistNotBetween(String value1, String value2) {
            addCriterion("skillList not between", value1, value2, "skilllist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistIsNull() {
            addCriterion("abilityList is null");
            return (Criteria) this;
        }

        public Criteria andAbilitylistIsNotNull() {
            addCriterion("abilityList is not null");
            return (Criteria) this;
        }

        public Criteria andAbilitylistEqualTo(String value) {
            addCriterion("abilityList =", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistNotEqualTo(String value) {
            addCriterion("abilityList <>", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistGreaterThan(String value) {
            addCriterion("abilityList >", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistGreaterThanOrEqualTo(String value) {
            addCriterion("abilityList >=", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistLessThan(String value) {
            addCriterion("abilityList <", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistLessThanOrEqualTo(String value) {
            addCriterion("abilityList <=", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistLike(String value) {
            addCriterion("abilityList like", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistNotLike(String value) {
            addCriterion("abilityList not like", value, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistIn(List<String> values) {
            addCriterion("abilityList in", values, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistNotIn(List<String> values) {
            addCriterion("abilityList not in", values, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistBetween(String value1, String value2) {
            addCriterion("abilityList between", value1, value2, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andAbilitylistNotBetween(String value1, String value2) {
            addCriterion("abilityList not between", value1, value2, "abilitylist");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andIndexIsNull() {
            addCriterion("index is null");
            return (Criteria) this;
        }

        public Criteria andIndexIsNotNull() {
            addCriterion("index is not null");
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(String value) {
            addCriterion("index =", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualTo(String value) {
            addCriterion("index <>", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThan(String value) {
            addCriterion("index >", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(String value) {
            addCriterion("index >=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThan(String value) {
            addCriterion("index <", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualTo(String value) {
            addCriterion("index <=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLike(String value) {
            addCriterion("index like", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotLike(String value) {
            addCriterion("index not like", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexIn(List<String> values) {
            addCriterion("index in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotIn(List<String> values) {
            addCriterion("index not in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexBetween(String value1, String value2) {
            addCriterion("index between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotBetween(String value1, String value2) {
            addCriterion("index not between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andDecorationindexIsNull() {
            addCriterion("decorationIndex is null");
            return (Criteria) this;
        }

        public Criteria andDecorationindexIsNotNull() {
            addCriterion("decorationIndex is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationindexEqualTo(Integer value) {
            addCriterion("decorationIndex =", value, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexNotEqualTo(Integer value) {
            addCriterion("decorationIndex <>", value, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexGreaterThan(Integer value) {
            addCriterion("decorationIndex >", value, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("decorationIndex >=", value, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexLessThan(Integer value) {
            addCriterion("decorationIndex <", value, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexLessThanOrEqualTo(Integer value) {
            addCriterion("decorationIndex <=", value, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexIn(List<Integer> values) {
            addCriterion("decorationIndex in", values, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexNotIn(List<Integer> values) {
            addCriterion("decorationIndex not in", values, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexBetween(Integer value1, Integer value2) {
            addCriterion("decorationIndex between", value1, value2, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationindexNotBetween(Integer value1, Integer value2) {
            addCriterion("decorationIndex not between", value1, value2, "decorationindex");
            return (Criteria) this;
        }

        public Criteria andDecorationsIsNull() {
            addCriterion("decorations is null");
            return (Criteria) this;
        }

        public Criteria andDecorationsIsNotNull() {
            addCriterion("decorations is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationsEqualTo(String value) {
            addCriterion("decorations =", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsNotEqualTo(String value) {
            addCriterion("decorations <>", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsGreaterThan(String value) {
            addCriterion("decorations >", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsGreaterThanOrEqualTo(String value) {
            addCriterion("decorations >=", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsLessThan(String value) {
            addCriterion("decorations <", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsLessThanOrEqualTo(String value) {
            addCriterion("decorations <=", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsLike(String value) {
            addCriterion("decorations like", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsNotLike(String value) {
            addCriterion("decorations not like", value, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsIn(List<String> values) {
            addCriterion("decorations in", values, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsNotIn(List<String> values) {
            addCriterion("decorations not in", values, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsBetween(String value1, String value2) {
            addCriterion("decorations between", value1, value2, "decorations");
            return (Criteria) this;
        }

        public Criteria andDecorationsNotBetween(String value1, String value2) {
            addCriterion("decorations not between", value1, value2, "decorations");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTempwifesnIsNull() {
            addCriterion("tempWifeSn is null");
            return (Criteria) this;
        }

        public Criteria andTempwifesnIsNotNull() {
            addCriterion("tempWifeSn is not null");
            return (Criteria) this;
        }

        public Criteria andTempwifesnEqualTo(Integer value) {
            addCriterion("tempWifeSn =", value, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnNotEqualTo(Integer value) {
            addCriterion("tempWifeSn <>", value, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnGreaterThan(Integer value) {
            addCriterion("tempWifeSn >", value, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnGreaterThanOrEqualTo(Integer value) {
            addCriterion("tempWifeSn >=", value, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnLessThan(Integer value) {
            addCriterion("tempWifeSn <", value, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnLessThanOrEqualTo(Integer value) {
            addCriterion("tempWifeSn <=", value, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnIn(List<Integer> values) {
            addCriterion("tempWifeSn in", values, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnNotIn(List<Integer> values) {
            addCriterion("tempWifeSn not in", values, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnBetween(Integer value1, Integer value2) {
            addCriterion("tempWifeSn between", value1, value2, "tempwifesn");
            return (Criteria) this;
        }

        public Criteria andTempwifesnNotBetween(Integer value1, Integer value2) {
            addCriterion("tempWifeSn not between", value1, value2, "tempwifesn");
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