<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>试卷管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jQuery.js"></script>
<style type="text/css">
span {
	display: none;
}

th {
	background-color: #666;
}

td {
	text-align: center;
}
</style>
</head>
<body>
	<div>
		<h3 align="center">请参加以下考试</h3>
		<table width="100%" align="center" id="marginTop" border="1"
			bordercolor="#eee" cellspacing="1">
			<tr>
				<th><font color="white">序号</font></th>
				<th><font color="white">类型</font></th>
				<th><font color="white">科目</font></th>
				<th><font color="white">标题</font></th>
				<th><font color="white">考试班级</font></th>
				<th><font color="white">开始时间</font></th>
				<th><font color="white">考试时长(分钟)</font></th>
				<th><font color="white">操作</font></th>
			</tr>
			<s:iterator value="listPapers" var="paperone" status="status">
				<tr>
					<td>${status.count }</td>
					<td>${paperone.ptype }</td>
					<td>[${paperone.course.major }&nbsp;${paperone.course.stage }]&nbsp;${paperone.course.csName }</td>
					<td>${paperone.pname }</td>
					<!-- 显示当前考生所在班级 -->
					<td>
						
					</td>
					<td>
						
					</td>
					<td>${paperone.ptime }</td>
					<td><a href="">开始考试</a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>