<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<title>发药--中软高科-2015</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="../css/bootstrap-responsive.css" />
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
		<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
		<script type="text/javascript" src="../js/jquery.sorted.js"></script>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
		<script type="text/javascript" src="../js/ckform.js"></script>
		<script type="text/javascript" src="../js/common.js"></script>
		
		<script src="../js/layer/layer.js"></script>
		<script src="../kj/jqjq.js"></script>

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
			$(function() {
				$('#backid').click(function() {
					window.location.href = "dispensing.html";
				});
				
				$(".ok").click(function() {

					if(chickform('#ff') == false) {
						return layer.msg('请填写完整!!!');
					}

					$.post2('doAddFaYao.ajax', $('#ff').serialize(), function(data) {
						if(data.res == 1) {
							return layer.alert("添加成功", {}, function() {
								$('#backid').click();
							});
						} else {
							return layer.alert("添加失败");
						}
					}, function(e, ee, eee) {
						layer.alert("添加异常:" + eee);
					})

				})
				
			});
		</script>
	</head>

	<body>
		<form id="ff" action="dispensing.html" method="post" class="definewidth m20">
			<table class="table table-bordered table-hover definewidth m10">
				<tr>
					<td width="10%" class="tableleft">病历号</td>
					<td>${guahao.gid}</td>
					<input type="hidden" name="gid" id="gid" value="${guahao.gid}" />
				</tr>
				<tr>
					<td width="10%" class="tableleft">姓名</td>
					<td>${guahao.gname}</td>
				</tr>
				<tr>
					<td width="10%" class="tableleft">
						<font color="red">*</font>药品名称</td>
					<td>
						<select name="yno">
							<c:forEach items="${yaos}" var="y" >
								<option value="${y.yno}">${y.y_name}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td width="10%" class="tableleft">
						<font color="red">*</font>发药数量</td>
					<td><input type="text" name="f_num" value="" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<center>
							<button type="button" class="ok btn btn-primary" type="button">保存</button> &nbsp;&nbsp;
							<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
						</center>
					</td>
				</tr>
			</table>
		</form>
	</body>

</html>