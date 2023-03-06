<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 - 회원등록</title>

	<style>
		.f-3 {
			display: flex;
			width: 300px;
			hight: 50px;
		}
		
		.f-3 > div{
			width: 150px;
			border: 1px black solid;
			margin: 0xp 3px;
		}
	</style>

</head>
<body>
	<div class="f-3">
		<div>아이디</div>
		<div>이름</div>
		<div>이메일</div>
	</div>
	<c:forEach items="${memberList }" var="member">
		<div class="f-3">
			<div>${member.id }</div>
			<div>${member.name }</div>
			<div>${member.email }</div>
		</div>
	</c:forEach>
</body>
</html>