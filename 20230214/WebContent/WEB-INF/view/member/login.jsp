<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/view/header.jsp"/>
	<section>
		<form action="login" method="post">
			<label>ID: </label>
			<input type="text" name="id">
			<button type="button" id="dupId">중목 확인</button>
			<span></span>
			<br/>
			<label>PW: </label>
			<input type="password" name="passwd"><br/>
			<button type="submit">로그인</button>
			<button type="button" class="btn join">회원가입</button>
		</form>
	</section>
	
	<script>
		$(".btn.join").on("click", handlerClickBtnEnroll);
		
		function handlerClickBtnEnroll(){
			location.href="<%=request.getContextPath()%>/enroll";
		};
	</script>
	
</body>
</html>