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
					<td><input type="file" name="imageFile"
						accept=".jpg,.png,.jpeg" onchange="loadImg(this);"></td>
				</tr>
				<tr class="tr-1">
					<th class="td-2">이미지 미리보기</th>
					<td colspan="3">
						<div id="img-viewer">
							<img id="img-view" width="500px">
						</div>
					</td>
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
	<script>
		function loadImg(f) {
			// 첨부파일이 여러개 일 수 있으므로 항상 배열처리
			if (f.files.length != 0 && f.files[0] != 0) {
				const reader = new FileReader(); // 파일정보를 읽어올 수 있는 객체
				reader.readAsDataURL(f.files[0]); // 선택한 파일 정보 읽어옴
				// 파일리더가 파일을 다 읽어오면 동작할 함수 작성
				reader.onload = function(e) {
					$("#img-view").attr("src",e.target.result);
				}
			} else {
				$("#img-view").attr("src","");
			}
		}
	</script>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>