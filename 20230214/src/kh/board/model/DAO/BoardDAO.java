package kh.board.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kh.board.model.VO.BoardVO;

import kh.common.jdbc.JdbcTemplate;

public class BoardDAO {

	public List<BoardVO> getBoardList(Connection conn ){
		List<BoardVO> result = null;
		
		String sql = "SELECT "
				+ "BOARD_NUM,"
				+ "BOARD_TITLE,"
				+ "BOARD_WRITER,"
				+ "BOARD_CONTENT,"
				+ "BOARD_ORIGINAL_FILENAME,"
				+ "BOARD_RENAME_FILENAME,"
				+ "BOARD_DATE,"
				+ "BOARD_LEVEL,"
				+ "BOARD_REF,"
				+ "BOARD_REPLY_SEQ,"
				+ "BOARD_READCOUNT "
				+ "FROM BOARD "
				+ "ORDER BY BOARD_REF DESC, BOARD_REPLY_SEQ ASC";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = new ArrayList<BoardVO>();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNum(rs.getInt("BOARD_NUM"));
				vo.setBoardTitle(rs.getString("BOARD_TITLE"));
				vo.setBoardWriter(rs.getString("BOARD_WRITER"));
				vo.setBoardContent(rs.getString("BOARD_CONTENT"));
				vo.setBoardOriginalFileName(rs.getString("BOARD_ORIGINAL_FILENAME"));
				vo.setBoardRenameFileName(rs.getString("BOARD_RENAME_FILENAME"));
				vo.setBoardDate(rs.getDate("BOARD_DATE"));
				vo.setBoardLevel(rs.getInt("BOARD_LEVEL"));
				vo.setBoardRef(rs.getInt("BOARD_REF"));
				vo.setBoardRdplySeq(rs.getInt("BOARD_REPLY_SEQ"));
				vo.setBoardReadcount(rs.getInt("BOARD_READCOUNT"));
				result.add(vo);
			}
			
		} catch (Exception e) {
			
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
				
		
		System.out.println(result);
		return result;
	}
	
}
