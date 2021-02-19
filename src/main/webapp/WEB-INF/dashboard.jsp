<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<h1>Welcome!</h1>
	<form method="POST" action="/login">
		<label>Username: <input type="text" name="username"></label>
	    <label>Password: <input type="password" name="password"></label>
	    <button>Login</button>
	</form>
	
	<p><c:out value="${error}"/></p>
</body>
</body>
</html>