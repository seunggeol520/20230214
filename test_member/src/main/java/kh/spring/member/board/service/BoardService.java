package kh.spring.member.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kh.spring.member.board.vo.BoardVo;

@Service
public interface BoardService {

	public List<BoardVo> getBoardList();
	
}
