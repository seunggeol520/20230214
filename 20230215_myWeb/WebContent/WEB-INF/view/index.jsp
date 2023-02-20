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
	
	<jsp:include page="/WEB-INF/view/board/boardList.jsp"/>
	
	<button class="insert">글작성</button>
	<!-- jsp:include page="/WEB-INF/view/board/boardInsert.jsp"/ -->
		
		<script>
			$(".insert").on("click", function(){
				location.href="<%=request.getContextPath()%>/insert";
			});
			
		</script>
</body>
</html>