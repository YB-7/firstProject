package co.yedam.exercise20;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

	// 사용자 입력값을 문자열로 변환
	// 기능만 사용할 것이기 때문에 static 타입
	public static String scanString(String arg) {
		System.out.print(arg);
		String val = scn.nextLine();
		return val;
	} // End of scanString()

	public static String scanNumString(String arg) {
		String val = "";
		while (true) {
			System.out.print(arg);
			val = scn.nextLine();
			// 오류가 나면 프로그램을 끝내지 말고 다시 한번 처리하기 위해서
			try {
				Integer.parseInt(val); // 1000, 1200
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		return val;
	}	// End of scanNumString()
	
} // End of class
