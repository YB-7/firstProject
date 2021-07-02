package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp {
	
	private static PilatesApp singleton = new PilatesApp();	// 자기 자신타입의 필드
	
	private PilatesApp() {
		
	}

	public static PilatesApp getInstance() {
		return singleton;
	}
	
	Member[] members = new Member[10];
	Scanner scn = new Scanner(System.in);

	public void main() {

		// 초기 데이터 생성. 이유: 테스트 데이터를 입력하는 수고를 줄이기 위해
		members[0] = new Member(1, "Hong", "01012345678", "970101", Gender.MEN);
		members[1] = new Member(2, "Hwang", "01022225678", "970201", Gender.MEN);
		members[2] = new Member(3, "Park", "01033335678", "970301", Gender.WOMEN);
		members[3] = new Member(4, "Choi", "01044445678", "970401", Gender.WOMEN);

		// 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 6.상세조회, 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberUpdate();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 6) {
				detailSearch();
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	} // end of main()

	public void detailSearch() {
		int id = scanInt("상세조회할 ID>>> ");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberID() == id) {
				exist = true;
				System.out.println("=======================================");
				System.out.print("회원번호: " + members[i].getMemberID());
				System.out.println("\t이름: " + members[i].getMemberName());
				System.out.print("생년월일: " + members[i].getMemberBirth());
				System.out.println("\t연락처: " + members[i].getMemberPhone());
				System.out.println("성별: " + members[i].getMemberGen());
				System.out.println("=======================================");
			}
		}
		if (!exist) {
			System.out.println("해당 ID가 없습니다.");
		}
	} // end of detailSearch()

	public void memberUpdate() {
		int id = scanInt("수정할 회원ID 입력>>> ");
		scn.nextLine();
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberID() == id) {
				exist = true;
				String name = scanString("이름>>> ");
				if (!name.equals("")) {
					members[i].setMemberName(name);
				}
				String phone = scanString("연락처>>> ");
				if (!phone.equals("")) {
					members[i].setMemberPhone(phone);
				}
				String birth = scanString("생년월일>>> ");
				if (!birth.equals("")) {
					members[i].setMemberBirth(birth);
				}
			}
		}
		if (!exist) {
			System.out.println("조회결과가 없습니다.");
		}
	} // end of memberUpdate()

	public void memberDelete() {
		int id = scanInt("삭제할 회원ID 입력>>> ");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberID() == id) {
				members[i] = null;
				System.out.println("회원이 삭제되었습니다.");
				exist = true;
				break;
			}
		}
		if (!exist) {
			System.out.println("해당 ID의 회원이 없습니다.");
		}
	} // end of memberDelete()

	public void searchByName() {
		String name = scanString("조회할 이름 입력>>> ");
		boolean exist = false; // 회원정보가 있는지 체크
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) { // 앞에 조건이 무조건 먼저 와야함
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("해당 이름이 없습니다.");
		}
	} // end of searchByName()

	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				System.out.println(members[i].showInfo());
			}
		}
	} // search by memberList()

	public int getNextID() {
		// 회원번호 가입순번 => 1, 2, 3...
		int memberID = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버아이디 중에서 최고번호
				if (members[i].getMemberID() > memberID) {
					memberID = members[i].getMemberID();
				}
			}
		}
		memberID++;
		// 회원정보가 삭제되어도 회원ID는 무조건 가장 큰 값 다음 번호
		return memberID;
	} // search by getNextId()

	public void memberAdd() {
		String name = scanString("이름을 입력>>> ");
		String phone = scanString("연럭처를 입력>>> ");
		String birth = scanString("생일을 입력>>> ");
		Gender gender = scanGen("성별을 입력(1:남, 2:여)>>> ");

		Member member = new Member(getNextID(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++)
			if (members[i] == null) { // 입력시 비어있는 곳에 입력
				members[i] = member;
				System.out.println("입력완료");
				break; // 비어있는 위치에 한건 입력 후 종료
			}
	} // End of memberAdd()

	public String scanString(String arg) { // 입력메세지 출력 후 문자열 입력값을 반환
		System.out.print(arg);
		String val = scn.nextLine();
		return val;
	} // end of scanString()

	public int scanInt(String arg) { // 입력메세지 출력 후 int 반환
		int val = 0;
		while (true) {
			try {
				System.out.print(arg);
				val = scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
				scn.nextLine();
			}
		}
		return val;
	} // end of scanInt()

	public Gender scanGen(String arg) { // 입력메세지 출력 후 Gender 반환
		Gender gender = null;
		while (true) {
			try {
				System.out.print(arg); // 예외가 발생하면 에러메세지 출력 후 다시 입력 받음
				int gen = scn.nextInt();
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2 입력하세요.");
					continue; // 반복문 탈출 못하도록..
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return gender;
	} // end of scanGen()

	public void showMenu() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.회원리스트 | 5.이름조회 | 6.상세조회 | 9.종료");
		System.out.println("--------------------------------------------------------------");
		System.out.print("선택> ");
	} // end of showMenu()
} // end of class
