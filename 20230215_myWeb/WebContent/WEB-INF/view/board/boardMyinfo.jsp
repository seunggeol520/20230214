<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세내용</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>
<body>
	<button onclick="location.href='<%=request.getContextPath()%>/index'">Home</button><br>
	
	
	
	
	
	<button class="update">수정</button>
	<button type="button" class="delete">삭제</button>
	
	<form action="<%=request.getContextPath()%>/insert" method="post">
		<label>작성자: </label>
		<input type="text" name="user"/><br>
		<label>비밀번호: </label>
		<input type="password" name="pw"/><br>
		<label>제목: </label>
		<input type="text" name="title"/><br>
		<label>내용</label><br>
		<textarea name="context" cols="30" rows="5"></textarea><br>
		<button type="submit" class="save">저장</button>
	</form>
	
	<!-- hidden button 삭제 저장-->
	
	
	
	<script>
		$(".delete").attr("style","display:none");
		$(".save").attr("style","display:none");
		
		$(".update").on("click", function(){
			var userPw = prompt("PASSWORD 를 입력하시오!");
			if(userPw == 11){
				$(".delete").removeAttr("style","display:none");
				$(".save").removeAttr("style","display:none");
				$(this).attr("style","display:none");
			}
		});
		
		$(".delete").on("click", function(){
			var userDel = confirm("게시글을 삭제하시겠습니까?");
			
			if(userDel){
				alert("게시글 삭제되었습니다.");
				location.href="<%=request.getContextPath()%>/del";
			}
		});
		
		
	</script>
	
</body>
</html>