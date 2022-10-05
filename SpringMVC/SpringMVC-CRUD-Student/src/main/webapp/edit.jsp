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
	<h1 align="center">Edit Data</h1>
	<form action="update">
		<table align="center">
		<input type= "hidden" name="id" value="${data.id }">
		
			<tr>
				<th>Name</th>
				<td><input type="text" name="name" value ="${data.name }"></td>
			</tr>
			
			<tr>
				<th>Username</th>
				<td><input type="text" name="username" value ="${data.username }"></td>
			</tr>

			<tr>
				<th>Password</th>
				<td><input type="text" name="password" value ="${data.password }"></td>
			</tr>

			<tr>
				<th>MobileNo.</th>
				<td><input type="text" name="mobno" value ="${data.mobno }"></td>
			</tr>

			<tr>
				<th>Email</th>
				<td><input type="text" name="email" value ="${data.email }"></td>

			</tr>

			<tr>
				<td align="center"><input type="submit" value="Update"></td>
			<tr>
		</table>

	
	</form>
</body>
</html>