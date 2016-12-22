<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.controller.*"%>
<%@ page import="com.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="JavaScript" type="text/javascript">
	function ps_() {
		document.selectForm.action="personal.jsp";
		document.selectForm.submit();
	}
	function il_() {
		document.selectForm.action="jobList.jsp";
		document.selectForm.submit();
	}
	function ar_() {
		document.selectForm.action="addRecruitment.jsp";
		document.selectForm.submit();
	}
	function cl_() {
		//document.selectForm.action="";
		document.selectForm.submit();
	}
	function exit_() {
		document.selectForm.action="login.jsp";
		document.selectForm.submit();
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Recruitment System</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
</head>
<body>
	<div class="wrapper">
		<div class="main">
			<div class="left">
				<form name="selectForm" method="POST">
					<font style="text-align:center; width:300px; height:30px; line-height:35px; color:white; font-size:20px;"><strong>${param.subTitle}</strong></font>
					<br>
					<input class="button" type="submit" name="personalInformation" value="View and Modify Personal Information" onclick="ps_()">
					<br>
					<input class="button" type="submit" name="informationList" value="Check the Recruitment Information List" onclick="il_()">
					<br>
					<input class="button" type="submit" name="addRecruitment" value="Add the Recruitment Information" onclick="ar_()">
					<br>
					<input class="button" type="submit" name="candidateList" value="The Candidate List" onclick="cl_()">
					<br>
					<input class="button" type="submit" name="exit" value="Exit" onclick="exit_()">
					<br>
				</form>
			</div>
			<div class="right">
			</div>
		</div>
	</div>
</body>
</html>