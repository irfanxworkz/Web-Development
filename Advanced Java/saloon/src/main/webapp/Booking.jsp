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
<title>defaultPage</title>
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
		<form action="ticket" method="post" style="background-color: white; margin-top: 50px; margin-left: 200px; margin-right: 200px; border: 1px solid black; border-radius: 10px; ">
				<span></span><br>
				<h1 style="color: red; text-align: center;">Ticket Booking Form</h1>
			<div class="container">
				<b>Name</b>
				<input type="text" name="name" placeholder="Enter Name" class="form-control">
				<label for="email"><b>Email</b></label>
				<input type="email" name="email" placeholder="Enter Email" class="form-control">
				<label for="mobile"><b>Mobile</b></label>
				<input type="number" name="mobile" placeholder="Enter Mobile Number" class="form-control">
				<label for="destination"><b>Destination</b></label>
				<select class="form-control" name="destination">
				  <option selected >Select Destination</option>
				  <option value="mumbai">Mumbai</option>
				  <option value="delhi">Delhi</option>
				  <option value="agra">Aagra</option>
				  <option value="bengaluru">Bengaluru</option>
				</select>
				<label for="source"><b>Source</b></label>
				<select class="form-control" name="source">
				  <option selected >Select Source</option>
				  <option value="irctc">IRCTC</option>
				  <option value="2">PAYTM</option>
				  <option value="google">GooglePay</option>
				  <option value="phonepay">PhonePay</option>
				</select>
				<label for="destination"><b>Total Ticket</b></label>
				<select class="form-control" name="ticket">
				  <option selected >Select Ticket</option>
				  <option value="1">One</option>
				  <option value="2">Two</option>
				  <option value="3">Three</option>
				  <option value="4">four</option>
				  <option value="5">five</option>
				  <option value="6">six</option>
				  <option value="7">seven</option>
				  <option value="8">Eight</option>
				  <option value="9">Nine</option>
				  <option value="10">Ten</option>
				</select>
				<br>
				<input type="submit" value="Save" class="btn btn-success"><br>
				<span></span><br>
			</div>		
		</form>
	</div>
</body>
</html>