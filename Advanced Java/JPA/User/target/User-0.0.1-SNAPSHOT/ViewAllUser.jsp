<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="Link.jsp" %>
<style>
        body {
            background-color: silver;
        }

        .container-style {
            background-color: white;
            border: 2px solid black;
            border-radius: 10px;
            margin-top: 50px;
            
        }

        .heading-style {
        	margin-top: 10px;
            color: red;
            text-align: center;
            font-family: cursive;
        }

        .label-style {
            color: red;
            font-family: cursive;
            font-size: larger;
        }

        .form-control-style {
            margin-bottom: 15px; /* Add some margin between form controls */
        }
    </style>
<title>All User Information</title>
</head>
<body>
		<h1 class="heading-style">User List</h1>
		<table class="table table-striped container">
		  <thead class="table-dark">
		    <tr>
		      <th scope="col">Id</th>
		      <th scope="col">Name</th>
		      <th scope="col">Password</th>
		      <th scope="col">Email</th>
		      <th scope="col">Sex</th>
		      <th scope="col">Country</th>
		      <th scope="col">Edit</th>
		      <th scope="col">Delete</th>
		    </tr>
		  </thead>
		  <tbody>
		  
		    <tr>
		      <th scope="row">1</th>
		      <td>Mark</td>
		      <td>Otto</td>
		      <td>@mdo</td>
		    </tr>
		    <tr>
		      <th scope="row">2</th>
		      <td>Jacob</td>
		      <td>Thornton</td>
		      <td>@fat</td>
		    </tr>
		    <tr>
		      <th scope="row">3</th>
		      <td colspan="2">Larry the Bird</td>
		      <td>@twitter</td>
		    </tr>
		  </tbody>
		</table>
</body>
</html>