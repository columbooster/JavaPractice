package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practiceforfor3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum;

    int n = sc.nextInt();

    

    sum = 0;

    for(int i=1; i<n+1; i++) {

      sum += i;

    }

    System.out.println(sum);

     

  }

}
