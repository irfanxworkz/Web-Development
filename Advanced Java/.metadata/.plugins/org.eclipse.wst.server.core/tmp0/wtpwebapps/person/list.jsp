<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Persons List</title>
</head>
<body>
    <h2>Persons List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="person" items="${persons}">
                <tr>
                    <td>${person.id}</td>
                    <td>${person.firstName}</td>
                    <td>${person.lastName}</td>
                    <td>${person.age}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/persons/${person.id}">View</a>
                        <a href="${pageContext.request.contextPath}/persons/edit/${person.id}">Edit</a>
                        <a href="${pageContext.request.contextPath}/persons/delete/${person.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/persons/add">Add Person</a>
</body>
</html>