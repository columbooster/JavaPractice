package exam;

import java.util.Scanner;

public class ReportExam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//���� ���ϱ�
		double mid, fin, rep, att; double a, b, c, total;
		
		System.out.println("�߰���� ������ �Է��� �ּ���.");
		mid = input.nextInt(); // �߰���� ����
		System.out.println("�⸻��� ������ �Է��� �ּ���.");
		fin = input.nextInt(); // �⸻��� ����
		System.out.println("����Ʈ ������ �Է��� �ּ���.");
		rep = input.nextInt(); // ����Ʈ ����
		System.out.println("�⼮ ������ �Է��� �ּ���.");
		att = input.nextInt(); // �⼮ ����
		
		a = (((mid+fin)/2)*0.6); // �߰�+�⸻ ���� 60%����
		b = (rep*0.2); // ����Ʈ ���� 20% ����
		c = (att*0.2); // �⼮ ���� 20% ����
		
		total = (a+b+c);
		
		//���� ���ϱ�
		char grade = '\0';
		
		if(total >= 90) {
			grade = 'A';
		} else if(total >= 80) {
			grade = 'B';
		} else if(total >= 70) {
			grade = 'C';
		} else if(total >= 60) {
			grade = 'D';
		} else grade = 'F';
		
		//�� ���ϱ�
		String eva ="\0";
		
		switch(grade) {
		case 'A':
		case 'B':
			eva = "excellant";
			break;
		case 'C':
		case 'D':
			eva = "good";
			break;
		case 'F':
			eva = "poor";
		}
		
		
		System.out.println("------ ��� �Դϴ� ------");
		System.out.printf("�߰����: %.0f\n", mid); // �Ҽ����� ���ְ� \n ���� �ٹٲٱ�
		System.out.println("�⸻���: "+ (int)fin); // �Ҽ����� ���ֱ� ���� int������ ĳ����.
		System.out.printf("����Ʈ: %.0f%n", rep); // �Ҽ����� ���ְ� %n ���� �ٹٲٱ�
		System.out.println("�⼮����: "+ (int)att);
		System.out.println();
		System.out.printf("���� : %.2f\n", total);
		System.out.println("����: "+ grade);
		System.out.println("��: "+ eva);
		
		input.close();

	}

}
