<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing.com</title>
<style>
h1 {
	color: red
}

th {
	color: olive
}
</style>
</head>
<body>


	<div align="center">
		<h1>Product Details</h1>
		<form action="store" align="center">
			<table>

				<tr>
					<th>ProductName</th>
					<td><input type="text" name="pname"></td>
				</tr>

				<tr>
					<th>Product Discount</th>
					<td><input type="text" name="pdiscount"></td>
				</tr>

				<tr>
					<th>Price</th>
					<td><input type="text" name="price"></td>
				</tr>

				<tr>
					<th>PId</th>
					<td><select>
							<option>1</option>
							<option>2</option>
							<option>3</option>
					</select></td>
				</tr>



			</table>


		</form>
	</div>
	<br>
	<br>
	<br>
	<div align="center">
		<a href="payment"> Payment Details</a>
	</div>
</body>
</html>