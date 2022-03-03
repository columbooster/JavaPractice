package design_pattern_decorator;

public class AudiDecorator implements ICar {

	protected ICar audi;
	protected int modelPrice;

	public AudiDecorator(ICar audi) {
		this.audi = audi;
	}

	@Override
	public int getPrice() {
		return audi.getPrice();
	}

	@Override
	public void showPrice() {
		System.out.println("Aud의 가격은 " + (audi.getPrice() + modelPrice) + " 원 입니다.");

	}

}
