<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加药品--中软高科-2015</title>
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
				window.location.href="index.html";
		 });
    });
    </script>
</head>
<body>
<form action="sys/bxd/medicineindex" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>药品编号</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">图片</td>
        <td><input type="file" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>进价</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>售价</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>药品名称</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>药品类型</td>
        <td><input type="radio" name="pname0" value="" checked/>处方药&nbsp;&nbsp;&nbsp;<input type="radio" name="pname0" value=""/>中药&nbsp;&nbsp;&nbsp;<input type="radio" name="pname0" value=""/>西药</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">简单描述</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>

    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>保质期</td>
        <td><input type="text" name="pname" value="36"/>月</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">详细描述</td>
        <td><textarea></textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">生产厂商</td>
        <td><textarea></textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>服用说明</td>
        <td><input type="text" name="pname" value=""/></td>
    </tr>
   
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td><textarea></textarea></td>
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