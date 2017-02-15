package by.epam.tr.lesson5.task1;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar d = new GregorianCalendar();
		int month = d.get(Calendar.MONTH);
		int today = d.get(Calendar.DAY_OF_MONTH);
		int tempMonth = 0;
		while (tempMonth < 12) {
			d.set(Calendar.DAY_OF_MONTH, 1);
			d.set(Calendar.MONTH,tempMonth);
			String s = String.format("%1$tB - %1tY",d);
			System.out.println(s);
			int weekday = d.get(Calendar.DAY_OF_WEEK);
			System.out.println("Âñ Ïí Âò Ñð ×ò Ïò Ñá");
			for (int i = Calendar.SUNDAY; i < weekday; i++)
				System.out.print("   ");
			do {
				int day = d.get(Calendar.DAY_OF_MONTH);
				if (day < 10)
					System.out.print(" ");
				System.out.print(day);
				if (day == today && month==tempMonth)
					System.out.print("*");
				else
					System.out.print(" ");
				if (weekday == Calendar.SATURDAY)
					System.out.println();
				d.add(Calendar.DAY_OF_MONTH, 1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
			} while (d.get(Calendar.MONTH) == tempMonth);
			System.out.println();
			if (weekday != Calendar.SUNDAY)
				System.out.println();
			tempMonth++;
		}
	}
}
