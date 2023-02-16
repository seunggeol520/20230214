package kh.member.model.service;

import java.sql.Connection;

import static kh.common.jdbc.JdbcTemplate.*;
import kh.member.model.VO.MemberVO;
import member.model.DAO.MemberDAO;

public class MemberService {
	// 내정보 보기
	
	public MemberVO myinfo(String id) {
		MemberVO result = null;
		
		
		return result;
	}
	
	
	// 로그인
	
	public MemberVO login(MemberVO vo) {
		MemberVO result = null;
		Connection conn = getConnection();
		MemberDAO dao = new MemberDAO();
		result = dao.login(vo, conn);
		close(conn);
		
		return result;
	}
	
	// 회원가입 
	public int enroll( MemberVO vo) {
		int result = -1;
		Connection conn = getConnection();
		MemberDAO dao = new MemberDAO();
		result = dao.enroll(conn, vo);
		close(conn);
		
		return result;
	}

}
