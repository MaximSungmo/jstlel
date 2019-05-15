<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>데이터 타입</h1>
	${iVal } <br>
	${fVal }  <br>
	${bVal } <br>
	
	<h1>연산</h1>
	${iVal * 20 + fVal} <br>
	${empty obj  } <br>
	${not empty obj  } <br>
	
	
	<h1>요청 파라미터 가져오기</h1>
	<!-- request.getParameter는 String값  -->
	<%=request.getParameter("a") +10 %> <br>
	<!-- request.getParameter는 Integer값d으로 변환해줌  -->
	${param.a +10} <br>
	
	<h1>객체 접근</h1>
	${requestScope.vo.no }
	${vo.name }
	
	
	<h1>Map 객체 접근</h1>
	${map.iVal } <br>
	${map.fVal } <br>
	${map.bVal } <br>
	
</body>
</html>