package co.yedam.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaDateTimeExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); // LocalDateTime -> String

		LocalDateTime anytime = LocalDateTime.parse("2021-06-13 15:00:00", dtf); // String -> LocalDateTime
		System.out.println(now.isAfter(anytime));
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");
		anytime = LocalDateTime.parse("2021/05/01 14", dtf);

		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		System.out.println(anytime.getMonth());
		LocalDateTime ti = LocalDateTime.now().withYear(2020).withMonth(7).withDayOfMonth(5).withHour(11);
		// 바꿔주는게 아니라 주어지는 값으로 새로 만들어주는 메소드
		System.out.println(ti.format(dtf));
//		System.out.println(now.isAfter(anytime));

		LocalDateTime yourBirth = LocalDateTime.now().withYear(1997).withMonth(12).withDayOfMonth(24).withHour(16);
		System.out.println(yourBirth.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:dd")));

	}
}
