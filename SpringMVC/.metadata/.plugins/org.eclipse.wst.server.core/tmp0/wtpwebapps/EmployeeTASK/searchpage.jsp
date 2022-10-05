<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<style>
h1 {
	color: red
}
</style>
</head>
<body>
<form action="searchresult">

	<div align="center">
		<h1>Search Page</h1>
		<h3>Search Employees</h3>
		<hr>
		<label for="cityname">Search Employee by City</label> <input
			type="text" name="cityname" placeholder="enter city" id="item_name">
		<input type="submit" value="Search">
		<br>
		<br>
		<a href ="list">Employee list</a>
	</div>
	</form>
</body>
</html>