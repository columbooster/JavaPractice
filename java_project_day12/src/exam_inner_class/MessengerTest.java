package exam_inner_class;

public class MessengerTest {

	public static void main(String[] args) {
		//�͸� Ŭ����
		Messenger test = new Messenger() {

			@Override
			public String getMessage() {
				return "���� �Ļ� ���ְ� �弼��~";
			}

			@Override
			public void setMessage(String msg) {
				System.out.println("test���� �޽����� �����մϴ� : " + msg);

			}

		};

		System.out.println(test.getMessage());
		test.setMessage("Have a nice day~!");
	}

}
