package com.comit.appointment.modules.sys.entity;

public class Illegals {
    private Integer ID;

    private String ILLEGAL_NAME;

    private String ILLEGAL_TYPE;

    private String ILLEGAL_STATUS;

    private String SORT;

    private String PUBLIC_STATUS;

    private String TIPS;

    private String REMARKS1;

    private String REMARKS2;

    private String REMARKS3;

    private String REMARKS4;
    
    
    

    @Override
	public String toString() {
		return "Illegals [ID=" + ID + ", ILLEGAL_NAME=" + ILLEGAL_NAME + ", ILLEGAL_TYPE=" + ILLEGAL_TYPE
				+ ", ILLEGAL_STATUS=" + ILLEGAL_STATUS + ", SORT=" + SORT + ", PUBLIC_STATUS=" + PUBLIC_STATUS
				+ ", TIPS=" + TIPS + ", REMARKS1=" + REMARKS1 + ", REMARKS2=" + REMARKS2 + ", REMARKS3=" + REMARKS3
				+ ", REMARKS4=" + REMARKS4 + "]";
	}

	public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getILLEGAL_NAME() {
        return ILLEGAL_NAME;
    }

    public void setILLEGAL_NAME(String ILLEGAL_NAME) {
        this.ILLEGAL_NAME = ILLEGAL_NAME == null ? null : ILLEGAL_NAME.trim();
    }

    public String getILLEGAL_TYPE() {
        return ILLEGAL_TYPE;
    }

    public void setILLEGAL_TYPE(String ILLEGAL_TYPE) {
        this.ILLEGAL_TYPE = ILLEGAL_TYPE == null ? null : ILLEGAL_TYPE.trim();
    }

    public String getILLEGAL_STATUS() {
        return ILLEGAL_STATUS;
    }

    public void setILLEGAL_STATUS(String ILLEGAL_STATUS) {
        this.ILLEGAL_STATUS = ILLEGAL_STATUS == null ? null : ILLEGAL_STATUS.trim();
    }

    public String getSORT() {
        return SORT;
    }

    public void setSORT(String SORT) {
        this.SORT = SORT == null ? null : SORT.trim();
    }

    public String getPUBLIC_STATUS() {
        return PUBLIC_STATUS;
    }

    public void setPUBLIC_STATUS(String PUBLIC_STATUS) {
        this.PUBLIC_STATUS = PUBLIC_STATUS == null ? null : PUBLIC_STATUS.trim();
    }

    public String getTIPS() {
        return TIPS;
    }

    public void setTIPS(String TIPS) {
        this.TIPS = TIPS == null ? null : TIPS.trim();
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