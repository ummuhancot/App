package com.tpe.domain;

public class User {

    private Integer userId;
    private String userName;
    private String userLastname;
    private String userEmail;
    private String userPassword;
    private String usertelefonNo;
    private Address adres;

    public User() {
    }

    public User(Integer userId, String userName, String userLastname, String userEmail, String userPassword, String usertelefonNo, Address adres) {
        this.userId = userId;
        this.userName = userName;
        this.userLastname = userLastname;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.usertelefonNo = usertelefonNo;
        this.adres = adres;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUsertelefonNo() {
        return usertelefonNo;
    }

    public void setUsertelefonNo(String usertelefonNo) {
        this.usertelefonNo = usertelefonNo;
    }

    public Address getAdres() {
        return adres;
    }

    public void setAdres(Address adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userLastname='" + userLastname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", usertelefonNo='" + usertelefonNo + '\'' +
                ", adres=" + adres +
                '}';
    }
}
