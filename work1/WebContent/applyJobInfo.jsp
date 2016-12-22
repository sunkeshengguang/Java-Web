<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.controller.*,com.dao.*, java.util.*, com.model.*,com.dao.impl.*" %>
<%String a=(String)request.getAttribute("id");%>
<script language="JavaScript" type="text/javascript">
	function ps_() {
		document.selectForm.action="userPersonal.jsp";
		document.selectForm.submit();
	}
	function il_() {
		document.selectForm.action="userJobList.jsp";
		document.selectForm.submit();
	}
	function ar_() {
		document.selectForm.action="adminAddRecruitment.jsp";
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
	function candidate_() {
		document.addInformation.action="CandidateInfo";
		
	}
</script>
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
				<form name="addInformation" method="POST">
					<table>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">Please enter your name:</font></td></tr>
						<tr align="left"><td><input name="candidatename" type="text" id="candidatename" size="95" style="height:25px; margin-left:10px"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">Your resume:</font></td></tr>
						<tr align="left"><td><textarea name="candidateresume" id="candidateresume" style="margin-left:10px" rows="20" cols="72"></textarea></td></tr>						
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">Company Id</font></td></tr>
						<tr align="left"><td><input name="id" type="text" id="id" value="<%=request.getAttribute("id") %>" size="95" style="height:25px; margin-left:10px"></td></tr>
						<tr align="center"><td>
						<input class="button" type="submit" name="ok" value="OK" onclick="candidate_()">
						</td></tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>