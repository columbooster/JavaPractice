package example;

import java.util.Scanner;
import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char[] nums = input.nextLine().toCharArray();
		
		Arrays.sort(nums);
		
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i]);
		}
		
		input.close();
		
	}

}
