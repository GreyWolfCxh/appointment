package com.comit.appointment.modules.sys.entity;

public class Fields {
    private Integer ID;

    private Integer ILLEGAL_ID;

    private String FIELD_ZNAME;

    private String FIELD_ENAME;

    private String DATASOURCE;

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

    public Integer getILLEGAL_ID() {
        return ILLEGAL_ID;
    }

    public void setILLEGAL_ID(Integer ILLEGAL_ID) {
        this.ILLEGAL_ID = ILLEGAL_ID;
    }

    public String getFIELD_ZNAME() {
        return FIELD_ZNAME;
    }

    public void setFIELD_ZNAME(String FIELD_ZNAME) {
        this.FIELD_ZNAME = FIELD_ZNAME == null ? null : FIELD_ZNAME.trim();
    }

    public String getFIELD_ENAME() {
        return FIELD_ENAME;
    }

    public void setFIELD_ENAME(String FIELD_ENAME) {
        this.FIELD_ENAME = FIELD_ENAME == null ? null : FIELD_ENAME.trim();
    }

    public String getDATASOURCE() {
        return DATASOURCE;
    }

    public void setDATASOURCE(String DATASOURCE) {
        this.DATASOURCE = DATASOURCE == null ? null : DATASOURCE.trim();
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