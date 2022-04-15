package subject_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*DAO(Data Access Object) Ŭ������ ������ ó���� �ñ����� �ܰ��̴�.
 * CRUD ���α׷� ����
 * �⺻���� ������ ó�� ����� �Է�(create,insert), ��ȸ(read(�Ǵ� retrieve), select), ����(update), ����(delete) ����� ������ �����ͺ��̽� ���α׷�.
 */

public class SubjectDAO {

	// �����ͺ��̽� ���� ���� ��� ����
	private static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521/xepdb1";
	private static final String USER = "javauser";
	private static final String PASSWD = "java1234";
	// Ŭ���� �ڽ��� Ÿ������ ���� �ʵ� ����
	private static SubjectDAO instance = null;

	// �ܺο��� ȣ���� �� �ִ� ���� �޼ҵ��� getInstance() �����Ͽ� �ν��Ͻ��� ��ȯ.
	public static SubjectDAO getInstance() {
		if (instance == null) {
			instance = new SubjectDAO();
		}
		return instance;
	}

	// �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���� ���� ���� ������(private) ����
	private SubjectDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(JDBC_URL, USER, PASSWD);
		return con;
	}

	/*
	 * goetSubjectTotal() �޼��� : �а� ���̺��� ��� ���ڵ带 ��ȯ �޼���
	 * 
	 * @return ArrayList<SubjectVO? �ڷ��� ����.
	 */

	public ArrayList<SubjectVO> getSubjectTotal() {
		StringBuffer sql = new StringBuffer();
		sql.append("select no, s_num, s_name from subject order by no");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVO svo = null;
		ArrayList<SubjectVO> list = new ArrayList<SubjectVO>();

		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();

			// ResultSet�� ������� ��� ���� ������ SubjectVO ��ü�� ����
			while (rs.next()) {
				// �� ���� �а� ������ ������ VO ��ü ����
				svo = new SubjectVO();
				// �� ���� �а� ������ VO ��ü�� ����.
				svo.setNo(rs.getInt("no"));
				svo.setS_num(rs.getString("s_num"));
				svo.setS_name(rs.getString("s_name"));

				// ArrayList ��ü�� ���ҷ� �߰�
				list.add(svo);
			}

		} catch (SQLException se) {
			System.out.println("��ȸ�� ������ �־� ��� �Ŀ� �ٽ� ������ �ּ���.");
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println("error = [" + e + " ]");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println("��� ���� ���� error = [ " + e + " ]");
			}
		}
		return list;

	}

	/*
	 * subjectInsert() �޼��� : �а� ���̺� ������ �Է�.
	 * 
	 * @param SubjectVO Ŭ����
	 * 
	 * @return boolean �ڷ��� ����
	 */
	public boolean subjectInsert(SubjectVO svo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into subject(no, s_num, s_name) ");
		sql.append("values(subject_seq.nextval, ?, ?)");

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean success = false;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, svo.getS_num()); // ù��° ?(���ε�����) ������ - �а���ȣ
			pstmt.setString(2, svo.getS_name()); // �ι�° ?(���ε�����) ������ - �а���

			int i = pstmt.executeUpdate(); // ������ ���� - ������� �Էµ� ���� �� ��ȯ..
			if (i == 1) {
				success = true;
			}
		} catch (SQLException se) {
			System.out.println("�Է¿� ������ �־� ��� �Ŀ� �ٽ� ������ �ּ���.");
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println("error = [ " + e + " ]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println("��� ���� ���� error = [ " + e + " ]");
			}
		}
		return success;

	}

	/*
	 * subjectUpdate() �޼��� : �а� ���̺� ������ ����.
	 * 
	 * @param SubjectVO Ŭ����
	 * 
	 * @return boolean �ڷ��� ����
	 */

	public boolean subjectUpdate(SubjectVO svo) {
		StringBuffer sql = new StringBuffer();
		sql.append("update subject set s_name =? ");
		sql.append("where no = ?");

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean success = false;

		try {
			con = getConnection();

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, svo.getS_name());
			pstmt.setInt(2, svo.getNo());

			int i = pstmt.executeUpdate();
			if (i == 1) {
				success = true;
			}

		} catch (SQLException e) {
			System.out.println("������ ������ �־� ��� �Ŀ� �ٽ� ������ �ּ���.");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("error = [ " + e2 + " ]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				System.out.println("��� ���� ���� error = [" + e2 + " ]");
			}
		}
		return success;

	}

	/*
	 * subjectDelete() �޼��� : �а� ���̺� ������ ����.
	 * 
	 * @param SubjectVO Ŭ����
	 * 
	 * @return boolean �ڷ��� ���� ������� : ��������ȭ�鿡�� ����帰 �κ� ������ �ּ���(01~05�� ������ ������ ������ ����)
	 * �Ű������� SubjectVO�� ����� �־ �ǰ� ������ �Ϸù�ȣ�� ����Ͽ��� �ȴ�.
	 */
	public boolean subjectDelete(SubjectVO svo) {
		// public boolean subjectDelete(int no)
		StringBuffer sql = new StringBuffer();
		sql.append("delete from subject where no = ?");

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean success = false;

		try {
			con = getConnection();

			pstmt = con.prepareStatement(sql.toString());
			// pstmt.setInt(1, no);
			pstmt.setInt(1, svo.getNo());

			int i = pstmt.executeUpdate();
			if (i == 1) {
				success = true;
			}
		} catch (SQLException e) {
			System.out.println("������ ������ �־� ��� �Ŀ� �ٽ� ������ �ּ���.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error = [ " + e + " ]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				System.out.println("��� ���� ���� error = [ " + e2 + " ]");
			}
		}
		return success;

	}

	/*
	 * subjectSearch() �޼��� : �а��� �˻�.
	 * 
	 * @param �а���
	 * 
	 * @return ArrayList<SubjectVO> �ڷ��� ����. ������� : ���� �˻��κ��� ��ü ��ȸ �޼��忡�� ���� ó���ϵ���
	 * �����Ѵ�.
	 */

	public ArrayList<SubjectVO> getSubjectSearch(String s_name) {
		StringBuffer sql = new StringBuffer();
		sql.append("select no, s_num, s_name, from subject ");
		sql.append("where s_name like ? ");
		sql.append("order by no");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVO svo = null;
		ArrayList<SubjectVO> list = new ArrayList<SubjectVO>();

		try {
			con = getConnection();

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, "%" + s_name + "%");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				svo = new SubjectVO();
				svo.setNo(rs.getInt("no"));
				svo.setS_num(rs.getString("s_num"));
				svo.setS_name(rs.getString("s_name"));

				list.add(svo);
			}

		} catch (SQLException e) {
			System.out.println("�˻��� ������ �־� ��� �Ŀ� �ٽ� ������ �ּ���.");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("error = [ " + e2 + " ]");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				System.out.println("��� ���� ���� error = [ " + e2 + " ]");
			}
		}
		return list;

	}

	/*
	 * subjectNum() �޼��� : �а���ȣ �ڵ� ���ϱ�.
	 * 
	 * @return String �ڷ��� ����.
	 */

	public String getSubjectNum() {
		StringBuffer sql = new StringBuffer();
		sql.append("select nvl(lpad(max(to_number(LTRIM(s_num,'0')))+1,2,'0'),'01') ");
		sql.append("as subjectNum from subject");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String subjectNumber = "";

		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				subjectNumber = rs.getString("subjectNum");
			}

		} catch (SQLException e) {
			System.out.println("���� getSubjectNum error = [ " + e + " ]");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("error = [ " + e2 + " ]");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println("��� ���� ���� error = [ " + e + " ]");
			}
		}
		return subjectNumber;
	}

}
