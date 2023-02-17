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
		String sql = "SELECT B_NUM, B_USER, B_CONTEXT, B_DATE FROM BOARD_TBL ORDER BY B_DATE DESC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = new ArrayList<BoardVO>();
				while(rs.next()) {
					int num = rs.getInt("B_NUM");
					String user = rs.getString("B_USER");
					String context = rs.getString("B_CONTEXT");
					Date date = rs.getDate("B_DATE");
					
					BoardVO vo = new BoardVO();
					
					vo.setNum(num);
					vo.setUser(user);
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

}
