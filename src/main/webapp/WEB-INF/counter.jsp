<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/count.js"></script>
<meta charset="UTF-8">
<title>Current Count Visit!</title>
</head>
<body>
	<h3>You have visited <a href="http://localhost:8080">http://localhost:8080</a> <c:out value="${count}"/> times.</h3>
	<a href="http://localhost:8080">Test another visit?</a>
</body>
</html>