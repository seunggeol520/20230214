package kh.board.model.service;

import java.sql.Connection;
import java.util.List;

import kh.board.model.DAO.BoardDAO;
import kh.board.model.VO.BoardVO;
import kh.common.jdbc.JdbcTemplate;

public class BoardService {

	
	public List<BoardVO> getBoardList(){
		List<BoardVO> result = null;
		Connection conn = JdbcTemplate.getConnection();
		BoardDAO dao = new BoardDAO();
		result = dao.getBoardList(conn);
		
		JdbcTemplate.close(conn);
		
		System.out.println(result);
		return result;
	}
	
	
	
	
	
	
	
	
}
