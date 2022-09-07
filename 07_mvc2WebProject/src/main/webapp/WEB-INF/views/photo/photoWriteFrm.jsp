<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.photoWrite td, .photoWrite th {
	border: 1px solid #eee;
}
</style>
<body>
	<%@include file="/WEB-INF/views/common/header.jsp"%>
	<div class="page-content">
		<div class="page-title">사진게시판 작성</div>
		<form action="/photoWrite.do" method="post"
			enctype="multipart/form-data">
			<table class="tbl photoWrite">
				<tr class="tr-1">
					<th class="td-2">제목</th>
					<td colspan="3"><input type="text" name="photoTitle"
						class="input-form"></td>
				</tr>
				<tr class="tr-1">
					<th class="td-2">작성자</th>
					<td><%=m.getMemberId()%> <input type="hidden"
						name="photoWriter" value="<%=m.getMemberId()%>"></td>
					<th class="td-2">이미지</th>
					<td><input type="file" name="imageFile"></td>
				</tr>
				<tr class="tr-1">
					<th class="td-2">내용</th>
					<td colspan="3"><textarea name="photoContent"
							class="input-form"></textarea></td>
				</tr>
				<tr class="tr-1">
					<th colspan="4">
						<button type="submit" class="btn bc22 bs4">등록</button>
					</th>
				</tr>
			</table>
		</form>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>