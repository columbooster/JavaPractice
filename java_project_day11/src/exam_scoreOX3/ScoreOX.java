package exam_scoreOX3;

public class ScoreOX {
	
	private int no; //번호
	private String name; //이름
	private int[] dap; //답
	private int cnt; //답개수 체크 카운트
	private int rank; //순위
	private char[] c_ox; //ox표시
	public static int tot; //전체 인원의 답개수 체크 총합산
	
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
