package conditions;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("이름을 입력: ");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("입력 이름: " + name);
		}
		System.out.println("프로그램 종료");
	} // End of main()
} // End of class
