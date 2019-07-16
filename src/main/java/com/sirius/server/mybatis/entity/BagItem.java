package com.sirius.server.mybatis.entity;

public class BagItem {
    private Long id;

    private Integer bagid;

    private Integer sn;

    private Long humanid;

    private Long ownerid;

    private Integer num;

    private Integer grade;

    private Integer bind;

    private String ext;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBagid() {
        return bagid;
    }

    public void setBagid(Integer bagid) {
        this.bagid = bagid;
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

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getBind() {
        return bind;
    }

    public void setBind(Integer bind) {
        this.bind = bind;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}