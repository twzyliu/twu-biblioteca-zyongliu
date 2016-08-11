package com.twu.biblioteca.Domain;

/**
 * Created by zyongliu on 16/8/11.
 */
public class User {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private CheckHistory checkHistory;
    private String libNum; //the login account, which is unique.
    private String password;    //the login password;

    public User() {
        checkHistory = new CheckHistory();
    }

    public User(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CheckHistory getCheckHistory() {
        return checkHistory;
    }

    public void setLibNum(String libNum) {
        this.libNum = libNum;
    }

    public String getLibNum() {
        return libNum;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
