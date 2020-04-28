<%--
  Created by IntelliJ IDEA.
  User: ***
  Date: 2019-06-13
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>火种——野外冒险</title>
    <meta name="author" content="hit-hhr">
    <meta name="description" content="火种-纯文字网页游戏">
    <meta name="type" content="副本地图界面">
    <link rel="icon" href="logo.png" type="image/x-icon" />
    <!-- 新 Bootstr 核心 CSS 文件 --><link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） --><script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 --><script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 --><script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* underline下划线 */
        .divcss5 {
            text-decoration: underline
        }
    </style>
</head>
<!-- <body background="bg01.png"> -->
<body>
<div style="background-color:transparent;height:630px;width:1000px;">
    <div style="background-color:transparent;height:690px;width:10px;float:left;">
        <!-- 左边距对齐区域 -->
    </div>
    <div id="header" style="background-	color:transparent;height:40px;width:1000px;">
        <!-- 标题区域 -->
        <h3 style="margin-bottom:0;">野外(副本地图1):黑暗丛林</h3>
        <!-- <h3 style="margin-bottom:0;">野外(副本地图2):荒凉山脉</h3> -->
        <!-- <h3 style="margin-bottom:0;">野外(副本地图3):阴雾沼泽</h3> -->
    </div>
    <div id="menu" style="background-color:transparent;height:650px;width:990px;float:left;">
        <div id="monsterInfo" style="font-family:arial;color:black;font-size:20px;">
            一头野猪从树林中冲了出来</div><br />
        <div class="divcss5" id="monsterName" onclick="lookMonster()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            野猪（1级）</div><br />
        <div class="divcss5" id="attack" onclick="attackMonster()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            挑战怪物</div><br />
        <div class="divcss5" id="forward" onclick="forward()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            继续前进</div><br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <div class="divcss5" id="back" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            <a href="main.jsp">返回庇护所</a>
        </div><br />
    </div>
</div>
<script>
    var pigLive = 1;
    var wolfLive = 1;
    var snackLive = 1;
    var monsterNum = 0;

    function lookMonster() {
        alert("暂时不可查看怪物信息");
    }

    function attackMonster() {
        if (monsterNum == 0) { //猪
            if (pigLive == 1) {
                document.getElementById("monsterInfo").innerHTML = "一番激烈的战斗之后，你用" + "拳头" + "打死了这头笨猪！";
                document.getElementById("monsterName").innerHTML = "野猪（1级）（已死亡）";
                pigLive = 0;
            } else {
                document.getElementById("monsterInfo").innerHTML = "它已经是一头死猪了，就不要再打了吧？";
            }
        } else if (monsterNum == 1) { //狼
            if (wolfLive == 1) {
                document.getElementById("monsterInfo").innerHTML = "一番激烈的战斗之后，你用" + "拳头" + "打死了这匹饿狼！ ";
                document.getElementById("monsterName").innerHTML = "饿狼（1级）（已死亡）";
                wolfLive = 0;
            } else {
                document.getElementById("monsterInfo").innerHTML = "它已经是一匹死狼了，就不要再打了吧？";
            }
        } else if (monsterNum == 2) { //蛇
            if (snackLive == 1) {
                document.getElementById("monsterInfo").innerHTML = "一番激烈的战斗之后，你用" + "拳头" + "打死了这条毒蛇！ ";
                document.getElementById("monsterName").innerHTML = "毒蛇（1级）（已死亡）";
                snackLive = 0;
            } else {
                document.getElementById("monsterInfo").innerHTML = "它已经是一条死蛇了，就不要再打了吧？";
            }
        }
    }

    function forward() {
        if (monsterNum == 0) { //猪
            if (pigLive == 1) {
                document.getElementById("monsterInfo").innerHTML = "野猪" + "挡在了你的面前，你只能挑战它或者返回庇护所";
            } else {
                monsterNum++;
                document.getElementById("monsterInfo").innerHTML = "正在摸索中，一匹饿狼向你靠近";
                document.getElementById("monsterName").innerHTML = "饿狼（1级）";
            }
        } else if (monsterNum == 1) { //狼
            if (wolfLive == 1) {
                document.getElementById("monsterInfo").innerHTML = "饿狼" + "挡在了你的面前，你只能挑战它或者返回庇护所";
            } else {
                monsterNum++;
                document.getElementById("monsterInfo").innerHTML = "窸窸窣窣的声音传来，有毒蛇！";
                document.getElementById("monsterName").innerHTML = "毒蛇（1级）";
            }
        } else if (monsterNum == 2) { //蛇
            if (snackLive == 1) {
                document.getElementById("monsterInfo").innerHTML = "毒蛇" + "挡在了你的面前，你只能挑战它或者返回庇护所";
            } else {
                monsterNum++;
                document.getElementById("monsterInfo").innerHTML = "这个地图的怪物都被你杀光啦，去下一个地图吧";
                document.getElementById("attack").innerHTML = "";
                document.getElementById("forward").innerHTML = "前往 野外(副本地图2):荒凉山脉";
            }
        } else if (monsterNum == 3) { //下一个地图
            alert("暂未开放");
        }
    }
</script>
</body>
</html>
