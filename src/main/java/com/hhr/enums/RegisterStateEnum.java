package com.hhr.enums;

/**
 * 使用枚举表述常量数据字典
 */

public enum RegisterStateEnum {

    SUCCESS(1, "数据成功写入后台数据库，账户注册成功"),
    Exist(0, "此账户ID已存在"),
    ERROR(-1, "系统异常");

    private int state;
    private String stateInfo;

    private RegisterStateEnum(int state, String stateInfo) { //必须定义构造函数
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static RegisterStateEnum stateOf(int index) {
        for (RegisterStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
