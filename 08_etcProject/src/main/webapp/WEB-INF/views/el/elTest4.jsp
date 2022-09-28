<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request data</h1>
	<p>${m.name }</p>
	<p>${m.age }</p>
	<p>${m.addr }</p>
	<h1>Session Data</h1>
	<p>${sessionScope.m.name }</p>
	<p>${sessionScope.m.age }</p>
	<p>${sessionScope.m.addr }</p>
</body>
</html>