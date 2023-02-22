<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성 페이지</title>
</head>
<body>
	<button onclick="location.href='<%=request.getContextPath()%>/index'">Home</button>
	
	<form action="<%=request.getContextPath()%>/insert" method="post">
		<h4>번호</h4><br>
		<label>작성자: </label>
		<input type="text" name="user"/><br>
		<label>비밀번호: </label>
		<input type="password" name="pw"/><br>
		<label>제목: </label>
		<input type="text" name="title"/><br>
		<label>내용</label><br>
		<textarea name="context" cols="30" rows="5"></textarea><br>
		<button type="submit">등록</button>
	</form>
	
</body>
</html>