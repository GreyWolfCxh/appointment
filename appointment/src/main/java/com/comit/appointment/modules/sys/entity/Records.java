package com.comit.appointment.modules.sys.entity;

import java.util.Date;

public class Records {
    private Integer ID;

    private String USER_CODE;

    private String USER_PHONE;

    private String USER_NAME;

    private String USER_CARDID;

    private String USER_ADDRESS;

    private String CAR_NUMBER;

    private String ILLEGAL_TYPE;

    private String ILLEGAL_REASON;

    private Date ILLEGAL_TIME;

    private String APPOINTMENT_ADDRESS;

    private String APPOINTMENT_WINDOW;

    private String TIME;

    private String VALID_TIME;

    private Date APPOINTMENT_DAY;

    private Date OPERATOR_DAY;

    private String APPOINTMENT_CODE;

    private Integer STATUS;

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

    public String getUSER_CODE() {
        return USER_CODE;
    }

    public void setUSER_CODE(String USER_CODE) {
        this.USER_CODE = USER_CODE == null ? null : USER_CODE.trim();
    }

    public String getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(String USER_PHONE) {
        this.USER_PHONE = USER_PHONE == null ? null : USER_PHONE.trim();
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME == null ? null : USER_NAME.trim();
    }

    public String getUSER_CARDID() {
        return USER_CARDID;
    }

    public void setUSER_CARDID(String USER_CARDID) {
        this.USER_CARDID = USER_CARDID == null ? null : USER_CARDID.trim();
    }

    public String getUSER_ADDRESS() {
        return USER_ADDRESS;
    }

    public void setUSER_ADDRESS(String USER_ADDRESS) {
        this.USER_ADDRESS = USER_ADDRESS == null ? null : USER_ADDRESS.trim();
    }

    public String getCAR_NUMBER() {
        return CAR_NUMBER;
    }

    public void setCAR_NUMBER(String CAR_NUMBER) {
        this.CAR_NUMBER = CAR_NUMBER == null ? null : CAR_NUMBER.trim();
    }

    public String getILLEGAL_TYPE() {
        return ILLEGAL_TYPE;
    }

    public void setILLEGAL_TYPE(String ILLEGAL_TYPE) {
        this.ILLEGAL_TYPE = ILLEGAL_TYPE == null ? null : ILLEGAL_TYPE.trim();
    }

    public String getILLEGAL_REASON() {
        return ILLEGAL_REASON;
    }

    public void setILLEGAL_REASON(String ILLEGAL_REASON) {
        this.ILLEGAL_REASON = ILLEGAL_REASON == null ? null : ILLEGAL_REASON.trim();
    }

    public Date getILLEGAL_TIME() {
        return ILLEGAL_TIME;
    }

    public void setILLEGAL_TIME(Date ILLEGAL_TIME) {
        this.ILLEGAL_TIME = ILLEGAL_TIME;
    }

    public String getAPPOINTMENT_ADDRESS() {
        return APPOINTMENT_ADDRESS;
    }

    public void setAPPOINTMENT_ADDRESS(String APPOINTMENT_ADDRESS) {
        this.APPOINTMENT_ADDRESS = APPOINTMENT_ADDRESS == null ? null : APPOINTMENT_ADDRESS.trim();
    }

    public String getAPPOINTMENT_WINDOW() {
        return APPOINTMENT_WINDOW;
    }

    public void setAPPOINTMENT_WINDOW(String APPOINTMENT_WINDOW) {
        this.APPOINTMENT_WINDOW = APPOINTMENT_WINDOW == null ? null : APPOINTMENT_WINDOW.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public String getVALID_TIME() {
        return VALID_TIME;
    }

    public void setVALID_TIME(String VALID_TIME) {
        this.VALID_TIME = VALID_TIME == null ? null : VALID_TIME.trim();
    }

    public Date getAPPOINTMENT_DAY() {
        return APPOINTMENT_DAY;
    }

    public void setAPPOINTMENT_DAY(Date APPOINTMENT_DAY) {
        this.APPOINTMENT_DAY = APPOINTMENT_DAY;
    }

    public Date getOPERATOR_DAY() {
        return OPERATOR_DAY;
    }

    public void setOPERATOR_DAY(Date OPERATOR_DAY) {
        this.OPERATOR_DAY = OPERATOR_DAY;
    }

    public String getAPPOINTMENT_CODE() {
        return APPOINTMENT_CODE;
    }

    public void setAPPOINTMENT_CODE(String APPOINTMENT_CODE) {
        this.APPOINTMENT_CODE = APPOINTMENT_CODE == null ? null : APPOINTMENT_CODE.trim();
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
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