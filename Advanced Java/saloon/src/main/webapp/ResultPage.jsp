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
			
			<h1 style="color: blue; text-align: center;">${savedata}</h1>
			<pre>
			<b style="color: red;">Name :</b><span style="color: green;">${saloonDto.name }</span> 
		 	<b style="color: red;">Date :</b><span style="color: green;">${saloonDto.date }</span>
			<b style="color: red;">Email :</b><span style="color: green;">${saloonDto.email }</span>
			<b style="color: red;">Number :</b><span style="color: green;">${saloonDto.num }</span>
			</pre>
</div>
</body>
<div class="fixed-footer">
		  <footer class="bg-secondary text-white" style="margin-top: 400px;">
		    <div class="text-center p-3" style="background-color: secondary;">
		      © 2023 Copyright:
		      <a class="text-white" href="https://irfan.xworkz@gmail.com/">irfan.xworkz@gmail.com</a>
		    </div>
		  </footer>
	</div>   
</html>