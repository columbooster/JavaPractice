package exam_generic_type;

//제네릭 클래스 선언
public class Box<T> { // 접근제어자 class 클래스명<매개변수 타입>{}

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}
