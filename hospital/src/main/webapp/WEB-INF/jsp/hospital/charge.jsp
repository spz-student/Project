<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>收费项目登记</title>
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
		$('#newNav').click(function(){
				window.location.href="sys/bxd/hospitalcharge-edit1";
		 });
    });
	
    	function checkall(){
			var alls=document.getElementsByName("check");
			var ch=document.getElementById("checkall");
			if(ch.checked){
				for(var i=0;i<alls.length;i++){
					alls[i].checked=true;	
				}	
			}else{
				for(var i=0;i<alls.length;i++){
					alls[i].checked=false;	
				}	
			}
		}
		function delAll(){
			var alls=document.getElementsByName("check");
			var ids=new Array();
			for(var i=0;i<alls.length;i++){
				if(alls[i].checked){
					ids.push(alls[i].value);
				}		
			}
			if(ids.length>0){
				if(confirm("确认操作?")){
					alert("成功!");
				}
			}else{
				alert("请选中要操作的项");
			}
		}
    $(function () {       
		$('#backid').click(function(){
				window.location.href="dispensing.html";
		 });
    });
    </script>
</head>
<body>
   
<form action="sys/bxd/hospitalcharge" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">收费项目名称：</td>
        <td width="10%"><input type="text" name="pname" value=""/></td>
		
        <td>
		<button type="submit" class="btn btn-primary" type="button">查询</button> 
			<button type="submit" class="btn btn-primary" type="button">清空</button> </td>
    </tr>
   
</table>


</form>
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
        <th>编号</th>
        <th>收费项目名称</th>        
        <th>收费金额</th>
        <th>创建日期</th>
        <th>操作</th>
    </tr>
    </thead>
	     <tr >
            <td style="vertical-align:middle;">1103</td>
            <td style="vertical-align:middle;">心脏检查</td>
            <td style="vertical-align:middle;">200</td>
            <td style="vertical-align:middle;">2015-01-04 10:34</td>
            <td style="vertical-align:middle;">
				<a href="sys/bxd/hospitalcharge-edit1">修改</a>
				<a href="sys/bxd/hospitalcharge-delete">删除</a>
				<a href="sys/bxd/hospitalcharge-edit1">查看详情</a>
			</td>
        </tr>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  <div class="inline pull-right page">
          <a href='#' >第一页</a> <a href='#'>上一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下一页</a> <a href='#' >最后一页</a>
		  &nbsp;&nbsp;&nbsp;共<span class='current'>32</span>条记录<span class='current'> 1/33 </span>页
		  </div>
		 <div><input type="button" class="btn btn-success" value="添加收费项目"id="newNav">
		 
		 </div>
		 
		 </th></tr>
  </table>
  
</body>
</html>
