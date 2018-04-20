<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统登录</title>

<style type="text/css">
html {
	overflow-y: scroll;
	vertical-align: baseline;
}

body {
	font-family: Microsoft YaHei, Segoe UI, Tahoma, Arial, Verdana,
		sans-serif;
	font-size: 12px;
	color: #fff;
	height: 100%;
	line-height: 1;
	background: #999
}

* {
	margin: 0;
	padding: 0
}

ul,li {
	list-style: none
}

h1 {
	font-size: 30px;
	font-weight: 700;
	text-shadow: 0 1px 4px rgba(0, 0, 0, .2)
}

.login-box {
	width: 410px;
	margin: 120px auto 0 auto;
	text-align: center;
	padding: 30px;
	background: url(images/mask.png);
	border-radius: 10px;
}

.login-box .name,.login-box .password,.login-box .code,.login-box .remember
	{
	font-size: 16px;
	text-shadow: 0 1px 2px rgba(0, 0, 0, .1)
}

.login-box .remember input {
	box-shadow: none;
	width: 15px;
	height: 15px;
	margin-top: 25px
}

.login-box .remember {
	padding-left: 40px
}

.login-box .remember label {
	display: inline-block;
	height: 42px;
	width: 70px;
	line-height: 34px;
	text-align: left
}

.login-box label {
	display: inline-block;
	width: 100px;
	text-align: right;
	vertical-align: middle
}

.login-box #code {
	width: 120px
}

.login-box .codeImg {
	float: right;
	margin-top: 26px;
}

.login-box img {
	width: 148px;
	height: 42px;
	border: none
}

input[type=text],input[type=password] {
	width: 270px;
	height: 42px;
	margin-top: 25px;
	padding: 0px 15px;
	border: 1px solid rgba(255, 255, 255, 1);
	border-radius: 6px;
	color: #fff;
	letter-spacing: 2px;
	font-size: 16px;
	background: transparent;
}

button {
	cursor: pointer;
	width: 100%;
	height: 44px;
	padding: 0;
	background: #ef4300;
	border: 1px solid #ff730e;
	border-radius: 6px;
	font-weight: 700;
	color: #fff;
	font-size: 24px;
	letter-spacing: 15px;
	text-shadow: 0 1px 2px rgba(0, 0, 0, .1)
}

input:focus {
	outline: none;
	box-shadow: 0 2px 3px 0 rgba(0, 0, 0, .1) inset, 0 2px 7px 0
		rgba(0, 0, 0, .2)
}

button:hover {
	box-shadow: 0 15px 30px 0 rgba(255, 255, 255, .15) inset, 0 2px 7px 0
		rgba(0, 0, 0, .2)
}

.screenbg {
	position: fixed;
	bottom: 0;
	left: 0;
	z-index: -999;
	overflow: hidden;
	width: 100%;
	height: 100%;
	min-height: 100%;
}

.screenbg ul li {
	display: block;
	list-style: none;
	position: fixed;
	overflow: hidden;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	z-index: -1000;
	float: right;
}

.screenbg ul a {
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	display: inline-block;
	margin: 0;
	padding: 0;
	cursor: default;
}

.screenbg a img {
	vertical-align: middle;
	display: inline;
	border: none;
	display: block;
	list-style: none;
	position: fixed;
	overflow: hidden;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	z-index: -1000;
	float: right;
}

.bottom {
	margin: 8px auto 0 auto;
	width: 100%;
	position: fixed;
	text-align: center;
	bottom: 0;
	left: 0;
	overflow: hidden;
	padding-bottom: 8px;
	color: #ccc;
	word-spacing: 3px;
	zoom: 1;
}

.bottom a {
	color: #FFF;
	text-decoration: none;
}

.bottom a:hover {
	text-decoration: underline;
}
</style>
<script type="text/javascript" src="statics/Js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	//管理员姓名 登录密码以及验证码非空验证
	$(function(){
		$("#submit").click(function(){
			var loginName=$("input[name=loginName]").val();
			var loginPwd=$("input[name=loginPwd]").val();
			var loginYzm=$("input[name=loginYzm]").val();
			if(loginName=="")
			{
				$("#errorMsg").html("管理员账号不能为空");
				return false;
			}
			if(loginPwd=="")
			{
				$("#errorMsg_pwd").html("密码不能为空");	
				return false;
			}
			if(loginYzm=="")
			{
				$("#errorMsg_yzm").html("验证码不能为空");
				return false;
			}
		});
			
	});
	//验证码随机
	function changeImg(){  
    var imgSrc = $("#imgObj");  
    var src = imgSrc.attr("src");  
    imgSrc.attr("src",chgUrl(src));  
}  
//时间戳  
//为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳  
function chgUrl(url){  
    var timestamp = (new Date()).valueOf();  
    url = url.substring(0,17);  
    if((url.indexOf("&")>=0)){  
        url = url + "×tamp=" + timestamp;  
    }else{  
        url = url + "?timestamp=" + timestamp;  
    }  
    return url;  
}  
  
function isRightCode(){  
    var code = $("#veryCode").attr("value");  
    code = "c=" + code;  
    $.ajax({  
        type:"POST",  
        url:"ResultServlet",  
        data:code,  
        success:callback  
    });  
}  
  
function callback(data){  
    $("#info").html(data);  
}  
</script>


</head>

<body>

	<div class="login-box">
		<h1>山东医院后台管理系统登陆</h1>
		<form method="post" action="dologin">
			<div class="name">
				<label>管理员账号：</label> <input type="text" name="uname" id="" tabindex="1"
					autocomplete="off" maxlength="5"/>
			</div>
			<div id="errorMsg" style="color: red" ></div>
			<div class="password">
				<label>密 码：</label> <input type="password" name="password" maxlength="8"
					id="" tabindex="2" />
			</div>
			<div id="errorMsg_pwd" style="color: red"  ></div>
			<div class="code">
				<label>验证码：</label> <input type="text" name="loginYzm" maxlength="4"
					id="code" tabindex="3" />
				<div class="codeImg">
					
					<img src="VerifyCodeServlet"   name="image" onclick="document.all.image.src='VerifyCodeServlet'">
				</div>
			</div>
			<div id="errorMsg_yzm" style="color: red"  ></div>
			<div class="remember">
				<input type="checkbox" id="remember" tabindex="4"> <label>记住密码</label>
			</div>
			
			<div class="login">
				<button type="submit" tabindex="5" id="submit">登录</button>
			</div>
			
		</form>
	</div>
	<div class="bottom">
		©2014 Leting <a href="javascript:;" target="_blank">关于</a> <span>京ICP证030173号</span><img
			width="13" height="16" src="statics/images/copy_rignt_24.png" />
	</div>

	<div class="screenbg">
		<ul>
			<li><a href="javascript:;"><img src="statics/images/01.jpg"></a></li>
		</ul>
	</div>
</body>
</html>
