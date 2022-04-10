package academic_management;

import subject_management.SubjectManagement;

public class AcademicManagement {

	public static void main(String[] args) {
		SubjectManagement subject = new SubjectManagement();
		int topMenuchoice, subMenuchoice;

		System.out.println("�л� ���� ���α׷��� �����մϴ�..");
		while (true) {
			MenuViewer.showTopMenu();
			topMenuchoice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();

			if (topMenuchoice < 1 || topMenuchoice > 3) {
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.\n");
				continue;
			}

			if (topMenuchoice == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}

			MenuViewer.showSubMenu();
			subMenuchoice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();

			if (topMenuchoice == 1) {
				switch (subMenuchoice) {
				case 1:
					//System.out.println("��ȸ\n");
					subject.read();
					break;
				case 2:
					//System.out.println("�Է�\n");
					subject.create();
					break;
				case 3:
					System.out.println("����\n");
					// subject.update();
					break;
				case 4:
					System.out.println("����\n");
					// subject.delete();
					break;
				case 5:
					System.out.println("�˻�(�а���)\n");
					// subject.search();
					break;
				default:
					System.out.println("��ȸ, �Է�, ����, ����, �˻� �߿� �ϳ��� �������ֽø� �˴ϴ�\n");
				}

			} else if (topMenuchoice == 2) {
				System.out.println("���� �غ��߿� �ֽ��ϴ�.\n");
			}

		}

	}

}
