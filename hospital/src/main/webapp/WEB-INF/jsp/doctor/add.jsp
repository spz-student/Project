<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加医生--中软高科-2015</title>
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
				window.location.href="index.jsp";
		 });
    });
    </script>
</head>
<body>
<form action="index.html" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>姓名</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>身份证号</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>手机</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">座机</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>性别</td>
        <td><input type="radio" name="pname" value="" checked/>男&nbsp;&nbsp;&nbsp;<input type="radio" name="pname" value=""/>女</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>出生年月</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>年龄</td>
        <td>28岁</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">电子邮箱</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>所属科室</td>
        <td><select><option>急诊科</option><option>骨科</option><option>血液科</option></select></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">学历</td>
        <td><select><option>专科</option><option>本科</option><option>博士</option><option>博士后</option></select></td>
    </tr>
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td><textarea></textarea></td>
	</tr>
    <tr>
        <td colspan="2">
			<center>
				<input class="btn btn-primary" type="submit" value="保存"> &nbsp;&nbsp;<input type="submit" class="btn btn-success" name="backid" id="backid" value="保存列表">
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>