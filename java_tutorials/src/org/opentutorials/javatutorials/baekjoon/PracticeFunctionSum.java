package org.opentutorials.javatutorials.baekjoon;

class Test {
	
    public static long sum(int[] a) {
        long sum = 0;
        
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}


public class PracticeFunctionSum {

	public static void main(String[] args) {
		
		Test t = new Test();
		int[] a = {2147483648};
		
		System.out.println(t.sum(a));
	
	}
}

