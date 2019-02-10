<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<h3 align="center">Welcome, Enter The User Details</h3>
	<form:form method="POST" action="#" modelAttribute="user">
		<table align="center">
			<tr>
				<td><form:label path="id"></form:label>ID</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="firstName"></form:label>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName"></form:label>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="phoneNumber"></form:label>Mobile Number</td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<td align="right"><input type="submit" value="Submit" /></td>
		</table>
	</form:form>
</body>
</html>