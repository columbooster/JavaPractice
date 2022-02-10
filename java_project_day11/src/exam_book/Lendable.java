package exam_book;

public interface Lendable {

	public abstract void checkOut(String borrower, String date); // 대출(대여) 관련 메서드

	void checkIn(); // 반납관련 메소드
	//public abstract 생략
}
