<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.controller.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="JavaScript" type="text/javascript">
	function login_() {
		document.loginForm.action="UserLogin";
		document.loginForm.submit();
	}
	function register_() {
		document.loginForm.action="register.jsp";
		document.loginForm.submit();
	}
	function go_() {
		document.loginForm.action="adminLogin.jsp";
		document.loginForm.submit();
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Recruitment System</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>
	<div class="wrapper">
		<div class="header">
		</div>
		<div class="main">
			<form name="loginForm" method="POST">
				<font style="line-height:30px; margin-top:10px; color:white;">USERNAME</font>
				<input name="username" type="text" id="username" size="20" style="height:25px; margin-left:5px; margin-top:10px;">
				<font style="line-height:30px; margin-left:20px; margin-top:10px; color:white;">PASSWORD</font>
				<input name="password" type="password" id="password" size="20" style="height:25px; margin-left:5px; margin-top:10px;">
				<input class="button" type="submit" name="login" value="Login" onclick="login_()">
				<input class="button" type="submit" name="register" value="Register" onclick="register_()">
				<input class="button" type="submit" name="adminLogin" value="Admin login" onclick="go_()">
			</form>
		</div>
		
	</div>
</body>
</html>
<%@include file="footer.jsp" %>