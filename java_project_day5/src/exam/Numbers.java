package exam;

public class Numbers {

	public static void main(String[] args) {
		/*
		 * ������ ���ǵ� ���� ������ �������� ����� ���� ���´´�. 
		 * ������ ������� Math.random.() ����Ѵ�. �׷� 0~1 ������ �Ǽ����� ��ȯ�Ѵ�.
		 * System.out.println(Math.radom());
		 * 0.485148545
		 * 0.66645554
		 * 0.05484455
		 * 
		 * System.out.println((int)(Math.random()*10)); 0~9 ������ ������ ���
		 * System.out.println((int)(Math.random()*10) + 1); 1~10 ������ ������ ���
		 */
		
		
		
		double data = Math.random();
		System.out.println(data);
		
		System.out.println((int)(data*10)); // 0 ~ 9 ������ ������ ���
		System.out.println((int)(data*10)+1); // 1~10 ������ ������ ���
		
		int num = (int)(Math.random()*6) +1 ;
		System.out.println("�ֻ��� : " + num);
		System.out.println();
		
		//5���� ������ ������ �� �ִ� �迭 ����. 1~10������ ������ ���ڰ� ����� �� �ֵ��� ����. �� ���� ����ϴ� ���α׷�.
		
		int[] numbers = new int[5];
		//1~10 ������ ������ ����� �� ��
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10) + 1;
		}
		
		//��¹�� 1
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		//��¹�� 2
		for(int value : numbers)
			System.out.print(value + " ");
		
		
		System.out.println("\n");
		
		/*ī�带 �����ϰ� �����Ͽ� ȭ�鿡 ����ϴ� �ڵ带 �ۼ��� ����.
		 * { "Clubs", "Diamonds", "Hearts", "Spades"}��
		 * { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" } �� 
		 * ������ �ִ� ���ڿ� �迭�� �����ϰ� �� �������κ��� �����ϰ� �ϳ��� ī�带 �����ϴ� �ڵ带 �����϶�
		 * ���� ��� : Hearts�� Jack 
		 */
		
		
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		int k = (int)(Math.random()*rank.length);
		int l = (int)(Math.random()*suit.length);
		
		System.out.println(suit[l] + " �� " + rank[k]);
		
	
		
		
		

	}

}
