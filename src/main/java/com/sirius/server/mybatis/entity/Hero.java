package com.sirius.server.mybatis.entity;

public class Hero {
    private Long id;

    private Integer sn;

    private Long humanid;

    private Integer advance;

    private Integer level;

    private Integer exp;

    private String skillgroup1;

    private String skillgroup2;

    private String skillgroup3;

    private Integer gid;

    private Integer equipsn;

    private String euqips;

    private String skills;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public Long getHumanid() {
        return humanid;
    }

    public void setHumanid(Long humanid) {
        this.humanid = humanid;
    }

    public Integer getAdvance() {
        return advance;
    }

    public void setAdvance(Integer advance) {
        this.advance = advance;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getSkillgroup1() {
        return skillgroup1;
    }

    public void setSkillgroup1(String skillgroup1) {
        this.skillgroup1 = skillgroup1 == null ? null : skillgroup1.trim();
    }

    public String getSkillgroup2() {
        return skillgroup2;
    }

    public void setSkillgroup2(String skillgroup2) {
        this.skillgroup2 = skillgroup2 == null ? null : skillgroup2.trim();
    }

    public String getSkillgroup3() {
        return skillgroup3;
    }

    public void setSkillgroup3(String skillgroup3) {
        this.skillgroup3 = skillgroup3 == null ? null : skillgroup3.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getEquipsn() {
        return equipsn;
    }

    public void setEquipsn(Integer equipsn) {
        this.equipsn = equipsn;
    }

    public String getEuqips() {
        return euqips;
    }

    public void setEuqips(String euqips) {
        this.euqips = euqips == null ? null : euqips.trim();
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills == null ? null : skills.trim();
    }
}