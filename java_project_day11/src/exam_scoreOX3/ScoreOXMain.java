package exam_scoreOX3;

public class ScoreOXMain {

	public static void main(String[] args) {

		ScoreOX[] sc = new ScoreOX[] {new ScoreOX(1, "ȫ�浿", new int[] {1,2,1,3,4}),new ScoreOX(2, "��ö��", new int[] {1,1,1,1,1}),
				new ScoreOX(3, "������", new int[] {1,2,1,3,1}), new ScoreOX(4, "������", new int[] {1,1,1,3,1}),new ScoreOX(5, "������", new int[] {1,4,2,5,4})
		};
		// ScoreOX �迭�� �������ش�.
		
		System.out.println("  * * ������ * *");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("��ȣ\t"+"�̸�\t"+"1\t"+"2\t"+"3\t"+"4\t"+"5\t"+ "����\t"+ "���");
		System.out.println("---------------------------------------------------------------------");
		
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].compute(); // for���� ���� �ش� �ν��Ͻ����� compute() �޼��带 ������ ������ ó�����ش�.
		}
		
		ScoreOX.ranking(sc); // ��ŷ �޼ҵ带 ���� ������ ���Ѵ�.
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].display(); // for���� ������ ������� ����Ѵ�.
		}
		
		System.out.println();
		
		System.out.println("��ü ���� ���� = "+ ScoreOX.tot); // ��ü ���� ���� ���
		
		System.out.println();

		
	}

}
