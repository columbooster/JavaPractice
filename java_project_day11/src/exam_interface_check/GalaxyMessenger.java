package exam_interface_check;

public class GalaxyMessenger implements Messenger, WorkFile {
	// messenger �������̽� �߻�޼��� ���ٶ��̵�
	@Override
	public String getMessage() {
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("galaxy���� �޽����� �����մϴ�." + msg);

	}

	// �Ϲݸ޼���
	public void changeKeyboard() {
		System.out.println("Ű����������� ��ġ �� Ű���带 �����մϴ�.");
	}

	// WorkFile �������̽� �߻�޼��� �������̵�
	@Override
	public void fileUpload() {
		System.out.println("file�� ���ε��մϴ�.");

	}

	@Override
	public void filedownload() {
		System.out.println("file�� ���ε��մϴ�.");

	}

}
