package member.model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.VO.BoardVO;
import member.model.service.BoardService;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/board/boardMyinfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardService service = new BoardService();
		
		
		String user = request.getParameter("user");
		String pw = request.getParameter("pw");
		String title = request.getParameter("title");
		String context = request.getParameter("context");
		
		BoardVO vo = new BoardVO();
		
		vo.setUser(user);
		vo.setPw(pw);
		vo.setTitle(title);
		vo.setContext(context);
		
		int result = service.boardUpdate(vo);
		if(result == 1) {
			response.sendRedirect("index");
		} else {
			request.getRequestDispatcher("/WEB-INF/view/board/boardInsert.jsp").forward(request, response);
		}
		
	}

}
