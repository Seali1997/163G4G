<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'teachermanage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
span {
	display: none;
}
th {
	background-color: #666;
}
td{
	text-align: center;
}
font {
	color: #fff;
}
#marginTop {
	margin-top: 10px;
}
.margRight {
	margin-right: 10px;
}
</style>
  </head>
  
  <body>
    <div>
    	<h3 align="center">教师列表</h3>
    	<input type="button" value="添加教师" onclick="addTeacher();"><br><br>
    	<form action="" method="post">
			编号:
			<s:textfield name="teacher.tid" />
			教师姓名:
			<s:textfield name="teacher.tname" />
			岗位:
			<s:select
				list="#{'':'请选择','讲师':'讲师','辅导员':'辅导员'}" name="teacher.post" />
			<input type="submit" value="查询" class="margRight">
		</form>
    </div>
    <fieldset id="marginTop">
		<table width="100%" align="center" id="marginTop" border="1"
			bordercolor="#eee" cellspacing="0.5">
			<tr>
				<th><font>序号</font></th>
				<th><font>编号</font></th>
				<th><font>姓名</font></th>
				<th><font>性别</font></th>
				<th><font>生日</font></th>
				<th><font>学历</font></th>
				<th><font>联系电话</font></th>
				<th><font>岗位</font></th>
				<th><font>操作</font></th>
			</tr>
			<s:iterator value="pageBean.Items" var="teacher" status="status">
				<tr>
					<td> <s:property value="#status.count"/> </td>
					<td> <s:property value="#teacher.tid"/> </td>
					<td> <s:property value="#teacher.tname"/> </td>
					<td> <s:property value="#teacher.sex"/> </td>
					<td> <s:property value="#teacher.birthday"/> </td>
					<td> <s:property value="#teacher.education"/> </td>
					<td> <s:property value="#teacher.tel"/> </td>
					<td> <s:property value="#teacher.post"/> </td>
					<td> 
						<a href=''>编辑</a>
						<a href=''>重置密码</a>
						<a href=''>删除</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		<div align="right" id="marginTop">
			第${pageBean.currentIndex }页， 共<s:property value="pageBean.getTotalPage()"/>页&nbsp;&nbsp;
			<a
				href="teacher/teacher_getTeacherList?pageIndex=1">首页</a>&nbsp;
			<a
				href="teacher/teacher_getTeacherList?pageIndex=${pageBean.preIndex }">上一页</a>&nbsp;
			<a
				href="teacher/teacher_getTeacherList?pageIndex=${pageBean.nextIndex }">下一页</a>&nbsp;
			<a
				href="teacher/teacher_getTeacherList?pageIndex=${pageBean.totalPage }">末页</a>
		</div>
	</fieldset>
  </body>
</html>
