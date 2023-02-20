<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<section>

	<h1>게시판</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
	<c:forEach var="list" items="${boardList}">
		<tr>
			<td>${list.num }</td>
			<td>${list.user }</td>
			<td>${list.title }</td>
			<td><button class="context">상세내용</button></td>
			<td>${list.date }</td>
		</tr>
	</c:forEach>
	</table>
		
		<script>
			$(".context").on("click", function(){
				location.href="<%=request.getContextPath()%>/myinfo";
			});
			
		</script>
	
	
</section>