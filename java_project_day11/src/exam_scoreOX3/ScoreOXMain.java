package exam_scoreOX3;

public class ScoreOXMain {

	public static void main(String[] args) {

		ScoreOX[] sc = new ScoreOX[] {new ScoreOX(1, "홍길동", new int[] {1,2,1,3,4}),new ScoreOX(2, "김철수", new int[] {1,1,1,1,1}),
				new ScoreOX(3, "이진희", new int[] {1,2,1,3,1}), new ScoreOX(4, "조현민", new int[] {1,1,1,3,1}),new ScoreOX(5, "최현정", new int[] {1,4,2,5,4})
		};
		// ScoreOX 배열로 선언해준다.
		
		System.out.println("  * * 시험결과 * *");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("번호\t"+"이름\t"+"1\t"+"2\t"+"3\t"+"4\t"+"5\t"+ "점수\t"+ "등수");
		System.out.println("---------------------------------------------------------------------");
		
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].compute(); // for문을 통해 해당 인스턴스마다 compute() 메서드를 돌려서 정보를 처리해준다.
		}
		
		ScoreOX.ranking(sc); // 랭킹 메소드를 돌려 순위를 구한다.
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].display(); // for문을 돌려서 순서대로 출력한다.
		}
		
		System.out.println();
		
		System.out.println("전체 맞은 개수 = "+ ScoreOX.tot); // 전체 맞은 개수 출력
		
		System.out.println();

		
	}

}
