package com.comit.appointment.modules.sys.entity;

public class Depts {
    private Integer ID;

    private String NAME;

    private Integer AREA_ID;

    private Integer STATUS;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public Integer getAREA_ID() {
        return AREA_ID;
    }

    public void setAREA_ID(Integer AREA_ID) {
        this.AREA_ID = AREA_ID;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }
}