package exam_api_date;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		String[] strWeek = { "", "일", "월", "화", "수", "목", "금", "토" };
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 " + week);

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년 " + month + "월 " + day + "일 ");
		System.out.print(strWeek[week] + "요일 ");
		System.out.println(strAmPm + " " + hour + "시 " + minute + "분 " + second + "초 ");
	}

}
