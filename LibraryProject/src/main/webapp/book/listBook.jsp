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
            <td><%= data.getNum() %></td>
           <td><%= data.getTitle() %></td>
            <td><%= data.getAuthor() %></td>
            <td><%= data.getCompany() %></td>
            <td><%= data.getPrice() %></td>
<%
				if(login == null){
					out.println("<td></td>");
				}else{
					if(data.getRent() == 't'){
						out.println("<td>대여중</td>");
					}else{
						%>
						<td><a href="/LibraryProject/rentBook?book_num=<%= data.getNum() %>>">대여하기</a></td>
						<%
					}
				}
%>
		</tr>
<%
			}
		} else {
%>
			<tr>
				<td colspan="6">정보를 찾을 수 없습니다.</td>
			</tr>
<%
		}
%>
    </table>
	<%@ include file="../footer.jsp" %>
</body>
</html>