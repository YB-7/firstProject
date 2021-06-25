package conditions;

public class ForExample3 {
	public static void main(String[] args) {
		// 1 ~ 50 까지 수 중에서 2 또는 3의 배수의 합
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum += i;
				System.out.println("i: " + i);
			}
		}
		System.out.println("최종 합계: " + sum);
	}
}