package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// 임의의 수 = > 가위, 바위, 보
		int ran = (int) (Math.random() * 3);
		String rsp = "";
		if (ran == 0) {
			rsp = "가위";
		} else if (ran == 1) {
			rsp = "바위";
		} else if (ran == 2) {
			rsp = "보";
		}

		Scanner scn = new Scanner(System.in);
		System.out.print("가위, 바위, 보 >>>> ");
		String str = scn.nextLine();

		// 조건문...컴퓨터 가위/바위/보 <=> 내 가위/바위/보
		// You win...
		// You lose...
		// Draw

		if (rsp.equals("가위")) {
			if (str.equals("바위")) {
				System.out.println("You win!");
			} else if (str.equals("보")) {
				System.out.println("You lose.");
			} else if (str.equals("가위")) {
				System.out.println("Draw.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} else if (rsp.equals("바위")) {
			if (str.equals("보")) {
				System.out.println("You win!");
			} else if (str.equals("가위")) {
				System.out.println("You lose.");
			} else if (str.equals("바위")) {
				System.out.println("Draw.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		} else {
			if (str.equals("가위")) {
				System.out.println("You win!");
			} else if (str.equals("바위")) {
				System.out.println("You lose.");
			} else if (str.equals("보")) {
				System.out.println("Draw.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("컴퓨터: " + rsp + ", You: " + str);
		System.out.println("<<<가위바위보 종료>>>");
	} // End of main()
} // End of class
