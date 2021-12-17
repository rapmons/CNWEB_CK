<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body>

<form action="CheckLoginServlet" method="post" name = "login">
	UserName: <input type="text" name="userName" /><br>
	Password:  <input type="password" name="password" /><br>
	<input type="submit" value="login"/>
	<input type="reset" value="Reset"/>
	
	
</form>
</body>
</html>