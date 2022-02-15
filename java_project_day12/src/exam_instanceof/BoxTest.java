package exam_instanceof;

//�ڹٿ����� ��ü�� ũ�⸦ ���ϴµ� ���Ǵ� Comparable�������̽��� �����Ѵ�.
/* public interface Comparable{
 * 			//�� ��ü�� �ٸ� ��ü���� ũ�� 1 ������ -1 ������ 0 ��ȯ�Ѵ�.
 * 			  int comparable(Object other);
 * }
*/

@SuppressWarnings("rawtypes")
class Box implements Comparable {

	private double volume;

	public Box(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public int compareTo(Object obj) { // Object obj = b2 ��ĳ����.
		Box other = (Box) obj; // (����Ŭ������) �θ�Ŭ������ ��������. �ٿ�ĳ����.
		if (this.volume < other.volume)
			return -1;
		else if (this.volume > other.volume)
			return 1;
		else
			return 0;

	}

}

//Box��� �̸��� Ŭ���� �����ϰ� �Ǽ������� �ʵ�(volume)�� �ϳ� ������.
//����Ŭ������ �����Ͽ� �ΰ��� ��ü�� �����Ͽ� �� ��ü�� �ʵ� ���� ���Ͽ� ū�� ������ �������� �Ǻ��ϵ��� �ڵ带 �ۼ��غ���.

public class BoxTest {

	public static void main(String[] args) {

		Box b1 = new Box(100.4);
		Box b2 = new Box(85.0);

		if (b1.getVolume() > b2.getVolume()) {
			System.out.println("b1�� b2���� �� ũ��.");
		} else
			System.out.println("b1�� b2�� ���ų� �۴�.");

		if (b1.compareTo(b2) > 0)
			System.out.println("b1�� b2���� �� ũ��.");
		else
			System.out.println("b1�� b2�� ���ų� �۴�.");

	}

}
