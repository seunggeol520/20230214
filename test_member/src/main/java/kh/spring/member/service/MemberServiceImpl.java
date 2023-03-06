package kh.spring.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kh.spring.member.dao.MemberDao;
import kh.spring.member.vo.MemberVo;

public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao dao;
	
	public int insert(MemberVo vo) {
		
		return dao.insert(vo);
	}
	
	public int update(MemberVo vo) {
		
		return dao.update(vo);
	}
	
	public int delete(String id) {
		
		return dao.delete( id);
	}
	
	public MemberVo selectOne(String id) {
		
		return dao.selectOne( id);
	}
	
	public List<MemberVo> selectList() {
		
		return dao.selectList();
	}
	
	
}
