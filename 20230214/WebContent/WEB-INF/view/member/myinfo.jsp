<%@page import="kh.member.model.VO.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내정보</title>
</head>
<body>
	<p>상세정보</p>
	<%
		Object obj = request.getAttribute("myinfo");
		MemberVO vo = null;
		if(obj == null){
			
	%>
			<h4>로그인 되지 않았습니다. 정보가 없습니다.</h4>
			<a href="<%=request.getContextPath()%>/login">로그인 페이지로 이동</a>
	<%
		}else { 
			if(obj instanceof MemberVO){
				vo = (MemberVO)obj;
			}
		
			if(vo == null){
				
	%>
				<h4>로그인 되지 않았습니다. 정보가 없습니다.</h4>
				<a href="<%=request.getContextPath()%>/login">로그인 페이지로 이동</a>

	<%		
	
			}else{
				//로그인 정보
	%>
	
				id: <%=vo.getId()%>
				<br>
				name: <%=vo.getName()%>
				<br>
				email: <%=vo.getEmail()%>
	<%				
			}
		
		}
	%>
	
</body>
</html>