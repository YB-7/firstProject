package reference;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Hong"; // 첫번째
		names[1] = "Hwang"; // 두번째
		names[2] = "Park"; // 세번째
		names[3] = "Kim"; // 네번째
		names[4] = "Choi"; // 다섯번째

		String[] orders = new String[5];
		orders[0] = "첫번째";
		orders[1] = "두번째";
		orders[2] = "세번째";
		orders[3] = "네번째";
		orders[4] = "다섯번째";

		// Hong 입력 => 첫번째 위치에 있습니다.
		// quit 입력 => 프로그램 종료
		// Lee 입력 => 이런 이름은 없습니다.
		Scanner scn = new Scanner(System.in);
		String name = "";

		while (true) {
			Boolean val = false;
			System.out.print("이름 입력>>> ");
			name = scn.nextLine();
			
			if (name.equals("quit")) {
				break;
			}
			// 입력한 값이랑 배열에 들어있는 값 비교 ...몇번째입니다...
			for (int i = 0; i < names.length; i++) {
				if (name.equals(names[i])) {
					System.out.println(orders[i] + "입니다.");
					val = true;
				}
			}
			if (!val) {
				System.out.println("이런 이름은 없습니다.");
			}
		}
		System.out.println("프로그램 종료");
	} // End of main()
} // End of class
