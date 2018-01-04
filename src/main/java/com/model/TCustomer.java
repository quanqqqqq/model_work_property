package com.model;

public class TCustomer {
    private String customerid;

    private String customername;

    private String customerpassword;

    private Integer customersex;

    private String address;

    private String customertel;

    private Integer worktotal;

    private Byte hasapplywork;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomerpassword() {
        return customerpassword;
    }

    public void setCustomerpassword(String customerpassword) {
        this.customerpassword = customerpassword == null ? null : customerpassword.trim();
    }

    public Integer getCustomersex() {
        return customersex;
    }

    public void setCustomersex(Integer customersex) {
        this.customersex = customersex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel == null ? null : customertel.trim();
    }

    public Integer getWorktotal() {
        return worktotal;
    }

    public void setWorktotal(Integer worktotal) {
        this.worktotal = worktotal;
    }

    public Byte getHasapplywork() {
        return hasapplywork;
    }

    public void setHasapplywork(Byte hasapplywork) {
        this.hasapplywork = hasapplywork;
    }
}