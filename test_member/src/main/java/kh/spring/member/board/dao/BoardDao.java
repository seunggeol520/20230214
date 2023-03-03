package kh.spring.member.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.member.board.vo.BoardVo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSession session;
	
	public List<BoardVo> getBoardList(){
		return session.selectList("board.selectList");
	}
	
	
}
