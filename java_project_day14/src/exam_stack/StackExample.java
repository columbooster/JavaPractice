package exam_stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		// push() �޼��� : Stack�� ������ �߰�.
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		// pup() �޼��� : Stack�� ������ ��ȯ.
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ����(pop) : " + coin.getValue() + "��");
		}
		System.out.println(coinBox.isEmpty());
	}

}
