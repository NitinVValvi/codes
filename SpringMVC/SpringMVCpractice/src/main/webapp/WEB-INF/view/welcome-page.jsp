<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	h1{
	color:red;
	}
	label
	{
	color:brown;
	}
</style>
</head>
<body>
	<form action="processorder">
		<div align="center">
			<h1 align="center">House Of Cafe</h1>
			<hr>
			<label for="item_name">Item Name : </label> <input type="text"
				name="foodtype" placeholder="food type ?" id="item_name"> <input
				type="submit" value="order now">
		</div>
	</form>
</body>
</html>