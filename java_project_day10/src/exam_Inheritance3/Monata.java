package exam_Inheritance3;

public class Monata extends Car{
	
	private String series;
	private String use;
	
	public Monata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t[�뵵] " + use + "\t[�ø���] " + series;
	}

}
