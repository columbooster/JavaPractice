package exam_array;
// 공장에 있는 온도 센서에서 1시간 마다 측정된 온도에 따라 에어컨을 가동한다.
// 에어컨이 가동된 시간을 구하여 출력하는 순서도를 구하라.

public class arrayConditioner {

	public static void main(String[] args) {
		int degree[] = {28, 30, 29, 32, 31, 28, 29, 30};
		int airConditioner = 0;
		
		for(int i = 0; i < degree.length; i++) {
			if(degree[i] >= 30) {
				airConditioner++;
			}
		}
		
		
		
		System.out.printf("에어컨은 총 %d시간 동안 가동되었다.\n", airConditioner);

	}

}
