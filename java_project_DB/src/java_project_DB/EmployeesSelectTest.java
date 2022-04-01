package java_project_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesSelectTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int employee_id, salary;
		String first_name, department_name;

		try {
			con = ConnectDatabase.makeConnection("hr", "hr1234");
			stmt = con.createStatement();

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT employee_id, first_name, salary, department_name ");
			sql.append("FROM employees e INNER JOIN departments d ");
			sql.append("ON e.department_id = d.department_id");
			rs = stmt.executeQuery(sql.toString());

			System.out.println("**** EMPLOYEES 테이블 데이터 출력 ****\n");
			System.out.printf("%s\t%s\t%6s\t%7s\n", "사원번호", "사원이름", "급여", "부서번호");

			while (rs.next()) {
				employee_id = rs.getInt("employee_id");
				first_name = rs.getString("first_name");
				salary = rs.getInt("salary");
				department_name = rs.getString("department_name");
				System.out.printf("%-7d %-11s %-6d %s\n", employee_id, first_name, salary, department_name);
			}

		} catch (SQLException e) {
			System.err.println("[쿼리문 ERROR] \n" + e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				System.out.println("CLOSE ERROR");
			}
		}

	}

}
