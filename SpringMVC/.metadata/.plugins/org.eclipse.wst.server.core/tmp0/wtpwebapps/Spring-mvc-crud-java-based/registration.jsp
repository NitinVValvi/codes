<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
<style>
h1{
color:red;
}
th{
color:olive;
}
</style>
</head>
<body>
	<h1 align="center">Registration form</h1>
	<form action="reg">
		<table align="center">
			<tr>
				<th>Name</th>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<th>Username</th>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<th>Password</th>
				<td><input type="text" name="password"></td>
			</tr>

			<tr>
				<th>MobileNo.</th>
				<td><input type="text" name="mobno"></td>
			</tr>

			<tr>
				<th>Email</th>
				<td><input type="text" name="email"></td>

			</tr>

			<tr>
				<td align="center"><input type="submit" value="Save"></td>
			<tr>
		</table>

	
	</form>
<a href ="login"></a>
</body>
</html>