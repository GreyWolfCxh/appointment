package com.comit.appointment.modules.sys.entity;

public class Modules {
    private Integer ID;

    private Integer USER_ID;

    private String START_TIME;

    private String END_TIME;

    private String TIME;

    private Integer APPOINTMENT_NUMBER;

    private String VALID_TIME;

    private Integer VERSION;

    private String REMARKS1;

    private String REMARKS2;

    private String REMARKS3;

    private String REMARKS4;
    
    

    @Override
	public String toString() {
		return "Modules [ID=" + ID + ", USER_ID=" + USER_ID + ", START_TIME=" + START_TIME + ", END_TIME=" + END_TIME
				+ ", TIME=" + TIME + ", APPOINTMENT_NUMBER=" + APPOINTMENT_NUMBER + ", VALID_TIME=" + VALID_TIME
				+ ", VERSION=" + VERSION + ", REMARKS1=" + REMARKS1 + ", REMARKS2=" + REMARKS2 + ", REMARKS3="
				+ REMARKS3 + ", REMARKS4=" + REMARKS4 + "]";
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

    public String getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(String START_TIME) {
        this.START_TIME = START_TIME == null ? null : START_TIME.trim();
    }

    public String getEND_TIME() {
        return END_TIME;
    }

    public void setEND_TIME(String END_TIME) {
        this.END_TIME = END_TIME == null ? null : END_TIME.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public Integer getAPPOINTMENT_NUMBER() {
        return APPOINTMENT_NUMBER;
    }

    public void setAPPOINTMENT_NUMBER(Integer APPOINTMENT_NUMBER) {
        this.APPOINTMENT_NUMBER = APPOINTMENT_NUMBER;
    }

    public String getVALID_TIME() {
        return VALID_TIME;
    }

    public void setVALID_TIME(String VALID_TIME) {
        this.VALID_TIME = VALID_TIME == null ? null : VALID_TIME.trim();
    }

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
        this.VERSION = VERSION;
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