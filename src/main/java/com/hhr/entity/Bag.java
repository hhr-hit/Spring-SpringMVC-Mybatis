package com.hhr.entity;

/* 玩家背包存储 实体类 */

public class Bag {

    private int accountid; //账户id

    private int allplace; //背包总格数，一个物品占一格

    private int usedplace; //背包已用格数

    private int allspace; //背包总空间

    private int usedspace; //背包已用空间

    private int goldcoin; //金币数量，不占格数，不占空间

    private String weaponname; //武器名称

    private String weaponscript; //武器详情

    private int weaponspace; //武器所占空间，0或3

    private String armorname; //护甲名称

    private String armorscript; //护甲详情

    private int armorspace; //护甲所占空间，0或2

    private String shoesname; //鞋子名称

    private String shoesscript; //鞋子详情

    private int shoesspace; //鞋子所占空间，0或1

    private String helmetname; //头盔名称

    private String helmetscript; //头盔详情

    private int helmetspace; //头盔所占空间，0或1

    private String item001name; //道具1名称

    private String item001script; //道具1详情

    private int item001space; //道具1所占空间，0或1

    private String item002name; //道具2名称

    private String item002script; //道具2详情

    private int item002space; //道具2所占空间，0或1

    private String item003name; //道具3名称

    private String item003script; //道具3详情

    private int item003space; //道具3所占空间，0或1

    private String item004name; //道具4名称

    private String item004script; //道具4详情

    private int item004space; //道具4所占空间，0或1

    private String item005name; //道具5名称

    private String item005script; //道具5详情

    private int item005space; //道具5所占空间，0或1

    private String item006name; //道具6名称

    private String item006script; //道具6详情

    private int item006space; //道具6所占空间，0或1

    //构造方法，getter和setter方法，toString方法

    public Bag(){
        //空的构造方法
    }

    public Bag(int accountid){
        this.accountid = accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public void setAllplace(int allplace) {
        this.allplace = allplace;
    }

    public void setAllspace(int allspace) {
        this.allspace = allspace;
    }

    public void setUsedplace(int usedplace) {
        this.usedplace = usedplace;
    }

    public void setGoldcoin(int goldcoin) {
        this.goldcoin = goldcoin;
    }

    public void setUsedspace(int usedspace) {
        this.usedspace = usedspace;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    public void setArmorname(String armorname) {
        this.armorname = armorname;
    }

    public void setWeaponscript(String weaponscript) {
        this.weaponscript = weaponscript;
    }

    public void setArmorscript(String armorscript) {
        this.armorscript = armorscript;
    }

    public void setWeaponspace(int weaponspace) {
        this.weaponspace = weaponspace;
    }

    public void setArmorspace(int armorspace) {
        this.armorspace = armorspace;
    }

    public void setHelmetname(String helmetname) {
        this.helmetname = helmetname;
    }

    public void setHelmetscript(String helmetscript) {
        this.helmetscript = helmetscript;
    }

    public void setHelmetspace(int helmetspace) {
        this.helmetspace = helmetspace;
    }

    public void setItem001name(String item001name) {
        this.item001name = item001name;
    }

    public void setItem001script(String item001script) {
        this.item001script = item001script;
    }

    public void setItem001space(int item001space) {
        this.item001space = item001space;
    }

    public void setItem002name(String item002name) {
        this.item002name = item002name;
    }

    public void setItem002script(String item002script) {
        this.item002script = item002script;
    }

    public void setItem002space(int item002space) {
        this.item002space = item002space;
    }

    public void setItem003name(String item003name) {
        this.item003name = item003name;
    }

    public void setItem003script(String item003script) {
        this.item003script = item003script;
    }

    public void setItem003space(int item003space) {
        this.item003space = item003space;
    }

    public void setItem004name(String item004name) {
        this.item004name = item004name;
    }

    public void setItem004script(String item004script) {
        this.item004script = item004script;
    }

    public void setItem004space(int item004space) {
        this.item004space = item004space;
    }

    public void setItem005name(String item005name) {
        this.item005name = item005name;
    }

    public void setItem005script(String item005script) {
        this.item005script = item005script;
    }

    public void setItem005space(int item005space) {
        this.item005space = item005space;
    }

    public void setItem006name(String item006name) {
        this.item006name = item006name;
    }

    public void setItem006script(String item006script) {
        this.item006script = item006script;
    }

    public void setItem006space(int item006space) {
        this.item006space = item006space;
    }

    public void setShoesname(String shoesname) {
        this.shoesname = shoesname;
    }

    public void setShoesscript(String shoesscript) {
        this.shoesscript = shoesscript;
    }

    public void setShoesspace(int shoesspace) {
        this.shoesspace = shoesspace;
    }

    public int getUsedplace() {
        return usedplace;
    }

    public int getUsedspace() {
        return usedspace;
    }

    public int getAccountid() {
        return accountid;
    }

    public int getAllplace() {
        return allplace;
    }

    public int getAllspace() {
        return allspace;
    }

    public int getGoldcoin() {
        return goldcoin;
    }

    public int getWeaponspace() {
        return weaponspace;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public String getWeaponscript() {
        return weaponscript;
    }

    public int getArmorspace() {
        return armorspace;
    }

    public String getArmorname() {
        return armorname;
    }

    public int getHelmetspace() {
        return helmetspace;
    }

    public int getItem001space() {
        return item001space;
    }

    public int getItem002space() {
        return item002space;
    }

    public int getItem003space() {
        return item003space;
    }

    public int getItem004space() {
        return item004space;
    }

    public int getItem005space() {
        return item005space;
    }

    public int getItem006space() {
        return item006space;
    }

    public int getShoesspace() {
        return shoesspace;
    }

    public String getArmorscript() {
        return armorscript;
    }

    public String getHelmetname() {
        return helmetname;
    }

    public String getHelmetscript() {
        return helmetscript;
    }

    public String getItem001name() {
        return item001name;
    }

    public String getItem001script() {
        return item001script;
    }

    public String getItem002name() {
        return item002name;
    }

    public String getItem002script() {
        return item002script;
    }

    public String getItem003name() {
        return item003name;
    }

    public String getItem003script() {
        return item003script;
    }

    public String getItem004name() {
        return item004name;
    }

    public String getItem004script() {
        return item004script;
    }

    public String getItem005name() {
        return item005name;
    }

    public String getItem005script() {
        return item005script;
    }

    public String getItem006name() {
        return item006name;
    }

    public String getItem006script() {
        return item006script;
    }

    public String getShoesname() {
        return shoesname;
    }

    public String getShoesscript() {
        return shoesscript;
    }

}
