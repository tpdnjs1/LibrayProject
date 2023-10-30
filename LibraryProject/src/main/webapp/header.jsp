<%@page import="vo.MemberVO"%>
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
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            list-style: none;
            text-decoration: none;
        }

        .wrapper{
            width: 100%;
            min-height: 100%;
            margin: 0 auto;
            padding: 10px;
        }

        header{
            height: 100px;
            text-align: center;
            line-height: 80px;
            background-color: #0b5da1;
            color: #fff;
            padding: 10px;
            margin-bottom: 40px;
        }

        .row{
            margin: 1em auto;
            display: flex;
            justify-content: flex-start;
            flex-wrap: wrap;
        }

        .side-menu{
            position: relative;
            width: 150px;
            height: 300px;
        }
        .side-menu a{
            position: absolute;
            width: 200px;
            padding: 10px;
            line-height: 30px;
            font-size: 15px;
            text-align: center;
            font-weight: bold;
            color: #fff;
            border-radius: 0 5px 5px 0;
        }

        .content{
            width: 80%;
            text-align: center;
        }

        #intro{
            top: 0;
            background-color: #4caf50;
        }
        #login, #logout{
            top: 55px;
            background-color: #2196f3;
        }
        #search{
            top: 110px;
            background-color: #f44336;
        }
        #rental{
            top: 165px;
            background-color: #f5ce42;
            color: #000;
        }
        #quit{
            top: 220px;
            background-color: #555;
        }
        footer{
            position: absolute;
            width: 100%;
            height: 50px;
            left: 0;
            bottom: 0;
            background-color: #c2d6d6;
            text-align: center;
            line-height: 50px;
        }
        .content table{
            margin: 50px auto;
        }
        h1, h2, h3, h4, h5, h6{
            margin-bottom: 40px;
        }
    </style>
</head>
<body>
    <div class="wrapper">
        <header>
            <h1> 양영디지털고등학교 도서관 홈페이지</h1>
        </header>
        <div class="row">
            <div class="side-menu">
				<%
                    MemberVO login = (MemberVO)session.getAttribute("loginOK");
                %>
                <a href="/LibraryProject/index.jsp" id="intro">처음으로</a>
                <%
                	if(login == null){
                %>
                        <a href="/LibraryProject/login/login.jsp" id="login">로그인</a>
                        <a href="/LibraryProject/member/signUp.jsp" id="quit">회원가입</a>
                        <a href="/LibraryProject/book/searchBook.jsp" id="search">도서 검색</a>
                        <a href="#" id="rental">도서대출현황</a>
                <%
                	}else{
                %>
         	       <a href="/LibraryProject/logout" id="logout">로그아웃</a>
         	       <a href="/LibraryProject/book/searchBook.jsp" id="search">도서 검색</a>
        	       <a href="/LibraryProject/rentalBook" id="rental">도서대출현황</a>
         	       <a id="quit" onclick="doQuit()">회원탈퇴</a>
                <%
                	}
                %>

            </div>
            
            <script>
            function doQuit() {
				if(window.confirm("회원 탈퇴 시 계정을 복구할 수 없습니다. 정말 탈퇴하시겠습니까?")){
					location.href="/LibraryProject/quit";
				}
			}
            </script>
       <div class="content">
</body>
</html>