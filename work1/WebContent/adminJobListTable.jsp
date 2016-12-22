 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.controller.*,com.dao.*, java.util.*, com.model.*,com.dao.impl.*" %>
<%
	CompanyDao companyDao = new CompanyDaoImp();
	List<Company> list = new ArrayList<Company>();
	list = companyDao.queryAllCompany();
%>
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

	function modify_() {
		document.selectForm.action="addRecruitment.jsp";
		document.selectForm.submit();
	}
	function delete_(id) {
		window.location.href="DeleteRecruitment?id="+id;
		
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Recruitment System</title>
<link rel="stylesheet" type="text/css" href="css/job.css" />
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
				<form name="infoList" method="POST">
					<table width="600px" border="1">
						<tr>
							<th><font style="line-height:30px">Company</font></th>
							<th><font style="line-height:30px">Position</font></th>
							<th><font style="line-height:30px">Operation</font></th>
						</tr>
						<%for(Company company: list) { %>
						<tr>
							<td><%=company.getCompanyName() %></td>
							<td><%=company.getJobName() %></td> 
							<%-- <td>${company.companyName}</td>
							<td>${company.jobName}</td> --%>
							<td>
							<!-- 	<input class="button0" type="submit" name="detail" value="Detail" onclick="">
								<input class="button0" type="submit" name="modity" value="Modify" onclick="modify_()">
 -->								<!-- <input class="button0" type="submit" name="delete" value="Delete"  onclick="delete_()"> -->
				
								<a href="javascript:modify_()">Modify</a>
								<a href="javascript:delete_('<%=company.getCompanyId()%>')">Delete</a>
							</td>
						</tr>
						<%} %>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html> 