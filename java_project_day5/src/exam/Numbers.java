package exam;

public class Numbers {

	public static void main(String[] args) {
		/*
		 * 난수란 정의된 범위 내에서 무작위로 추출된 수를 일컫는다. 
		 * 난수를 얻기위해 Math.random.() 사용한다. 그럼 0~1 사이의 실수값을 반환한다.
		 * System.out.println(Math.radom());
		 * 0.485148545
		 * 0.66645554
		 * 0.05484455
		 * 
		 * System.out.println((int)(Math.random()*10)); 0~9 사이의 정수값 출력
		 * System.out.println((int)(Math.random()*10) + 1); 1~10 사이의 정수값 출력
		 */
		
		
		
		double data = Math.random();
		System.out.println(data);
		
		System.out.println((int)(data*10)); // 0 ~ 9 사이의 정수값 출력
		System.out.println((int)(data*10)+1); // 1~10 사이의 정수값 출력
		
		int num = (int)(Math.random()*6) +1 ;
		System.out.println("주사위 : " + num);
		System.out.println();
		
		//5개의 정수를 저장할 수 있는 배열 생성. 1~10사이의 임의의 숫자가 저장될 수 있도록 설정. 그 값을 출력하는 프로그램.
		
		int[] numbers = new int[5];
		//1~10 사이의 난수를 얻고자 할 때
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10) + 1;
		}
		
		//출력방법 1
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		//출력방법 2
		for(int value : numbers)
			System.out.print(value + " ");
		
		
		System.out.println("\n");
		
		/*카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성해 보자.
		 * { "Clubs", "Diamonds", "Hearts", "Spades"}와
		 * { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" } 를 
		 * 가지고 있는 문자열 배열을 생성하고 위 내용으로부터 랜덤하게 하나의 카드를 선택하는 코드를 적성하라
		 * 실행 결과 : Hearts의 Jack 
		 */
		
		
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		int k = (int)(Math.random()*rank.length);
		int l = (int)(Math.random()*suit.length);
		
		System.out.println(suit[l] + " 의 " + rank[k]);
		
	
		
		
		

	}

}
