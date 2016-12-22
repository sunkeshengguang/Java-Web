<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="JavaScript" type="text/javascript">
	function ps_() {
		document.selectForm.action="adminPersonal.jsp";
		document.selectForm.submit();
	}
	function il_() {
		document.selectForm.action="adminJobList.jsp";
		document.selectForm.submit();
	}
	function ar_() {
		document.selectForm.action="addRecruitment.jsp";
		document.selectForm.submit();
	}
	function cl_() {
		document.selectForm.action="candidateList.jsp";
		//document.selectForm.submit();
	}
	function exit_() {
		document.selectForm.action="userLogin.jsp";
		document.selectForm.submit();
	}
	function ok_() {
		document.addInformation.action="AddRecruitment";
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
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The name of the company:</font></td></tr>
						<tr align="left"><td><input name="companyname" type="text" id="companyname" size="95" style="height:25px; margin-left:10px"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The introduction of the company:</font></td></tr>
						<tr align="left"><td><textarea name="companyintroduction" id="companyintroduction" style="margin-left:10px" rows="20" cols="72"></textarea></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The address of the company:</font></td></tr>
						<tr align="left"><td><input name="companyaddress" type="text" id="companyaddress" size="95" style="height:25px; margin-left:10px"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The contact of the company:</font></td></tr>
						<tr align="left"><td><input name="companycontact" type="text" id="companycontact" size="95" style="height:25px; margin-left:10px"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The name of the job:</font></td></tr>
						<tr align="left"><td><input name="jobname" type="text" id="jobname" size="95" style="height:25px; margin-left:10px"></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The duty of the job:</font></td></tr>
						<tr align="left"><td><textarea name="jobduty" id="jobduty" style="margin-left:10px" rows="5" cols="72"></textarea></td></tr>
						<tr align="left"><td><font style="line-height:30px; margin-left:10px;">The require of the job:</font></td></tr>
						<tr align="left"><td><textarea name="jobrequire" id="jobrequire" style="margin-left:10px" rows="5" cols="72"></textarea></td></tr>
						<tr align="center"><td>
							<input class="button0" type="submit" name="ok" value="OK" onclick="ok_()">
						</td></tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>