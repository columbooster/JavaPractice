package exam;

public class GradesProgramming {

	public static void main(String[] args) {
		
		String[] name = {"홍길동", "김철수", "이진희"};
		int[][] score = {{90,75,61},{55,56,46},{90,90,90}};
		double avg = 0;
		char grade = '\0';
		String pnp = null;
		int[] rank = new int[3];		
		int ranking =0;
		
		System.out.println("             성적 프로그램\n=========================================\n 번호 이름 국어 영어 수학 총점  평균  학점  재수강  순위 \n=========================================");
		
		double total = 0;
		
		
		for(int i = 0; i < score.length; i++) {
			
			System.out.print("  " + (i+1) +" " + name[i] + " "); // 번호, 이름
			
			for(int j =0; j <score[i].length; j++) {
				
				System.out.print(score[i][j] + " "); // 점수
				
				total += score[i][j]; // 총점
				
			}
			avg = (double) (total/3); // 평균
			//학점
			if(avg>=90) {
				grade = 'A';
			} else if(avg>=80) {
				grade ='B';
			} else if(avg>=70) {
				grade ='C';
			} else if(avg>=60) {
				grade = 'D';
			} else grade = 'F';
			
			// 재수강 여부
			if(avg>=60) {
				pnp = "pass";
			} else pnp = "nopass";
			
			// 순위
			rank[i] = (int)total;
			
			if(rank[i] == rank[0]) {
				ranking = 2;
			} else if(rank[i] > rank[0]) {
				ranking = 1;
			} else ranking = 3;
			

			System.out.printf("%.0f  %.2f  %c  %s  %d\n", total, avg, grade, pnp, ranking); //출력
			
			
			total = 0; // 총점 구하고 다시 0으로 초기화.
		}
		
		
		
		
		
		
		
		

	}

}
