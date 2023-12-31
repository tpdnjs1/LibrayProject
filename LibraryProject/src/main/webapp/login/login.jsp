<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        form{
            background-color: #ccc;
            padding: 10px;
            margin: 0 auto;
            width: 300px;
        }

        .login-container{
            border: 3px solid #f1f1f1;
            padding: 16px;
        }

        input[type=text], input[type=password]{
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
        }
        input[type=submit]{
            background-color: #4caf50;
            color: #fff;
            padding: 14px 20px;
            margin: 8px 0;
            cursor: pointer;
            width: 100%;
        }

        a{
            text-decoration: none;
            color:#000;
        }
    </style>
</head>
<body>
<%@ include file="../header.jsp" %>

    <h2>양영디지털고등학교 도서관 로그인 페이지</h2>

    <form action="/LibraryProject/loginServlet" method="post">
        <div class="login-container">
            <label><b>User ID</b></label>
            <input type="text" placeholder="test" name="id">
                                               
            <label><b>User PW</b></label>
            <input type="password" placeholder="1234" name="pw">

            <input type="submit" value="로그인">

            <a href="/LibraryProject/member/signUp.jsp">회원가입</a>
        </div>
    </form>
<%@ include file="../footer.jsp" %>
</body>
</html>