<%@page import="kh.member.model.VO.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내정보</title>
</head>
<body>
	<h2>상세정보</h2>
	<c:if test="${empty myinfo }">
		<div>
			<h4>로그인 되지 않았습니다. 정보가 없습니다.</h4>
			<a href="<%=request.getContextPath()%>/login">로그인 페이지로 이동</a>
		</div>
	</c:if>
	<c:if test="${not empty myinfo }">
		<div>
			id: ${myinfo.id }
			<br>
			name: ${myinfo.name }
			<br>
			email: ${myinfo.email }
			<br>
		</div>
	</c:if>
	<hr>
	
	id: ${loginSession.id }
	<br>
	name: ${loginSession.name }
	<br>
	email: ${loginSession.email }
	
	<%
		MemberVO ss = (MemberVO)session.getAttribute("loginSession");
	%>	
		id: <%=ss.getId()%>
		<br>
		name: <%=ss.getName()%>
		<br>
		email: <%=ss.getEmail()%>
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