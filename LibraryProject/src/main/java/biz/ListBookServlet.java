package biz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import vo.BookVO;


@WebServlet("/listBook")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListBookServlet() {
    	super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String search = request.getParameter("title");
		BookDao dao = new BookDao();
		ArrayList<BookVO> list = dao.getBookList(search);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
