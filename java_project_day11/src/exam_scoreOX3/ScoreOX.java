package exam_scoreOX3;

public class ScoreOX {
	
	private int no; //��ȣ
	private String name; //�̸�
	private int[] dap; //��
	private int cnt; //�䰳�� üũ ī��Ʈ
	private int rank; //����
	private char[] c_ox; //oxǥ��
	public static int tot; //��ü �ο��� �䰳�� üũ ���ջ�
	
	public ScoreOX() {
		
	}
	
	public ScoreOX(int no, String name, int[] dap) {
		this.no = no;
		this.name = name;
		this.dap = dap;
	}
	
	public void compute() {
		for(int i =0; i < dap.length; i++) {
			if(dap[i]==1) {
				c_ox[i] = 'O';
			}else {
				c_ox[i]='X';
			}
		}
		
		
	}
	
	public void display() {
		
	}
	
	public static void ranking() {
		
	}

}
