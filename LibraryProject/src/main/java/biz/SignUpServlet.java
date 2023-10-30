package biz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import vo.MemberVO;


@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignUpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		MemberDao dao = new MemberDao();
		boolean isExist = dao.existId(request.getParameter("id"));
		int result = 0;
		
		if(isExist) {
			out.println("<script>alert('이미 존재하는 ID입니다. 다시 시도해주세요.'); history.back(); </script>");
		} else {
			MemberVO vo = new MemberVO();
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));
			vo.setName(request.getParameter("name"));
			vo.setAddress(request.getParameter("address"));
			vo.setAge(Integer.parseInt(request.getParameter("age")));
			
			result = dao.insertMember(vo);
			
			if(result > 0) {
				HttpSession session = request.getSession();
				session.setAttribute("loginOK", vo);
				out.println("<script>alert('회원가입 되었습니다.');</script>");
				
				response.sendRedirect("/LibraryProject/login/loginOk.jsp");
			} else {
				out.println("<script>alert('회원가입에 실패하였습니다. 다시 시도해주세요.'); history.back(); </script>");
			}
		}
	}

}
