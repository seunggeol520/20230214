package member.model.VO;

import java.sql.Date;

public class BoardVO {
	
//	BOARD_TABLE
	
//	  B_ID NUMBER(6) NOT NULL,
//    B_NUM NUMBER(6),
//    B_USER VARCHAR2(20),
//    B_CONTEXT VARCHAR2(2000),
//    B_DATE DATE DEFAULT SYSDATE,
	
	private int id;
	private int num;
	private String user;
	private String context;
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", num=" + num + ", user=" + user + ", context=" + context + ", date=" + date
				+ "]";
	}
	
	

}
