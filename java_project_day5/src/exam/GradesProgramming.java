package exam;

public class GradesProgramming {

	public static void main(String[] args) {
		
		String[] name = {"ȫ�浿", "��ö��", "������"};
		int[][] score = {{90,75,61},{55,56,46},{90,90,90}};
		double avg = 0;
		char grade = '\0';
		String pnp = null;
		int[] rank = new int[3];		
		int ranking =0;
		
		System.out.println("             ���� ���α׷�\n=========================================\n ��ȣ �̸� ���� ���� ���� ����  ���  ����  �����  ���� \n=========================================");
		
		double total = 0;
		
		
		for(int i = 0; i < score.length; i++) {
			
			System.out.print("  " + (i+1) +" " + name[i] + " "); // ��ȣ, �̸�
			
			for(int j =0; j <score[i].length; j++) {
				
				System.out.print(score[i][j] + " "); // ����
				
				total += score[i][j]; // ����
				
			}
			avg = (double) (total/3); // ���
			//����
			if(avg>=90) {
				grade = 'A';
			} else if(avg>=80) {
				grade ='B';
			} else if(avg>=70) {
				grade ='C';
			} else if(avg>=60) {
				grade = 'D';
			} else grade = 'F';
			
			// ����� ����
			if(avg>=60) {
				pnp = "pass";
			} else pnp = "nopass";
			
			// ����
			rank[i] = (int)total;
			
			if(rank[i] == rank[0]) {
				ranking = 2;
			} else if(rank[i] > rank[0]) {
				ranking = 1;
			} else ranking = 3;
			

			System.out.printf("%.0f  %.2f  %c  %s  %d\n", total, avg, grade, pnp, ranking); //���
			
			
			total = 0; // ���� ���ϰ� �ٽ� 0���� �ʱ�ȭ.
		}
		
		
		
		
		
		
		
		

	}

}
