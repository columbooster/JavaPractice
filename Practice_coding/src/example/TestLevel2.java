package example;

public class TestLevel2 {

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;

				if (sum == n) {
					answer++;
					break;
				} else if (sum > n) {
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		TestLevel2 test = new TestLevel2();
		
		test.solution(15);
		
		System.out.println(test.solution(15));

	}

}
