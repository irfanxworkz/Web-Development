<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All details display</title>
<link href="Sample.css" rel="stylesheet" type="text/css" >
</head>
<body style='background-color:#d3d3d3;'>
<form action="index.jsp">
<pre>	
	Name: ${StudentName }
	Qualification: ${StudentQualification }
	Stream: ${StudentStream }
	Course: ${StudentCourse }
	College: ${StudentCollege }
	City: ${StudentCity }
	State: ${StudentState }
	Country: ${StudentCountry }
</pre>
<input type="submit" value="send">
</form>
</body>
</html>