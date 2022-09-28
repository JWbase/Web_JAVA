<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.notice-tbl a:hover {
	text-decoration: underline;
}

.notice-tbl tr {
	border-bottom: 1px solid #ccc;
}

.notice-tbl tr>td:nth-child(2) {
	text-align: left;
}

#pageNavi {
	margin: 30px;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp" />

	<div class="page-content">
		<div class="page-title">공지사항</div>

		<c:if test="${not empty sessionScope.m && sessionScope.m.memberLevel eq 1 }">
			<a class="btn bc4 writeBtn" href="/noticeWriteFrm.do">글쓰기</a>
		</c:if>	

		<table class="tbl tbl-hover notice-tbl">
			<tr class="tr-2">
				<th style="width: 10%;">번호</th>
				<th style="width: 45%;">제목</th>
				<th style="width: 15%;">작성자</th>
				<th style="width: 20%;">작성일</th>
				<th style="width: 10%;">조회수</th>
			</tr>
			<c:forEach items="${list }" var="n">
				<tr class="tr-1">
					<td>${n.noticeNo }</td>
					<td><a href="/noticeView.do?noticeNo=${n.noticeNo }">${n.noticeTitle }</a></td>
					<td>${n.noticeWriter }</td>
					<td>${n.regDate }</td>
					<td>${n.readCount }</td>
				</tr>
			</c:forEach>
		</table>
		<div id="pageNavi">${pageNavi }</div>
	</div>
	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
</body>
</html>