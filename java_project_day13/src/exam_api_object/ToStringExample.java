package exam_api_object;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date now = new Date();
		System.out.println(now.toString()); // Date클래스의 오버라이딩된 toString()
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = sdf.format(now);
		System.out.println(format);
		
		String str = new String("자바");
		System.out.println(str.toString()); // String클래스의 오버라이딩된 toString()
		
		Integer i = Integer.valueOf(10);
		System.out.println(i.toString()); // Integer클래스의 오버라이딩된 toString()

	}

}
