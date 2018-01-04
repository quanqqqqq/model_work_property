package com.model;

import java.util.Date;

public class TAuthuser {
    private String authuserid;

    private String authusername;

    private Integer authusersex;

    private Integer authpower;

    private String authuseremail;

    private String authusertel;

    private String authuserpassword;

    private Date lastlogindate;

    private String lastloginip;

    public String getAuthuserid() {
        return authuserid;
    }

    public void setAuthuserid(String authuserid) {
        this.authuserid = authuserid == null ? null : authuserid.trim();
    }

    public String getAuthusername() {
        return authusername;
    }

    public void setAuthusername(String authusername) {
        this.authusername = authusername == null ? null : authusername.trim();
    }

    public Integer getAuthusersex() {
        return authusersex;
    }

    public void setAuthusersex(Integer authusersex) {
        this.authusersex = authusersex;
    }

    public Integer getAuthpower() {
        return authpower;
    }

    public void setAuthpower(Integer authpower) {
        this.authpower = authpower;
    }

    public String getAuthuseremail() {
        return authuseremail;
    }

    public void setAuthuseremail(String authuseremail) {
        this.authuseremail = authuseremail == null ? null : authuseremail.trim();
    }

    public String getAuthusertel() {
        return authusertel;
    }

    public void setAuthusertel(String authusertel) {
        this.authusertel = authusertel == null ? null : authusertel.trim();
    }

    public String getAuthuserpassword() {
        return authuserpassword;
    }

    public void setAuthuserpassword(String authuserpassword) {
        this.authuserpassword = authuserpassword == null ? null : authuserpassword.trim();
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }
}