package exam;
/* ������ �迭�� ���Ե� ������ �ش��ϴ� ���� �׷����� ������ ���� ����Ͻÿ�.
 * [������]
 * 	90 �� : �� �� �� �� �� �� �� �� �� 
 * 	20 �� : �� �� 
 * 	50 �� : �� �� �� �� �� 
 *  70 �� : �� �� �� �� �� �� �� 
 *  65 �� : �� �� �� �� �� �� 
 *  90 �� : �� �� �� �� �� �� �� �� �� 
 * 100 �� : �� �� �� �� �� �� �� �� �� �� 
 * 	43 �� : �� �� �� �� 
 *  55 �� : �� �� �� �� �� 
 *  87 �� : �� �� �� �� �� �� �� �� 
 */
public class ArrayExample6 {

	public static void main(String[] args) {
		
		int[] score = {90,20,50,70,65,90,100,43,55,87};
		int[] count = new int[10];
		
		for(int i = 0; i < count.length; i++) {
			count[i] = score[i] / 10; 
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf(" %4d �� : ", score[i]);
			for(int j =0; j < count[i]; j++) {
				System.out.print("�� ");
			}
			System.out.printf("\n");
		}
		

	}

}
