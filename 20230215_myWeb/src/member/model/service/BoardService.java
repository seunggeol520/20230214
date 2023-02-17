package member.model.service;

import java.sql.Connection;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.DAO.BoardDAO;
import member.model.VO.BoardVO;

public class BoardService {

	public List<BoardVO> selectAll() {
		List<BoardVO> result = null;
		Connection conn = JdbcTemplate.getConnection();
		BoardDAO dao = new BoardDAO();
		result = dao.selectAll(conn);
		
		JdbcTemplate.close(conn);
		
		return result;
	}
	
}
