<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
	<%@ include file="../header.jsp" %>
    <%
    	String msg = (String)session.getAttribute("quit");
    %>
    <h2>회원 탈퇴 결과</h2>
    <p><%= msg %></p>
	<%@ include file="../footer.jsp" %>
</body>
</html>