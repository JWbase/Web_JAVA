<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%@include file="/WEB-INF/views/common/header.jsp"%> --%>
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>
	<h1>index페이지</h1>
	<h3>
		<a href="/test1.do">서블릿호출1</a>
	</h3>
	<h3>
		<a href="/test2.do">서블릿호출2</a>
	</h3>
	<hr>
	<h3><a href="/jspForward.do?name=이정우">jsp:forward</a></h3>
	<hr>
	<h2>EL(Expression Language)</h2>
	<h3><a href="/elTest1.do">1. EL Test1(기본변수)</a></h3>
	<h3><a href="/elTest2.do">1. EL Test2(VO)</a></h3>
	<h3><a href="/elTest3.do">1. EL Test3(list,array)</a></h3>
	<h3><a href="/elTest4.do">1. EL Test4(내장객체)</a></h3>
	<h3><a href="/elTest5.do">1. EL Test5(연산)</a></h3>
	<hr>
	<h2>JSTL(JSP Standard Tag Library)</h2>
	<h3><a href="/jstlTest1.do">1. JSTL 기본사용법</a></h3>
	<h3><a href="/jstlTest2.do">2. JSTL if</a></h3>
	<h3><a href="/jstlTest3.do">3. JSTL choose</a></h3>
	<h3><a href="/jstlTest4.do">3. JSTL forEach</a></h3>
</body>
</html>