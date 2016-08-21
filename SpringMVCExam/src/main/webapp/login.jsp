<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

		
</head>
<body style="background-image: url('img/pt1.jpg')">
<div>
	<table>
		<tr>
			<td>10941-车孟杰</td>
		</tr>
	</table>
</div>
<div style="background-image: url('img/pt2.png'); background-repeat: no-repeat;position: relative;height: 400px;top: 200px;left: 440px; "  >
		<form name="loginForm" method="post" action="login.do" >
		<table width="320" height="70" border="0" cellspacing="0" cellpadding="0" style=" position:fixed;top: 280px;left: 550px">
			<tr>
				<td>用户名:<input type="text" name="first_name"></td>
			</tr>
			<tr>
				<td>密&nbsp;码:<input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td>
				<input type="submit" value="登录" style="background-color: pink"> 
				<input type="reset" value="重置" style="background-color: red"></td>
			</tr>
		</table>
		</form>	
	
</div>
	
</body>
</html>