package example;

public class ChangeValue {
	public static void main(String[] args) {
	  /*자료형  변수명 = 값 >> 값을 인트형 변수 number1에 대입 시키겠다. "=" -> 대입연산자
		int number1 = 10;*/
		//자료형 변수명 ; <= 변수 선언
		int number1, number2, temp;
		
		number1 = 10;
		number2 = 15;
		
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number1 = " + number1 + " number2 = " + number2);
		System.out.println("number1+number2 = " + (number1+number2));
		
		temp = number1; // temp = number1 의 값 대입. 10
		number1 = number2; // number1 = number2의 값 대입. 15
		number2 = temp; // number2 = temp의 값 대입. 10
		
		System.out.println("교환 후 달라진 number1,2의 값");
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number1 = " + number1 + " number2 = " + number2);
		System.out.println("number1+number2 = " + (number1+number2));
		
		
		boolean b;
		
		b= true;
		b=(1>2);
		System.out.println(b);
	}

}
