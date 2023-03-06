<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내정보보기</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<form id="frmInfo" method="get">
		<input value="${memberVo.id}" type="text" name="id" readonly="readonly"><br>
		<input value="${memberVo.passwd}" type="password" readonly="readonly"><br>
		<input value="${memberVo.name}" type="text" readonly="readonly"><br>
		<input value="${memberVo.email}" type="text" readonly="readonly"><br>
		<button type="button" onclick="frmSubmit('update');">수정</button>
		<button type="button" onclick="frmSubmit('delete');">탈퇴</button>
		<button type="button">수정</button>
		<button type="button">탈퇴</button>
	</form>
	
	<script>
	
		console.log($("button").eq(2).text());	
		console.log($("button").get(2).innerText);	
	
		$("button").eq(2).click('update', frmSubmit2);
		$("button").eq(3).click('delete', frmSubmit2);
	
		function frmSubmit2(event){
				//$("#frmInfo").attr("action", targetEle);
				//$("#frmInfo").submit();
				console.log(this); // 이벤트가 발생한 시점의 element
				
				frmInfo.action = event.data;
				frmInfo.submit();
		}
		function frmSubmit(targetEle){
				//$("#frmInfo").attr("action", targetEle);
				//$("#frmInfo").submit();
				
				console.log(this); // window 전체 객체
				
				frmInfo.action = targetEle;
				frmInfo.submit();
		}
		
	</script>
	
</body>
</html>