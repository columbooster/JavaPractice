package exam_generic_type;

//제네릭 클래스
class Bag<T> {
	private T thing;

	// 생성자
	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getSimpleName());
	}
}

class Book {
	private String title;
	private String writer;

	public Book() {

	}

	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + "]";
	}

}

class PencilCase {
	private String brand;
	private String kind;

	public PencilCase() {

	}

	public PencilCase(String brand, String kind) {
		this.brand = brand;
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "PencilCase [brand=" + brand + ", kind=" + kind + "]";
	}

}

class NoteBook {
	private String color;
	private int price;

	public NoteBook() {

	}

	public NoteBook(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "NoteBook [color=" + color + ", price=" + price + "]";
	}

}

public class BagTest {

	public static void main(String[] args) {

		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<NoteBook> bag3 = new Bag<>(new NoteBook());

		bag.showType();
		bag2.showType();
		bag3.showType();

	}

}
