<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Insert</title>
</head>
<body>
	<form:form modelAttribute="car" method="post" action="/VuTienDuc_DecuaKhanh/insert">
		<label>Name</label>
		<form:input path="name"/>
		<label>Price</label>
		<form:input path="price"/>
		<label>Year</label>
		<form:input path="year"/>
		<label>Manufacturer</label>
		<form:input path="manufacturer"/>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>