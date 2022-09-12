package kr.or.iei.photo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.or.iei.notice.model.service.NoticeService;
import kr.or.iei.notice.model.vo.Notice;
import kr.or.iei.photo.model.service.PhotoService;
import kr.or.iei.photo.model.vo.Photo;

/**
 * Servlet implementation class PhotoWriteServlet
 */
@WebServlet(name = "PhotoWrite", urlPatterns = { "/photoWrite.do" })
public class PhotoWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PhotoWriteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 인코딩
		request.setCharacterEncoding("utf-8");
		// 2. 값추출
		// multipart/form-data(파일업로드)형식이면 데이터를 꺼낸 후 추출
		// -> cos.jar 라이브러리 사용해서 처리
		// 2-1. 파일이 업로드 될 경로를 지정
		String root = getServletContext().getRealPath("/");
		String saveDirectory = root + "upload/photo";
		// 2-2. 파일 업로드 최대용량 설정 (일반적인 웹은 최대용량 10MB)
		int maxSize = 10 * 1024 * 1024;
		// 2-3. multipart/form-data에서 데이터를 꺼내기위한 객체변환
		// request -> MultipartRequest객체 변환(cos.jar)
		// 매개변수 5개를 전달하면서 객체 생성
		// 1) request, 2) 파일저장경로, 3) 파일최대크기, 4) 인코딩타입 , 5) 파일명중복처리객체
		// MultipartRequest객체가 생성되는 시점에 파일이 업로드 완료
		MultipartRequest mRequest = new MultipartRequest(request, saveDirectory, maxSize, "UTF-8",
				new DefaultFileRenamePolicy());

		// 데이터추출은 MultipartRequest에서 수행
		// request에서 추출하면 모두 null리턴
		String photoTitle = mRequest.getParameter("photoTitle");
		String photoWriter = mRequest.getParameter("photoWriter");
		String photoContent = mRequest.getParameter("photoContent");
		String filepath = mRequest.getFilesystemName("imageFile");
		Photo p = new Photo();
		p.setPhotoTitle(photoTitle);
		p.setPhotoWriter(photoWriter);
		p.setPhotoContent(photoContent);
		p.setFilepath(filepath);
		// 3. 비즈니스로직
		PhotoService service = new PhotoService();
		int result = service.insertPhoto(p);
		// 4. 결과처리
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
		if (result > 0) {
			request.setAttribute("title", "성공");
			request.setAttribute("msg", "게시물이 등록되었습니다.");
			request.setAttribute("icon", "success");
		} else {
			request.setAttribute("title", "실패");
			request.setAttribute("msg", "게시물 등록 중 문제가 발생했습니다.");
			request.setAttribute("icon", "error");
		}
		request.setAttribute("loc", "/photoList.do");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
