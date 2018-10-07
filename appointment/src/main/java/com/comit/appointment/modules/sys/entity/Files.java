package com.comit.appointment.modules.sys.entity;

import java.util.Date;

public class Files {
    private Integer ID;

    private String NEW_NAME;

    private String ORIGINAL_NAME;

    private String TYPE;

    private String UPLOAD_BY;

    private Date UPLOAD_DATE;

    private String HREF;

    private String STATUS;

    private Integer ILLEGAL_ID;

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

    public String getNEW_NAME() {
        return NEW_NAME;
    }

    public void setNEW_NAME(String NEW_NAME) {
        this.NEW_NAME = NEW_NAME == null ? null : NEW_NAME.trim();
    }

    public String getORIGINAL_NAME() {
        return ORIGINAL_NAME;
    }

    public void setORIGINAL_NAME(String ORIGINAL_NAME) {
        this.ORIGINAL_NAME = ORIGINAL_NAME == null ? null : ORIGINAL_NAME.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getUPLOAD_BY() {
        return UPLOAD_BY;
    }

    public void setUPLOAD_BY(String UPLOAD_BY) {
        this.UPLOAD_BY = UPLOAD_BY == null ? null : UPLOAD_BY.trim();
    }

    public Date getUPLOAD_DATE() {
        return UPLOAD_DATE;
    }

    public void setUPLOAD_DATE(Date UPLOAD_DATE) {
        this.UPLOAD_DATE = UPLOAD_DATE;
    }

    public String getHREF() {
        return HREF;
    }

    public void setHREF(String HREF) {
        this.HREF = HREF == null ? null : HREF.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public Integer getILLEGAL_ID() {
        return ILLEGAL_ID;
    }

    public void setILLEGAL_ID(Integer ILLEGAL_ID) {
        this.ILLEGAL_ID = ILLEGAL_ID;
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