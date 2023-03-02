package kh.spring.s01.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.s01.board.model.service.BoardService;
import kh.spring.s01.board.model.vo.BoardVo;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	private final static int BOARD_LIMIT = 5;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView viewListBoard(ModelAndView mv) {
		
		int currentPage = 1;
		
		
		mv.addObject("boardList", service.selectList(currentPage, BOARD_LIMIT));
		mv.setViewName("bosrd/list");
		
		return mv;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void viewUpdateBoard() {
		
	}
	
	@PostMapping("/update")
	public void updateBoard() {
		int boardNum = 1;
		String boardTitle = "수정제목";
		String boardContent = "수정내용";
		String boardOriginalFileName = "";  //값 = "" 파일없음
		String boardRenameFileName = "";    //값 = "" 파일없음
		
		BoardVo vo = new BoardVo();
		vo.setBoardTitle(boardTitle);
		vo.setBoardContent(boardContent);
		vo.setBoardOriginalFileName(boardOriginalFileName);
		vo.setBoardRenameFileName(boardRenameFileName);
		service.update(vo);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void viewDeleteeBoard() {
		
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void viewReadBoard() {
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
//	@GetMapping("/boardinsert")
	public ModelAndView viewInsertBoard(
			ModelAndView mv,
			HttpServletRequest req,
			HttpSession session, 
			BoardVo vo) {
		
		mv.addObject("test", "testValue");
		
		mv.setViewName("/board/insert");
		
		return mv;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
//	@PostMapping("/boardinsert")
	public ModelAndView doInsertBoard(ModelAndView mv) {
		
		return mv;
	}
	
	
	@GetMapping("/insertReply")
	public ModelAndView viewInsertReply(ModelAndView mv
			, int boardNum  // 몇번글에 답글인
			) {
		
		
		return mv;
	}
	
	@PostMapping("/insertReply")
	public ModelAndView viewInsertReply(ModelAndView mv
			, BoardVo vo  // 몇번글에 답글인
			) {
		int boardNum = 4;
		vo.setBoardNum(boardNum);
		
		vo.setBoardContent("임시답내용");
		vo.setBoardTitle("임시답제목");
		vo.setBoardWriter("user22");
		
		service.insert(vo);
		
		return mv;
	}
	
//	get/post 모두 적용
	@RequestMapping("/test")
	public ModelAndView test(ModelAndView mv) {
		
		return mv;
	}
	
}
