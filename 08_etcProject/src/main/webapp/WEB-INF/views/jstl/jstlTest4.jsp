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
	<h1>c:forEach</h1>
	<hr>
	<h3>1. 리스트 순회 반복(forEach문)</h3>
	<table border="1">
		<tr>
			<th>순서</th>
			<th>이름</th>
			<th>나이</th>
			<th>주소</th>
		</tr>
		<%--
			<%for<Member m : memberList) {%>
		 --%>
		<c:forEach items="${memberList }" var="m" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td>${m.name}</td>
				<td>${m.age}</td>
				<td>${m.addr}</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<h3>2. 반복회차 지정하는 반복문</h3>
	<%--
		for(int i=0; i<10; i++)
	 --%>
	 <ul>
	 	<c:forEach begin="0" step="1" end="9" varStatus="i">
	 		<li>${i.count }_반복문</li>
	 	</c:forEach>
	 </ul>
</body>
</html>