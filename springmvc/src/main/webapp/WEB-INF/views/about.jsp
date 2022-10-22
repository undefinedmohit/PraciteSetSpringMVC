<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About pagee....</title>
</head>
<body>
<h1>Hi this is about page......</h1>
<h1>hello......</h1>

<%

	List<String> ss =(List<String>)request.getAttribute("s");

%>

	<%
	for(String s:ss)	{
	
	%>

	
		
		<h1><%= s %></h1>
		<%
	}

		%>

</body>
</html>