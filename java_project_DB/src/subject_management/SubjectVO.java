package subject_management;

//VO(Value Object) Ŭ������ �����͸� ��� �����̳� ������ �ϴ� Ŭ������ ������ ������ �������� ������� Ŭ�����̴�.
//VOŬ������ ���ø����̼� �������� �� �ܰ��� ����� ������ �����ϴ� ������ �����ϸ�,
//�Ӽ�(attribute: �ʵ�). setter(������)�� getter(������)�� �����ȴ�.

public class SubjectVO {
	private int no; // ��ȣ(���̺��� �÷���� �����ϰ� ���!!!!!!!!!!!!!!!!)
	private String s_num; // �а���ȣ
	private String s_name; // �а���

	public SubjectVO() {
	}

	public SubjectVO(String s_num, String s_name) {
		this(0, s_num, s_name);
	}

	public SubjectVO(int no, String s_num, String s_name) {
		this.no = no;
		this.s_num = s_num;
		this.s_name = s_name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return "Subject [no=" + no + ", s_num=" + s_num + ", s_name=" + s_name + "]";
	}

	
}
