package exam_class_basic;

public class Score {
	
	public String studentName;
	public int kor;
	public int eng;
	public int mat;
	
	public void scoreData(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int sum(int kor, int eng, int mat) {
		return kor+eng+mat;
	}
	
	public double avg() {
		return (kor+eng+mat)/3;
	}

}
