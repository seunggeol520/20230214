<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
	<form action="update" method="post">
		<input value="${memberVo.id}" type="text" name="id" placeholder="id" readonly="readonly"><br>
		<input value="${memberVo.passwd}" type="password" name="passwd" placeholder="pass"><br>
		<input value="${memberVo.name}" type="text" name="name" placeholder="name" readonly="readonly"><br>
		<input value="${memberVo.email}" type="text" name="email" placeholder="email"><br>
		<button type="submit">제출</button>
	</form>
</body>
</html>