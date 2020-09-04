<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

</head>
<body>
<body>
<div>
	<a href="/">Tiny List</a>
	<center><h1>Complete list</h1></center>
	<table class="table">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Innovation</th>
			<th>Year<th>
		</tr>
	<c:forEach var="comp" items="${complete}">
		<tr>
		<td>${comp.firstName}hello</td>
		<td>${comp.lastName}</td>
		<td>${comp.innovation}</td>
		<td>${comp.year}</td>
		</tr>
		</c:forEach>
		</table>
</div>		
</body>
</html>