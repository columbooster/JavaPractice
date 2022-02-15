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

	public ScoreOX() { //����Ʈ ������

	}

	public ScoreOX(int no, String name, int[] dap) { //�ް����� �Է¹��� ������
		this.no = no;
		this.name = name;
		this.dap = dap;
	}

	public void compute() { // ����ó�� �޼ҵ�
		c_ox = new char[5];
		for (int i = 0; i < dap.length; i++) {
			if (dap[i] == 1) { //�Է����� ���� ���� ���
				score += 20; // ���� 20 ���� ����
				c_ox[i] = 'O'; // ���� O�� ǥ��
				cnt++; // ī��Ʈ ����
				tot++; // ��ü ��Ż ī��Ʈ ����
			} else {
				c_ox[i] = 'X'; // ���� Ʋ�� ��� X�� ǥ��
			}
		}

	}

	public void display() { //��� �޼ҵ�
		System.out.print("  "+no + "\t" + name + "\t"); //��ȣ, �̸�
		for (int i = 0; i < c_ox.length; i++) {
			System.out.print(c_ox[i]+"\t"); // �ݺ����� ���� 1~5�������� O,X ���
		}
		System.out.println(score + "\t"+ rank); //���� ��� ���

	}

	public static void ranking(ScoreOX[] sc) { // ��� �޼ҵ�

		
		for(int i = 0 ; i < sc.length; i++)
		{
			int rank = 1; // ��� �ʱⰪ 1�� ����
			for(int j = 0 ; j < sc.length; j++)
			{
				if(sc[i].score < sc[j].score) // sc[i]�� ������ sc[j]�� �������� ������
					rank++; //rank�� 1�� �÷��� ��ũ�� �����Ѵ�.
			}
			sc[i].rank = rank; //sc[i]��° ��ũ ����
		}
		
	}

}
