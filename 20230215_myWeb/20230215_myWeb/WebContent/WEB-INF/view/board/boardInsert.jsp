<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성 페이지</title>
</head>
<body>
	
	<form action="<%=request.getContextPath()%>/insert" method="post">
		<label>작성자: </label>
		<input type="text" name="user"/><br>
		<label>비밀번호: </label>
		<input type="password" name="pw"/><br>
		<label>제목: </label>
		<input type="text" name="title"/><br>
		<br>
		<label style="text-align: center">내용: </label>
		<textarea name="context" cols="30" rows="5"></textarea><br>
		<button type="submit">등록</button>
	</form>
	
</body>
</html>