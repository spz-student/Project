<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>查看--中软高科-2015</title>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="statics/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="statics/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="statics/Css/style.css" />
    <script type="text/javascript" src="statics/Js/jquery.js"></script>
    <script type="text/javascript" src="statics/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="statics/Js/bootstrap.js"></script>
    <script type="text/javascript" src="statics/Js/ckform.js"></script>
    <script type="text/javascript" src="statics/Js/common.js"></script>
    <script type="text/javascript" src="statics/Js/ckeditor/ckeditor.js"></script>
 

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
    <script type="text/javascript">
    $(function () {       
		$('#backid').click(function(){
				window.location.href="sys/bxd/hospitalindex";
		 });
    });
    </script>
</head>
<body>
<form action="index.html" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td>陆小凤</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">证件类型</td>
        <td>身份证</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">证件号</td>
        <td>102434586345673</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">社保号</td>
        <td>435345435</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">联系电话</td>
        <td>12378656789</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">是否自费</td>
        <td>否</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">性别</td>
        <td>男</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">年龄</td>
        <td>33</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">职业</td>
        <td>狗仔队</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">初复诊</td>
        <td>初诊</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">所挂科室</td>
        <td>骨科</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">指定医生</td>
        <td>欧阳雨露</td>
    </tr>
	 <tr>
        <td width="10%" class="tableleft">押金余额</td>
        <td>3000元</td>
    </tr>
	
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td>此人疑拟有精神病</td>
	</tr>
    <tr>
        <td colspan="2">
			<center>
				<input type="button" class="btn btn-success" name="backid" id="backid" value="返回列表">
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>