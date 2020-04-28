package com.hhr.entity;

/* 玩家是否开启某功能 实体类 */

public class Function {

    private int accountid; //账户id

    private int usebag; //背包存储

    private int makefire; //生火取暖

    private int cuttree; //砍树伐木

    private int collectwater; //收集水源

    private int makebait; //制作诱饵

    private int placetrap; //放置陷阱

    private int makebacon; //制作烤肉

    private int train; //冥想修炼

    private int makeshoes; //鞋子制作

    private int makearmor; //护甲制作

    private int makehelmet; //头盔制作

    private int makeweapon; //武器制作

    private int dungeon01; //副本1

    private int dungeon02; //副本2

    private int dungeon03; //副本3

    private int dungeon04; //副本4

    private int dungeon05; //副本5

    private int dungeon06; //副本6

    private int dungeon07; //副本7

    private int dungeon08; //副本8

    //构造方法，getter和setter方法，toString方法

    public Function(){
        //空的构造方法
    }

    public Function(int accountid){
        this.accountid = accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public void setCollectwater(int collectwater) {
        this.collectwater = collectwater;
    }

    public void setCuttree(int cuttree) {
        this.cuttree = cuttree;
    }

    public void setMakebacon(int makebacon) {
        this.makebacon = makebacon;
    }

    public void setMakearmor(int makearmor) {
        this.makearmor = makearmor;
    }

    public void setMakebait(int makebait) {
        this.makebait = makebait;
    }

    public void setMakefire(int makefire) {
        this.makefire = makefire;
    }

    public void setPlacetrap(int placetrap) {
        this.placetrap = placetrap;
    }

    public void setMakeshoes(int makeshoes) {
        this.makeshoes = makeshoes;
    }

    public void setTrain(int train) {
        this.train = train;
    }

    public void setUsebag(int usebag) {
        this.usebag = usebag;
    }

    public void setDungeon01(int dungeon01) {
        this.dungeon01 = dungeon01;
    }

    public void setDungeon02(int dungeon02) {
        this.dungeon02 = dungeon02;
    }

    public void setDungeon03(int dungeon03) {
        this.dungeon03 = dungeon03;
    }

    public void setDungeon04(int dungeon04) {
        this.dungeon04 = dungeon04;
    }

    public void setDungeon05(int dungeon05) {
        this.dungeon05 = dungeon05;
    }

    public void setDungeon06(int dungeon06) {
        this.dungeon06 = dungeon06;
    }

    public void setDungeon07(int dungeon07) {
        this.dungeon07 = dungeon07;
    }

    public void setDungeon08(int dungeon08) {
        this.dungeon08 = dungeon08;
    }

    public void setMakehelmet(int makehelmet) {
        this.makehelmet = makehelmet;
    }

    public void setMakeweapon(int makeweapon) {
        this.makeweapon = makeweapon;
    }

    public int getUsebag() {
        return usebag;
    }

    public int getAccountid() {
        return accountid;
    }

    public int getCollectwater() {
        return collectwater;
    }

    public int getCuttree() {
        return cuttree;
    }

    public int getMakebacon() {
        return makebacon;
    }

    public int getMakebait() {
        return makebait;
    }

    public int getMakefire() {
        return makefire;
    }

    public int getMakeshoes() {
        return makeshoes;
    }

    public int getPlacetrap() {
        return placetrap;
    }

    public int getTrain() {
        return train;
    }

    public int getDungeon01() {
        return dungeon01;
    }

    public int getDungeon02() {
        return dungeon02;
    }

    public int getDungeon03() {
        return dungeon03;
    }

    public int getDungeon04() {
        return dungeon04;
    }

    public int getDungeon05() {
        return dungeon05;
    }

    public int getDungeon06() {
        return dungeon06;
    }

    public int getDungeon07() {
        return dungeon07;
    }

    public int getDungeon08() {
        return dungeon08;
    }

    public int getMakearmor() {
        return makearmor;
    }

    public int getMakehelmet() {
        return makehelmet;
    }

    public int getMakeweapon() {
        return makeweapon;
    }

}
