package exam_network;

//QuizProtocol 클래스는 클라이언트와 서버가 통신하기 위하여 사용하는 프로토콜을 구현한다.

public class QuizProtocol {

	private static final int WAITING = 0;
	private static final int PROBLEM = 1;
	private static final int ANSWER = 2;

	private static final int NUMPROBLEMS = 3;

	private int state = WAITING;
	private int currentProblem = 0;

	private String[] problems = { "몸에 해로운 청바지는?", "설운도가 옷 입으면서 하는 노래는?", "왕이 궁에 들어가기 싫을 때 하는 말은?" }; // 3개 퀴즈문제
	private String[] answers = { "유해진", "상하의 상하의 상하의~!~!", "궁시렁 궁시렁" }; // 3개 퀴즈에 대한 정답

	public String process(String theInput) {

		String theOutput = null;

		if (state == WAITING) {
			theOutput = "퀴즈를 시작합니다(y/n)";
			state = PROBLEM;
		} else if (state == PROBLEM) {
			if (theInput.equalsIgnoreCase("y")) {
				theOutput = problems[currentProblem];
				state = ANSWER;
			} else {
				state = WAITING;
				theOutput = "quit";
			}
		} else if (state == ANSWER) {
			if (theInput.equalsIgnoreCase(answers[currentProblem])) {
				theOutput = "정답입니다. 계속하시겠습니까? (y/n)";
				state = PROBLEM;
			} else {
				state = PROBLEM;
				theOutput = "오답입니다. 계속하시겠습니까? (y/n)";
			}
			currentProblem = (currentProblem + 1) % NUMPROBLEMS;
		}
		return theOutput;

	}
}