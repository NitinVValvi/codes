<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
  h1 {color:red;}
  th {color:blue;}
  td {color:green;}
  a {color:green;}
</style>
<center><h1>Registration Form</h1></center>
<body>
	<form action="login">
		<table align="center">
			<tr>
				<th>First Name</th>
				<td><input type = "text" name ="fname" placeholder="Enter your First Name"></td>
			</tr>
			
			<tr>
				<th>Last Name</th>
				<td><input type = "text" name = "lname" placeholder="Enter your Last Name"></td>
			
			</tr>
			
			<tr>
				<th>Email</th>
				<td><input type = "email" email= "email" placeholder="Enter your Email"></td>
			</tr>
			<tr>
				<th>PhoneNo</th>
				<td><input type = "number" phoneno= "phoneno" placeholder="Enter your PhoneNo">
			</tr>
			
			<tr>
				<th>Gender</th>
				<td> <input type ="radio" name= "gender">
				Male <input type="radio" name="gender">
				Female<input type= "radio" name="gender">
				Other
				</td>
			</tr>
			
			<tr>
			<th>Address</th>
			<td><textarea></textarea>
			</tr>
			
			<tr>
				<th>Password</th>
				<td><input type = "password" password= "password" placeholder="Enter your Password"></td>
			</tr>
			
			<tr>
				<th>DOB</th>
				<td><input type= "date" date =""> </td>
			</tr>			
			
			<tr>
				<th>Qualifications</th>
				<td>
					<select>
						<option>Select</option>
						<option>Btech</option>
						<option>Mtech</option>
						<option>B.E</option>
						<option>M.E</option>
					</select>
				</td>
			</tr>
			<tr>
			<th>Hobbies</th>
			<td><legend></legend>
	<input name="checkbox-1a" id="checkbox-1a" type="checkbox"/>
	<label for="checkbox-1a">Reading</label><br>
	<input name="checkbox-1b" id="checkbox-1b" type="checkbox"/>
	<label for="checkbox-1b">Coding</label><br>
	<input name="checkbox-1c" id="checkbox-1c" type="checkbox"/>
	<label for="checkbox-1c">Swimming</label><br>
	<input name="checkbox-1c" id="checkbox-1c" type="checkbox"/>
	<label for="checkbox-1c">Trekking</label><br>
	Other<input type="textarea">
	</td>
			</tr>
			<tr>
				<td colspan="2">
				<center><input type ="submit" value = "Submit">
				<input type = "reset" value = "Reset"><br>
				<a href="login">Login here</a></center>
			</tr>
</table>

</form>
</body>
</html>