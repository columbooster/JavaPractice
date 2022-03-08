package exam_join;

public class SumThread extends Thread {

	private int first, last;
	private int sum;

	public SumThread(int first, int last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public void run() {
		for (int i = first; i <= last; i++) {
			sum = sum + i;
		}
	}

	public int getSum() {
		return sum;
	}

}
