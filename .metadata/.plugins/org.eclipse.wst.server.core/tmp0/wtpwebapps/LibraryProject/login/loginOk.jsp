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

<p><%= login.getName() %>님이 로그인 하셨습니다.</p>

<%@ include file="../footer.jsp" %>
</body>
</html>