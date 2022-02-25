package exam_collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/* 장기자랑 프로그램에서 사용될 수 있는 심사위원들의 점수를 집계하는 프로그램을 작성하라.
 * 점수는 0.0에서 10.0 까지 가능하다. 10명의 점수 입력받아 그 중에서
 * 최고 점수(Collections.max(리스트의 참조변수))와
 * 최저 점수(Collections.min(리스트의 참조변수))
 * 는 제외된다. Double 타입의 ArrayList를 사용하라.
 * 
 * [실행결과]
 * 		심사위원의 점수: 1
 *  	심사위원의 점수: 2
 *  	심사위원의 점수: 3
 *  	심사위원의 점수: 4
 *  	심사위원의 점수: 5
 *  	심사위원의 점수: 6
 *  	심사위원의 점수: 7
 *  	심사위원의 점수: 8
 *  	심사위원의 점수: 9
 *  	심사위원의 점수: 10
 *  
 *  	점수의 합: 44.0
 */

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<Double>();

		Scanner scan = new Scanner(System.in);

//		for (int i = 0; i < 10; i++) {
//			System.out.println("심사위원의 점수 : ");
//			double value = scan.nextDouble();
//			list.add(value);
//		}

		// 입력단계
		int i = 1;
		double value = 0.0;
		while (true) {
			System.out.printf("(%d번째)심사위원 점수 : ", i);
			value = scan.nextDouble();
			if (value < 0 || value > 10) {
				continue;
			}
			list.add(value);
			i++;
			if (i > 10)
				break;
		}

		// 처리단계 및 출력단계
		double max = Collections.max(list);
		double min = Collections.min(list);
		double sum = 0.0;
		double collValue = 0.0;

		for (int j = 0; j < 10; j++) {
			collValue = list.get(j);
			if (collValue != min && collValue != max) {
				sum += collValue;
			}
		}
		System.out.printf("점수의 합 : %.1f", sum);

		scan.close();

//		list.add((double) 1);
//		list.add((double) 2);
//		list.add((double) 3);
//		list.add((double) 4);
//		list.add((double) 5);
//		list.add((double) 6);
//		list.add((double) 7);
//		list.add((double) 8);
//		list.add((double) 9);
//		list.add((double) 10);
//
//		double count = 0;
//
//		Iterator<Double> it = list.iterator();
//		while (it.hasNext()) {
//			double num = it.next();
//			System.out.printf("\t심사위원의 점수: %.0f%n", num);
//
//			count += num;
//		}
//
//		System.out.println();
//		System.out.println("\t점수의 합: " + (count - Collections.max(list) - Collections.min(list)));

	}

}
