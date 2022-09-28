<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#noticeView th, #noticeView td {
	border: 1px solid #eee;
}

#noticeContent {
	min-height: 300px;
	text-align: left;
	font-family: ns-light;
}

.inputCommentBox {
	margin: 50px
}

.inputCommentBox>form>ul {
	list-style-type: none;
	display: flex;
}

.inputCommentBox>form>ul>li:first-child {
	width: 15%;
	display: flex;
	justify-content: center;
	align-items: center;
}

.inputCommentBox>form>ul>li:first-child>span {
	font-size: 80px;
	color: #ccc;
}

.inputCommentBox>form>ul>li:nth-child(2) {
	width: 75%;
}

.inputCommentBox>form>ul>li:nth-child(2)>textarea.input-form {
	height: 96px;
	min-height: 96px;
}

.inputCommentBox>form>ul>li:last-child {
	width: 10%;
}

.inputRecommentBox {
	margin: 30px 0px;
	display: none;
}

.inputRecommentBox>form>ul {
	list-style-type: none;
	display: flex;
}

.inputRecommentBox>form>ul>li:first-child {
	width: 15%;
	display: flex;
	justify-content: center;
	align-items: center;
}

.inputRecommentBox>form>ul>li:first-child>span {
	font-size: 50px;
	color: #ccc;
}

.inputRecommentBox>form>ul>li:nth-last-child(2) {
	width: 75%;
}

.inputRecommentBox>form>ul>li:nth-last-child(2)>textarea.input-form {
	height: 96px;
	min-height: 96px;
}

