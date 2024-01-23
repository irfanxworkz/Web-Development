<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
     <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="Saloon.css">
<title>defaultPage</title>
</head>
<header>
	<div class="fixed-header">
		<nav class="navbar navbar-dark bg-secondary justify-content-between">
		<a href="index.jsp" class="btn btn-info">Home</a>
		</nav>
	</div>		
</header>
<body style="background-color: silver;">
	<div class="container">
		
		<form action="save" method="post" style="background-color: white; margin-top: 50px; margin-left: 200px; margin-right: 200px; border: 1px solid black; border-radius: 10px; ">
				<span></span><br>
				<h1 style="color: red; text-align: center;">${msg}</h1>
			<div class="container">
				<b>Name</b>
				<input type="text" name="name" placeholder="Enter Name" class="form-control">
				<b>Date</b>
				<input type="date" name="date" class="form-control">
				<label for="email"><b>Email</b></label>
				<input type="email" name="email" placeholder="Enter Email" class="form-control">
				<label for="num"><b>Number</b></label>
				<input type="number" name="num" placeholder="Enter Mobile Number" class="form-control">
				<br>
				<input type="submit" value="Save" class="btn btn-success"><br>
				<span></span><br>
			</div>		
		</form>
	</div>
</body>
<div class="fixed-footer">
		  <footer class="bg-secondary text-white" style="margin-top: 200px;">
		    <div class="text-center p-3" style="background-color: secondary;">
		      © 2023 Copyright:
		      <a class="text-white" href="https://irfan.xworkz@gmail.com/">irfan.xworkz@gmail.com</a>
		    </div>
		  </footer>
	</div>   
</html>