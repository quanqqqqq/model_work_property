package com.model;

public class TWorksheet {
    private Integer sheetid;

    private String sheetname;

    private String workerid;

    private String authuserid;

    private Integer process;

    private Integer comsume;

    private String customerid;

    public Integer getSheetid() {
        return sheetid;
    }

    public void setSheetid(Integer sheetid) {
        this.sheetid = sheetid;
    }

    public String getSheetname() {
        return sheetname;
    }

    public void setSheetname(String sheetname) {
        this.sheetname = sheetname == null ? null : sheetname.trim();
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getAuthuserid() {
        return authuserid;
    }

    public void setAuthuserid(String authuserid) {
        this.authuserid = authuserid == null ? null : authuserid.trim();
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public Integer getComsume() {
        return comsume;
    }

    public void setComsume(Integer comsume) {
        this.comsume = comsume;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }
}