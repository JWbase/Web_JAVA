<%@page import="ko.or.iei.member.service.MemberService"%>
<%@page import="ko.or.iei.member.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 1.인코딩
request.setCharacterEncoding("utf-8");
// 2. 값추출
Member m = new Member();
m.setMemberId(request.getParameter("memberId"));
m.setMemberPw(request.getParameter("memberPw"));
m.setMemberName(request.getParameter("memberName"));
m.setMemberPhone(request.getParameter("memberPhone"));
m.setMemberAddr(request.getParameter("memberAddr"));
// 3. 비즈니스로직
MemberService service = new MemberService();
int result = service.insertMember(m);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 결과</h1>
	<% if (result > 0) {%>
			<h3>회원가입 성공</h3>
		<% } else { %>
				<h3>회원가입 실패</h3>
				<a href='/'>메인페이지로 이동</a>
		<% } %>
</body>
</html>