package com.hhr.dto;

import com.hhr.enums.RegisterStateEnum;

/**
 * 封装注册执行后结果
 */

public class RegisterExecution {

    private int accountid; //想要进行注册的账户id

    //private String userid; //想要进行注册的用户id

    private String username; //想要进行注册的用户昵称

    private int state; //注册结果状态

    private String stateInfo; //注册结果状态信息

    public int getAccountid() {
        return accountid;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

//    public String getUserid() {
//        return userid;
//    }

    public String getUsername() {
        return username;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

//    public void setUserid(String userid) {
//        this.userid = userid;
//    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RegisterExecution() {
        //空的构造方法
    }

    //注册失败的构造器
    public RegisterExecution(RegisterStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //注册成功的构造器
    public RegisterExecution(int accountid, String username, RegisterStateEnum stateEnum) {
        this.accountid = accountid;
        //this.userid = userid;
        this.username = username;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

}
