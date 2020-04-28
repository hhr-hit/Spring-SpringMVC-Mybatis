<%--
  Created by IntelliJ IDEA.
  User: ****
  Date: 2019-06-11
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java"%>
<html>
<head>
    <title>火种——庇护所时代</title>
    <meta name="author" content="hit-hhr">
    <meta name="description" content="火种-纯文字网页游戏">
    <meta name="type" content="游戏主界面">
    <link rel="icon" href="logo.png" type="image/x-icon" />
<%--    <!-- 新 Bootstr 核心 CSS 文件 --><link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
<%--    <!-- 可选的Bootstrap主题文件（一般不使用） --><script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>--%>
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
    <div id="header" style="background-color:transparent;height:40px;width:1000px;">
        <!-- 标题区域 -->
        <h3 style="margin-bottom:0;">庇护所(初级):小型村落</h3>
    </div>
    <div id="menu" style="background-color:transparent;height:650px;width:200px;float:left;">
        <!-- 游戏功能选择区域 -->
        <div class="divcss5" id="toBuildHouses" onclick="toBuildHouses()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            建造木屋</div><br />
        <div class="divcss5" id="toBuildTrunks" onclick="toBuildTrunks()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            建造货车</div><br />
        <div class="divcss5" id="toBuildTraps" onclick="toBuildTraps()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            建造陷阱</div><br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <div class="divcss5" id="toCutTrees" onclick="toCutTrees()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            伐木</div><br />
        <div class="divcss5" id="toCheckTraps" onclick="toCheckTraps()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            查看陷阱</div><br />
        <div class="divcss5" id="toRisk" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            <a href="risk.jsp">出发去冒险</a></div><br />
        <div class="divcss5" id="toLookStock" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            <!-- <a href="stock.jsp">查看所有库存</a> -->
            查看所有库存
        </div><br />
    </div>
    <div style="background-color:transparent;height:250px;width:790px;float:left;">
        <!-- 右侧分配工人区域 -->
        <div id="all" style="height:25px;width:700px;float:left;">
            总人口 : 0
        </div>
        <div id="blank" style="height:25px;width:90px;float:left;">
            发呆 : 0
        </div>
        <div style="background-color:transparent;height:30px;width:240px;float:left;font-size:20px;">
            伐木工<span style="font-size:15px">[木头+2]</span>
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="cutterS10" onclick="toSubCutter10()" style="color:blue;font-size:20px;cursor:pointer;">
                -10</div>
        </div>
        <div style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            <div class="divcss5" id="cutterS1" onclick="toSubCutter1()" style="color:blue;font-size:20px;cursor:pointer;">
                -1</div>
        </div>
        <div id="cutter" style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            0<br />
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="cutterA1" onclick="toAddCutter1()" style="color:blue;font-size:20px;cursor:pointer;">
                +1</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:290px;float:left;font-size:20px;">
            <div class="divcss5" id="cutterA10" onclick="toAddCutter10()" style="color:blue;font-size:20px;cursor:pointer;">
                +10</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:240px;float:left;font-size:20px;">
            猎人<span style="font-size:15px">[毛皮+1 生肉+1]</span>
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="hunterS10" onclick="toSubHunter10()" style="color:blue;font-size:20px;cursor:pointer;">
                -10</div>
        </div>
        <div style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            <div class="divcss5" id="hunterS1" onclick="toSubHunter1()" style="color:blue;font-size:20px;cursor:pointer;">
                -1</div>
        </div>
        <div id="hunter" style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            0<br />
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="hunterA1" onclick="toAddHunter1()" style="color:blue;font-size:20px;cursor:pointer;">
                +1</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:290px;float:left;font-size:20px;">
            <div class="divcss5" id="hunterA10" onclick="toAddHunter10()" style="color:blue;font-size:20px;cursor:pointer;">
                +10</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:240px;float:left;font-size:20px;">
            陷阱师<span style="font-size:15px">[生肉-2 诱饵+1]</span>
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="baiterS10" onclick="toSubBaiter10()" style="color:blue;font-size:20px;cursor:pointer;">
                -10</div>
        </div>
        <div style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            <div class="divcss5" id="baiterS1" onclick="toSubBaiter1()" style="color:blue;font-size:20px;cursor:pointer;">
                -1</div>
        </div>
        <div id="baiter" style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            0<br />
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="baiterA1" onclick="toAddBaiter1()" style="color:blue;font-size:20px;cursor:pointer;">
                +1</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:290px;float:left;font-size:20px;">
            <div class="divcss5" id="baiterA10" onclick="toAddBaiter10()" style="color:blue;font-size:20px;cursor:pointer;">
                +10</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:240px;float:left;font-size:20px;">
            熏肉师<span style="font-size:15px">[生肉-10 木头-10 熏肉+1]</span>
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="baconerS10" onclick="toSubBaconer10()" style="color:blue;font-size:20px;cursor:pointer;">
                -10</div>
        </div>
        <div style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            <div class="divcss5" id="baconerS1" onclick="toSubBaconer1()" style="color:blue;font-size:20px;cursor:pointer;">
                -1</div>
        </div>
        <div id="baconer" style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            0<br />
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="baconerA1" onclick="toAddBaconer1()" style="color:blue;font-size:20px;cursor:pointer;">
                +1</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:290px;float:left;font-size:20px;">
            <div class="divcss5" id="baconerA10" onclick="toAddBaconer10()" style="color:blue;font-size:20px;cursor:pointer;">
                +10</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:240px;float:left;font-size:20px;">
            皮革师<span style="font-size:15px">[毛皮-10 皮革+1]</span>
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="leathererS10" onclick="toSubLeatherer10()" style="color:blue;font-size:20px;cursor:pointer;">
                -10</div>
        </div>
        <div style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            <div class="divcss5" id="leathererS1" onclick="toSubLeatherer1()" style="color:blue;font-size:20px;cursor:pointer;">
                -1</div>
        </div>
        <div id="leatherer" style="background-color:transparent;height:30px;width:80px;float:left;font-size:20px;">
            0<br />
        </div>
        <div style="background-color:transparent;height:30px;width:50px;float:left;font-size:20px;">
            <div class="divcss5" id="leathererA1" onclick="toAddLeatherer1()" style="color:blue;font-size:20px;cursor:pointer;">
                +1</div><br />
        </div>
        <div style="background-color:transparent;height:30px;width:290px;float:left;font-size:20px;">
            <div class="divcss5" id="leathererA10" onclick="toAddLeatherer10()" style="color:blue;font-size:20px;cursor:pointer;">
                +10</div><br />
        </div>
    </div>
    <div style="background-color:transparent;height:220px;width:790px;float:left;">
        <!-- 右侧物品库存区域 -->
        <div style="height:25px;width:200px;float:left;">
            物品
        </div>
        <div style="height:25px;width:200px;float:left;">
            库存
        </div>
        <div style="height:25px;width:390px;float:left;">
            收入/7秒
        </div>
        <div style="height:25px;width:200px;float:left;">
            木头
        </div>
        <div id="woods" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="woodsChange" style="height:25px;width:390px;float:left;">
            0
        </div>
        <div style="height:25px;width:200px;float:left;">
            生肉
        </div>
        <div id="meats" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="meatsChange" style="height:25px;width:390px;float:left;">
            0
        </div>
        <div style="height:25px;width:200px;float:left;">
            诱饵
        </div>
        <div id="baits" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="baitsChange" style="height:25px;width:390px;float:left;">
            0
        </div>
        <div style="height:25px;width:200px;float:left;">
            熏肉
        </div>
        <div id="bacons" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="baconsChange" style="height:25px;width:390px;float:left;">
            0
        </div>
        <div style="height:25px;width:200px;float:left;">
            毛皮
        </div>
        <div id="furs" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="fursChange" style="height:25px;width:390px;float:left;">
            0
        </div>
        <div style="height:25px;width:200px;float:left;">
            皮革
        </div>
        <div id="leathers" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="leathersChange" style="height:25px;width:390px;float:left;">
            0
        </div>
        <div style="height:25px;width:200px;float:left;">
            牙齿
        </div>
        <div id="teeth" style="height:25px;width:200px;float:left;">
            0
        </div>
        <div id="teethChange" style="height:25px;width:390px;float:left;">
            0
        </div>
    </div>
    <div id="content" style="background-color:transparent;height:180px;width:790px;float:left;">
        <!-- 游戏信息显示区域 -->
        <div id="info" style="background-color:transparent;height:180px;width:790px;float:left;overflow-y:scroll;">
            火堆冒出火苗
        </div>
    </div>
