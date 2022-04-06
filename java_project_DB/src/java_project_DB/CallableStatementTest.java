package java_project_DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CallableStatementTest {

	public static void main(String[] args) {
		int book_id;
		Scanner input = null;
		Connection con = null;
		CallableStatement cstmt = null;

		try {
			input = new Scanner(System.in);
			System.out.print("å��ȣ �Է� : ");
			book_id = input.nextInt();

			con = ConnectDatabase.makeConnection("javauser", "java1234");
			cstmt = con.prepareCall("{call books_proc(?,?)}");
			cstmt.setInt(1, book_id);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.executeQuery();

			System.out.println("\n**** BOOKS ���̺� �˻� ������ ****");
			System.out.printf("å���� : %s", cstmt.getString(2));

		} catch (InputMismatchException e) {
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("����Ŭ ���� ���� �� ���� ���࿡ ������ �߻��Ͽ����ϴ�.");
		} catch (Exception e) {
			System.out.println("ERROR(" + e.getMessage());
		} finally {
			try {
				if (input != null)
					input.close();
				if (cstmt != null)
					cstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				System.out.println("���� ���� ����.");
				e2.printStackTrace();
			}
		}

	}

}
