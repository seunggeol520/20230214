package kh.spring.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public ModelAndView insert(ModelAndView mv, MemberVo vo,
			String id,
			RedirectAttributes rttr ) {
//		vo.setEmail("email");
//		vo.setId("id");
//		vo.setName("name");
//		vo.setPasswd("passwd");
		int result = service.insert(vo);
		
		if(result > 0) {
			//방법 1
//			mv.setViewName("redirect:/?msg=회원가입성공");
			
			//방법 2
//			mv.addObject("msg", "회원가입성공");
//			mv.setViewName("error/errorFailure");
			
			//방법 3
			rttr.addFlashAttribute("msg", "회원가입성공");
			mv.setViewName("redirect:/");
			
		} else {
			rttr.addFlashAttribute("msg", "회원가입실패");
			mv.setViewName("redirect:/member/signUp/");
		}
		
		return mv;
	}
	
	@GetMapping("/update")
	public ModelAndView viewUpdate(ModelAndView mv,
			// id 라는 이름의 Parameter 없어도 됨. 없는 경우 null 값이 들어감. String id 
//			@RequestParam(name="id", required=true) String id, // String id - request.getParameter("id");
			@RequestParam("id") String id, // String id - request.getParameter("id");
			@RequestParam("aaa") int bbb, // String bbb - request.getParameter("aaa");
			@RequestParam(name="ccc", required=false, defaultValue="100") int ccc // String ccc - request.getParameter("ccc");
			) {
		MemberVo result =  service.selectOne(id);
		mv.addObject("membervo", result);
		mv.setViewName("/member/update");
		
		return mv;
	}
	
	@PostMapping("/update")
	public ModelAndView update(ModelAndView mv, MemberVo vo) {
		
		int result = service.update(vo);
		
		if(result > 0) {
			mv.setViewName("redirect:/");
		} else {
			mv.setViewName("redirect:/member/signUp");
		}
		
		
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(ModelAndView mv, String id) {
		
		service.delete(id);
		return mv;
	}
	
	@GetMapping("/info")
	public ModelAndView selectOne(ModelAndView mv, String id) {
		
		if(id == null){
			mv.setViewName("redirect:/");
			return mv;
		}
		
		MemberVo result =  service.selectOne(id);
		mv.addObject("membervo", result);
		mv.setViewName("/member/info");
		return mv;
	}
	
	@GetMapping("/list")
	public ModelAndView selectList(ModelAndView mv) {
		List<MemberVo> result = service.selectList();
		mv.addObject("memberList", result);
		
		return mv;
	}
	
	
}
