package com.comit.appointment.modules.sys.entity;

public class Users {
    private Integer ID;

    private String ACCOUNT;

    private String PASSWORD;

    private String NAME;

    private Integer DEPT_ID;

    private Integer SEX;

    private Integer LEVEL;

    private Integer STATUS;

    private Integer AREA_ID;
    
    

    @Override
	public String toString() {
		return "Users [ID=" + ID + ", ACCOUNT=" + ACCOUNT + ", PASSWORD=" + PASSWORD + ", NAME=" + NAME + ", DEPT_ID="
				+ DEPT_ID + ", SEX=" + SEX + ", LEVEL=" + LEVEL + ", STATUS=" + STATUS + ", AREA_ID=" + AREA_ID + "]";
	}

	public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getACCOUNT() {
        return ACCOUNT;
    }

    public void setACCOUNT(String ACCOUNT) {
        this.ACCOUNT = ACCOUNT == null ? null : ACCOUNT.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public Integer getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(Integer DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public Integer getSEX() {
        return SEX;
    }

    public void setSEX(Integer SEX) {
        this.SEX = SEX;
    }

    public Integer getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(Integer LEVEL) {
        this.LEVEL = LEVEL;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Integer getAREA_ID() {
        return AREA_ID;
    }

    public void setAREA_ID(Integer AREA_ID) {
        this.AREA_ID = AREA_ID;
    }
}