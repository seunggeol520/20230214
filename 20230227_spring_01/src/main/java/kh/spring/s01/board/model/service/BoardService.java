package kh.spring.s01.board.model.service;

import java.util.List;

import kh.spring.s01.board.model.vo.BoardVo;

public interface BoardService {

	public int insert(BoardVo vo);
	
	public int update(BoardVo vo);
	
//	public int updateReadCount(int boardNum);
	
//	public int updateForReply(int boardNum);
	
	public int delete(int boardNum /*BoardVo vo 또는 PK*/);
	
	public BoardVo selectOne(int boardNum, String writer /*PK*/);
	
	public List<BoardVo> selectList();   
	// 전체 조회
	public List<BoardVo> selectList(int currentPage, int limit); // paging 처리
	
	public int selectOneCount();
	
}
