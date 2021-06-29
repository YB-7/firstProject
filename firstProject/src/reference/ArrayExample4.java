package reference;

import java.util.Scanner;

public class ArrayExample4 {

	static int n = 25;
	static int[] intAry = new int[n];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 중복값 제거

		for (int i = 0; i < intAry.length; i++) {
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;
			// 이전 값과 비교
			for (int j = 0; j < i; j++) { // j를 감소시키는 방법도 있을 듯
				if (intAry[i] == intAry[j]) {
					// intAry[i] = (int) (Math.random() * n) + 1;
					pass = false;
					break; // 동일한 값이 있으면 for 반복문 벗어나기
				}
			}
			if (!pass) {
				i--;
			}
		}
		// 배열의 각 값을 출력
//		intAry[0] = 0;
//		intAry[4] = -1;
		// 화면에 출력
		for (int i = 0; i < intAry.length; i++) {
			show(i);
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		while (true) {
			System.out.print("숫자 10을 찾으세요(0~24) >>> ");
			int idx = scn.nextInt();
			if (idx > 24 || idx < 0) { // 잘못된 범위의 값을 입력한 경우
				System.out.println("잘못된 값을 넣었습니다.(0 ~ 24까지 값)");
				continue; // continue; 아래부분을 실행하지 않고 다시 반복의 처음으로
			}
			if (intAry[idx] == 10) {
				System.out.println("찾았습니다.");
				break;
			} else {
				intAry[idx] = 0;
			}
			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) {
					System.out.println();
				}
			}
		}
		System.out.println("프로그램 종료");
	} // End of main()

	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx);
		} else {
			System.out.printf("(**)", idx);
		}
	}
} // End of class
