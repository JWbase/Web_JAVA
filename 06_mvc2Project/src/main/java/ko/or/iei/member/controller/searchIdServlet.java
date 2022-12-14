package ko.or.iei.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.JDBCTemplate;
import ko.or.iei.member.service.MemberService;
import ko.or.iei.member.vo.Member;

/**
 * Servlet implementation class searchIdServlet
 */
@WebServlet(name = "SearchId", urlPatterns = { "/searchId.do" })
public class searchIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public searchIdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.인코딩
		request.setCharacterEncoding("utf-8");
		// 2. 값추출
		String memberId = request.getParameter("memberId");
		// 3. 비즈니스로직
		MemberService service = new MemberService();
		Member m = service.searchIdMember(memberId);
		// 4. 결과처리
		// 4-1. 결과를 처리할 jsp를 지정
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/searchId.jsp");
		// 4-2. 화면구성에 필요한 데이터를 등록
		request.setAttribute("m", m);
		// 4-3. 페이지 이동
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
