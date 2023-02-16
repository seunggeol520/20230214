<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KH 회원가입</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/view/header.jsp"/>
	<section>
		<h1>회원가입</h1>	
		<form action="<%=request.getContextPath()%>/enroll.jsp" method="post">
			<label>ID: </label>
			<input type="text" name="id">
			<button type="button" id="dupId">중복 확인</button>
			<span></span><br/>
			<label>PW: </label>
			<input type="password" name="passwd"><br/>
			<label>NAME: </label>
			<input type="text" name="name"><br/>
			<label>Email: </label>
			<input type="text" name="email"><br/>
			<button type="submit">회원가입</button>
		</form>	
	</section>
	<script type="text/javascript">
	$("#dupId").click(checkDupId);
	
	function checkDupId(){
		$.ajax({
			url:"<%=request.getContextPath()%>/dupId.lo"
			, type:"post"   // 생략 가능
			, async:false   // 생략 가능
			, data: {id: $("input[type=text]").val()} // 생략 가능
			, success: function(result){console.log(result)
				if(result == 1){
					$("#dupId").next().html("중복된 아이디 입니다.");
					$("#dupId").next().css("color", "red");
				}else {
					$("#dupId").next().html("사용가능한 아이디 입니다.");
					$("#dupId").next().css("color", "blue");
				}	
			}
			, error: function(request, status, error){alert(request.status)}
		});
	}
</script>
</body>
</html>