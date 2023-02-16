package kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.member.model.VO.MemberVO;
import kh.member.model.service.MemberService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/member/login.jsp").forward(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("login Post");
		//1 
		MemberVO vo = new MemberVO();
		String id = req.getParameter("id");
		String passwd = req.getParameter("passwd");
		vo.setId(id);
		vo.setPasswd(passwd);
		
		//2
		
		MemberVO result = new MemberService().login(vo);
		if(result != null) {
			System.out.println("성공!!");
			req.getSession().setAttribute("loginSession", result);
		} else {
			System.out.println("실패!!");
		}
		
		//3. 페이지이동 및 데이터 전달
//		resp.sendRedirect(req.getContextPath() + url);
//		request.setAttribute("name1", "값");
//		request.getRequestDispatcher("xxx.jsp").forward(request, response);
//		out.println(값); out.flush(); out.close();
		
		resp.sendRedirect(req.getContextPath() + "/");
	}
	
}
