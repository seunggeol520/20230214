<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>20230214 myWeb home</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>
<body>	
	<jsp:include page="/WEB-INF/view/header.jsp"/>
	
	<c:if test="${not empty loginSession }">
		<button class="btn myinfo">내정보 보기</button>
	</c:if>
	
	<jsp:include page="/WEB-INF/view/board/boardList.jsp"/>
	
	<script>
		$(".btn.login").on("click", handlerClickBtnLogin);
		$(".btn.logout").on("click", handlerClickBtnLogout);
		$(".btn.myinfo").on("click", handlerClickBtnMyinfo);
		
		function handlerClickBtnLogin(){
			console.log("btnLogin 눌림")
			location.href="<%=request.getContextPath()%>/login";
		};
		
		function handlerClickBtnLogout(){
			console.log("btnLogout 눌림")
			location.href="<%=request.getContextPath()%>/logout";
		};
		
		function handlerClickBtnMyinfo(){
			console.log("btnMyinfo 눌림")
			location.href="<%=request.getContextPath()%>/myinfo";
		};
	
	
	</script>
</body>
</html>