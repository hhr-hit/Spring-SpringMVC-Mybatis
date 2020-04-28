package com.hhr.dto;

import com.hhr.enums.DataSynStateEnum;

/**
 * 封装注册执行后结果
 */

public class DataSynExecution {

    private int accountid; //想要进行用户数据同步的账户id

    private int state; //数据同步结果状态

    private String stateInfo; //数据同步结果状态信息

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public int getAccountid() {
        return accountid;
    }

    public DataSynExecution() {
        //空的构造方法
    }

    //用户数据同步失败的构造器
    public DataSynExecution(DataSynStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //用户数据同步成功的构造器
    public DataSynExecution(int accountid, DataSynStateEnum stateEnum) {
        this.accountid = accountid;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

}
