package example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBTest {

	public static void main(String[] args) {
		
		addBook("Clean Code(Ŭ�� �ڵ�)", "�λ���Ʈ", "2013", 33000);
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

			System.out.println("������ Ȯ�� : " + sb);

			int insertCount = stmt.executeUpdate(sb.toString());
			if (insertCount == 1)
				System.out.println("���ڵ� �߰� ����");
			else
				System.out.println("���ڵ� �߰� ����");

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

}
