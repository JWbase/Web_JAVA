<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int totalCount = (Integer) request.getAttribute("totalCount");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/views/common/header.jsp"%>
	<div class="page-content">
		<div class="page-title">
			사진게시판<%=totalCount%></div>
		<%
		if (m != null) {
		%>
		<a href="/photoWriteFrm.do" class="btn bc4">글쓰기</a>
		<%
		}
		%>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>