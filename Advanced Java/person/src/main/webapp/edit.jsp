<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Person</title>
</head>
<body>
    <h2>Edit Person</h2>
    <form action="${pageContext.request.contextPath}/persons/edit/${person.id}" method="post">
        <label for="firstName">First Name: </label>
        <input type="text" id="firstName" name="firstName" value="${person.firstName}" required>
        <br>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" value="${person.lastName}" required>
        <br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" value="${person.age}" required>
        <br>
        <input type="submit" value="Update Person">
    </form>
    <a href="${pageContext.request.contextPath}/persons">Back to List</a>
</body>
</html>