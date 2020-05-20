<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	<h1>Your registration is completed.</h1>
	<h3>Details entered by you are: </h3>
	Name: ${registrationInfoObj.user}
	<br>
	UserName: ${registrationInfoObj.userName}
	<br>
	Password: ${registrationInfoObj.password}
	<br>
	Country: ${registrationInfoObj.country}
</body>
</html>