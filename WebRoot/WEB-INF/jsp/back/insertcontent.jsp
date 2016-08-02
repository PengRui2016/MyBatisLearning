<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<title>HTML5 Title</title>
    <meta content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">

</head>
<body>
    <form action="<%=basePath %>insert.action" method="POST">
    	<label>内容：</label>
    	<input type="text" name="content" value="" />
    	<br/>
    	<label>指令id：</label>
    	<input type="number" name="commandid" value=""/>
    	<br/>
    	<label>内容：</label>
    	<input type="text" name="content" value="" />
    	<br/>
    	<label>指令id：</label>
    	<input type="number" name="commandid" value=""/>
    	<br/>
    	<input type="submit" value="提交"/>
    </form>
</body>
</html>
