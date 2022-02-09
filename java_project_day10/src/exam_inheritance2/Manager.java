package exam_inheritance2;

public class Manager extends Employee {
	private int bonus;
	private String job;
	
	public Manager() {//dafault ������
		super(); // ��� ���� ���� �� '�����Ϸ�'�� �ڵ� �߰�
		
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
	// ��ü �ʵ带 �����ϱ� ���� �޼��� (������ ����)
	public void setMgrData(String name, String address, String phoneNumber, int salary, int bonus, String job) {
		//���� Ŭ������ setEmpData()�� ���� �������� ���ǵ� �ʵ带 ����
		setEmpData(name,address,phoneNumber,salary);
		this.job = job;
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		String data =  ", ���ʽ�: " + getBonus() + "��å: " + getJob();
		//super Ű���带 ���� �θ�Ŭ������ �ʵ�� �޼��带 ȣ��
		return super.toString() + data;
	}

}
