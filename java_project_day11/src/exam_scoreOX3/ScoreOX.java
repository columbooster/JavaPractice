package exam_scoreOX3;

public class ScoreOX {

	private int no; // 번호
	private String name; // 이름
	private int[] dap; // 답
	private int cnt; // 답개수 체크 카운트
	private int score; // 점수
	private int rank; // 순위
	private char[] c_ox; // ox표시
	public static int tot; // 전체 인원의 답개수 체크 총합산

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
		
		//사실 더 좋은 방법은, 인자로 받은 sc배열을 오름차순 정렬을 하는 것
		//sc배열은 각 학생의 데이터를 가지고 있으므로, 
		//sc배열인자의 score를 기준으로 오름차순 정렬을 함 (collection 이용하면 쉬움)
		//순서대로 ranking을 부여하면 됨.
		//아래 로직이 결국 버블 소팅 하는 것임
		
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
