package kh.spring.member.service;

import java.util.List;

import kh.spring.member.vo.MemberVo;

public interface MemberService {

	public int insert(MemberVo vo);
	
	public int update(MemberVo vo);
	
	public int delete(String id);
	
	public MemberVo selectOne(String id);
	
	public List<MemberVo> selectList();
	
	
}
