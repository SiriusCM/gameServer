package com.sirius.server.mybatis.entity;

public class Wife {
    private Long id;

    private Integer wifesn;

    private Long humanid;

    private Integer advance;

    private Integer level;

    private Integer exp;

    private Integer star;

    private String ultskill;

    private String skilllist;

    private String abilitylist;

    private Integer floor;

    private String index;

    private Integer decorationindex;

    private String decorations;

    private Integer type;

    private Integer tempwifesn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWifesn() {
        return wifesn;
    }

    public void setWifesn(Integer wifesn) {
        this.wifesn = wifesn;
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

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getUltskill() {
        return ultskill;
    }

    public void setUltskill(String ultskill) {
        this.ultskill = ultskill == null ? null : ultskill.trim();
    }

    public String getSkilllist() {
        return skilllist;
    }

    public void setSkilllist(String skilllist) {
        this.skilllist = skilllist == null ? null : skilllist.trim();
    }

    public String getAbilitylist() {
        return abilitylist;
    }

    public void setAbilitylist(String abilitylist) {
        this.abilitylist = abilitylist == null ? null : abilitylist.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index == null ? null : index.trim();
    }

    public Integer getDecorationindex() {
        return decorationindex;
    }

    public void setDecorationindex(Integer decorationindex) {
        this.decorationindex = decorationindex;
    }

    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations == null ? null : decorations.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTempwifesn() {
        return tempwifesn;
    }

    public void setTempwifesn(Integer tempwifesn) {
        this.tempwifesn = tempwifesn;
    }
}