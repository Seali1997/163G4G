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
    
    <title>My JSP 'teacherlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/common1.css">

  </head>
  
  <body>
    <div id="man_zone">
    	<h3 align="center">教师列表</h3>
    	<a href="">添加教师</a>
    	<s:form action="/teacher/teacher_getTeacherList" method="post" theme="simple">
  		编号：<s:textfield name="tid" />
  		教师姓名：<s:textfield name="tname" />
		岗位：<s:select name="post" list="{'讲师','辅导员'}" value="post" ></s:select>
		<s:submit value="查询"></s:submit>
	</s:form>
    	<table>
    		<tr>
    			<th>序号</th>
    			<th>账号</th>
    			<th>姓名</th>
    			<th>性别</th>
    			<th>生日</th>
    			<th>学历</th>
    			<th>联系电话</th>
    			<th>岗位</th>
    			<th>操作</th>
    		</tr>
    		<s:iterator value="pageBean.Items" var="teacher" status="status">
    			<tr align="center">
    				<td><s:property value="#status.count" /></td>
    				<td><s:property value="#teacher.tid" /></td>
    				<td><s:property value="#teacher.tname" /></td>
    				
    				<td>
	    				<s:if test='#teacher.sex == "m"'>
	    					男
	    				</s:if>
	    				<s:else>
	    					女
	    				</s:else>
    				</td>
    				
    				<td><s:property value="#teacher.birthday" /></td>
    				<td><s:property value="#teacher.education" /></td>
    				<td><s:property value="#teacher.tel" /></td>
    				<td><s:property value="#teacher.post" /></td>
    				<td>
    					<a href="<s:url value='toUpdateRole?role.roleId=%{#role.roleId}'/>">编辑</a>
    					<a href="<s:url value='toUpdateRole?role.roleId=%{#role.roleId}'/>">重置密码</a>
    					<a href="<s:url value='deleteRole?role.roleId=%{#role.roleId}'/>">删除</a>
    				</td>
    			</tr>
    		</s:iterator>
    	</table>
    	<div align="right" id="marginTop">
			第${pageBean.currentIndex }页， 共
			<s:property value="pageBean.getTotalPage()" />
			页&nbsp;&nbsp; <a
				href="teacher/teacher_getAll?pageIndex=1">首页</a>&nbsp;
			<a
				href="teacher/teacher_getAll?pageIndex=${pageBean.preIndex }">上一页</a>&nbsp;
			<a
				href="teacher/teacher_getAll?pageIndex=${pageBean.nextIndex }">下一页</a>&nbsp;
			<a
				href="teacher/teacher_getAll?pageIndex=${pageBean.totalPage }">末页</a>
		</div>
	</div>
  </body>
</html>
