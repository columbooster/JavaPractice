package exam_scoreOX3;

public class ScoreOXMain {

	public static void main(String[] args) {

//		ScoreOX[] sc = new ScoreOX[] {new ScoreOX(1, "ȫ�浿", new int[] {1,2,1,3,4}),new ScoreOX(2, "��ö��", new int[] {1,1,1,1,1}),
//				new ScoreOX(3, "������", new int[] {1,2,1,3,1}), new ScoreOX(4, "������", new int[] {1,1,1,3,1}),new ScoreOX(5, "������", new int[] {1,4,2,5,4})
//		};
		
		ScoreOX s1 = new ScoreOX(1, "ȫ�浿", new int[] {1,2,1,3,4});
		ScoreOX s2 = new ScoreOX(2, "��ö��", new int[] {1,1,1,1,1});
		ScoreOX s3 = new ScoreOX(3, "������", new int[] {1,2,1,3,1});
		ScoreOX s4 = new ScoreOX(4, "������", new int[] {1,1,1,3,1});
		ScoreOX s5 = new ScoreOX(5, "������", new int[] {1,4,2,5,4});
		
		ScoreOX[] sc = new ScoreOX[5];
		sc[0] = s1; sc[1] = s2; sc[2] = s3; sc[3] = s4; sc[4] = s5;
		
		System.out.println("  * * ������ * *");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("��ȣ\t"+"�̸�\t"+"1\t"+"2\t"+"3\t"+"4\t"+"5\t"+ "����\t"+ "���");
		System.out.println("---------------------------------------------------------------------");
		
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].compute();
		}
		
		ScoreOX.ranking(sc);
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].display();
		}
		
		System.out.println();
		
		System.out.println("��ü ���� ���� = "+ ScoreOX.tot);
		
		System.out.println();
		
		
		//�̹� �� �л� ���� ScoreOX Instance�� �Ҵ� �Ͽ���, compute()�� ������ ����� �����ؾ���
		//���� �ڵ��� ��� ranaking�Լ� �ȿ��� �� �����ϰ� �ǹǷ� ��ȿ�����̰�,
		//static int tot���� ����ǰ� ��


		
	}

}
