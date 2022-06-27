<%@page import="com.sooriya.web.model.Actor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		Actor a = (Actor)request.getAttribute("Actor");
		out.println(a);
	%>
</body>
</html>