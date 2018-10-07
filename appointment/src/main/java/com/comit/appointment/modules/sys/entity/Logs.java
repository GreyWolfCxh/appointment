package com.comit.appointment.modules.sys.entity;

public class Logs {
    private Integer ID;

    private String NAME;

    private String TIME;

    private String ACTION;
    
    

    @Override
	public String toString() {
		return "Logs [ID=" + ID + ", NAME=" + NAME + ", TIME=" + TIME + ", ACTION=" + ACTION + "]";
	}

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

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public String getACTION() {
        return ACTION;
    }

    public void setACTION(String ACTION) {
        this.ACTION = ACTION == null ? null : ACTION.trim();
    }
}