<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>
<body>	
	<h1>게시판</h1>
	
	<c:if test="${empty boardList }">
		<div>
			<h4>정보가 없습니다.${boardList }</h4>
		</div>
	</c:if>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>작성자</th>
					<th>내용</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty boardList }">
					<c:forEach var="list" items="${boardList}">
						<tr>
							<td>${list.num }</td>
							<td>${list.user }</td>
							<td>${list.context }</td>
							<td>${list.date }</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
		
</body>
</html>