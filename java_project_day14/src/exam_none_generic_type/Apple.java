package exam_none_generic_type;

public class Apple {

	private String color;

	public Apple() {

	}

	public Apple(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() { //Object의 toString() 메서드를 오버라이딩
		return "Apple [color : " + color + "]";
	}

}
