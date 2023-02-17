package member.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static kh.common.jdbc.JdbcTemplate.*;
import kh.member.model.VO.MemberVO;

public class MemberDAO {
	
	public MemberVO myinfo(Connection conn, String id) {
		MemberVO result = null;
		String sql = "SELECT ID, NAME, EMAIL FROM TEST_MEMBER";
		sql += "WHERE ID=?";
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new MemberVO();
				result.setId(rs.getString("id"));
				result.setName(rs.getString("name"));
				result.setEmail(rs.getString("email"));
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
	
	
	// 로그인
	
	public MemberVO login(MemberVO vo, Connection conn) {
		MemberVO result = null;
		
		String sql = "SELECT ID, NAME, EMAIL FROM TEST_MEMBER";
		sql += " WHERE ID=? AND PASSWD=?";
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPasswd());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new MemberVO();
				result.setId(rs.getString("id"));
				result.setName(rs.getString("name"));
				result.setEmail(rs.getString("email"));
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
	
	
	// 회원가입 
	
	public int enroll(Connection conn, MemberVO vo) {
		int result = -1;
		
		String query = "INSERT INTO TEXT_MEMBER VALUES";
		query += "(?,?,?,?)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			//? 채우기
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			
			//pstmt 실행
			
			
			// 결과값 result 에 대입
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("DAO enroll() return: " + result);
		return result;
	}
	
	
	
}
