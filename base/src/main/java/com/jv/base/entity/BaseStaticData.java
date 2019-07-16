package com.jv.base.entity;

import java.util.Date;

public class BaseStaticData {
    private String staticcode;

    private String staticname;

    private Integer statictype;

    private Date effectdate;

    private Date expiredate;

    private Integer state;

    private Integer opid;

    private Date updatedate;

    private String note;

    private String staticvalue;

    public String getStaticcode() {
        return staticcode;
    }

    public void setStaticcode(String staticcode) {
        this.staticcode = staticcode == null ? null : staticcode.trim();
    }

    public String getStaticname() {
        return staticname;
    }

    public void setStaticname(String staticname) {
        this.staticname = staticname == null ? null : staticname.trim();
    }

    public Integer getStatictype() {
        return statictype;
    }

    public void setStatictype(Integer statictype) {
        this.statictype = statictype;
    }

    public Date getEffectdate() {
        return effectdate;
    }

    public void setEffectdate(Date effectdate) {
        this.effectdate = effectdate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOpid() {
        return opid;
    }

    public void setOpid(Integer opid) {
        this.opid = opid;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getStaticvalue() {
        return staticvalue;
    }

    public void setStaticvalue(String staticvalue) {
        this.staticvalue = staticvalue == null ? null : staticvalue.trim();
    }
}