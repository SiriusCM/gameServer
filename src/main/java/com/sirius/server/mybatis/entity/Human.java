package com.sirius.server.mybatis.entity;

public class Human {
    private Long id;

    private String channelid;

    private String uid;

    private Integer serverid;

    private String platformname;

    private String deviceuniqueid;

    private Integer timeseconline;

    private Long timelogin;

    private Long timelogout;

    private Long timecreate;

    private Long timelvchange;

    private String gameoptions;

    private Integer initsn;

    private Integer gold;

    private Integer diamond;

    private Integer phy;

    private Integer level;

    private String name;

    private Integer profession;

    private Integer sex;

    private Long exp;

    private Byte lotto;

    private Byte tenlotto;

    private Byte xuzhangpass;

    private String bosslist;

    private Integer food;

    private Long silent;

    private Long ban;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getServerid() {
        return serverid;
    }

    public void setServerid(Integer serverid) {
        this.serverid = serverid;
    }

    public String getPlatformname() {
        return platformname;
    }

    public void setPlatformname(String platformname) {
        this.platformname = platformname == null ? null : platformname.trim();
    }

    public String getDeviceuniqueid() {
        return deviceuniqueid;
    }

    public void setDeviceuniqueid(String deviceuniqueid) {
        this.deviceuniqueid = deviceuniqueid == null ? null : deviceuniqueid.trim();
    }

    public Integer getTimeseconline() {
        return timeseconline;
    }

    public void setTimeseconline(Integer timeseconline) {
        this.timeseconline = timeseconline;
    }

    public Long getTimelogin() {
        return timelogin;
    }

    public void setTimelogin(Long timelogin) {
        this.timelogin = timelogin;
    }

    public Long getTimelogout() {
        return timelogout;
    }

    public void setTimelogout(Long timelogout) {
        this.timelogout = timelogout;
    }

    public Long getTimecreate() {
        return timecreate;
    }

    public void setTimecreate(Long timecreate) {
        this.timecreate = timecreate;
    }

    public Long getTimelvchange() {
        return timelvchange;
    }

    public void setTimelvchange(Long timelvchange) {
        this.timelvchange = timelvchange;
    }

    public String getGameoptions() {
        return gameoptions;
    }

    public void setGameoptions(String gameoptions) {
        this.gameoptions = gameoptions == null ? null : gameoptions.trim();
    }

    public Integer getInitsn() {
        return initsn;
    }

    public void setInitsn(Integer initsn) {
        this.initsn = initsn;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    public Integer getPhy() {
        return phy;
    }

    public void setPhy(Integer phy) {
        this.phy = phy;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProfession() {
        return profession;
    }

    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }

    public Byte getLotto() {
        return lotto;
    }

    public void setLotto(Byte lotto) {
        this.lotto = lotto;
    }

    public Byte getTenlotto() {
        return tenlotto;
    }

    public void setTenlotto(Byte tenlotto) {
        this.tenlotto = tenlotto;
    }

    public Byte getXuzhangpass() {
        return xuzhangpass;
    }

    public void setXuzhangpass(Byte xuzhangpass) {
        this.xuzhangpass = xuzhangpass;
    }

    public String getBosslist() {
        return bosslist;
    }

    public void setBosslist(String bosslist) {
        this.bosslist = bosslist == null ? null : bosslist.trim();
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public Long getSilent() {
        return silent;
    }

    public void setSilent(Long silent) {
        this.silent = silent;
    }

    public Long getBan() {
        return ban;
    }

    public void setBan(Long ban) {
        this.ban = ban;
    }
}