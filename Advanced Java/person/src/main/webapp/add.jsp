<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Person</title>
</head>
<body>
    <h2>Add Person</h2>
    <form action="${pageContext.request.contextPath}/persons/add" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>
        <br>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>
        <br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
        <br>
        <input type="submit" value="Add Person">
    </form>
    <a href="${pageContext.request.contextPath}/persons">Back to List</a>
</body>
</html>