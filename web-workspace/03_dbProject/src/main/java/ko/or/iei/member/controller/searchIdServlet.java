package ko.or.iei.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>아이디조회</title></head>");
		out.println("<body>");
		if(m == null) {
			out.println("<h1>조회결과 없음</h1>");
		} else {
			out.println("<ul>");
			out.println("<li>"+m.getMemberId()+"</li>");
			out.println("<li>"+m.getMemberName()+"</li>");
			out.println("<li>"+m.getMemberPhone()+"</li>");
			out.println("<li>"+m.getMemberAddr()+"</li>");
			out.println("</ul>");
		}
		out.println("</body></html>");


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
