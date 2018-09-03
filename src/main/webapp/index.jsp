<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloWorld</title>
</head>
<body>




<a href="springmvc/testPathVariable/1">test PathVariable</a>
<br><br>

<a href="springmvc/testAntPatch/aaa/abc">testAntPatch_aaa_abc</a>
<br><br>
<a href="springmvc/testAntPatch/bbb/abc">testAntPatch_bbb_abc</a>


<br><br>

	<a href="springmvc/testParamsAndHeaders?username=ted&age=20">testParamsAndHeaders</a>

<br><br>
	<form name="testpost" action="springmvc/testMethod" method="post">
		<input type="test" value="test"/>
		<input type="submit" value="testMethod" >
	</form>
<br>
	<a href="springmvc/testMethod">testMethod</a>
<br>
	<h1>Hello World!! Spring MVC</h1>
	<a href="helloworld">Hello world</a>
	<br>
	
	<a href="springmvc/testRequestMapping">testRequestMapping</a>

</body>
</html>