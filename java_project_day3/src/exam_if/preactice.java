package exam_if;

public class preactice {

	public static void main(String[] args) {
		
		//1������
		int j;
		
		j = 1;
		
		while(j <=5) {
			System.out.println(j+" ");
			j++;
		}
		//2������
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
