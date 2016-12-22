<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.controller.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="JavaScript" type="text/javascript">
	function ok_() {
		document.registerForm.action="Register.do";
	
	}
	function cancel_() {
		document.registerForm.action="userLogin.jsp";
		document.registerForm.submit();
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Recruitment System</title>
<link rel="stylesheet" type="text/css" href="css/register.css" />
</head>
<body>
	<div class="wrapper">
		<div class="header">
		</div>
		<form name="registerForm" method="POST">
			<table width="930px">
				<tr height="40px">
					<td colspan="2">
						<font style="align:center; font-size:20px; line-height:30px; "><strong>Register!</strong></font>
					</td>
				</tr>
				<tr>
					<td width="330px" align="right"><font style="line-height:30px;">USERNAME</font></td>
					<td align="left"><input name="username" type="text" id="username" size="45" style="height:25px; margin-left:10px"></td>
				</tr>
				<tr>
					<td width="330px" align="right"><font style="line-height:30px;">PASSWORD</font></td>
					<td align="left"><input name="password" type="password" id="password" size="45" style="height:25px; margin-left:10px"></td>
				</tr>
				<tr>
					<td width="330px" align="right"><font style="line-height:30px;">NAME</font></td>
					<td align="left"><input name="name" type="text" id="name" size="45" style="height:25px; margin-left:10px"></td>
				</tr>
				<tr height="40px">
					<td colspan="2">
						<input class="button" type="submit" name="ok" value="OK" onclick="ok_()">
						<input class="button" type="submit" name="cancel" value="Cancel" onclick="cancel_()">
					</td>
				</tr>
			</table>
		</form>
		
	</div>
</body>
</html>
<%@include file="footer.jsp" %>