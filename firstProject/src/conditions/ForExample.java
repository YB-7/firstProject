package conditions;

public class ForExample {
	public static void main(String[] args) {
		// 1 ~ 10 합을 구하는 프로그램.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println("현재 i: " + i);
				System.out.println("현재 sum : " + sum);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (i == 5) {
				break;
			}
		}
		System.out.println("최종 합계: " + sum);
	} // end of main()
} // end of class
