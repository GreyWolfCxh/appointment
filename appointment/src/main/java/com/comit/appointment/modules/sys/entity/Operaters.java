package com.comit.appointment.modules.sys.entity;

import java.util.Date;

public class Operaters {
    private Integer ID;

    private Integer USER_ID;

    private Integer MODULE_ID;

    private Integer APPOINTMENT_NUMBER;

    private Integer OPERATION_NUMBER;

    private String APPOINTMENT_ADDRESS;

    private String APPOINTMENT_WINDOW;

    private String TIME;

    private String VALID_TIME;

    private Integer VALID_DAY;

    private Date DAY;

    private Integer STATUS;

    private String REMARKS1;

    private String REMARKS2;

    private String REMARKS3;

    private String REMARKS4;
    
    

    @Override
	public String toString() {
		return "Operaters [ID=" + ID + ", USER_ID=" + USER_ID + ", MODULE_ID=" + MODULE_ID + ", APPOINTMENT_NUMBER="
				+ APPOINTMENT_NUMBER + ", OPERATION_NUMBER=" + OPERATION_NUMBER + ", APPOINTMENT_ADDRESS="
				+ APPOINTMENT_ADDRESS + ", APPOINTMENT_WINDOW=" + APPOINTMENT_WINDOW + ", TIME=" + TIME
				+ ", VALID_TIME=" + VALID_TIME + ", VALID_DAY=" + VALID_DAY + ", DAY=" + DAY + ", STATUS=" + STATUS
				+ ", REMARKS1=" + REMARKS1 + ", REMARKS2=" + REMARKS2 + ", REMARKS3=" + REMARKS3 + ", REMARKS4="
				+ REMARKS4 + "]";
	}

	public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Integer USER_ID) {
        this.USER_ID = USER_ID;
    }

    public Integer getMODULE_ID() {
        return MODULE_ID;
    }

    public void setMODULE_ID(Integer MODULE_ID) {
        this.MODULE_ID = MODULE_ID;
    }

    public Integer getAPPOINTMENT_NUMBER() {
        return APPOINTMENT_NUMBER;
    }

    public void setAPPOINTMENT_NUMBER(Integer APPOINTMENT_NUMBER) {
        this.APPOINTMENT_NUMBER = APPOINTMENT_NUMBER;
    }

    public Integer getOPERATION_NUMBER() {
        return OPERATION_NUMBER;
    }

    public void setOPERATION_NUMBER(Integer OPERATION_NUMBER) {
        this.OPERATION_NUMBER = OPERATION_NUMBER;
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

    public Integer getVALID_DAY() {
        return VALID_DAY;
    }

    public void setVALID_DAY(Integer VALID_DAY) {
        this.VALID_DAY = VALID_DAY;
    }

    public Date getDAY() {
        return DAY;
    }

    public void setDAY(Date DAY) {
        this.DAY = DAY;
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