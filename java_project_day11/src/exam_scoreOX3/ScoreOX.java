package exam_scoreOX3;

public class ScoreOX {

	private int no; // ��ȣ
	private String name; // �̸�
	private int[] dap; // ��
	private int cnt; // �䰳�� üũ ī��Ʈ
	private int score; // ����
	private int rank; // ����
	private char[] c_ox; // oxǥ��
	public static int tot; // ��ü �ο��� �䰳�� üũ ���ջ�

	public ScoreOX() {

	}

	public ScoreOX(int no, String name, int[] dap) {
		this.no = no;
		this.name = name;
		this.dap = dap;
	}

	public void compute() {
		c_ox = new char[5];
		for (int i = 0; i < dap.length; i++) {
			if (dap[i] == 1) {
				score += 20;
				c_ox[i] = 'O';
				cnt++;
				tot++;
			} else {
				c_ox[i] = 'X';
			}
		}

	}

	public void display() {
		System.out.print("  "+no + "\t" + name + "\t");
		for (int i = 0; i < c_ox.length; i++) {
			System.out.print(c_ox[i]+"\t");
		}
		System.out.println(score + "\t"+ rank);

	}

	public static void ranking(ScoreOX[] sc) {
//		int[] rank = {1,1,1,1,1};
//		for(int i = 0; i < sc.length; i++) {
//			sc[i].compute();
//			rank[i]= 1;
//			for(int j=0; j < sc.length; j++) {
//				if(sc[i].score<sc[j].score) {
//					rank[i]++;
//				}
//			}
//		}
//		for(int i = 0; i < sc.length; i++) {
//			System.out.print(rank[i]);
//		}
		
		//��� �� ���� �����, ���ڷ� ���� sc�迭�� �������� ������ �ϴ� ��
		//sc�迭�� �� �л��� �����͸� ������ �����Ƿ�, 
		//sc�迭������ score�� �������� �������� ������ �� (collection �̿��ϸ� ����)
		//������� ranking�� �ο��ϸ� ��.
		//�Ʒ� ������ �ᱹ ���� ���� �ϴ� ����
		
		for(int i = 0 ; i < sc.length; i++)
		{
			int rank = 1;
			for(int j = 0 ; j < sc.length; j++)
			{
				if(sc[i].score < sc[j].score)
					rank++;
			}
			sc[i].rank = rank;
		}
		/*for (int i = 0; i < sc.length; i++) {
			System.out.println(sc[i].rank);
		}*/
	}

}
