<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${boardList }" var="board">
	${board.boardNum }
</c:forEach>
	<hr>
	<c:forEach begin="${pageInfo.startPage}" end="${pageInfo.startPage}">
		${page }
	</c:forEach>
	

</body>
</html>