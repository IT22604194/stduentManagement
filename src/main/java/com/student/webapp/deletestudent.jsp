<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String classname = request.getParameter("classname");
		String marks = request.getParameter("marks");
		
	%>

	<h1>Student Account Delete</h1>

	<form action="deletestu" method="post">
	<table>
		<tr>
			<td>Student ID</td>
			<td><input type="text" name="stuid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>" readonly></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="<%= email %>" readonly></td>
	</tr>
	<tr>
		<td>Class Name</td>
		<td><input type="text" name="classname" value="<%= classname %>" readonly></td>
	</tr>
	<tr>
		<td>Marks</td>
		<td><input type="text" name="marks" value="<%= marks%>" readonly></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Delete My Account">
	</form>
  
</body>
</html>