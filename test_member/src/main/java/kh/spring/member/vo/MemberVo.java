package kh.spring.member.vo;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class MemberVo {

// 유효성 체크	@Validated
	private String id;
	private String passwd;
	private String name;
	private String email;
	private String aaa;
	
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVo(String id, String passwd, String name, String email) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
	}

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
		return "MemberVo [id=" + id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
