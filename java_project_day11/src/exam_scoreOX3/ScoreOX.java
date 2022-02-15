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

	public ScoreOX() { //디폴트 생성자

	}

	public ScoreOX(int no, String name, int[] dap) { //메개변수 입력받을 생성자
		this.no = no;
		this.name = name;
		this.dap = dap;
	}

	public void compute() { // 정보처리 메소드
		c_ox = new char[5];
		for (int i = 0; i < dap.length; i++) {
			if (dap[i] == 1) { //입려받은 답이 맞을 경우
				score += 20; // 점수 20 점씩 증가
				c_ox[i] = 'O'; // 문자 O로 표기
				cnt++; // 카운트 증가
				tot++; // 전체 토탈 카운트 증가
			} else {
				c_ox[i] = 'X'; // 답이 틀릴 경우 X로 표기
			}
		}

	}

	public void display() { //출력 메소드
		System.out.print("  "+no + "\t" + name + "\t"); //번호, 이름
		for (int i = 0; i < c_ox.length; i++) {
			System.out.print(c_ox[i]+"\t"); // 반복문을 통해 1~5번까지의 O,X 출력
		}
		System.out.println(score + "\t"+ rank); //점와 등수 출력

	}

	public static void ranking(ScoreOX[] sc) { // 등수 메소드

		
		for(int i = 0 ; i < sc.length; i++)
		{
			int rank = 1; // 등수 초기값 1로 설정
			for(int j = 0 ; j < sc.length; j++)
			{
				if(sc[i].score < sc[j].score) // sc[i]의 점수가 sc[j]의 점수보다 낮을때
					rank++; //rank를 1씩 올려서 랭크를 구분한다.
			}
			sc[i].rank = rank; //sc[i]번째 랭크 설정
		}
		
	}

}
