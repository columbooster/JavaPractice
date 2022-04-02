package java_project_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BooksInsertTest {

	public static void main(String[] args) {
		//addBook("Clean Code(클린 코드)", "인사이트", "2013", 33000);
		searchBook();
	}

	private static void addBook(String title, String publisher, String year, int price) {
		Connection con = ConnectDatabase.makeConnection("javauser", "java1234");
		Statement stmt = null;

		try {
			stmt = con.createStatement();

			StringBuffer sb = new StringBuffer();
			sb.append("INSERT INTO books (book_id, title, publisher, ");
			sb.append("year, price) VALUES (books_seq.nextval, ");
			sb.append("'" + title + "','" + publisher + "','");
			sb.append(year + "'," + price + ")");

			System.out.println("쿼리문 확인 : " + sb);

			int insertCount = stmt.executeUpdate(sb.toString());
			if (insertCount == 1)
				System.out.println("레코드 추가 성공");
			else
				System.out.println("레코드 추가 실패");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private static void searchBook() {
		Connection con = ConnectDatabase.makeConnection("javauser", "java1234");
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.createStatement();

			StringBuffer sb = new StringBuffer();
			sb.append("select book_id, title, publisher, year, price ");
			sb.append("from books order by book_id");

			System.out.println("쿼리문 확인 : " + sb);

			rs = stmt.executeQuery(sb.toString());
			System.out.println("**** 책정보 출력 ****\n");
			while (rs.next()) {
				System.out.print(rs.getInt("book_id") + "\t");
				System.out.print(rs.getString("title") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.print(rs.getString("year") + "\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
