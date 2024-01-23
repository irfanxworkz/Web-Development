<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="Link.jsp" %>
<title>View User</title>
</head>
<body>
		<h1 class="heading-style">User Details</h1>
		<span class="msg-style-green">${userSaveMsg}</span>
		<span class="msg-style-green">${userSaveMsg1}</span>
		<h1 class="heading-style"> Id : <span class="span-style">${userdata.id}</span></h1>
		<h1 class="heading-style"> Name : <span class="span-style">${userdata.name}</span></h1>
		<h1 class="heading-style"> Password : <span class="span-style">${userdata.password}</span></h1>
		<h1 class="heading-style">	Email : <span class="span-style">${userdata.email}</span></h1>
		<h1 class="heading-style"> Sex : <span class="span-style">${userdata.sex}</span></h1>
		<h1 class="heading-style"> Country : <span class="span-style">${userdata.country}</span></h1>
</body>
</html>