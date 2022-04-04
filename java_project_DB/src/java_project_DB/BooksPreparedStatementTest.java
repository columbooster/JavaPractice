package java_project_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BooksPreparedStatementTest {
	public static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ ����");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� : ");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String title, publisher, year;
		int choice, price;

		while (true) {
			showMenu();
			choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.println("\n**** books ���̺� ������ �Է�****");

				System.out.print("å���� �Է� : ");
				title = input.nextLine();
				System.out.print("���ǻ� �Է� : ");
				publisher = input.nextLine();
				System.out.print("���ǿ��� �Է� : ");
				year = input.nextLine();
				System.out.print("���� �Է� : ");
				price = input.nextInt();

				addBook(title, publisher, year, price);
				break;
			case 2:
				System.out.println("\n**** books ���̺� ������ ����****");

				System.out.print("å��ȣ �Է� : ");
				int book_id = input.nextInt();
				deleteBook(book_id);
				break;
			case 3:
				readAllBook();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				input.close();
				return;

			}

		}

	}

	public static void addBook(String title, String publisher, String year, int price) {
		Connection con = ConnectDatabase.makeConnection("javauser", "java1234");
		PreparedStatement pstmt = null;

		try {
			StringBuffer sb = new StringBuffer();
			sb.append("INSERT INTO books (book_id, title, publisher, year, price) ");
			sb.append("VALUES(books_seq.nextval,?,?,?,?)");

			pstmt = con.prepareStatement(sb.toString());

			pstmt.setString(1, title);
			pstmt.setString(2, publisher);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);

			int insertCount = pstmt.executeUpdate();

			if (insertCount == 1) {
				System.out.println("���ڵ� �߰� ����");
			} else
				System.out.println("���ڵ� �߰� ����");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
			;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private static void readAllBook() {

	}

	private static void deleteBook(int book_id) {

	}

}
