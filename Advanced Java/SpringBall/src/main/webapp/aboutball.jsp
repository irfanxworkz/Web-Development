<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<ul class="nav">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Active</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="index">Index</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Link</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
  </li>
</ul>
<h3>${text}</h3>
<form action="mallu" method="post">

<div>
<label>Brand</label>
<input type="text" name="brand">
</div>

<div>
<label>Name</label>
<input type="text" name="name">
</div>

<div>
<label>Color</label>
<input type="text" name="color">
</div>

<div>
<label>price</label>
<input type="number" name="price">
</div>

<div>
<label>Diameter</label>
<input type="text" name="diameter">
</div>

<input type="submit" value="save">


</form>



</body>
</html>