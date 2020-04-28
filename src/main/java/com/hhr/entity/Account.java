package com.hhr.entity;

/* 账户注册信息 实体类 */

import java.sql.Timestamp;
import java.util.Date;

public class Account {

    private int accountid; //账户id

    private String accountpwd; //账户密码

    private Date signupdate; //账户注册时间

    //构造方法，getter和setter方法，toString方法

    public Account(){
        //空的构造方法
    }

    public Account(int accountid, String accountpwd){
        this.accountid = accountid;
        this.accountpwd = accountpwd;
    }

    public Account(int accountid, String accountpwd, Date signupdate){
        this.accountid = accountid;
        this.accountpwd = accountpwd;
        this.signupdate = signupdate;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountpwd(String accountpwd) {
        this.accountpwd = accountpwd;
    }

    public String getAccountpwd() {
        return accountpwd;
    }

    public void setSignupdate(Date signupdate) {
        this.signupdate = signupdate;
    }

    public Date getSignupdate() {
        return signupdate;
    }

    /*  在类实例化的过程中自动执行的方法叫做构造方法，它不需要你手动调用。
        构造方法可以在类实例化的过程中做一些初始化的工作。
        构造方法的名称必须与类的名称相同，并且没有返回值。
        每个类都有构造方法。
        如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认的构造方法。
    */

    /*//Java中对数据库插入datetime类型的数据
    java.util.Date date = new java.util.Date();
    //获取一个Date对象
    Timestamp timeStamp = new Timestamp(date.getTime());
    //将日期时间转换为数据库中的timestamp类型
     */

}
