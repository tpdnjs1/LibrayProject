package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.JdbcUtil;
import oracle.net.aso.p;
import vo.BookVO;

public class BookDao{
	public BookDao(){
		
	}
	
	public ArrayList<BookVO> getBookList(String search){
		ArrayList<BookVO> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			conn = JdbcUtil.getConnection();
			
			if (search.equals("all")) {
				sql = "SELECT * FROM book ORDER BY num ASC";
				pstmt = conn.prepareStatement(sql);
			}else {
				sql = "SELECT * FROM book WHERE title like ? ORDER BY num ASC";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%" + search + "%");
			}
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BookVO vo = new BookVO();
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setAuthor(rs.getString("author"));
				vo.setCompany(rs.getString("company"));
				vo.setPrice(rs.getInt("price"));
				vo.setRent(rs.getString("rent").charAt(0));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("book 테이블 조회 실패");
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	public int setRentField(int num, char rent) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE book SET rent=? WHERE num=?";
		
		try {
			conn = JdbcUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, String.valueOf(rent));
			pstmt.setInt(2, num);
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("string인게 문제인듯");
		} finally {
			JdbcUtil.close(conn, pstmt);
		}
		
		return result;
	}

}


