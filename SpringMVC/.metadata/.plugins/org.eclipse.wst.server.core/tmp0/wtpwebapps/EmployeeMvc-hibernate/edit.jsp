<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<h1 align="center">Edit Data</h1>
	<form action="update">
		<table align="center">
			<input type="hidden" name="id" value="${data.id }">
			<tr>
				<th>Id</th>
				<td><input type="text" name="id" value="${data.id }"></td>
			</tr>

			<tr>
				<th>Name</th>
				<td><input type="text" name="name" value="${data.name }"></td>
			</tr>
			<tr>
				<th>Username</th>
				<td><input type="text" name="username"
					value="${data.username }"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="text" name="password"
					value="${data.password }"></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input type="text" name="email" value="${data.email }"></td>
			</tr>

			<tr>
				<th>Age</th>
				<td><input type="text" name="age" value="${data.age }"></td>
			</tr>

			<tr>
				<th>MobileNo</th>
				<td><input type="text" name="mobno" value="${data.mobno }"></td>
			</tr>

			<tr>
				<th>City</th>
				<td><input type="text" name="city" value="${data.city }"></td>
			</tr>
			<tr>
			<tr>
				<td align="center"><input type="submit" value="Update"></td>
			<tr>
		</table>


	</form>
</body>
</html>