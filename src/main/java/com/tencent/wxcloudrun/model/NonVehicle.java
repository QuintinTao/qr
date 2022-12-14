package com.tencent.wxcloudrun.model;

import com.tencent.wxcloudrun.utils.CompareUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NonVehicle {

    private Integer id;

    private String name;

    private String nameStr;

    @Override
    public String toString() {
        return "NonVehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", novNum='" + novNum + '\'' +
                ", sno='" + sno + '\'' +
                ", dept='" + dept + '\'' +
                ", starTimeStr='" + starTimeStr + '\'' +
                ", pov='" + pov + '\'' +
                ", starTime=" + starTime +
                '}';
    }

    private String novNum;

    private String sno;

    private String snoStr;

    private String dept;

    private String starTimeStr;

    public String getPov() {
        return pov;
    }

    public void setPov(String pov) {
        this.pov = pov;
    }

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public String getSnoStr() {
        return snoStr;
    }

    public void setSnoStr(String snoStr) {
        this.snoStr = snoStr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //有效期
    private String pov;

    private String pass;

    public String getStarTimeStr() {
        return starTimeStr;
    }

    public void setStarTimeStr(String starTimeStr) {
        this.starTimeStr = starTimeStr;
    }

    private Timestamp starTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.nameStr = CompareUtils.sensitiveProtection(name);
    }

    public String getNovNum() {
        return novNum;
    }

    public void setNovNum(String novNum) {
        this.novNum = novNum;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        this.snoStr = CompareUtils.sensitiveProtectionMuti(sno);
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Timestamp getStarTime() {
        return starTime;
    }

    public void setStarTime(Timestamp starTime) {
        this.starTime = starTime;
        this.pov = CompareUtils.calPeriodOfValidity(starTime, 4);
        this.starTimeStr = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date(starTime.getTime()));
    }
}
