<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>List of books</h1>

	<form action="MyServlet" method="POST">
		<input type="hidden" name="command" value="addBook">
		Add new book<br>
		Name of book:<input type="text" name="nameBook"><br>
		<input type="submit" name="submit" value="Add"><br>
		<br>
	</form>
	
	<form action="MyServlet" method="POST">
		<input type="hidden" name="command" value="removeBook">
		Remove book<br>
		Name of book:<input type="text" name="nameBook"><br>
		<input type="submit" name="submit" value="Remove"><br>
		<br>
	</form>
	
	<c:forEach var="nameBooks" items="${nameBooks}">
		<c:out value="${nameBooks}"/>
		<br>
	</c:forEach>
	
</body>
</html>