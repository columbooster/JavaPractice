package exam_main_argument;

// 실행방법
// RUn > Run Configurations 에서 두번째 탭(Arguments)을 선택하여 
// program arguments에 값을 입력하고 Run 버튼을 클릭하면 된다.


public class Greeting {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("실행시 사용자명을 입력해 주셔야 해당 문자열을 출력할 수 있습니다.");
			System.exit(1);
		}
		System.out.println("안녕하세요." + args[0] + "님!");
			

	}

}
