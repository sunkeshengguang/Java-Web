<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="myTags" uri="message"%>
<%@ page import="java.util.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Recruitment System</title>
</head>
<body>
<body bgcolor="#EEEEEE">
<p align="center">
<%-- <myTags:errorMessage error_message="${message}"/> --%>
<br><br><br><br><br><br><br><br>
&nbsp;&nbsp;&nbsp;
<myTags:errorMessage error_message="${message}"/></p>
<center>&nbsp;&nbsp;&nbsp;
<a href="javascript:history.back();"> &lt;&lt;Back</a></center>
</body>
</html>
<center><%@ include file="footer.jsp" %> 