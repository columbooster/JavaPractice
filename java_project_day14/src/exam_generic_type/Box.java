package exam_generic_type;

//���׸� Ŭ���� ����
public class Box<T> { // ���������� class Ŭ������<�Ű����� Ÿ��>{}

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}
