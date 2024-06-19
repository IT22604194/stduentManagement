<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
  <form action="insertstu" method="post">
        Student Id <input type="text" name="studentid"><br>
		Name <input type="text" name="name"><br>
		Email <input type="text" name="email"><br>
		Class Name<input type="text" name="classname"><br>
		Marks<input type="text" name="marks"><br>
		
		
		<input type="submit" name="submit" value="Create Student">
	</form>
  
</body>
</html>