package exam_Inheritance3;

public class CarMain {

	public static void main(String[] args) {

		Monata[] m = new Monata[] { new Monata("흰색", 5000, "NF", "승용"), new Monata("은색", 7000, "Brilliant", "업무"),
				new Monata("감홍색", 4000, "EF", "택시"), new Monata("검정색", 6000, "Hybrid", "승용") };
		
		
		System.out.println("======================== Monata 생산 시작 ========================");
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}
		
		
		System.out.println("======================== Monata 생산 시작 ========================");
		//for(자료형 변수명 : 배열명) {}
		for(Monata monata : m) {
			System.out.println(monata.toString());
		}

	}

}
