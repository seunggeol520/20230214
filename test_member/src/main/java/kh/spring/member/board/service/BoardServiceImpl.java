package kh.spring.member.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.member.board.dao.BoardDao;
import kh.spring.member.board.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao dao;
	
	public List<BoardVo> getBoardList(){
		
		
		return dao.getBoardList();
	}
	
	
	
	
}
