package co.yedam;

import java.util.Calendar;

// 1 ~ 31까지

// 1 2 3 4 5 6 7
// 8 9 10 11 12 13 14
// 15 16 17 18 19 20 21
// 22 23 24 25 26 28 28
// 29 30 31

public class calExample {
	public static void main(String[] args) {

		int year = 2021;
		int month = 7;
		printCal(year, month);
	} // End of main()

	public static void printDays() {
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		// 요일 정보
		for (String day : days) {
			System.out.print(day + " ");
		}
		System.out.println();
	} // End of printDays()

	public static void printCal(int year, int month) {
		System.out.println("     <<< " + year + "년 " + month + "월 >>>");
		Calendar cal = Calendar.getInstance(); // new Calendar();
		cal.set(year, month - 1, 1);

		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		printDays(); // 요일 타이틀 보여주기

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s ", " ");
		}

		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%3d ", i);
			if ((i + firstDay) % 7 == 1) {
				System.out.println();
			}
		}

		System.out.println();
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + (cal.get(Calendar.MONTH) + 1));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));
	} // End of printCal
} // End of class
