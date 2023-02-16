package kh.member.model.VO;

/**
 * 
 * @author seunggol 
 * TEST_MEMBER 테이블을 이용하여 회원가입
 * 0. 첫화면("/index.jsp") include header.jsp           - login(get)/logout(get) 버튼 토글, nav 내정보보기(myinfo get) 버튼
 * 로그인 화면                      -  로그인(login post) / 회원가입(enroll get) 버튼 
 * 1. 회원 가입("/enroll")          - get: enroll.jsp, , post: 회원가입 DB 다녀와서 첫 이동 id 중복확인
 * 회원가입화면                      - 회원가입(enroll post) 버튼
 * 2. 로그인("/login")             - get: login.jsp로 forward , post: 로그인확인 DB 다녀와서 session(loginSession)등록(name, email, id)
 * 3. 로그아웃("/logout")           - get 세션만료후 "/"로 이동
 * 4. 마이 페이지("/myinfo")         - get: myinfo.jsp
 * 내정보보기 화면에서 하단에 수정(infoupdate get), 탈퇴 버튼
 * 5. 마이 페이지 수정("/myinfo/")    - 
 * 내정보보기 수정 회면에서 주성(infoupdate post)
 *
 */

public class MemberVO {

//	desc test_member;
//	----------------------------
//	ID     NOT NULL VARCHAR2(15) 
//	PASSWD NOT NULL VARCHAR2(15) 
//	NAME   NOT NULL VARCHAR2(20) 
//	EMAIL           VARCHAR2(30) 

	private String id;
	private String passwd;
	private String name;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
