package exam_user_define_exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*사용자로부터 국어, 영어, 수학, 점수를 입력 받아서 평균을 계산하는 프로그램을 작성하여 보자.
 * 만약 사용자가 음수를 입력하면 NegativeNumberException(사용자 예외 클래스)을 발생한다.
 * 이 예외를 catch라는 블록으로 잡아서 처리하는 코드도 추가하라.
 * 또한 sum() 이라는 점수의 합을 반환 받도록 메서드를 정의하여 보자.
 */

//사용자 예외 클래스
@SuppressWarnings("serial")
class NegativeNumberException extends Exception {

//	private String msg;

	public NegativeNumberException() {
		super("음수 입력 불가");
	}
//
//	public NegativeNumberException(String msg) {
//		this.msg = msg;
//	}
//
//	@Override
//	public String getMessage() {
//		if (msg == null) {
//			return "음수 입력 불가";
//		} else {
//			return msg;
//		}
//	}

}

//class Avg {
//	private int kor, eng, math;
//	private double avg;
//
//	public Avg() {
//
//	}
//
//	public Avg(int kor, int eng, int math) throws NegativeNumberException {
//		if (kor < 0 || eng < 0 || math < 0) {
//			throw new NegativeNumberException("음수 입력 불가");
//		}
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//
//	public double avgMethod() {
//		this.avg = sum() / 3;
//		return avg;
//	}
//
//	public int sum() {
//		return kor + eng + math;
//	}
//
//	public int getKor() {
//		return kor;
//	}
//
//	public int getEng() {
//		return eng;
//	}
//
//	public int getMath() {
//		return math;
//	}
//
//}

public class AvgProgramming {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//
//		try {
//			Avg avg = new Avg(scan.nextInt(), scan.nextInt(), scan.nextInt());
//			System.out.println(avg.avgMethod());
//			System.out.println(avg.sum());
//		} catch (NegativeNumberException e) {
//			System.out.println(e.getMessage());
//		}

		int tot = 0;
		try {
			tot = sum();
			System.out.println("평균은 " + tot / 3.0 + "입니다.");
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException i) {
			System.out.println("입력값이 잘못 되었습니다.");
		} catch (Exception et) {
			System.out.println("예외 발생 ");
		}

	}

	public static int sum() throws NegativeNumberException {
		int score, tot = 0;

		String[] subject = { "국어", "영어", "수학" };

		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + " 입력 : ");
			score = scan.nextInt();
			if (score < 0) //예외상황
				throw new NegativeNumberException(); //예외객체 생성
			tot += score;
		}
		return tot;

	}

}
