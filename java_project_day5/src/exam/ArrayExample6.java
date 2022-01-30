package exam;
/* 일차원 배열에 대입된 점수에 해당하는 막대 그래프를 다음과 같이 출력하시오.
 * [실행결과]
 * 	90 점 : ■ ■ ■ ■ ■ ■ ■ ■ ■ 
 * 	20 점 : ■ ■ 
 * 	50 점 : ■ ■ ■ ■ ■ 
 *  70 점 : ■ ■ ■ ■ ■ ■ ■ 
 *  65 점 : ■ ■ ■ ■ ■ ■ 
 *  90 점 : ■ ■ ■ ■ ■ ■ ■ ■ ■ 
 * 100 점 : ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ 
 * 	43 점 : ■ ■ ■ ■ 
 *  55 점 : ■ ■ ■ ■ ■ 
 *  87 점 : ■ ■ ■ ■ ■ ■ ■ ■ 
 */
public class ArrayExample6 {

	public static void main(String[] args) {
		
		int[] score = {90,20,50,70,65,90,100,43,55,87};
		int[] count = new int[10];
		
		for(int i = 0; i < count.length; i++) {
			count[i] = score[i] / 10; 
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf(" %4d 점 : ", score[i]);
			for(int j =0; j < count[i]; j++) {
				System.out.print("■ ");
			}
			System.out.printf("\n");
		}
		

	}

}
