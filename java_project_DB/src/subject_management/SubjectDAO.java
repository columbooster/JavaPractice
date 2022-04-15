package subject_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*DAO(Data Access Object) 클래스가 데이터 처리의 궁극적인 단계이다.
 * CRUD 프로그램 구현
 * 기본적인 데이터 처리 기능인 입력(create,insert), 조회(read(또는 retrieve), select), 수정(update), 삭제(delete) 기능을 구현한 데이터베이스 프로그램.
 */

public class SubjectDAO {

	// 데이터베이스 연결 관련 상수 선언
	private static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521/xepdb1";
	private static final String USER = "javauser";
	private static final String PASSWD = "java1234";
	// 클래스 자신의 타입으로 정적 필드 선언
	private static SubjectDAO instance = null;

	// 외부에서 호출할 수 있는 정적 메소드인 getInstance() 선언하여 인스턴스를 반환.
	public static SubjectDAO getInstance() {
		if (instance == null) {
			instance = new SubjectDAO();
		}
		return instance;
	}

	// 외부에서 new 연산자로 생성자를 호출할 수 없도록 막기 위해 접근 제한자(private) 설정
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
	 * goetSubjectTotal() 메서드 : 학과 테이블에서 모든 레코드를 반환 메서드
	 * 
	 * @return ArrayList<SubjectVO? 자료형 리턴.
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

			// ResultSet의 결과에서 모든 행을 각각의 SubjectVO 객체에 저장
			while (rs.next()) {
				// 한 행의 학과 정보를 저장할 VO 객체 생성
				svo = new SubjectVO();
				// 한 행의 학과 정보를 VO 객체에 저장.
				svo.setNo(rs.getInt("no"));
				svo.setS_num(rs.getString("s_num"));
				svo.setS_name(rs.getString("s_name"));

				// ArrayList 객체에 원소로 추가
				list.add(svo);
			}

		} catch (SQLException se) {
			System.out.println("조회에 문제가 있어 잠시 후에 다시 진행해 주세요.");
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
				System.out.println("디비 연동 해제 error = [ " + e + " ]");
			}
		}
		return list;

	}

	/*
	 * subjectInsert() 메서드 : 학과 테이블에 데이터 입력.
	 * 
	 * @param SubjectVO 클래스
	 * 
	 * @return boolean 자료형 리턴
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
			pstmt.setString(1, svo.getS_num()); // 첫번째 ?(바인딩변수) 설정값 - 학과번호
			pstmt.setString(2, svo.getS_name()); // 두번째 ?(바인딩변수) 설정값 - 학과명

			int i = pstmt.executeUpdate(); // 쿼리문 실행 - 결과값은 입력된 행의 수 반환..
			if (i == 1) {
				success = true;
			}
		} catch (SQLException se) {
			System.out.println("입력에 문제가 있어 잠시 후에 다시 진행해 주세요.");
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
				System.out.println("디비 연동 해제 error = [ " + e + " ]");
			}
		}
		return success;

	}

	/*
	 * subjectUpdate() 메서드 : 학과 테이블에 데이터 수정.
	 * 
	 * @param SubjectVO 클래스
	 * 
	 * @return boolean 자료형 리턴
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
			System.out.println("수정에 문제가 있어 잠시 후에 다시 진행해 주세요.");
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
				System.out.println("디비 연동 해제 error = [" + e2 + " ]");
			}
		}
		return success;

	}

	/*
	 * subjectDelete() 메서드 : 학과 테이블에 데이터 삭제.
	 * 
	 * @param SubjectVO 클래스
	 * 
	 * @return boolean 자료형 리턴 참고사항 : 삭제실행화면에서 설명드린 부분 참조해 주세요(01~05를 제외한 나머지 데이터 삭제)
	 * 매개변수로 SubjectVO로 명시해 주어도 되고 삭제할 일련번호로 명시하여도 된다.
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
			System.out.println("삭제에 문제가 있어 잠시 후에 다시 진행해 주세요.");
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
				System.out.println("디비 연동 해제 error = [ " + e2 + " ]");
			}
		}
		return success;

	}

	/*
	 * subjectSearch() 메서드 : 학과명 검색.
	 * 
	 * @param 학과명
	 * 
	 * @return ArrayList<SubjectVO> 자료형 리턴. 참고사항 : 추후 검색부분은 전체 조회 메서드에서 같이 처리하도록
	 * 수정한다.
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
			System.out.println("검색에 문제가 있어 잠시 후에 다시 진행해 주세요.");
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
				System.out.println("디비 연동 해제 error = [ " + e2 + " ]");
			}
		}
		return list;

	}

	/*
	 * subjectNum() 메서드 : 학과번호 자동 구하기.
	 * 
	 * @return String 자료형 리턴.
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
			System.out.println("쿼리 getSubjectNum error = [ " + e + " ]");
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
				System.out.println("디비 연동 해제 error = [ " + e + " ]");
			}
		}
		return subjectNumber;
	}

}
