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
    <title>火种——谜之起源</title>
    <meta name="author" content="hit-hhr">
    <meta name="description" content="火种-纯文字网页游戏">
    <meta name="type" content="新手引导界面">
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
<div id="left" style="background-color:transparent;height:690px;width:10px;float:left;">
    <!-- 左边距对齐区域 -->
</div>
<div class="divcss5" id="menu" style="background-color:transparent;height:690px;width:200px;float:left;">
    <!-- 游戏功能选择区域 -->
    <div class="divcss5" id="u1" onmouseover="this.style.cursor='hand'" onclick="toNext()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">醒来</div><br />
    <div class="divcss5" id="u2" onmouseover="this.style.cursor='hand'" onclick="toLightFire()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 生火 -->
    </div><br />
    <div class="divcss5" id="u3" onmouseover="this.style.cursor='hand'" onclick="toStrengthFire()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 添柴 -->
    </div><br />
    <div class="divcss5" id="u4" onmouseover="this.style.cursor='hand'" onclick="toCutTrees()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 伐木 -->
    </div><br />
    <div class="divcss5" id="u5" onmouseover="this.style.cursor='hand'" onclick="toMakeTraps()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 制作陷阱 -->
    </div><br />
    <div class="divcss5" id="u6" onmouseover="this.style.cursor='hand'" onclick="toLookTraps()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 查看陷阱 -->
    </div><br />
    <div class="divcss5" id="u7" onmouseover="this.style.cursor='hand'" onclick="toMakeBacon()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 制作熏肉 -->
    </div><br />
    <div class="divcss5" id="u8" onmouseover="this.style.cursor='hand'" onclick="toBuildHouse()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
        <!-- 建造木屋 -->
    </div><br />
    <a class="divcss5" id="u9" onmouseover="this.style.cursor='hand'" onclick="toGame()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;"
       href="main.jsp">
    </a><br />
</div>
<div id="content" style="background-color:transparent;color:black;height:690px;width:700px;float:left;">
    <!-- 游戏信息显示区域 -->
    <!-- 你在一片黑暗中醒来，周围好像是一片荒凉的原始丛林。<br /> -->
</div>
<div id="right" style="background-color:transparent;color:white;height:690px;width:300px;float:left;">
    <!-- 右侧空白区域 -->
</div>
<script>
    var nextIntro = [
        "你在一片黑暗中醒来，周围好像是一片荒凉的原始丛林。",
        "在黑夜里丛林显得格外狰狞，你摸索着。",
        "前方出现了 一个废弃的小木屋。",
        "确定没有危险后，你走了进去。",
        "屋子有些冷，尝试着生火来取暖吧。",
        "一个陌生人走了进来，他很冷，添点柴火让房间更暖和一些。",
        "陌生人情况好转了，他询问是否可以留下。",
        "陌生人说他是一名工匠，他能帮你建造更多的建筑。",
        "你请他帮你建造一个灾难庇护所。",
        "在这末世中，一个庇护所能让更多的人活下去。",
        "你留下了这个人。",
        "管理者+1",
        "缺少材料，去伐木吧。",
        "木头+5",
        "可以制作陷阱了，这会带来更多的食物和保障。",
        "陷阱+1",
        "陷阱已安放，等待动物入网。",
        "牙齿+3，肉+1，毛皮+2",
        "得到了更多的材料，可以制作熏肉了。",
        "木头-1，肉-1，熏肉+1",
        "木头足够多了，建造更多的房间来吸引人口。",
        "木屋+1",
        "屋子多了起来，厨房和各种工坊也建立起来。",
        "庇护所逐渐成型。"
    ]; //游戏内容
    var lightIntro = [
        "火焰蹦出火花，熄灭了。",
        "火焰燃烧着，虽然弱小但仍在挣扎。"
    ]; //游戏内容
    var next_time = -1; //点击"醒来""继续"的次数
    var light_time = 0; //点击"生火"的次数

    function toNext() { //"醒来""继续"
        //alert("yes");
        if (next_time == -1) { //此时是"醒来",点击后变为"继续"
            //alert("yes");
            document.getElementById("u1").innerText = "继续";
        } else if (next_time == 3) { //"生火"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u2").innerText = "生火";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 4) { //"添柴"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u3").innerText = "添柴";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 11) { //"伐木"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u4").innerText = "伐木";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 13) { //"制作陷阱"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u5").innerText = "制作陷阱";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 15) { //"查看陷阱"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u6").innerText = "查看陷阱";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 17) { //"制作熏肉"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u7").innerText = "制作熏肉";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 19) { //"建造木屋"开启
            document.getElementById("u1").innerText = "";
            document.getElementById("u8").innerText = "建造木屋";
            //document.getElementById("content").style.color = 'white';
        } else if (next_time == 22) { //"进入庇护所(初级)"即进入游戏
            document.getElementById("u1").innerText = "";
            document.getElementById("u9").innerText = "进入庇护所(初级)";
            //document.getElementById("content").style.color = 'white';
        }
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
    }

    function toLightFire() { //"生火"
        document.getElementById("content").innerText = lightIntro[light_time++]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        if (light_time == 2) { //"生火"关闭
            //alert("yes");
            document.getElementById("u2").innerText = "";
            document.getElementById("u1").innerText = "继续";
        }
    }

    function toStrengthFire() { //"添柴"
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        document.getElementById("u3").innerText = "";
        document.getElementById("u1").innerText = "继续";
    }

    function toCutTrees() { //"伐木"
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        document.getElementById("u4").innerText = "";
        document.getElementById("u1").innerText = "继续";
    }

    function toMakeTraps() { //"制作陷阱"
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        document.getElementById("u5").innerText = "";
        document.getElementById("u1").innerText = "继续";
    }

    function toLookTraps() { //"查看陷阱"
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        document.getElementById("u6").innerText = "";
        document.getElementById("u1").innerText = "继续";
    }

    function toMakeBacon() { //"制作熏肉"
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        document.getElementById("u7").innerText = "";
        document.getElementById("u1").innerText = "继续";
    }

    function toBuildHouse() { //"建造木屋"
        document.getElementById("content").innerText = nextIntro[++next_time]; //更换引导文字,点击"继续"次数+1
        //document.getElementById("content").style.color = 'white'; //文字颜色
        document.getElementById("u8").innerText = "";
        document.getElementById("u1").innerText = "继续";
    }

    function toGame() { //"进入庇护所(初级)"
        document.getElementById("content").innerText = "";
        document.getElementById("u9").innerText = "";
        //window.toStaticHTML(main.html);
    }
</script>
</body>
</html>
