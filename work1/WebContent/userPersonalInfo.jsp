 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.controller.*"%>
<%@ page import="com.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="JavaScript" type="text/javascript">
	function ps_() {
		document.selectForm.action="userPersonal.jsp";
		document.selectForm.submit();
	}
	function il_() {
		document.selectForm.action="userJobList.jsp";
		document.selectForm.submit();
	}
	
	function cl_() {
		//document.selectForm.action="";
		document.selectForm.submit();
	}
	function exit_() {
		document.selectForm.action="userLogin.jsp";
		document.selectForm.submit();
	}
	function ok_() {
		document.personalForm.action="modifyUser";

	}
	function cancel_() {
		document.personalForm.action="showUser.jsp";
		document.personalForm.submit();
	}
</script>
<%
	User user = new User();
	user = (User) session.getAttribute("user");
	if(user == null) {
		user.setUserName("");
		user.setUserPassword("");
		user.setUserUsername("");
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Recruitment System</title>
<link rel="stylesheet" type="text/css" href="css/recruitment.css" />
</head>
<body>
	<div class="wrapper">
		<div class="main">
			<div class="left">
				<form name="selectForm" method="POST">
					<font style="text-align:center; width:300px; height:30px; line-height:35px; color:white; font-size:20px;"></font>
					<br>
					<input class="button" type="submit" name="personalInformation" value="View and Modify Personal Information" onclick="ps_()">
					<br>
					<input class="button" type="submit" name="jobList" value="Job List" onclick="il_()">
					<br>
					<input class="button" type="submit" name="exit" value="Exit" onclick="exit_()">
					<br>
				</form>
			</div>
			<div class="right">
				<form name="personalForm" method="POST">
					<table>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">USERNAME</font></td></tr>
						<tr align="left"><td><input name="username" type="text" id="username" size="95" style="height:25px; margin-left:10px"  value="${user.userUsername}"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">PASSWORD</font></td></tr>
						<tr align="left"><td><input name="password" type="text" id="password" size="95" style="height:25px; margin-left:10px" value="${user.userPassword}"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">NAME</font></td></tr>
						<tr align="left"><td><input name="name" type="text" id="name" size="95" style="height:25px; margin-left:10px" value="${user.userName}"></td></tr>
					    <tr align="left"><td><font style="line-height:30px; margin-left:10px;">ID</font></td></tr>
						<tr align="left"><td><input name="id" type="text" id="id" size="95" style="height:25px; margin-left:10px" value="${user.userId}"></td></tr>
						<tr align="center"><td>
							<input class="button0" type="submit" name="ok" value="OK" onclick="ok_()">
							<input class="button0" type="submit" name="cancel" value="Cancel" onclick="cancel_()">
						</td></tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html> 