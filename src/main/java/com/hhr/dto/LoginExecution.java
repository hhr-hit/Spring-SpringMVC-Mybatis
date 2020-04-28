package com.hhr.dto;

import com.hhr.enums.LoginStateEnum;

/**
 * 封装注册执行后结果
 */

public class LoginExecution {

    private int accountid; //想要进行登陆的账户id

    //private String userid; //想要进行登陆的用户id

    private String username; //想要进行登陆的用户昵称

    private int state; //登陆结果状态

    private String stateInfo; //登陆结果状态信息

    public int getAccountid() {
        return accountid;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getUsername() {
        return username;
    }

//    public String getUserid() {
//        return userid;
//    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public void setUserid(String userid) {
//        this.userid = userid;
//    }

    public LoginExecution() {
        //空的构造方法
    }

    //登陆失败的构造器
    public LoginExecution(LoginStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //登陆成功的构造器1
    public LoginExecution(int accountid, String username, LoginStateEnum stateEnum) {
        this.accountid = accountid;
        //this.userid = userid;
        this.username = username;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //登陆成功的构造器2
    public LoginExecution(int accountid, LoginExecution stateEnum) {
        this.accountid = accountid;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

}
