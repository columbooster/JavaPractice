package exam_scoreOX3;

public class ScoreOXMain {

	public static void main(String[] args) {

//		ScoreOX[] sc = new ScoreOX[] {new ScoreOX(1, "홍길동", new int[] {1,2,1,3,4}),new ScoreOX(2, "김철수", new int[] {1,1,1,1,1}),
//				new ScoreOX(3, "이진희", new int[] {1,2,1,3,1}), new ScoreOX(4, "조현민", new int[] {1,1,1,3,1}),new ScoreOX(5, "최현정", new int[] {1,4,2,5,4})
//		};
		
		ScoreOX s1 = new ScoreOX(1, "홍길동", new int[] {1,2,1,3,4});
		ScoreOX s2 = new ScoreOX(2, "김철수", new int[] {1,1,1,1,1});
		ScoreOX s3 = new ScoreOX(3, "이진희", new int[] {1,2,1,3,1});
		ScoreOX s4 = new ScoreOX(4, "조현민", new int[] {1,1,1,3,1});
		ScoreOX s5 = new ScoreOX(5, "최현정", new int[] {1,4,2,5,4});
		
		ScoreOX[] sc = new ScoreOX[5];
		sc[0] = s1; sc[1] = s2; sc[2] = s3; sc[3] = s4; sc[4] = s5;
		
		System.out.println("  * * 시험결과 * *");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("번호\t"+"이름\t"+"1\t"+"2\t"+"3\t"+"4\t"+"5\t"+ "점수\t"+ "등수");
		System.out.println("---------------------------------------------------------------------");
		
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].compute();
		}
		
		ScoreOX.ranking(sc);
		
		for(int i = 0; i < sc.length; i++) {
			sc[i].display();
		}
		
		System.out.println();
		
		System.out.println("전체 맞은 개수 = "+ ScoreOX.tot);
		
		System.out.println();
		
		
		//이미 각 학생 별로 ScoreOX Instance를 할당 하였고, compute()를 수행한 결과를 재사용해야함
		//기존 코드의 경우 ranaking함수 안에서 재 수행하게 되므로 비효율적이고,
		//static int tot값도 변경되게 됨


		
	}

}
