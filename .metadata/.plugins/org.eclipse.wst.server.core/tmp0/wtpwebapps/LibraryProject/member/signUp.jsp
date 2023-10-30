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
    <h2>회원 가입 화면</h2>

    <form action="/LibraryProject/signUp" method="post">
        <table width="500px" border="1" align="center">
            <tr>
                <td>회원 ID</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>회원 PW</td>
                <td><input type="password" name="pw"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>나이</td>
                <td><input type="number" name="age"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="가입">
                    &nbsp;&nbsp;
                    <input type="reset" value="취소">
                </td>
            </tr>
        </table>
    </form>
	<%@ include file="../footer.jsp" %>
</body>
</html>