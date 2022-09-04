<%@page import="ko.or.iei.member.vo.Member"%>
<%@page import="ko.or.iei.member.service.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 1. 인코딩
	request.setCharacterEncoding("utf-8");
    // 2. 값추출
    String memberId = request.getParameter("memberId");
    
    // 3. 비즈니스로직
    MemberService service = new MemberService();
    Member m = service.searchIdMember(memberId);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%if(m==null) {%>
		<h2>회원 정보를 조회할 수 없습니다.</h2>
		<%}else { %>
			<ul>
				<li><%=m.getMemberId() %></li>
				<li><%=m.getMemberName() %></li>
				<li><%=m.getMemberPhone() %></li>
				<li><%=m.getMemberAddr() %></li>
			</ul>
		<%} %>
</body>
</html>