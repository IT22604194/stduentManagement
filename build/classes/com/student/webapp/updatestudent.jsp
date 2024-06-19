<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
      table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 1px solid black;
		}
	</style>
</head>
<body>
  <%
		String id = request.getParameter("id");
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String ClassName = request.getParameter("ClassName");
		String NIC= request.getParameter("NIC");
		String Address= request.getParameter("Address");
		String DOB= request.getParameter("DOB");
		String Gender= request.getParameter("Gender");
	%>
	
	
	<form action="updatestu" method="post">
	<table>
		<tr>
			<td>Student ID</td>
			<td><input type="text" name="id" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="Name" value="<%= Name %>"></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="Email" value="<%= Email %>"></td>
	</tr>
	<tr>
		<td>Class Name</td>
		<td><input type="text" name="ClassName" value="<%= ClassName %>"></td>
	</tr>
	<tr>
		<td>NIC</td>
		<td><input type="text" name="NIC" value="<%= NIC %>"></td>
	</tr>
	
	<tr>
		<td>Address</td>
		<td><input type="text" name="Address" value="<%= Address %>"></td>
	</tr>
	
	<tr>
		<td>DOB</td>
		<td><input type="text" name="DOB" value="<%=DOB %>"></td>
	</tr>
	
	<tr>
		<td>Gender</td>
		<td><input type="text" name="Gender" value="<%= Gender %>"></td>
	</tr>
	
	
			
	</table>
	<br>
	<input type="submit" name="submit" value="Update My Data">
	</form>
  
</body>
</html>