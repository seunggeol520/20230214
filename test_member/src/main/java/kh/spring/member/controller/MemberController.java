package kh.spring.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.member.service.MemberServiceImpl;
import kh.spring.member.vo.MemberVo;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberServiceImpl service;
	
	@GetMapping("/signUp")
	public ModelAndView viewinsert(ModelAndView mv) {
		
		mv.setViewName("member/signUp");
		return mv;
	}
	
	@PostMapping("/signUp")
	public ModelAndView insert(ModelAndView mv, MemberVo vo) {
//		vo.setEmail("email");
//		vo.setId("id");
//		vo.setName("name");
//		vo.setPasswd("passwd");
		int result = service.insert(vo);
		return mv;
	}
	
	@GetMapping("/update")
	public ModelAndView viewUpdate(ModelAndView mv) {
		return mv;
	}
	
	@PostMapping("/update")
	public ModelAndView update(ModelAndView mv, MemberVo vo) {
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(ModelAndView mv) {
		return mv;
	}
	
	@GetMapping("/info")
	public ModelAndView selectOne(ModelAndView mv, String id) {
		return mv;
	}
	
	@GetMapping("/list")
	public ModelAndView selectList(ModelAndView mv) {
		List<MemberVo> result = service.selectList();
		return mv;
	}
	
	
}
