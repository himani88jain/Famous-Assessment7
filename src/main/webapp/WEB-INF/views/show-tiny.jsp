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
<div>
	<a href="/complete">Complete List</a>
	<center><h1>Tiny list</h1></center>
	<table class="table">
		<tr>
			<th>Name</th>
			<th>Invention</th>
			<th>Year<th>
		</tr>
	<c:forEach var="tiny" items="${tiny}">
		<tr>
		<td>${tiny.name}</td>
		<td>${tiny.invented}</td>
		<td>${tiny.year}</td>
		</tr>
		</c:forEach>
		</table>
</div>		
</body>
</html>