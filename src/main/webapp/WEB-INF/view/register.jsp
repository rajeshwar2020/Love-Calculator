<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
</head>
<body>
	<h1 align="center">Please register here</h1>
	<form:form action="registrationSuccessful" modelAttribute="regInfo">
	 <div align="center">
		<label>User: </label>
		<form:input path="user"/>
		<br> <br>
		<label>UserName: </label>
		<form:input path="userName"/>
		<br> <br>
		<label>Password: </label>
		<form:password path="password"/>
		<br> <br>
		<label>Country: </label>
		<form:select path="country">
			<form:option value="India"></form:option>
			<form:option value="USA"></form:option>
		</form:select>	
		<br><br>
		<label>Hobbies: </label>
		Cricket<form:checkbox value="circket" path="hobbies"/>
		Programming<form:checkbox value="Programming" path="hobbies"/>
		PubG<form:checkbox value="pubG" path="hobbies"/>
		<br> <br>
		<Label>Gender: </Label>
		Male<form:radiobutton value="Male" path="gender"/>
		Female<form:radiobutton value="Female" path="gender"/>
		<br> <br>
		<input type="submit" value="Register"/>
	 </div>	
	</form:form>
</body>
</html>