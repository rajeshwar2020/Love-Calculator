<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love-calculator</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get" modelAttribute="referenceForView">
	<div align="center">
	<p>
		<label for="yn">Your Name: </label>
		<form:input id="yn" path="userName"></form:input>
	</p>
	<p>
		<label for="cn">Crush Name: </label>
		<form:input id="cn" path="crushName"></form:input>
	</p>	
	
	<input type="submit" value="Calculate" >
	</div>
	</form:form>
</body>
</html>