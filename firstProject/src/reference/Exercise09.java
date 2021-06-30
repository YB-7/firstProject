package reference;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		boolean pass = false;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				pass = true;
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				if (!pass) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
					if (scores[i] < 0 || scores[i] > 100) {
						System.out.println("0 ~ 100의 숫자를 입력해주세요.");
						i--;
						continue;
					}
				}
			} else if (selectNo == 3) {
				if (!pass) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				if (!pass) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				int maxVal = 0;
				double avg = 0;
				for (int score : scores) {
					if (maxVal < score) {
						maxVal = score;
					}
					avg += score;
				}
				avg /= studentNum;
				System.out.println("최고 점수: " + maxVal);
				System.out.printf("평균 점수: %.1f\n", avg);
			} else if (selectNo == 5) {
				run = false;
			}
		} // End of while
		System.out.println("프로그램 종료");
	} // End of main()
} // End of class
