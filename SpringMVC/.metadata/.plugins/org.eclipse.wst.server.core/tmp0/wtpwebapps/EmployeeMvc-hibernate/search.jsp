<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<style>
h1 {
	color: red
}

h2 {
	color: blue
}

th {
	color: olive
}
</style>

</head>
<body>
	<div align="center">
		<h1 align="center">Search</h1>
		<form action="search">
			<input type="text" name="city" placeholder="Enter City Name">
			<input type="submit" value="Search">

		</form>

		<br> <br>

		<table border="1" align="center">

			<th>ID</th>
			<th>Name</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Email</th>
			<th>Age</th>
			<th>Mobile No</th>
			<th>City</th>
			</b>
			<tr>

				<c:forEach items="${li}" var="user">

					<td>${user.id }</td>
					<td>${user.name }</td>
					<td>${user.username }</td>
					<td>${user.password}</td>
					<td>${user.email }</td>
					<td>${user.age }</td>
					<td>${user.mobno }</td>
					<td>${user.city }</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	<h2 align="center">${msg}</h2>
</body>
</html>