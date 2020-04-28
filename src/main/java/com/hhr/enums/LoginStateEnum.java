package com.hhr.enums;

/**
 * 使用枚举表述常量数据字典
 */

public enum LoginStateEnum {

    SUCCESS(1, "密码匹配，账户登陆成功"),
    FAIL(0, "密码不匹配，账户登陆失败"),
    NotExist(-2, "此账户ID不存在"),
    ERROR(-1, "系统异常");

    private int state;
    private String stateInfo;

    private LoginStateEnum(int state, String stateInfo) { //必须定义构造函数
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

    public static LoginStateEnum stateOf(int index) {
        for (LoginStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
