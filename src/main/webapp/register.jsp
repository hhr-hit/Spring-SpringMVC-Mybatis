<%--
  Created by IntelliJ IDEA.
  User: ***
  Date: 2019-06-11
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>火种——注册</title>
    <meta name="author" content="hit-hhr">
    <meta name="description" content="火种-纯文字网页游戏">
    <meta name="type" content="账户注册界面">
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
    <div style="background-color:transparent;height:690px;width:50px;float:left;">
        <!-- 左边距对齐区域 -->
    </div>
    <div id="header" style="background-color:transparent;height:50px;width:1000px;">
        <!-- 上边距对齐区域 -->
    </div>
    <div id="menu" style="background-color:transparent;height:650px;width:200px;float:left;">
        <!-- 注册信息输入区域 -->
        <div style="font-family:arial;color:blue;font-size:20px;">
            账户ID: <input id="accountid" type="text"><br><br>
            用户昵称: <input id="username" type="text"><br><br>
            密码: <input id="accountpwd" type="password"><br><br>
            确认密码: <input id="accountpwd0" type="password"><br><br>
        </div>
        <br />
        <div class="divcss5" id="toRegister" onclick="toRegister()" style="font-family:arial;color:blue;font-size:20px;cursor:pointer;">
            确认注册</div><br />
    </div>
</div>
<script>
    function toRegister() {
        var accountid = document.getElementById("accountid").value;
        var username = document.getElementById("username").value;
        var accountpwd = document.getElementById("accountpwd").value;
        var accountpwd0 = document.getElementById("accountpwd0").value;
        //Date signupdate = new Date();
        var json = {
            accountid: accountid,
            accountpwd: accountpwd,
            username: username
        };
        $.ajax({
            url: 'register',
            type: "POST",
            data: JSON.stringify(json),
            //dataType:"json",
            success: function(data) { //如果连接成功,data为后端返回的数据
                if (data == "SUCCESS") {
                    alert("注册成功，现在去登陆");
                    window.location.href = "login.jsp"

                } else if (data == "EXIST") {
                    alert("账户ID已存在");
                } else {
                    alert("抱歉！遭遇异常，请稍后再试。");
                }
            },
            contentType: "application/json;charset=UTF-8"
        });
        //1)GET 请求发送的并不是JSON字符串，jquery会给他转成url的请求参数
        //2)traditonal：true 不能省，这是防止浏览器将集合参数名为"favs[]"这样后台会报错
        //3)POST请求的JSON.stringify不能省略
        //4)contentType其实可以省略
    }
</script>
</body>
</html>
