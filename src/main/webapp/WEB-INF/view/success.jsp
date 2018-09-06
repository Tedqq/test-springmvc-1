<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloWorld</title>
</head>
<body>
	<h1>Success ! </h1>
	<a href="helloworld">Hello world</a>
	<br><br>
	names:${requestScope.names}
	
	<br><br>
	
	request user :${requestScope.user}
	<br><br>
	session user :${sessionScope.user}
	
	<br><br>
	request user :${requestScope.school}
	
	<br><br>
	session school :${sessionScope.school}
	
	
</body>
</html>