package exam_operation;

public class LogicalOperator {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println((x == 3) && ( y == 7)); //x=3���̶� �ڿ��� Ȯ���ϴµ� y=4 �̶� false
		System.out.println((x == 3) || (y == 4)); // x=3 ���̶� �����ϳ��� ���̸� �Ǵϱ� true �ڿ������� �Ѿ�� �ʴ´�. �տ��� ���߸� �ٷ� true ���
		
		boolean result = (++x == 3) && (y++ == 7); //�������������� �پ x=4�� false�� �ٷ� false ��µǹǷ� �ڿ� y�������������ڴ� ����x
		
		System.out.println("x= "+ x + ", y = " + y); // �� result�� ������ �޾� x=4 �̰� y�� �״�� 4
		System.out.println("result = " + result); // result�� flase
		
		result = (x++ == 4 ) || (++y == 7); //���� x�� 4�̰� x==4�̹Ƿ� true. �����ϳ��� treu�� �Ǵµ� ó������ �ٷ� true�ϱ� �ڿ��� �� ����x �׸��� x�� �������������ڋ����� 5�� ��ȭ
		
		System.out.println("x= "+ x + ", y = " + y); // �� result�� ������ �޾� x=5�̰� y�� �״�� 4
		System.out.println("result = " + result); // result �� true
		

	}

}
