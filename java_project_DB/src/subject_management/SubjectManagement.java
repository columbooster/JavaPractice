package subject_management;

import java.util.ArrayList;

import academic_management.MenuViewer;

public class SubjectManagement {
	private SubjectDAO dao = SubjectDAO.getInstance();

	public void read() {
		ArrayList<SubjectVO> svo = dao.getSubjectTotal();
		System.out.println("\n**** subject ���̺� ������ ��� ****");
		System.out.println("��ȣ\t�а���ȣ\t�а���");

		if (svo.size() > 0) {
			// for(int i = 0; i < svo.size(); i++) {
			// SubjectVO sub = svo
			for (SubjectVO sub : svo) {
				System.out.print(sub.getNo() + "\t");
				System.out.print(sub.getS_num() + "\t");
				System.out.println(sub.getS_name() + "\t");
			}
		} else {
			System.out.println("�а� ������ �������� �ʽ��ϴ�.");
		}
	}

	private SubjectVO inputData(String mode) {
		String s_num = null, s_name = null;
//		System.out.print("�а��ڵ� �Է� : ");
//		
//		���� �а� ��ȣ�� �ڵ����� �ο��ϵ��� ����
//		switch(mode) {
//			case "input" :
//				s_num = dao.getSubjectNum();
//				System.out.println(s_num);
//				break;
//			case "update" :
//				s_num = MenuViewer.keyboard.nextLine();
//				break;
//		}

		System.out.print("�а��ڵ� �Է� : ");
		s_num = MenuViewer.keyboard.nextLine();

		System.out.print("�а��� �Է� : ");
		s_name = MenuViewer.keyboard.nextLine();

		SubjectVO sub = new SubjectVO(0, s_num, s_name);
		return sub;
	}

	public void create() {
		SubjectVO svo = inputData("input");
		boolean result = dao.subjectInsert(svo);
		if (result) {
			System.out.println("�а� ������ �Է� ����.");
		} else {
			System.out.println("�а� ������ �Է� ����.");
		}

	}

	private int inputDataNO() {
		return 0;
	}

	public void update() {

	}

	public void delete() {

	}

	public void search() {

	}

}