package exam_array_in_array;

public class RainFall {

	public static void main(String[] args) {
		final int YEARS = 3; //3년
		final int QUATERS = 5; //4분기 + 총합
		
		//2차원 배열 선언
		/*double[][] rain = new double[YEARS][QUATERS];
		 * Scanner scan = new Scanner(System.in);
		 * 	for(int y = 0; y < YEARS; y++) {
			for(int q = 0; q < QUATERS-1; q++) {
				System.out.print((y+1) + "년차" + (q+1) + "분기 강수량 :");
				rain[y][q] = scan.nextDouble();
					
			}
		 * 
		 */
		
		
		
		//기상청 데이터 2차원 배열 초기화
		double[][] rain =new double[][] {
			{368.1, 586.5, 351.2, 66.5, 0},
			{173.9, 493, 448.4,168.1, 0},
			{172,8, 1012.4, 259.4, 46.7, 0}
		};
			
		
		for(int y = 0; y < YEARS; y++) {
			for(int q = 0; q < QUATERS-1; q++) {
				rain[y][QUATERS-1] += rain[y][q];
				// rain[y][QUATERS-1] = rain[y][QUATERS-1] + rain[y][q];
				// rain[행][열 마지막 인덱스] = rain[행][열 마지막 인덱스] + 분기별 강수량;
				// rain[행][4] = rain[행][4] + 분기별 강수량;
				
			}
		}
		String[] year = {"2018", "2019", "2020"};
		System.out.println("년도\t1분기\t2분기\t3분기\t4분기\t총합");
		System.out.println("-----------------------------------------------");
		
		for(int y = 0; y < YEARS; y++) {
			//System.out.print((y+1)+"년차\t");
			System.out.print(year[y]+"년도\t");
			for(int q = 0; q < QUATERS; q++) {
				System.out.printf("%.1f\t", rain[y][q]);
			}
			System.out.println();
		}
		
		
		// scan.close;
		
		
		
		
		

	}

}
