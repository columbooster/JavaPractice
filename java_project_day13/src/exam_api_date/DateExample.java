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
		
		//2022년 02월 23일 수요일 오후 03시 14분 22초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		//Calendar 클래스로 날짜 설정.
		Calendar today = Calendar.getInstance();
		System.out.println(sdf.format(today.getTime()));
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sd.parse("2022-02-23"); //문자열을 날짜형(Date)으로 변환
		System.out.println(sd.format(date));
		
		// 10 -> "10"
		
		// "10" -> 10

	}

}
