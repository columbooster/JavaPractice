package exam_class_basic;

public class Score {
	//필드선언
	public String studentName;
	public int kor;
	public int eng;
	public int math;
	public int sum;
	
	/* 						매개변수
	 * 접근제어자(제한자) 리턴타입 메서드명(자료형 변수명, 자료형 변수명) ==> 메서드 선언
	 * 				 void
	 * 				 자료형(기초형/참조형)
	 */
	
	//생성자
	public void scoreData(String n, int kor, int eng, int math) {
		this.studentName = n;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	//합을 구하는 메서드
	public void getSum() {
		sum = kor+eng+math;
	}

	//평균을 구하는 메서드
	public double getAverage() {
		return (double)sum/3;
	}
	//학점을 구하는 메서드
	public char getGrade() {
		char hakjum = '\n'; // null을 의미
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
