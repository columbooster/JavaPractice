package exam_input;
//����ڰ� �Է��� �� ���� ���ڸ� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;// Scanner Ŭ���� ����

public class TwoNumberSum {
		//���� �޼ҵ忡������ ������ �ȴ�.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y, sum;
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: "); // �Է¾ȳ� ���   ---> �䱸����
		x = input.nextInt(); // ����ڷκ��� ù ��° ���ڸ� �д´�.
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: "); // �Է¾ȳ� ���
		y = input.nextInt(); // ����ڷκ��� �� ��° ���ڸ� �д´�.
		
		sum = x + y; // �� ���� ���ڸ� ���Ѵ�.
		
		System.out.println("�� ���� �� : " + sum); // ���� ����Ѵ�.
		
		input.close();

	}

}
