package exam_array;
// ���忡 �ִ� �µ� �������� 1�ð� ���� ������ �µ��� ���� �������� �����Ѵ�.
// �������� ������ �ð��� ���Ͽ� ����ϴ� �������� ���϶�.

public class arrayConditioner {

	public static void main(String[] args) {
		int degree[] = {28, 30, 29, 32, 31, 28, 29, 30};
		int airConditioner = 0;
		
		for(int i = 0; i < degree.length; i++) {
			if(degree[i] >= 30) {
				airConditioner++;
			}
		}
		
		
		
		System.out.printf("�������� �� %d�ð� ���� �����Ǿ���.\n", airConditioner);

	}

}
