package com.leishaw.forjob.DO;

import java.util.Date;

public class FuckDO {
    private Integer id;

    private String insultor;

    private String receiper;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInsultor() {
        return insultor;
    }

    public void setInsultor(String insultor) {
        this.insultor = insultor;
    }

    public String getReceiper() {
        return receiper;
    }

    public void setReceiper(String receiper) {
        this.receiper = receiper;
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}