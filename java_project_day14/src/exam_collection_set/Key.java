package exam_collection_set;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) { // �θ�Ŭ���� �������� = ����Ŭ������ �ּڰ� -> ��ĳ����
		if (obj instanceof Key) {
			Key compareKey = (Key) obj; // ����Ŭ���� �������� = (����Ŭ����)�θ�Ŭ����Ÿ�� ��������;-> �ٿ�ĳ����
			if (this.number == compareKey.number) {
				return true;
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "number : " + number;
	}

}
