package conditions;

import java.util.Scanner;

public class Exercise08 {

	// 필드..
	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}

	public static void printMenu() {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
		System.out.println("-----------------------------");
		System.out.println("선택> ");
	}

	public static void deposit() {
		System.out.print("예금액>>> ");
		int temp = scn.nextInt();
		// 잔고가 100,000이 넘지 않게 하기
		if (add(balance, temp) > 100000) {
			System.out.println("잔고가 100,000원을 초과하면 안됩니다.");
		} else {
			// balance += temp;
			balance = add(balance, temp);
			System.out.println(temp + "원이 입금되었습니다.");
		}
	}

	public static void withdraw() {
		System.out.print("출금액>>> ");
		int temp = scn.nextInt();
		// 잔액보다 큰 금액 출금하려면 안된다고 메세지
		if (add(balance, -temp) < 0) {
			System.out.println("잔액보다 큰 금액은 출금할 수 없습니다.");
		} else {
			// balance -= temp;
			balance = add(balance, -temp);
			System.out.println(temp + "원이 출금되었습니다.");
		}
	}

	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}
	
	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		boolean run = false;

		do {
			if (!run) {
				// id, pass => admin, 1234
				System.out.print("ID 입력>>> ");
				String id = scn.nextLine();
				System.out.print("passWD 입력>>> ");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass);
			} else {
				// 메뉴출력
				printMenu();	// 메소드 호출..

				int menu = scn.nextInt();
				if (menu == 1) {
					System.out.println("예금처리");
					deposit();
				} else if (menu == 2) {
					System.out.println("출금처리");
					withdraw();
				} else if (menu == 3) {
					System.out.println("잔액조회처리");
					System.out.println("잔고>>> " + balance);
				} else if (menu == 4) {
					run = false;
				}
			}
		} while (run); // while
		System.out.println("프로그램 종료");
	} // End of main()
} // End of Class