</div>
<script>
    var gameInfo = [
        "一户饱经风雨的人家住进木屋",
        "陌生人在夜里到达",
        "建造者添了柴",
        "火堆冒出火苗",
        "该功能暂未开放"
    ]; //游戏提示信息
    var all = 0; //总人口
    var blank = 0; //空闲的人
    var house = 0;
    var trunk = 0;
    var trap = 0;
    var cutter = 0; //伐木工
    var woods = 0;
    var woodsChange = 0;
    var baiter = 0;
    var baits = 0;
    var baitsChange = 0;
    var teeth = 0;
    var hunter = 0;
    var meats = 0;
    var meatsChange = 0;
    var furs = 0;
    var fursChange = 0;
    var baconer = 0;
    var bacons = 0;
    var baconsChange = 0;
    var leatherer = 0;
    var leathers = 0;
    var leathersChange = 0;
    var noWoods = 0;
    var noBaits = 0;
    var noBacons = 0;
    var noMeats = 0;
    var noFurs = 0;
    var noLeathers = 0;
    var noteeth = 0;
    var cannotBacons1 = 0;
    var cannotBacons2 = 0;
    var cannotBaits = 0;
    var cannotLeathers = 0;
    var cutTime = 0;
    var checkTime = 0;

    var addChangeTimer = self.setInterval("addChange()", 10000); //收入计算，(20-流水线等级*2)秒一次

    // var synTime = 10;
    // var synTimer = self.setInterval("dataSynA()", 1000); //1分钟同步一次前后端数据
    // var synTime = 10;
    // var synTimer = self.setInterval("dataSynB()", 1000); //1分钟同步一次前后端数据
    // var synTime = 10;
    // var synTimer = self.setInterval("dataSynF()", 1000); //1分钟同步一次前后端数据
    var accountid = 123456; //登陆时记录accountid
    var synTime = 20;
    // var synTimer = self.setInterval("dataSyn()", 1000); //1分钟同步一次前后端数据
    dataSyn();
    function dataSyn() {
        var json = {
            accountid: accountid,
            all: all,
            blank: blank,
            house: house,
            trunk: trunk,
            trap: trap,
            cutter: cutter,
            woods: woods,
            woodsChange: woodsChange,
            baiter: baiter,
            baits: baits,
            baitsChange: baitsChange,
            teeth: teeth,
            hunter: hunter,
            meats: meats,
            meatsChange: meatsChange,
            furs: furs,
            fursChange: fursChange,
            baconer: baconer,
            bacons: bacons,
            baconsChange: baconsChange,
            leatherer: leatherer,
            leathers: leathers,
            leathersChange: leathersChange,
            noWoods: noWoods,
            noBaits: noBaits,
            noBacons: noBacons,
            noMeats: noMeats,
            noFurs: noFurs,
            noLeathers: noLeathers,
            noteeth: noteeth,
            cannotBacons1: cannotBacons1,
            cannotBacons2: cannotBacons2,
            cannotBaits: cannotBaits,
            cannotLeathers: cannotLeathers,
            cutTime: cutTime,
            checkTime: checkTime
        };
        console.log(json)
        $.ajax({
            url: 'dataSyn',
            type: "POST",
            data: JSON.stringify(json),
            dataType:"json",
            contentType: "application/json",
            // asyn: false,
            success: function(data) { //如果连接成功,data为后端返回的数据
                if (data == "SUCCESS") {
                    var newInfo = "数据同步成功";
                    var conInfo = document.getElementById("info").innerHTML +
                        " <br /> " + newInfo;
                    document.getElementById("info").innerHTML = conInfo;
                } else{
                    var newInfo = "数据同步失败";
                    var conInfo = document.getElementById("info").innerHTML +
                        " <br /> " + newInfo;
                    document.getElementById("info").innerHTML = conInfo;
                }
            }
        });
    }

    function toBuildHouses() {
        if (woods >= 50) {
            woods -= 50;
            house += 1;
            all += 4;
            blank += 4;
            document.getElementById("woods").innerHTML = woods;
            document.getElementById("all").innerHTML = "总人口 : " + all;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            var newInfo = "一户饱经风雨的人家住进木屋";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        } else {
            var newInfo = "木头不够，去伐木或者分配工人吧";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        }
    }

    function toBuildTrunks() {
        if (woods >= 20 && trunk < 5) {
            woods -= 20;
            trunk += 1;
            cutTime = 10 - trunk;
            document.getElementById("woods").innerHTML = woods;
            var newInfo = "货车越多，伐木速度越快";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        } else {
            var newInfo = "木头不够，去伐木或者分配工人吧";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        }
    }

    function toBuildTraps() {
        if (woods >= 20 && trap < 5) {
            woods -= 20;
            trap += 1;
            document.getElementById("woods").innerHTML = woods;
            var newInfo = "陷阱越多，每次查看陷阱收获越多"; //这三行用来显示信息
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        } else {
            var newInfo = "木头不够，去伐木或者分配工人吧";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        }
    }

    function toCutTrees() { //点击伐木时,(10-trunk)秒内仅一次有效
        if (cutTime <= 0) {
            woods += 7;
            document.getElementById("woods").innerHTML = woods;
            var newInfo = " 地上零落着枯枝败叶 ";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
            cutTime = 0 - trunk; //开始冷却
            var cutTimer = self.setInterval(function() {
                cutTime--;
            }, 1000); //伐木冷却计算，(10-trunk)秒一次
        } else {
            var newInfo = " 伐木未冷却 ";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        }
    }

    function toCheckTraps() { //查看陷阱时,20秒一次,显示游戏信息,增加库存
        if (checkTime <= 0) {
            meats += (3 + trap);
            furs += (2 + trap);
            teeth += (1 + trap);
            var newInfo = "肉+" + (3 + trap) + " 毛皮+" + (2 + trap) + " 牙齿+" + (1 + trap);
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
            document.getElementById("meats").innerHTML = meats;
            document.getElementById("furs").innerHTML = furs;
            document.getElementById("teeth").innerHTML = teeth;
            checkTime = 0; //开始冷却
            var checkTimer = self.setInterval(function() {
                checkTime--;
            }, 1000); //查看陷阱冷却计算,20秒一次
        } else {
            var newInfo = " 陷阱未冷却 ";
            var conInfo = document.getElementById("info").innerHTML +
                " <br /> " + newInfo;
            document.getElementById("info").innerHTML = conInfo;
        }
    }

    function toAddCutter1() {
        if (blank >= 1) {
            blank -= 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            cutter += 1;
            document.getElementById("cutter").innerHTML = cutter;
        }
        calcChange();
    }

    function toAddCutter10() {
        if (blank >= 10) {
            blank -= 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            cutter += 10;
            document.getElementById("cutter").innerHTML = cutter;
        } else {
            cutter += blank;
            document.getElementById("cutter").innerHTML = cutter;
            blank -= blank;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubCutter1() {
        if (cutter >= 1) {
            cutter -= 1;
            document.getElementById("cutter").innerHTML = cutter;
            blank += 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubCutter10() {
        if (cutter >= 10) {
            cutter -= 10;
            document.getElementById("cutter").innerHTML = cutter;
            blank += 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        } else {
            blank += cutter;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            cutter -= cutter;
            document.getElementById("cutter").innerHTML = cutter;
        }
        calcChange();
    }

    function toAddHunter1() {
        if (blank >= 1) {
            blank -= 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            hunter += 1;
            document.getElementById("hunter").innerHTML = hunter;
        }
        calcChange();
    }

    function toAddHunter10() {
        if (blank >= 10) {
            blank -= 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            hunter += 10;
            document.getElementById("hunter").innerHTML = hunter;
        } else {
            hunter += blank;
            document.getElementById("hunter").innerHTML = hunter;
            blank -= blank;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubHunter1() {
        if (hunter >= 1) {
            hunter -= 1;
            document.getElementById("hunter").innerHTML = hunter;
            blank += 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubHunter10() {
        if (hunter >= 10) {
            hunter -= 10;
            document.getElementById("hunter").innerHTML = hunter;
            blank += 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        } else {
            blank += hunter;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            hunter -= hunter;
            document.getElementById("hunter").innerHTML = hunter;
        }
        calcChange();
    }

    function toAddBaiter1() {
        if (blank >= 1) {
            blank -= 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            baiter += 1;
            document.getElementById("baiter").innerHTML = baiter;
        }
        calcChange();
    }

    function toAddBaiter10() {
        if (blank >= 10) {
            blank -= 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            baiter += 10;
            document.getElementById("baiter").innerHTML = baiter;
        } else {
            baiter += blank;
            document.getElementById("baiter").innerHTML = baiter;
            blank -= blank;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubBaiter1() {
        if (baiter >= 1) {
            baiter -= 1;
            document.getElementById("baiter").innerHTML = baiter;
            blank += 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubBaiter10() {
        if (baiter >= 10) {
            baiter -= 10;
            document.getElementById("baiter").innerHTML = baiter;
            blank += 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        } else {
            blank += baiter;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            baiter -= baiter;
            document.getElementById("baiter").innerHTML = baiter;
        }
        calcChange();
    }

    function toAddBaconer1() {
        if (blank >= 1) {
            blank -= 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            baconer += 1;
            document.getElementById("baconer").innerHTML = baconer;
        }
        calcChange();
    }

    function toAddBaconer10() {
        if (blank >= 10) {
            blank -= 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            baconer += 10;
            document.getElementById("baconer").innerHTML = baconer;
        } else {
            baconer += blank;
            document.getElementById("baconer").innerHTML = baconer;
            blank -= blank;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubBaconer1() {
        if (baconer >= 1) {
            baconer -= 1;
            document.getElementById("baconer").innerHTML = baconer;
            blank += 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubBaconer10() {
        if (baconer >= 10) {
            baconer -= 10;
            document.getElementById("baconer").innerHTML = baconer;
            blank += 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        } else {
            blank += baconer;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            baconer -= baconer;
            document.getElementById("baconer").innerHTML = baconer;
        }
        calcChange();
    }

    function toAddLeatherer1() {
        if (blank >= 1) {
            blank -= 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            leatherer += 1;
            document.getElementById("leatherer").innerHTML = leatherer;
        }
        calcChange();
    }

    function toAddLeatherer10() {
        if (blank >= 10) {
            blank -= 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            leatherer += 10;
            document.getElementById("leatherer").innerHTML = leatherer;
        } else {
            leatherer += blank;
            document.getElementById("leatherer").innerHTML = leatherer;
            blank -= blank;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubLeatherer1() {
        if (leatherer >= 1) {
            leatherer -= 1;
            document.getElementById("leatherer").innerHTML = leatherer;
            blank += 1;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        }
        calcChange();
    }

    function toSubLeatherer10() {
        if (leatherer >= 10) {
            leatherer -= 10;
            document.getElementById("leatherer").innerHTML = leatherer;
            blank += 10;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
        } else {
            blank += leatherer;
            document.getElementById("blank").innerHTML = "发呆 : " + blank;
            leatherer -= leatherer;
            document.getElementById("leatherer").innerHTML = leatherer;
        }
        calcChange();
    }

    function calcChange() { //每次分配工人时，计算收入并回显收入
        //alert(calcChange);
        woodsChange = cutter * 2 + baconer * (-10); //点击+-分配工人时
        document.getElementById("woodsChange").innerHTML = woodsChange;
        baitsChange = baiter * 1;
        document.getElementById("baitsChange").innerHTML = baitsChange;
        meatsChange = hunter * 1 + baconer * (-10) + baiter * (-2);
        document.getElementById("meatsChange").innerHTML = meatsChange;
        baconsChange = baconer * 1;
        document.getElementById("baconsChange").innerHTML = baconsChange;
        fursChange = hunter * 1 + leatherer * (-10);
        document.getElementById("fursChange").innerHTML = fursChange;
        leathersChange = leatherer * 1;
        document.getElementById("leathersChange").innerHTML = leathersChange;
    }

    function addChange() { //游戏运行时,每(20-流水线等级*2)秒一次，获取收入并回显库存
        //alert(addChange);
        if ((woods + woodsChange) >= 0) {
            cannotBacons1 = 0;
            noWoods = 0; //足够
            woods += woodsChange;
            document.getElementById("woods").innerHTML = woods;
        } else {
            if (noWoods == 0) {
                cannotBacons1 = 1;
                noBacons = 1;
                var newInfo = "木头 库存不足，请合理分配工人数量";
                var conInfo = document.getElementById("info").innerHTML +
                    " <br /> " + newInfo;
                document.getElementById("info").innerHTML = conInfo;
                noWoods = 1; //不足，仅提醒一次
            }
        }
        if ((meats + meatsChange) >= 0) {
            cannotBacons2 = 0;
            cannotBaits = 0;
            noMeats = 0; //足够
            meats += meatsChange;
            document.getElementById("meats").innerHTML = meats;
        } else {
            if (noMeats == 0) {
                cannotBacons2 = 1;
                cannotBaits = 1;
                noBacons = 1;
                noBaits = 1;
                var newInfo = "肉 库存不足，请合理分配工人数量";
                var conInfo = document.getElementById("info").innerHTML +
                    " <br /> " + newInfo;
                document.getElementById("info").innerHTML = conInfo;
                noMeats = 1; //不足，仅提醒一次
            }
        }
        if ((furs + fursChange) >= 0) {
            cannotLeathers = 0;
            noFurs = 0; //足够
            furs += fursChange;
            document.getElementById("furs").innerHTML = furs;
        } else {
            if (noFurs == 0) {
                cannotLeathers = 1;
                var newInfo = "毛皮 库存不足，请合理分配工人数量";
                var conInfo = document.getElementById("info").innerHTML +
                    " <br /> " + newInfo;
                document.getElementById("info").innerHTML = conInfo;
                noFurs = 1; //不足，仅提醒一次
            }
        }
        if ((baits + baitsChange) >= 0 && cannotBaits == 0) {
            noBaits = 0; //足够
            baits += baitsChange;
            document.getElementById("baits").innerHTML = baits;
        } else {
            if (noBaits == 0) {
                var newInfo = "诱饵 库存不足，请合理分配工人数量";
                var conInfo = document.getElementById("info").innerHTML +
                    " <br /> " + newInfo;
                document.getElementById("info").innerHTML = conInfo;
                noBaits = 1; //不足，仅提醒一次
            }
        }

        if ((bacons + baconsChange) >= 0 && cannotBacons1 == 0 && cannotBacons2 == 0) {
            noBacons = 0; //足够
            bacons += baconsChange;
            document.getElementById("bacons").innerHTML = bacons;
        } else {
            if (noBacons == 0) {
                var newInfo = "熏肉 库存不足，请合理分配工人数量";
                var conInfo = document.getElementById("info").innerHTML +
                    " <br /> " + newInfo;
                document.getElementById("info").innerHTML = conInfo;
                noBacons = 1; //不足，仅提醒一次
            }
        }
        if ((leathers + leathersChange) >= 0 && cannotLeathers == 0) {
            noLeathers = 0; //足够
            leathers += leathersChange;
            document.getElementById("leathers").innerHTML = leathers;
        } else {
            if (noLeathers == 0) {
                var newInfo = "皮革 库存不足，请合理分配工人数量";
                var conInfo = document.getElementById("info").innerHTML +
                    " <br /> " + newInfo;
                document.getElementById("info").innerHTML = conInfo;
                noLeathers = 1; //不足，仅提醒一次
            }
        }
    }
</script>
</body>
</html>
