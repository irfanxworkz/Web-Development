<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="Link.jsp" %>
<title>Add User</title>
</head>
<body>

	<a href="ViewAllUser.jsp" class="btn btn-danger" style="margin: 20px;">View All Records</a>
	
	<div class="container container-style">
												<h1 class="heading-style">Add New User</h1>
	    <form action="saveUser" method="post" class="row g-3">									
	    <div class="form-group col-md-6">
	        <label class="label-style">Name :</label>
	        	<input type="text" class="form-control form-control-style" name="name" placeholder="Enter name">
	    </div>
	    <div class="form-group col-md-6">
	        <label class="label-style">Password :</label>
	        	<input type="password" class="form-control form-control-style" name="password" placeholder="Enter Password">
	    </div>
	    <div class="form-group col-6">
	        <label class="label-style">Email :</label>
	        	<input type="email" class="form-control form-control-style" name="email" placeholder="Enter Email">
	    </div>
	    <div class="form-group col-md-6">
	        <label class="label-style">Sex :</label>
		        <div class="form-check">
		            <input type="radio" name="sex" value="Male">
		           		<label class="form-check-label" >Male</label>
		        </div>
		        <div class="form-check">
		            <input type="radio" name="sex" value="Female">
		            	<label class="form-check-label" >Female</label>
		        </div>
	    </div>
	    <div class="form-group col-md-6">
	        <label class="label-style">Country :</label>
		        <select class="form-select" name="country">
		            <option value="" selected disabled>Select Country</option>
		            <option value="india">India</option>
		            <option value="usa">USA</option>
		            <option value="china">China</option>
		            <option value="japan">Japan</option>
		        </select>
	    </div> 
	    <div class="form-group col-md-6">
    		<div class="form-check">
		      <input class="form-check-input" type="checkbox">
		      <label class="form-check-label">Check me out</label>
		    </div>
  		</div> 
	    <div class="form-group col -md-6">
	    	<input type="submit" class="btn btn-danger" value="Sign in">
	    </div>
	    </form>	
	</div>
		
</body>
</html>