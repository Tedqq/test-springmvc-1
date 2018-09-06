<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloWorld</title>
</head>
<body>

	<!-- 
		摸擬修改操作
		1.原始  1 , tom , 123456 , ted@google.com.tw
		2.密碼不能被修改
		3.表單回顯，摸擬操作直接在表單填寫對應的屬性值
	 -->
	 <form action="springmvc/testModelAttribute" method="Post">
	 	<input type="hidden" name="id" value="1">
	 	username:<input type="text" name="username" value="ted">
		<br>
		email:<input type="text" name="email" value="ted_tzeng@settour.com.tw">
		<br>
		age:<input type="text" name="age" value="40">
		<br>
		<input type="submit" value="testModelAttribute">
	 </form>
	 

	<a href="springmvc/testSessionAttributes">testSessionAttributes</a>
	<br><br>

	<a href="springmvc/testSessionAttributes">testSessionAttributes</a>
	<br><br>
	
	
	<a href="springmvc/testMap">testMap</a>
	<br><br>

	<a href="springmvc/testModelAndView">testModelAndView</a>
	<br><br>
	<a href="springmvc/testServletApi">testServletApi</a>
	<br><br>
	<form action="springmvc/testPojo" method="post">
		username:<input type="text" name="username">
		<br>
		password:<input type="password" name="password">
		<br>
		email:<input type="text" name="email">
		<br>
		age:<input type="text" name="age">
		<br>
		city:<input type="text" name="address.city">
		<br>
		age:<input type="text" name="address.province">
		<input type="submit" value="test pojo">
	</form>
	<br><br>
	<a href="springmvc/testCookieValue">testCookieValue</a>
	<br><br>
	<a href="springmvc/testRequestHeader?username=ted&age=11">test request header</a>
	<br><br>
	<a href="springmvc/testRequestParam?username=ted&age=11">test request param</a>
	<br><br>
	<form name="testpost" action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT" /> 
		<input type="submit" value="testRest put">
	</form>

	<br>
	<br>
	<form name="testpost" action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE" /> 
		<input type="submit" value="testRest delete">
	</form>
	<br>
	<br>

	<br>
	<br>
	<form name="testpost" action="springmvc/testRest" method="post">
		<input type="hidden" value="test" /> 
		<input type="submit" value="testRest post">
	</form>
	<br>
	<br>

	<br>
	<br>
	<a href="springmvc/testRest/1">test rest Get</a>
	<br>
	<br>



	<a href="springmvc/testPathVariable/1">test PathVariable</a>
	<br>
	<br>

	<a href="springmvc/testAntPatch/aaa/abc">testAntPatch_aaa_abc</a>
	<br>
	<br>
	<a href="springmvc/testAntPatch/bbb/abc">testAntPatch_bbb_abc</a>


	<br>
	<br>

	<a href="springmvc/testParamsAndHeaders?username=ted&age=20">testParamsAndHeaders</a>

	<br>
	<br>
	<form name="testpost" action="springmvc/testMethod" method="post">
		<input type="test" value="test" /> <input type="submit"
			value="testMethod">
	</form>
	<br>
	<br>
	<a href="springmvc/testMethod">testMethod</a>
	<br>
	<h1>Hello World!! Spring MVC</h1>
	<a href="helloworld">Hello world</a>
	<br>

	<a href="springmvc/testRequestMapping">testRequestMapping</a>

</body>
</html>