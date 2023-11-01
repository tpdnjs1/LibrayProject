<%@page import="vo.BookVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
	<%@ include file="../header.jsp" %>

	<% ArrayList<BookVO> list = (ArrayList<BookVO>)request.getAttribute("booklist"); %>

    <h1>도서 전체 확인</h1>
    <table border="1" align="center" width="800px">
        <tr>
            <th>도서번호</th>
            <th>책이름</th>
            <th>저자</th>
            <th>출판사</th>
            <th>가격</th>
            <th>대여하기</th>
        </tr>
<%
		if(list != null){
			for(BookVO data : list){
%>
        <tr>
            <th><%= data.getNum() %></th>
           <th><%= data.getTitle() %></th>
            <th><%= data.getAuthor() %></th>
            <th><%= data.getCompany() %></th>
            <th><%= data.getPrice() %></th>
            <th><a href="/BookProject/updateBook?isbn=<%= data.getNum()%>">수정</a></th>
        </tr>
<%
			}
		}
%>
    </table>
	<%@ include file="../footer.jsp" %>
</body>
</html>