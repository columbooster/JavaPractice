package exam;

public class SchoolCafeteriaExample {

	public static void main(String[] args) {
		
		int[] service = {1,2,1,2,3,1,2,2,3,1,3,3,1,1,1,2,3,1,3,2};
		
		int good = 0;
		int normal = 0;
		int bad = 0;
		
		for(int i = 0; i < service.length; i++) {
			if(service[i] == 3) {
				good++;
			} else if(service[i] == 2) {
				normal++;
			} else bad++;
		}
		
		System.out.printf("붊만족 : %d 보통 : %d 만족 : %d", bad, normal, good);

	}

}
