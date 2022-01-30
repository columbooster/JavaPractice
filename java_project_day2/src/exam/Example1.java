package exam;
//국어, 영어, 수학 점수를 입력 받아, 총점과 평균(소수 첫번재짜리)을 구해 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, sum; double average;
		
		a = sc.nextInt(); //국어
		b = sc.nextInt(); //영어
		c = sc.nextInt(); //수학
		
		sum = a + b + c; // 총점
		average = (a+b+c)*0.3; //평균
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f", average);
		
		sc.close();

	}

}
