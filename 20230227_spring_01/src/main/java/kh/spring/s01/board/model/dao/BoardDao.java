package kh.spring.s01.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import kh.spring.s01.board.model.vo.BoardVo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	public int insert(BoardVo vo) {
		
		return sqlSession.insert("board.insert", vo);
	}
	
	public int update(BoardVo vo) {
		
		return sqlSession.update("board.update", vo);
	}
	
	public int updateReadCount(int boardNum) {
		
		return sqlSession.update("board.updateReadCount", boardNum);
	}
	
	public int updateForReply(int boardNum) {
		
		return sqlSession.update("board.updateForReply", boardNum);
	}
	
	public int delete(int boardNum /*BoardVo vo 또는 PK*/) {
		
		return sqlSession.delete("board.delete", boardNum);
	}
	
	public BoardVo selectOne(int boardNum /*PK*/) {
		
		return sqlSession.selectOne("board.selectOne", boardNum);
	}
	
	public List<BoardVo> selectList() {
		
		return sqlSession.selectList("board.selectList");
	}
	
	public int selectOneCount() {
		return sqlSession.selectOne("board.selectOneCount");
	}
	
	
}
