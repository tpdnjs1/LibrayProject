<%@page import="vo.RentVO"%>
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

	<% ArrayList<RentVO> list = (ArrayList<RentVO>)request.getAttribute("rentList"); %>

    <h2>도서 대여 결과 화면</h2>
    <table border="1" align="center" width="800px">
        <tr>
            <th>사용자ID</th>
            <th>대출자</th>
            <th>책이름</th>
            <th>반납하기</th>
        </tr>
<%
		if(list != null){
			for(RentVO data : list){
%>
        <tr>
            <td><%= data.getMemberId() %></td>
           <td><%= data.getMemberName() %></td>
            <td><%= data.getBookTitle() %></td>
<%
				if(login == null){

				}else{
%>
					<td><a href="/LibraryProject/returnBook?bookNum=<%= data.getBookNum()%>">반납하기</a></td>
<%
				}
%>
		</tr>
<%
			}
		}
%>
    </table>
	<%@ include file="../footer.jsp" %>
</body>
</html>