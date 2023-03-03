package kh.spring.member.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.member.board.service.BoardService;
import kh.spring.member.board.vo.BoardVo;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	@GetMapping("/selectList")
	public ModelAndView viewBoardInsert(ModelAndView mv) {
		List<BoardVo> result = service.getBoardList();
		
		mv.addObject("selectList",result);
		mv.setViewName("board/selectList");
		return mv;
	}
	
	
	
}
