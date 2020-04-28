package com.hhr.enums;

/**
 * 使用枚举表述常量数据字典
 */

public enum DataSynStateEnum {

    SUCCESS(1, "数据发送完成，同步成功"),
    ERROR(-1, "系统异常");

    private int state;
    private String stateInfo;

    private DataSynStateEnum(int state, String stateInfo) { //必须定义构造函数
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

    public static DataSynStateEnum stateOf(int index) {
        for (DataSynStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
