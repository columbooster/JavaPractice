package java_project_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BooksPreparedStatementTest {
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");

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
				System.out.println("\n**** books 테이블 데이터 입력****");

				System.out.print("책제목 입력 : ");
				title = input.nextLine();
				System.out.print("출판사 입력 : ");
				publisher = input.nextLine();
				System.out.print("출판연도 입력 : ");
				year = input.nextLine();
				System.out.print("가격 입력 : ");
				price = input.nextInt();

				addBook(title, publisher, year, price);
				break;
			case 2:
				System.out.println("\n**** books 테이블 데이터 삭제****");

				System.out.print("책번호 입력 : ");
				int book_id = input.nextInt();
				deleteBook(book_id);
				break;
			case 3:
				readAllBook();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
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
				System.out.println("레코드 추가 성공");
			} else
				System.out.println("레코드 추가 실패");
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
