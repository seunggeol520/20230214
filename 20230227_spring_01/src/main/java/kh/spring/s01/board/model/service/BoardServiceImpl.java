package kh.spring.s01.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.s01.board.model.dao.BoardDao;
import kh.spring.s01.board.model.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao dao;
	
	
	@Override
	public int insert(BoardVo vo) {
		// TODO Auto-generated method stub
		return dao.insert(vo);
	}

	@Override
	public int update(BoardVo vo) {
		// TODO Auto-generated method stub
		return dao.update(vo);
	}

	@Override
	public int delete(int boardNum) {
		// TODO Auto-generated method stub
		return dao.delete(boardNum);
	}

	@Override
	public BoardVo selectOne(int boardNum, String writer) {
		BoardVo result = dao.selectOne(boardNum);
		if(!result.getBoardWriter().equals(writer)) {
			dao.updateReadCount(boardNum);
		}
		return result;
//		if(dao.updateReadCount(boardNum)>0) {
//			return dao.selectOne(boardNum);
//		} else {
//			return null;
//		}
	}

	@Override
	public List<BoardVo> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public int selectOneCount() {
		// TODO Auto-generated method stub
		return dao.selectOneCount();
	}

}
