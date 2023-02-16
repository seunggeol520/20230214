package member.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static common.jdbc.JdbcTemplate.*;
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
			
			if(rs.next()) {
				result = new ArrayList<BoardVO>();
				do {
					String num = rs.getString("B_NUM");
					String user = rs.getString("B_USER");
					String context = rs.getString("B_CONTEXT");
					String date = rs.getString("B_DATE");
					
					BoardVO vo = new BoardVO();
					
					vo.setNum(Integer.parseInt(num));
					vo.setUser(user);
					vo.setContext(context);
					vo.setDate(date);
					
					
				} while(rs.next());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			close(rs);
			close(pstmt);
		}
		
		System.out.println(result);
		return result;
	}

}
