package example;

import java.util.Iterator;

public class Lottofor {

	public static void main(String[] args) {

		int lotto[] = new int[6];
		
		System.out.print("´çÃ· ¹øÈ£ : ");
		
		for (int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random()*45) + 1;
			lotto[i] = num;
			for(int j=0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " ");
			
		}
		
		
	}

}
