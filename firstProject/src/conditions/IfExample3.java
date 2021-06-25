package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 임의의 수 1 , 2, 3을 생성 => 1: 가위, 2: 바위, 3: 보
		int ran = (int) (Math.random() * 3) + 1;
		String anyVal = "";
		if (ran == 1) {
			anyVal = "가위";
		} else if (ran == 2) {
			anyVal = "바위";
		} else {
			anyVal = "보";
		}
		// 사용자 값을 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 입력>");
		String val = scanner.nextLine();

		// 임의의 값과 사용자 입력값 비교
		if (anyVal.equals(val)) {	// == eqauls()로 비교
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다");
		}

	} // end of main()
} // end of class
