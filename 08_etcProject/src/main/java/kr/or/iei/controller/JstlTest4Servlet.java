package kr.or.iei.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlTest4Servlet
 */
@WebServlet(name = "JstlTest4", urlPatterns = { "/jstlTest4.do" })
public class JstlTest4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JstlTest4Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Member> list = new ArrayList<Member>();
		Member m1 = new Member("유저1", 20, "서울");
		Member m2 = new Member("유저2", 21, "광주");
		Member m3 = new Member("유저3", 22, "부천");
		list.add(m1);
		list.add(m2);
		list.add(m3);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/jstl/jstlTest4.jsp");
		request.setAttribute("memberList", list);
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
