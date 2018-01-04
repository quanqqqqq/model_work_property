package com.model;

public class TWorkers {
    private String workerid;

    private String workername;

    private String workerpassword;

    private String workertel;

    private String workeremail;

    private String workeraddress;

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    public String getWorkerpassword() {
        return workerpassword;
    }

    public void setWorkerpassword(String workerpassword) {
        this.workerpassword = workerpassword == null ? null : workerpassword.trim();
    }

    public String getWorkertel() {
        return workertel;
    }

    public void setWorkertel(String workertel) {
        this.workertel = workertel == null ? null : workertel.trim();
    }

    public String getWorkeremail() {
        return workeremail;
    }

    public void setWorkeremail(String workeremail) {
        this.workeremail = workeremail == null ? null : workeremail.trim();
    }

    public String getWorkeraddress() {
        return workeraddress;
    }

    public void setWorkeraddress(String workeraddress) {
        this.workeraddress = workeraddress == null ? null : workeraddress.trim();
    }
}