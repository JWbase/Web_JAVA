<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>배열사용방법</h2>
	<p>${numArr[0] }</p>
	<p>${numArr[1] }</p>
	<h2>리스트 사용방법 1</h2>
	<p>${numList[0] }</p>
	<p>${numList[1] }</p>
	<h2>리스트 사용방법 2</h2>
	<p>${memberList[0].name }</p>
	<p>${memberList[0].age }</p>
	<p>${memberList[0].addr }</p>
	<p>${memberList[1].name }</p>
	<p>${memberList[1].age }</p>
	<p>${memberList[1].addr }</p>
</body>
</html>