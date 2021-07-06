package co.yedam.friend;

import java.util.Scanner;

public class FriendListApp {

	static Friend[] friends = new Friend[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.추가 | 2.리스트 | 3.종료
		boolean run = true;
		while (run) {
			System.out.println("=======================");
			System.out.println("1.추가 | 2.리스트 | 3.종료");
			System.out.println("=======================");
			System.out.print("선택> ");
			String selectNo = scn.next();
			switch (selectNo) {
			case "1":
				System.out.println("1.친구 2.학교친구 3.회사친구");
				String menu = scn.next();
				Friend friend = null;
				// 따로 함수 만드는게 깔끔할 것 같다.
				if (menu.equals("1")) {
					System.out.print("이름>>> ");
					String name = scn.next();
					System.out.print("연락처>>> ");
					String phone = scn.next();
					friend = new Friend(name, phone); // Friend 인스턴스

					// 배열에 저장
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = friend;
							break;
						}
					}
				} else if (menu.equals("2")) {
					System.out.print("이름>>> ");
					String name = scn.next();
					System.out.print("연락처>>> ");
					String phone = scn.next();
					System.out.print("전공>>> ");
					String major = scn.next();
					friend = new UnivFriend(name, phone, major); // UnivFriend 인스턴스

					// 배열에 저장
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = friend;
							break;
						}
					}
				} else if (menu.equals("3")) {
					System.out.print("이름>>> ");
					String name = scn.next();
					System.out.print("연락처>>> ");
					String phone = scn.next();
					System.out.print("부서>>> ");
					String depart = scn.next();
					friend = new CompFriend(name, phone, depart); // CompFriend 인스턴스

					// 배열에 저장
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = friend;
							break;
						}
					}
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				break; // 스위치 구문의 break
			case "2":
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].toString());
					}
				}
				break;
			case "3":
				run = false;
				// 굳이 break 안해도 마지막이라서 switch 구문을 빠져나옴
			}
		}
		System.out.println("프로그램 종료");
	} // End of main()
} // End of class
