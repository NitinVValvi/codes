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
		<h1>Payment Details</h1>
		<form action="" align="center">
			<table>
				
				<tr>
					<th>PId</th>
					<td><input type="text" name="pid"></td>
				</tr>

				<tr>
					<th>Total Payment</th>
					<td><input type="text" name="totalpayment"></td>
				</tr>

				<tr>
					<th>Payment Date</th>
					<td><input type="text" name="paymentdate"></td>
				</tr>

				<tr>
					<th>Payment Status</th>
					<td><input type="text" name="status"></td>
				</tr>

				<tr>
					<th>Payment Mode</th>
					<td><input type="text" name="paymentmode"></td>
				</tr>


			</table>


		</form>
	
	<br>
	<br>
	<br>
	
		<a href="/product"> Product Details</a>
	</div>
</body>
</html>