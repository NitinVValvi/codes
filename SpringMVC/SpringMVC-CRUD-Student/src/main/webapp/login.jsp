<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
h1{
color:red;
}
th{
color:brown;
}
a{
color:blue;
}
</style>
</head>
<body>
	<form action="login">
		<h1 align="center">Login Page</h1>
		
		<table align ="center">
		<tr>
			<th>Username</th>
			<td><input type="text" name="username"></td>
		</tr>
		
		<tr>
			<th>Password</th>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
		<th><input type ="submit" value="Login"></th>
		<td><a href="registration">New User ?</a></td>
		</tr>
		</table>
		<h2 align="center">${msg}</h2>
		<!-- Username <input type="text" name="un"><br> Password <input
			type="text" name="pw"><br> <input type="submit"
			value="Login"> <a href="reg">New User</a> -->
	</form>
</body>
</html>