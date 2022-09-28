<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>c:choose</h1>
	<hr>
	<c:choose>
		<c:when test="${num%5 eq 0}">
			<h1>5의 배수입니다.</h1>
		</c:when>
		<c:when test="${num%3 eq 0}">
			<h1>3의 배수입니다.</h1>
		</c:when>
		<c:when test="${num%4 eq 0}">
			<h1>4의 배수입니다.</h1>
		</c:when>
		<c:otherwise>
			<h1>5의 배수가 아닙니다.</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>