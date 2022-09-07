<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입양식</h1>
	<hr>
	<form action="/jsp/join.jsp" method="post">
	<fieldset>
		<legend>회원정보입력</legend>
		<label for="memberId">아이디</label>
		<input type="text" name="memberId" id="memberId"><br>
		<label for="memberPw">비밀번호</label>
		<input type="password" name="memberPw" id="memberPw"><br>
		<label for="memberName">이름</label>
		<input type="text" name="memberName" id="memberName"><br>
		<label for="memberPhone">전화번호</label>
		<input type="text" name="memberPhone" id="memberPhone" placeholder="010-0000-0000"><br>
		<label for="memberAddr">주소</label>
		<input type="text" name="memberAddr" id="memberAddr"><br>
		<input type="submit" value="회원가입">
	</fieldset>
	<a href="/">메인페이지로 돌아가기</a>
	</form>
</body>
</html>