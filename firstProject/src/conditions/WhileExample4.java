package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		// 1 ~ 50까지 2 또는 3의 배수의 합
		// while구문 사용
		int i = 1;
		int sum = 0;
		while (i <= 50) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum += i;
				System.out.println("i: " + i);
			}
			i++;
		}
		System.out.println("최종합계: " +  sum);
	} // End of main()
} // End of class
