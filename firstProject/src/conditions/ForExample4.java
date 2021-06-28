package conditions;

public class ForExample4 {
	public static void main(String[] args) {
		forSum();
	} // End of main()

	public static void whileSum() {
		// while 구문 1 ~ 10 합.
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 10까지 짝수합: " + sum);
	}

	public static void forSum() {
		// 1부터 10까지 i 변수를 활용
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.println("sum> " + sum + ", i> " + i);
			}
		}
		System.out.println("1 ~ 10까지 홀수합: " + sum);
		// 1 ~ 10까지 합: 55
	} // End of forSum()
} // End of class
