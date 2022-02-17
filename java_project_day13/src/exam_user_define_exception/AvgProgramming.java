package exam_user_define_exception;

import java.util.Scanner;

/*����ڷκ��� ����, ����, ����, ������ �Է� �޾Ƽ� ����� ����ϴ� ���α׷��� �ۼ��Ͽ� ����.
 * ���� ����ڰ� ������ �Է��ϸ� NegativeNumberException(����� ���� Ŭ����)�� �߻��Ѵ�.
 * �� ���ܸ� catch��� �������� ��Ƽ� ó���ϴ� �ڵ嵵 �߰��϶�.
 * ���� sum() �̶�� ������ ���� ��ȯ �޵��� �޼��带 �����Ͽ� ����.
 */

//����� ���� Ŭ����
@SuppressWarnings("serial")
class NegativeNumberException extends Exception {

	private String msg;

	public NegativeNumberException() {
		//super("���� �Է� �Ұ�");
	}

	public NegativeNumberException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		if (msg == null) {
			return "���� �Է� �Ұ�";
		} else {
			return msg;
		}
	}

}

class Avg {
	private int kor, eng, math;
	private double avg;
	
	public Avg() {
		
	}
	
	public Avg(int kor, int eng, int math) throws NegativeNumberException {
		if(kor<0 || eng<0 || math <0) {
			throw new NegativeNumberException("���� �Է� �Ұ�");
		}
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public double avgMethod() {
		this.avg = sum()/3;
		return avg;
	}
	
	public int sum() {
		return kor+eng+math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	
	
}



public class AvgProgramming {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		try {
		Avg avg = new Avg(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(avg.avgMethod());
		System.out.println(avg.sum());
		}catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
	}
	

}