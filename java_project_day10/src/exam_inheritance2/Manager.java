package exam_inheritance2;

public class Manager extends Employee {
	private int bonus;
	private String job;
	
	public Manager() {//dafault 생성자
		super(); // 명시 하지 않을 시 '컴파일러'가 자동 추가
		
	}
	
	public Manager(String name, String address, String phoneNumber, int salary, int bonus, String job) {
		super(name, address,phoneNumber, salary);
		this.bonus = bonus;
		this.job = job;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	// 전체 필드를 설정하기 위한 메서드 (관리자 정보)
	public void setMgrData(String name, String address, String phoneNumber, int salary, int bonus, String job) {
		//직원 클래스의 setEmpData()를 통해 직원에게 정의된 필드를 설정
		setEmpData(name,address,phoneNumber,salary);
		this.job = job;
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		String data =  ", 보너스: " + getBonus() + "직책: " + getJob();
		//super 키워드를 통해 부모클래스의 필드와 메서드를 호출
		return super.toString() + data;
	}

}
