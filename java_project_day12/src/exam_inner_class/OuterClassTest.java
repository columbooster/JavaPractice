package exam_inner_class;

class OuterClass {
	private String famous;

	public OuterClass() {
		famous = "�� �� �ִٴ� ������ ������ ó������ �׷� �ɷ��� ��������" + "�ᱹ���� �� �� �ִ� �ɷ��� Ȯ���� ���� �ȴ�.";
	}

	class InnerClass {
		private String wise;

		public InnerClass() {
			wise = "�����̶�� ���� �������� �������̶�� ��ġ�� �ʿ��ϴ�. - �� ���̽�";
		}

		public void innerMethod() {
			System.out.println("1. " + wise);
			System.out.println("2. " + famous);
		}
	}
}

public class OuterClassTest {

	public static void main(String[] args) {
		//OuterClass oc = new OuterClass();
		//OuterClass.InnerClass ic = oc.new InnerClass();
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		
		
		ic.innerMethod();

	}

}
