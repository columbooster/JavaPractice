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
	public boolean equals(Object obj) { // 부모클래스 참조변수 = 서브클래스의 주솟값 -> 업캐스팅
		if (obj instanceof Key) {
			Key compareKey = (Key) obj; // 서브클래스 참조변수 = (서브클래스)부모클래스타입 참조변수;-> 다운캐스팅
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
