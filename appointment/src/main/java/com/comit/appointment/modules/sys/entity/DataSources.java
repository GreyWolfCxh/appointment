package com.comit.appointment.modules.sys.entity;

public class DataSources {
    private Integer ID;

    private Integer ILLEGAL_ID;

    private String DATASOURCE_ZNAME;

    private String DATASOURCE_ENAME;

    private Integer SQL_ID;

    private String SQL_CODE;

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

    public String getDATASOURCE_ZNAME() {
        return DATASOURCE_ZNAME;
    }

    public void setDATASOURCE_ZNAME(String DATASOURCE_ZNAME) {
        this.DATASOURCE_ZNAME = DATASOURCE_ZNAME == null ? null : DATASOURCE_ZNAME.trim();
    }

    public String getDATASOURCE_ENAME() {
        return DATASOURCE_ENAME;
    }

    public void setDATASOURCE_ENAME(String DATASOURCE_ENAME) {
        this.DATASOURCE_ENAME = DATASOURCE_ENAME == null ? null : DATASOURCE_ENAME.trim();
    }

    public Integer getSQL_ID() {
        return SQL_ID;
    }

    public void setSQL_ID(Integer SQL_ID) {
        this.SQL_ID = SQL_ID;
    }

    public String getSQL_CODE() {
        return SQL_CODE;
    }

    public void setSQL_CODE(String SQL_CODE) {
        this.SQL_CODE = SQL_CODE == null ? null : SQL_CODE.trim();
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