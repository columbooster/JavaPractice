package exam_month;

public class ForeignStudent extends Student {

	private String nat;

	public ForeignStudent(String name, int age, int id, String nat) {
		super(name, age, id);
		this.nat = nat;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	@Override
	public String show() {
		return super.show() + ", ±¹Àû : " + nat;
	}

}
