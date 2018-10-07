package com.comit.appointment.modules.sys.entity;

import java.util.Date;

public class Windows {
    private Integer ID;

    private String WINDOW_NAME;

    private String WINDOW_AREA;

    private String WINDOW_ADDRESS;

    private Integer OPERATOR_ID;

    private String OPERATOR_NAME;

    private Date TIME;

    private Integer STATUS;

    private Integer DEPT_ID;

    private String REMARKS1;

    private String REMARKS2;

    private String REMARKS3;

    private String REMARKS4;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getWINDOW_NAME() {
        return WINDOW_NAME;
    }

    public void setWINDOW_NAME(String WINDOW_NAME) {
        this.WINDOW_NAME = WINDOW_NAME == null ? null : WINDOW_NAME.trim();
    }

    public String getWINDOW_AREA() {
        return WINDOW_AREA;
    }

    public void setWINDOW_AREA(String WINDOW_AREA) {
        this.WINDOW_AREA = WINDOW_AREA == null ? null : WINDOW_AREA.trim();
    }

    public String getWINDOW_ADDRESS() {
        return WINDOW_ADDRESS;
    }

    public void setWINDOW_ADDRESS(String WINDOW_ADDRESS) {
        this.WINDOW_ADDRESS = WINDOW_ADDRESS == null ? null : WINDOW_ADDRESS.trim();
    }

    public Integer getOPERATOR_ID() {
        return OPERATOR_ID;
    }

    public void setOPERATOR_ID(Integer OPERATOR_ID) {
        this.OPERATOR_ID = OPERATOR_ID;
    }

    public String getOPERATOR_NAME() {
        return OPERATOR_NAME;
    }

    public void setOPERATOR_NAME(String OPERATOR_NAME) {
        this.OPERATOR_NAME = OPERATOR_NAME == null ? null : OPERATOR_NAME.trim();
    }

    public Date getTIME() {
        return TIME;
    }

    public void setTIME(Date TIME) {
        this.TIME = TIME;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Integer getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(Integer DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getREMARKS1() {
        return REMARKS1;
    }

    public void setREMARKS1(String REMARKS1) {
        this.REMARKS1 = REMARKS1 == null ? null : REMARKS1.trim();
    }

    public String getREMARKS2() {
        return REMARKS2;
    }

    public void setREMARKS2(String REMARKS2) {
        this.REMARKS2 = REMARKS2 == null ? null : REMARKS2.trim();
    }

    public String getREMARKS3() {
        return REMARKS3;
    }

    public void setREMARKS3(String REMARKS3) {
        this.REMARKS3 = REMARKS3 == null ? null : REMARKS3.trim();
    }

    public String getREMARKS4() {
        return REMARKS4;
    }

    public void setREMARKS4(String REMARKS4) {
        this.REMARKS4 = REMARKS4 == null ? null : REMARKS4.trim();
    }
}