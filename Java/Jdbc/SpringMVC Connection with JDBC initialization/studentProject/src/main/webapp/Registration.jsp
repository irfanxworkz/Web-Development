<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link href="Sample.css" rel="stylesheet" type="text/css" >
</head>
<body style='background-color:#d3d3d3;'>

<form action="info" method="post">
<pre>
	Name: <input type="text" name="name">
	
	<label for="qualifi">Choose Qualification:</label>
		<select name="qualification" id="qualification">
 		<option value="B.tech">B.Tech</option>
  		<option value="M.tech">M.tech</option>
  		<option value="MBA">MBA</option>
  		<option value="BCA">BCA</option>
  		</select>
 	Stream: <input type="text" name="stream">
  	Course: <input type="text" name="course">
  	College: <input type="text" name="college">
  	City: <input type="text" name="city">
  	State: <input type="text" name="state">
  	Country: <input type="text" name="country">
  
  		<input type="submit" value="Send">
</pre>	
		
</form>

</body>
</html>