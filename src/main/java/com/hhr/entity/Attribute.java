package com.hhr.entity;

/* 玩家属性 实体类 */

public class Attribute {

    private int accountid; //账户id

    private int level; //玩家等级

    private String title; //玩家称号

    private int exnow; //当前已有经验值

    private int exneed; //当前升级所需经验值

    private int vip; //玩家VIP等级

    private int hp; //玩家最大生命值（正常状态下）

    private int atk; //玩家攻击力（正常状态下）

    private int def; //玩家防御值（正常状态下）

    private int sp; //玩家速度值（正常状态下）

    //构造方法，getter和setter方法，toString方法

    public Attribute(){
        //空的构造方法
    }

    public Attribute(int accountid){
        this.accountid = accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setExneed(int exneed) {
        this.exneed = exneed;
    }

    public int getExneed() {
        return exneed;
    }

    public void setExnow(int exnow) {
        this.exnow = exnow;
    }

    public int getAtk() {
        return atk;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDef() {
        return def;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getExnow() {
        return exnow;
    }

    public int getHp() {
        return hp;
    }

    public int getVip() {
        return vip;
    }

    public String getTitle() {
        return title;
    }

    public int getSp() {
        return sp;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

}
