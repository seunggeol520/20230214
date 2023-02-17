<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성 페이지</title>
</head>
<body>
	
	<form action="/insert" method="post">
		<label>작성자: </label>
		<input type="text" name="user"/>
		<label>비밀번호: </label>
		<input type="password" name="pw"/>
		<label>내용: </label>
		<input type="text" name="context"/>
		<button type="submit">등록</button>
	</form>
	
</body>
</html>