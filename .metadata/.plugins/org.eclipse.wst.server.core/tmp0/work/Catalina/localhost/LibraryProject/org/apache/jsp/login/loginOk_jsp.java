/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2023-10-30 06:18:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.MemberVO;

public final class loginOk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/login/../header.jsp", Long.valueOf(1698646246697L));
    _jspx_dependants.put("/login/../footer.jsp", Long.valueOf(1698646246697L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("vo.MemberVO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("        *{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .wrapper{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            min-height: 100%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header{\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 80px;\r\n");
      out.write("            background-color: #0b5da1;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 40px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .row{\r\n");
      out.write("            margin: 1em auto;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: flex-start;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .side-menu{\r\n");
      out.write("            position: relative;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("        }\r\n");
      out.write("        .side-menu a{\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            line-height: 30px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border-radius: 0 5px 5px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .content{\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #intro{\r\n");
      out.write("            top: 0;\r\n");
      out.write("            background-color: #4caf50;\r\n");
      out.write("        }\r\n");
      out.write("        #login, #logout{\r\n");
      out.write("            top: 55px;\r\n");
      out.write("            background-color: #2196f3;\r\n");
      out.write("        }\r\n");
      out.write("        #search{\r\n");
      out.write("            top: 110px;\r\n");
      out.write("            background-color: #f44336;\r\n");
      out.write("        }\r\n");
      out.write("        #rental{\r\n");
      out.write("            top: 165px;\r\n");
      out.write("            background-color: #f5ce42;\r\n");
      out.write("            color: #000;\r\n");
      out.write("        }\r\n");
      out.write("        #quit{\r\n");
      out.write("            top: 220px;\r\n");
      out.write("            background-color: #555;\r\n");
      out.write("        }\r\n");
      out.write("        footer{\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            background-color: #c2d6d6;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        .content table{\r\n");
      out.write("            margin: 50px auto;\r\n");
      out.write("        }\r\n");
      out.write("        h1, h2, h3, h4, h5, h6{\r\n");
      out.write("            margin-bottom: 40px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <h1> 양영디지털고등학교 도서관 홈페이지</h1>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"side-menu\">\r\n");
      out.write("				");

                    MemberVO login = (MemberVO)session.getAttribute("loginOK");
                
      out.write("\r\n");
      out.write("                <a href=\"/LibraryProject/index.jsp\" id=\"intro\">처음으로</a>\r\n");
      out.write("                ");

                	if(login == null){
                
      out.write("\r\n");
      out.write("                        <a href=\"/LibraryProject/login/login.jsp\" id=\"login\">로그인</a>\r\n");
      out.write("                        <a href=\"/LibraryProject/member/signUp.jsp\" id=\"quit\">회원가입</a>\r\n");
      out.write("                        <a href=\"/LibraryProject/book/searchBook.jsp\" id=\"search\">도서 검색</a>\r\n");
      out.write("                        <a href=\"#\" id=\"rental\">도서대출현황</a>\r\n");
      out.write("                ");

                	}else{
                
      out.write("\r\n");
      out.write("         	       <a href=\"/LibraryProject/logout\" id=\"logout\">로그아웃</a>\r\n");
      out.write("         	       <a href=\"/LibraryProject/book/searchBook.jsp\" id=\"search\">도서 검색</a>\r\n");
      out.write("        	       <a href=\"/LibraryProject/rentalBook\" id=\"rental\">도서대출현황</a>\r\n");
      out.write("         	       <a id=\"quit\" onclick=\"doQuit()\">회원탈퇴</a>\r\n");
      out.write("                ");

                	}
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <script>\r\n");
      out.write("            function doQuit() {\r\n");
      out.write("				if(window.confirm(\"회원 탈퇴 시 계정을 복구할 수 없습니다. 정말 탈퇴하시겠습니까?\")){\r\n");
      out.write("					location.href=\"/LibraryProject/quit\";\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("            </script>\r\n");
      out.write("       <div class=\"content\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( login.getName() );
      out.write("님이 로그인 하셨습니다.</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     \r\n");
      out.write("            </div><!-- content 닫기 -->\r\n");
      out.write("        </div><!-- row 닫기 -->\r\n");
      out.write("        <footer>\r\n");
      out.write("            <p>Copyright &copy;양영디지털고등학교 도서관. All right reserved.</p>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div><!-- wrapper닫기 -->\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
