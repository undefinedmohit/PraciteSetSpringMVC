<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page.....</title>
</head>
<body>
<h1 style="color: olive;">Your id is: ${user.id}</h1>

<h1 style="color: scarlet">Welcome, ${user.name}</h1>
<h1 style="color: lavender">your email and password are:</h1>
<h2 style="color: maroon;">email: ${user.email }</h2>
<h2>password: ${user.password }</h2>

</body>
</html>