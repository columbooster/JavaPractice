package exam_method_overload;
/*
 * 메소드 오버로딩
 * 클래스 내에서 같은 이름의 메소드를 여러개 선언하는 것
 * 하나의 메소드 이름으로 다양한 매개값을 받기 위해 메소드 오버로딩
 * 오버로딩 조건 : 매개변수의 타입, 개수가 달라야한다.
 * 
 */
public class OverloadCalc {
	
	public int plus(int a, int b) {
		System.out.println("plus(int a, int b)");
		return a+b;
	}
	
	public float plus(float a, float b) {
		System.out.println("plus(float a, float b)");
		return a+b;
	}
	public double plus(double a, double b) {
		System.out.println("plus(double a, double b)");
		return a+b;
	}
	
	public int plus(int ... c) { // int[] c = {5,7,4,2}
		System.out.println("plus(int ... c) 가변 길이 메서드 호출");
		int sum = 0;
		for(int i = 0; i <c.length; i++) {
			sum += c[i];
		}
		return sum;
	}
	
	public int plusInt(int[] v) { // int[] v = values1
		System.out.println("plus(int ... c) 가변 길이 메서드 호출");
		int sum = 0;
		for(int i = 0; i <v.length; i++) {
			sum += v[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	

}
