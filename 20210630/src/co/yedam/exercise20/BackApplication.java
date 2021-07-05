package co.yedam.exercise20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

public class BackApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static File file = new File("accountList.txt");

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.파일저장 | 6.파일열기 | 7.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				fileSave();
			} else if (selectNo == 6) {
				fileOpen();
			} else if (selectNo == 7) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	} // end of main()

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");

		String account = Utils.scanString("계좌번호: ");
		String name = Utils.scanString("계좌주: ");
		// static 타입의 메소드면 인스턴스를 만들 필요없이 기능만 사용가능
		System.out.print("초기입금액: ");
		int amount = scanner.nextInt();
		// String으로 받은 다음 ac.setBalance(Integer.parseInt(amount)) 하면 "1000" -> 1000
		System.out.println("결과: 계좌가 생성되었습니다.");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(account, name, amount);
				break;
			}
		}
	} // End of createAccount()

	// 계좌목록보기
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");

		System.out.println("계좌번호\t예금주\t금액");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno());
				System.out.print("\t" + accountArray[i].getOwner());
				System.out.println("\t" + accountArray[i].getBalance());
			} else {
				break;
			}
		}
	} // End of accountList()

	// 예금하기
	private static void deposit() {
		String ano = Utils.scanString("계좌번호: ");
		Account ac = findAccount(ano);

		if (ac != null) {
			System.out.print("예금액: ");
			int amount = scanner.nextInt();
			ac.setBalance(ac.getBalance() + amount);
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("해당하는 계좌가 없어서 예금에 실패했습니다.");
		}
	} // End of deposit()

	// 출금하기
	private static void withdraw() {
		String ano = Utils.scanString("계좌번호: ");
		Account ac = findAccount(ano);

		if (ac != null) {
			System.out.print("출금액: ");
			int amount = scanner.nextInt();
			if (ac.getBalance() - amount >= 0) {
				ac.setBalance(ac.getBalance() - amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			} else {
				System.out.println("예금액보다 큰 금액은 출금할 수 없습니다.");
			}
		} else {
			System.out.println("해당하는 계좌가 없어서 출금에 실패했습니다.");
		}
	} // End of withdraw()

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;
	} // End of findAccount()

	private static void fileSave() {
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] != null) {
					Account account = accountArray[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes()); // 얘도 같이 try-catch 처리됨.
				}
			}
			System.out.println("파일에 저장하였습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // End of fileSave()

	private static void fileOpen() {
		Reader is = null;

		try {
			is = new FileReader(file);
			int readByte = 0;
			StringBuffer sb = new StringBuffer(); // str += newStr;
			while ((readByte = is.read()) != -1) {
				sb.append((char) readByte);
			}
			String[] acnts = sb.toString().split("\n");
			for (int i = 0; i < acnts.length; i++) {
				String[] acnt = acnts[i].split(",");
				accountArray[i] = new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
			}
			System.out.println("파일을 불러왔습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
