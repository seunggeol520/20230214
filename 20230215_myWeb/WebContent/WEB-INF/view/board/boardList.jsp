<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<section>

	<h1>게시판</h1>
	<c:forEach var="list" items="${boardList}">
		<div>
			${list.num }  |  ${list.user }  |  ${list.context }
		</div>
		<hr/>
	</c:forEach>
	
</section>