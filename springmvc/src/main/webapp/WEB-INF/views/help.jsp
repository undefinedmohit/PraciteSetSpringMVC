<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>

</head>
<body>
<h1>this is help page broo.....</h1>

<%
	/* String n=(String)request.getAttribute("name");
	Integer r=(Integer)request.getAttribute("id");
	LocalDateTime d =(LocalDateTime)request.getAttribute("d"); */

%>

<h1>Hi my name is: ${name} <%-- <%=n %> --%></h1>
<h1>roll number is: ${id} <%-- <%=r %> --%></h1>
<h1><%-- <%=d %> --%>${d}</h1>

<c:forEach var="i" items="${q}">

<h1>${i}</h1>

</c:forEach>


</body>
</html>