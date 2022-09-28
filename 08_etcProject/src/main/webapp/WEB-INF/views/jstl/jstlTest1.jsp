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
	<h1>JSTL 기본문법</h1>
	<h3>1. 변수선언(기본변수 선언으로 해당 페이지에서만 사용가능)</h3>
	<%--
	<%
		int num = 10;
	%>
	 --%>
	<c:set var="newVar1" value="1" />
	<c:set var="newVar2" value="안녕하세요" />
	<p>request : ${requestScope.newVar1 }</p>
	<p>session : ${sessionScope.newVar1 }</p>
	<p>page : ${pageScope.newVar1 }</p>
	<p>page : ${pageScope.newVar2 }</p>
	<p>영역생략 : ${newVar1 }</p>
	<h3>2. 변수선언(범위 지정)</h3>
	<c:set var="num1" value="10" scope="request" />
	<c:set var="num1" value="100" scope="session" />
	<p>request : ${num1 }</p>
	<p>session : ${sessionScope.num1 }</p>
	<h3>3. 변수 삭제</h3>
	<c:remove var="num1" scope="session" />
	<p>request : ${num1 }</p>
	<p>session : ${sessionScope.num1 }</p>
	<h3>4. core를 이용한 출력</h3>
	<p>EL : ${num1 }</p>
	<p>
		core :
		<c:out value="${num1 }" />
	</p>
	<p>EL : ${sessionScope.num1 }</p>
	<p>
		core :
		<c:out value="${sessionScope.num1 }" default="없음" />
	</p>
	<c:set var="test" value="<b>진한글씨</b>" />
	<p>EL : ${pageScope.test }</p>
	<p>core1 : <c:out value="${pageScope.test }" escapeXml="true"/></p>
	<p>core2 : <c:out value="${pageScope.test }" escapeXml="false"/></p>
</body>
</html>