.inputRecommentBox>form>ul>li:last-child {
	width: 10%;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	<div class="page-content">
		<div class="page-title">공지사항</div>
		<table class="tbl" id="noticeView">
			<tr class="tr-3">
				<th colspan="6">${n.noticeTitle }</th>
			</tr>
			<tr class="tr-1">
				<th class="td-3">작성자</th>
				<td>${n.noticeWriter }</td>
				<th class="td-3">조회수</th>
				<td>${n.readCount }</td>
				<th class="td-3">작성일</th>
				<td>${n.regDate }</td>
			</tr>
			<tr class="tr-1">
				<th class="td-3">첨부파일</th>
				<td colspan="5"><c:if test="${not empty n.filename }">
						<img src="/img/file.png" width="16px">
						<a href="/noticeFileDown.do?noticeNo=${n.noticeNo }">${n.filename }</a>
					</c:if></td>
			</tr>
			<tr>
				<td colspan="6">
					<div id="noticeContent">${n.noticeContentBr }</div>
				</td>
			</tr>
			<c:if
				test="${not empty m && n.noticeWriter eq sessionScope.m.memberId }">
				<tr class="tr-1">
					<th colspan="6"><a class="btn bc44"
						href="/noticeUpdateFrm.do?noticeNo=${n.noticeNo }">수정</a>
						<button class="btn bc44" onclick="noticeDelete(${n.noticeNo});">삭제</button></th>
				</tr>
			</c:if>
		</table>
		<c:if test="${not empty m }">
			<div class="inputCommentBox">
				<form action="/insertComment.do" method="post">
					<ul>
						<li><span class="material-icons">account_box</span></li>
						<li><input type="hidden" name="ncWriter"
							value="${sessionScope.m.memberId }"> <input type="hidden"
							name="noticeRef" value="${n.noticeNo }"> <input
							type="hidden" name="ncRef" value="0"> <textarea
								class="input-form" name="ncContent"></textarea></li>
						<li>
							<button type="submit" class="btn bc1 bs4">등록</button>
						</li>
					</ul>
				</form>
			</div>
		</c:if>
		<div class="commentBox">
			<c:forEach items="${commentList }" var="nc">
				<ul class="posting-comment">
					<li><span class="material-icons">account_box</span></li>
					<li>
						<p class="comment-info">
							<span>${nc.ncWriter }</span> <span>${nc.ncDate }</span>
						</p>
						<p class="comment-content">${nc.ncContent }</p> <textarea
							name="ncContent" class="input-form"
							style="min-height: 96px; display: none;">${nc.ncContent }</textarea>
						<p class="comment-link">
							<c:if test="${not empty m }">
								<c:if
									test="${sessionScope.m.memberId eq nc.ncWriter || sessionScope.m.memberLevel eq 1 }">
									<a href="javascript:void(0)"
										onclick="modifyComment(this,${nc.ncNo },${n.noticeNo});">수정</a>
									<a href="javascript:void(0)"
										onclick="deleteComment(this,${nc.ncNo },${n.noticeNo});">삭제</a>
								</c:if>
								<a href="javascript:void(0)" class="recShow">답글</a>
							</c:if>
						</p>
					</li>
				</ul>

				<c:forEach items="${reCommentList}" var="ncc">

					<c:if test="${ncc.ncRef eq nc.ncNo }">
						<ul class="posting-comment reply">
							<li><span class="material-icons">subdirectory_arrow_right</span>
								<span class="material-icons">account_box</span></li>
							<li>
								<p class="comment-info">
									<span>${nc.ncWriter }</span> <span>${ncc.ncDate }</span>
								</p>
								<p class="comment-content">${ncc.ncContent }</p> <textarea
									name="ncContent" class="input-form"
									style="min-height: 96px; display: none;">${ncc.ncContent }</textarea>
								<p class="comment-link">

									<c:if test="${not empty m}">
										<c:if
											test="${sessionScope.m.memberId eq nc.ncWriter || sessionScope.m.memberLevel eq 1}">
											<a href="javascript:void(0)"
												onclick="modifyComment(this,${ncc.ncNo },${n.noticeNo });">수정</a>
											<a href="javascript:void(0)"
												onclick="deleteComment(this,${ncc.ncNo },${n.noticeNo });">삭제</a>
										</c:if>
									</c:if>
								</p>
							</li>
						</ul>
					</c:if>
				</c:forEach>


				<c:if test="${not empty sessionScope.m }">
					<div class="inputRecommentBox">
						<form action="/insertComment.do" method="post">
							<ul>
								<li><span class="material-icons">subdirectory_arrow_right</span>
								</li>
								<li><input type="hidden" name="ncWriter"
									value="${sessionScope.m.memberId }"> <input
									type="hidden" name="noticeRef" value="${n.noticeNo }">
									<input type="hidden" name="ncRef" value="${nc.ncNo }">
									<textarea class="input-form" name="ncContent"></textarea></li>
								<li>
									<button type="submit" class="btn bc1 bs4">등록</button>
								</li>
							</ul>
						</form>
					</div>
				</c:if>
			</c:forEach>

		</div>
	</div>
	<script>
		function noticeDelete(noticeNo){
			if(confirm("공지사항을 삭제하시겠습니까?")){
				location.href="/noticeDelete.do?noticeNo="+noticeNo;
			}
		}
		$(".recShow").on("click",function(){
			const idx = $(".recShow").index(this);
			if($(this).text() == "답글") {
				$(this).text("취소");
			} else {
				$(this).text("답글");
			}
			$(".inputRecommentBox").eq(idx).toggle();
			$(".inputRecommentBox").eq(idx).find("textarea").focus();
		});
		function modifyComment(obj,ncNo,noticeNo){
			$(obj).parent().prev().show(); // textarea 화면에 보여줌
			$(obj).parent().prev().prev().hide(); // 내용을 보여주던 p태그 숨김
			// 수정 -> 수정완료
			$(obj).text("수정완료");
			$(obj).attr("onclick","modifyComplete(this,"+ncNo+","+noticeNo+")");
			
			// 삭제 -> 수정취소
			$(obj).next().text("수정취소");
			$(obj).next().attr("onclick","modifyCancle(this,"+ncNo+","+noticeNo+")");
			
			// 답글버튼 숨김
			$(obj).next().next().hide();
		}
		function modifyCancle(obj,ncNo,noticeNo){
			$(obj).parent().prev().hide(); // textarea 숨김
			$(obj).parent().prev().prev().show(); // 기존댓글 보여줌
			// 수정완료 -> 수정
			$(obj).prev().text("수정");
			$(obj).prev().attr("onclick","modifyComment(this,"+ncNo+","+noticeNo+")");
			// 수정취소 -> 삭제
			$(obj).text("삭제");
			$(obj).attr("onclick","deleteComment(this,"+ncNo+","+noticeNo+")")
			// 답글달기버튼 보여줌
			$(obj).next().show();
		}
		function modifyComplete(obj,ncNo,noticeNo){
			// form태그를 생성해서 전송
			// 1. form태그생성
			const form = $("<form action='/noticeCommentUpdate.do' method = 'post'></form>");
			// 2. input태그 생성(ncNo)
			const ncInput = $("<input type='text' name='ncNo'>");
			// ncNo값 세팅
			ncInput.val(ncNo);
			// form태그에 추가
			form.append(ncInput);
			// 3. inpunt태그생성(noticeNo)
			const noticeInput = $("<input type='text' name='noticeNo'>");
			noticeInput.val(noticeNo);
			form.append(noticeInput);
			// 4. textarea
			const ncContent = $(obj).parent().prev();
			form.append(ncContent);
			// 5. body태그에 생성한 form태그 추가
			$("body").append(form);
			//form 태그에전승
			form.submit();
		}
		function deleteComment(obj,ncNo,noticeNo){
			if(confirm("댓글을 삭제하시겠습니까?")){
				location.href="/deleteNoticeComment.do?ncNo="+ncNo+"&noticeNo="+noticeNo
			}
		}
	</script>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>