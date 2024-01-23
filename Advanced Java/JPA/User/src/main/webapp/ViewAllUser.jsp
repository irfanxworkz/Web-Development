<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="Link.jsp" %>
<title>All User Information</title>
</head>
<body>
		<h1 class="heading-style">User List</h1>
		<table class="table table-striped container">
		  <thead class="table-dark">
		    <tr>
		      <th>Id</th>
		      <th>Name</th>
		      <th>Password</th>
		      <th>Email</th>
		      <th>Sex</th>
		      <th>Country</th>
		      <th>Edit</th>
		      <th>Delete</th>
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach var="detail" items="${userdata}"></c:forEach>
		    <tr>
		      	<td>${detail.id}</td>
		      	<td>${detail.name }</td>
		      	<td>${detail.password }</td>
		      	<td>${detail.email }</td>
		      	<td>${detail.sex }</td>
		      	<td>${detail.country }</td>
		      	<td><form action="editUserDetail" method="post">
					<button value="${pud.id}" name="id" class="btn btn-danger" type="submit">Edit</button>
					</form>
				</td>
		      	<td><form action="deleteUserDetail" method="post">
					<button value="${pud.id}" name="id" class="btn btn-danger" type="submit">Delete</button>
					</form>
				</td>
		    </tr>
		  </tbody>
		</table>
</body>
</html>