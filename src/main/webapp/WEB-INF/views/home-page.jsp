<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h3>List Car</h3>
	<ul>
		<c:forEach var="car" items="${cars}">
			<li>${car.name} <a href="show-form-update/${car.id}">Update</a> <a href="delete/${car.id}">Delete</a></li>
		</c:forEach>
	</ul>
	<br><br>
	<a href="show-form-insert">Insert Car</a>
</body>
</html>