package member.model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.VO.BoardVO;

public class BoardDAO {

	public List<BoardVO> selectAll(Connection conn) {
		
		List<BoardVO> result = null;
		String sql = "SELECT B_NUM, B_USER, B_CONTEXT, B_TITLE, B_DATE FROM BOARD_TBL ORDER BY B_DATE DESC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = new ArrayList<BoardVO>();
				while(rs.next()) {
					int num = rs.getInt("B_NUM");
					String user = rs.getString("B_USER");
					String title = rs.getString("B_TITLE");
					String context = rs.getString("B_CONTEXT");
					Date date = rs.getDate("B_DATE");
					
					BoardVO vo = new BoardVO();
					
					vo.setNum(num);
					vo.setUser(user);
					vo.setTitle(title);
					vo.setContext(context);
					vo.setDate(date);
					
					result.add(vo);
					
				} 
				
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		
		return result;
	}

	public int boardInsert(Connection conn, BoardVO vo) {
		int result = 0;
		String sql = "INSERT INTO BOARD_TBL VALUES("
				+ "(select NVL(max(B_ID),0)+1 newNum from BOARD_TBL),"
				+ "(select NVL(max(B_NUM),0)+1 newNum from BOARD_TBL),"
				+ "?,"
				+ "?,"
				+ "?,"
				+ "?,"
				+ "DEFAULT)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUser());
			pstmt.setString(4, vo.getPw());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContext());
			rs = pstmt.executeQuery();
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		
		return result;
	}

}
