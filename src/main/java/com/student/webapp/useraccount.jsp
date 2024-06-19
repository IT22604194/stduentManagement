<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
</head>
<body>
  <table>
	<c:forEach var="cus" items="${stuDetails}">
	
	<c:set var="id" value="${stu.id}"/>
	<c:set var="name" value="${stu.name}"/>
	<c:set var="email" value="${stu.email}"/>
	<c:set var="classname" value="${stu.classname}"/>
	<c:set var="marks" value="${stu.marks}"/>
	
	
	<tr>
		<td>Student ID</td>
		<td>${stu.id}</td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td>${stu.name}</td>
	</tr>
	<tr>
		<td>Student Email</td>
		<td>${stu.email}</td>
	</tr>
	<tr>
		<td>Class Name</td>
		<td>${stu.classname}</td>
	</tr>
	<tr>
		<td>marks</td>
		<td>${stu.marks}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updatestudent.jsp" var="stuupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="Name" value="${Name}"/>
		<c:param name="Email" value="${Email}"/>
		<c:param name="ClassName" value="${ClassName}"/>
		<c:param name="NIC" value="${NIC}"/>
		<c:param name="Address" value="${Address}"/>
		<c:param name="DOB" value="${DOB}"/>
		<c:param name="Gender" value="${Gender}"/>
		
	</c:url>
	
	<a href="${stuupdate}">
	<input type="button" name="update" value="Update Student Data">
	</a>
	
	<br>
	<c:url value="deletestudent.jsp" var="studelete">
		<c:param name="id" value="${id}"/>
		<c:param name="Name" value="${Name}"/>
		<c:param name="Email" value="${Email}"/>
		<c:param name="ClassName" value="${ClassName}"/>
		<c:param name="NIC" value="${NIC}"/>
		<c:param name="Address" value="${Address}"/>
		<c:param name="DOB" value="${DOB}"/>
		<c:param name="Gender" value="${Gender}"/>
	</c:url>
	<a href="${studelete}">
	<input type="button" name="delete" value="Delete Student Account">
	</a>
	
	
</body>
</html>