package subject_management;

import java.util.ArrayList;

import academic_management.MenuViewer;

public class SubjectManagement {
	private SubjectDAO dao = SubjectDAO.getInstance();

	public void read() {
		ArrayList<SubjectVO> svo = dao.getSubjectTotal();
		System.out.println("\n**** subject 테이블 데이터 출력 ****");
		System.out.println("번호\t학과번호\t학과명");

		if (svo.size() > 0) {
			// for(int i = 0; i < svo.size(); i++) {
			// SubjectVO sub = svo
			for (SubjectVO sub : svo) {
				System.out.print(sub.getNo() + "\t");
				System.out.print(sub.getS_num() + "\t");
				System.out.println(sub.getS_name() + "\t");
			}
		} else {
			System.out.println("학과  정보가 존재하지 않습니다.");
		}
	}

	private SubjectVO inputData(String mode) {
		String s_num = null, s_name = null;
//		System.out.print("학과코드 입력 : ");
//		
//		추후 학과 번호를 자동으로 부여하도록 설정
//		switch(mode) {
//			case "input" :
//				s_num = dao.getSubjectNum();
//				System.out.println(s_num);
//				break;
//			case "update" :
//				s_num = MenuViewer.keyboard.nextLine();
//				break;
//		}

		System.out.print("학과코드 입력 : ");
		s_num = MenuViewer.keyboard.nextLine();

		System.out.print("학과명 입력 : ");
		s_name = MenuViewer.keyboard.nextLine();

		SubjectVO sub = new SubjectVO(0, s_num, s_name);
		return sub;
	}

	public void create() {
		SubjectVO svo = inputData("input");
		boolean result = dao.subjectInsert(svo);
		if (result) {
			System.out.println("학과 데이터 입력 성공.");
		} else {
			System.out.println("학과 데이터 입력 실패.");
		}

	}

	private int inputDataNO() {
		int no;
		System.out.print("번호 입력 : ");
		no = MenuViewer.keyboard.nextInt();
		return no;
	}

	public void update() {
		SubjectVO svo = inputData("update");
		int no = inputDataNO();
		svo.setNo(no);

		boolean result = dao.subjectUpdate(svo);
		if (result) {
			System.out.println("학과 데이터 수정 성공");
		} else {
			System.out.println("학과 데이터 수정 실패");
		}

	}

	public void delete() {
		// int no = inputDataNo();
		// boolean result = dao.subjectDelete(no);

		int no = inputDataNO();
		SubjectVO svo = new SubjectVO();
		svo.setNo(no);

		boolean result = dao.subjectDelete(svo);
		if (result) {
			System.out.println("학과 데이터 삭제 성공");
		} else {
			System.out.println("학과 데이터 삭제 실패");
		}
	}

	public void search() {
		SubjectVO svo = inputData("search");
		System.out.println("검색 단어 :" + svo.getS_name());

		ArrayList<SubjectVO> list = dao.getSubjectSearch(svo.getS_name());
		System.out.println("번호\t학과번호\t학과명");
		if (list.size() > 0) {
			for (SubjectVO sub : list) {
				System.out.print(sub.getNo() + "\t");
				System.out.print(sub.getS_num() + "\t");
				System.out.println(sub.getS_name() + "\t");
			}
		} else {
			System.out.println("학과 정보가 존재하지 않습니다.");
		}

	}

}
