<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Base64" %>
    <%@page import="dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%User user=(User) request.getSession().getAttribute("user"); %>
<%String username=user.getUsername(); %>

<h1>Welcome <%= username %></h1>
<h3>Email : <%= user.getUseremail() %></h3>

<% String image=new String(Base64.getEncoder().encode(user.getUserimage())); %>
<img alt="" src="data:image/jpeg;base64,<%= image %> " width="200" height="300">

</body>
</html>