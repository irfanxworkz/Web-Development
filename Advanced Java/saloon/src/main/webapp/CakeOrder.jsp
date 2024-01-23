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
</head>
<title>cake Order</title>
</head>
<header>
	<div class="fixed-header">
		<nav class="navbar navbar-dark bg-secondary justify-content-between">
			<form action="click" method="post">
			<input type="submit" value="Click" class="btn btn-info">
			</form>
		</nav>
	</div>		
</header>
<body style="background-color: silver;">
	<div class="container">	
		<form action="cake" method="post" style="background-color: white; margin-top: 50px; margin-left: 200px; margin-right: 200px; border: 1px solid black; border-radius: 10px; ">
				<span></span><br>
				<h1 style="color: red; text-align: center;">Cake Order</h1>
			<div class="container">
				<b>Name</b>
				<input type="text" name="name" placeholder="Enter Name" class="form-control">
				<label for="email"><b>Email</b></label>
				<input type="email" name="email" placeholder="Enter Email" class="form-control">
				<label for="price"><b>Price</b></label>
				<input type="number" name="price" placeholder="Enter Price" class="form-control">
				<label for="flavour"><b>Flavour</b></label>
				<select class="form-control" name="flavour">
				  <option selected >Select Flavour</option>
				  <option value="mumbai">Mumbai</option>
				  <option value="delhi">Delhi</option>
				  <option value="agra">Aagra</option>
				  <option value="bengaluru">Bengaluru</option>
				</select>
				<label for="weight"><b>Weight</b></label>
				<select class="form-control" name="weight">
				  <option selected >Select Weight</option>
				  <option value="0.5">Half Kg</option>
				  <option value="1">One Kg</option>
				  <option value="2">Two Kg</option>
				  <option value="3">Three Kg</option>
				</select>
				<div class="form-group">
				<label><b>TakeAway</b></label>
				<input type="radio" name="takeAway" value="True" >Yes
				<input type="radio" name="takeAway" value="False" >No
				</div>
				<br>
				<input type="submit" value="Save" class="btn btn-success"><br>
				<span></span><br>
			</div>		
		</form>
	</div>
</body>