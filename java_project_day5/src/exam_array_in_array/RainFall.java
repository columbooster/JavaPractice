package exam_array_in_array;

public class RainFall {

	public static void main(String[] args) {
		final int YEARS = 3; //3��
		final int QUATERS = 5; //4�б� + ����
		
		//2���� �迭 ����
		/*double[][] rain = new double[YEARS][QUATERS];
		 * Scanner scan = new Scanner(System.in);
		 * 	for(int y = 0; y < YEARS; y++) {
			for(int q = 0; q < QUATERS-1; q++) {
				System.out.print((y+1) + "����" + (q+1) + "�б� ������ :");
				rain[y][q] = scan.nextDouble();
					
			}
		 * 
		 */
		
		
		
		//���û ������ 2���� �迭 �ʱ�ȭ
		double[][] rain =new double[][] {
			{368.1, 586.5, 351.2, 66.5, 0},
			{173.9, 493, 448.4,168.1, 0},
			{172,8, 1012.4, 259.4, 46.7, 0}
		};
			
		
		for(int y = 0; y < YEARS; y++) {
			for(int q = 0; q < QUATERS-1; q++) {
				rain[y][QUATERS-1] += rain[y][q];
				// rain[y][QUATERS-1] = rain[y][QUATERS-1] + rain[y][q];
				// rain[��][�� ������ �ε���] = rain[��][�� ������ �ε���] + �б⺰ ������;
				// rain[��][4] = rain[��][4] + �б⺰ ������;
				
			}
		}
		String[] year = {"2018", "2019", "2020"};
		System.out.println("�⵵\t1�б�\t2�б�\t3�б�\t4�б�\t����");
		System.out.println("-----------------------------------------------");
		
		for(int y = 0; y < YEARS; y++) {
			//System.out.print((y+1)+"����\t");
			System.out.print(year[y]+"�⵵\t");
			for(int q = 0; q < QUATERS; q++) {
				System.out.printf("%.1f\t", rain[y][q]);
			}
			System.out.println();
		}
		
		
		// scan.close;
		
		
		
		
		

	}

}
