<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>修改收费项目--中软高科-2015</title>
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
				window.location.href="charge.html";
		 });
    });
    </script>
</head>
<body>
<form action="charge.html" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">编号</td>
        <td>1103</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>收费项目名称</td>
        <td><input type="text" value="心电图图检" /></td>
    </tr>

    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>收费金额</td>
        <td><input type="text" name="pname" value="600"/></td>
    </tr>
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>