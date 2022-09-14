<%@ page import="ua.foxminded.dynamicweb.DatabaseFacade"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	
	<%
		List<String> nameBooks = (List<String>)request.getAttribute("nameBooks");
		for(String nameBook : nameBooks)
			out.println(nameBook + "<br>");
	%>
	
</body>
</html>