package exam_api_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		
		//Wed Feb 23 15:14:22 KST 2022
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		//2022�� 02�� 23�� ������ ���� 03�� 14�� 22��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		//Calendar Ŭ������ ��¥ ����.
		Calendar today = Calendar.getInstance();
		System.out.println(sdf.format(today.getTime()));
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sd.parse("2022-02-23"); //���ڿ��� ��¥��(Date)���� ��ȯ
		System.out.println(sd.format(date));
		
		// 10 -> "10"
		
		// "10" -> 10

	}

}
