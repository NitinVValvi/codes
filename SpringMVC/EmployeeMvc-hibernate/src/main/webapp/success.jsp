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

th {
	color: olive
}
</style>
<script type="text/javascript">
	function addUser() {
		document.fn.action = "registration";
		document.fn.submit();
	}
	function deleteUser() {
		/*   if(confirm('Do you want to delete this User ?')){
		        var url = 'delete/'+id;
		        window.location.href = url;
		        
		    } */
		document.fn.action = "delete";
		document.fn.submit();

	}
	function editUser() {
		document.fn.action = "edit";
		document.fn.submit();
	}
</script>
</head>
<body>

	<div align="center">
		<h1 align="center">All Data</h1>

		<br> <br>
		<form name="fn">
			<table border="1" align="center">

				<th>Sr No</th>
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

					<c:forEach items="${data}" var="user">
						<td><input type="radio" name="id" value="${user.id}"></td>
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
			<table border="2" align="center">
				<tr>
					<td><input type="button" value="EDIT" onclick="editUser()"></td>
					<td><input type="button" value="ADD" onclick="addUser()"></td>

					<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
				
					<!-- <spring:message code="label.Delete"/>
 -->
				</tr>
			</table>



		</form>
	</div>
	<center>
		<h2>
			<a href="find"> Search</a>
		</h2>
	</center>
</body>
</html>