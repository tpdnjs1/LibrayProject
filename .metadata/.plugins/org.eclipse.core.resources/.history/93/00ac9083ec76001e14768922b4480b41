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


@WebServlet("/quit")
public class QuitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public QuitServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		MemberVO user = (MemberVO)session.getAttribute("loginOK");
		int result =0;
		
		if(user == null){
			out.println("<script>alert('탈퇴를 진행 할 수 없습니다. 다시 시도해주세요.'); history.back(); </script>");
		} else {
			MemberDao dao = new MemberDao();
			result = dao.removeMember(user.getId());
			String msg;
			if(result > 0) {
				msg = user.getName() + "님의 회원 정보가 삭제되었습니다. 안녕히가세요.";
			}else {
				msg = user.getName() + "님의 회원 정보 삭제에 실패했습니다. 다시 시도해주세요.";
			}
			
			session.setAttribute("quit", msg);
			response.sendRedirect("/LibraryProject/member/quitResult.jsp");
			}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
