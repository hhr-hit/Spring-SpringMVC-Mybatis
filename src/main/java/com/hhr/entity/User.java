package com.hhr.entity;

/* 用户登陆信息 实体类 */

import java.sql.Timestamp;
import java.util.Date;

public class User {

    private int accountid; //账户id

    private String accountpwd; //账户密码

    //private String userid; //用户id

    private String username; //用户昵称

    private Date signupdate; //账户注册时间

    private int userstate; //用户登陆状态

    //构造方法，getter和setter方法，toString方法

    public User(){
        //空的构造方法
    }

    public User(int accountid, String accountpwd, String username){
        //this.userid = userid;
        this.accountid = accountid;
        this.accountpwd = accountpwd;
        this.username = username;
    }

    public User(int accountid, String accountpwd, String username, Date signupdate){
        //this.userid = userid;
        this.accountid = accountid;
        this.accountpwd = accountpwd;
        this.username = username;
        this.signupdate = signupdate;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public void setSignupdate(Date signupdate) {
        this.signupdate = signupdate;
    }

    public void setAccountpwd(String accountpwd) {
        this.accountpwd = accountpwd;
    }

//    public void setUserid(String userid) {
//        this.userid = userid;
//    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserstate(int userstate) {
        this.userstate = userstate;
    }

    public int getUserstate() {
        return userstate;
    }

//    public String getUserid() {
//        return userid;
//    }

    public String getUsername() {
        return username;
    }

    public int getAccountid() {
        return accountid;
    }

    public Date getSignupdate() {
        return signupdate;
    }

    public String getAccountpwd() {
        return accountpwd;
    }

}
