package exam_class_basic;

public class Score {
	//�ʵ弱��
	public String studentName;
	public int kor;
	public int eng;
	public int math;
	public int sum;
	
	/* 						�Ű�����
	 * ����������(������) ����Ÿ�� �޼����(�ڷ��� ������, �ڷ��� ������) ==> �޼��� ����
	 * 				 void
	 * 				 �ڷ���(������/������)
	 */
	
	//������
	public void scoreData(String n, int kor, int eng, int math) {
		this.studentName = n;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	//���� ���ϴ� �޼���
	public void getSum() {
		sum = kor+eng+math;
	}

	//����� ���ϴ� �޼���
	public double getAverage() {
		return (double)sum/3;
	}
	//������ ���ϴ� �޼���
	public char getGrade() {
		char hakjum = '\n'; // null�� �ǹ�
		double avg = getAverage();
		
		if(avg>=90) {
			hakjum = 'A';
		} else if(avg>=80) {
			hakjum = 'B';
		} else if(avg>=70) {
			hakjum = 'C';
		} else if(avg>=60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
		return hakjum;
			
	}
	
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t",studentName,kor,eng,math,sum,getAverage(),getGrade());
	}
	
	
	
	

}
