package exam_class_basic;

import java.util.Scanner;

/*
 * ������ ���ϴ� score Ŭ������ ��������.
 * �̸�/����/����/����/������ �����ϰ��� �Ѵ�.
 * �ʵ忡 ���� ������ �� �ִ� ���, �������� ���� ���ϴ� ���, ������ ���ϴ� ���,
 * ��� �ʵ带 ����� �� �ִ� ����� �����ϵ��� �Ѵ�.
 * 
 * [��°��]
 * ����ڷ� �Ͽ��� �̸� �� �������� �Է¹޾� �Ʒ��� ����� ����ϵ��� ����.
 * �������� ������ ����
 * 
====================================
�̸�		����	����	����	����	���	    ����	
====================================
ȫ�浿	90	75	61	226	75.3	C	
��ö��	55	56	46	157	52.3	F	
������	90	90	90	270	90.0	A	

 * 
 * 
 * 
 */


public class scoreTest {
	
	public static Scanner input = new Scanner(System.in);
	//�����͸� �Է¹ޱ� ���� �޼��� Score score = s1
	public static void inputData(Score score) { // �Ű����� : Ŭ������ �������� = �ּҰ�
		//�ʵ忡 ���� ���� 
		System.out.println("�̸� �Է�: ");
		score.studentName = input.nextLine();
		System.out.println("���� ���� �Է�: ");
		score.kor = input.nextInt();
		System.out.println("���� ���� �Է�: ");
		score.eng = input.nextInt();
		System.out.println("���� ���� �Է�: ");
		score.math = input.nextInt();
		input.nextLine();
		
	}
	//������ �˸��� main() �޼���
	public static void main(String[] args) {
		Score s1 = new Score();
		//s1.scoreDate("ȫ�浿",90,75,61);
		inputData(s1);
		s1.getSum();
		
		Score s2 = new Score();
		s2.scoreData("��ö��",55,56,46);
		//inputData(s2);
		s2.getSum();
		
		Score s3 = new Score();
		s3.scoreData("������", 90, 90, 90);
		//inputData(s3);
		s3.getSum();
		
		System.out.println("====================================================");
		String[] subject = {"�̸�","����","����","����","����","���","����"};
		for(int i = 0; i <subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
		System.out.println("\n====================================================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		

	}

}
