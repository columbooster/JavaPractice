package exam_api_date;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		String[] strWeek = { "", "��", "��", "ȭ", "��", "��", "��", "��" };
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� " + week);

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "�� " + month + "�� " + day + "�� ");
		System.out.print(strWeek[week] + "���� ");
		System.out.println(strAmPm + " " + hour + "�� " + minute + "�� " + second + "�� ");
	}

}
