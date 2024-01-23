<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Person Details</title>
</head>
<body>
    <h2>Person Details</h2>
    <p>ID: ${person.id}</p>
    <p>First Name: ${person.firstName}</p>
    <p>Last Name: ${person.lastName}</p>
    <p>Age: ${person.age}</p>
    <a href="${pageContext.request.contextPath}/persons">Back to List</a>
</body>
</html>