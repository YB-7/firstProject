package operator;

public class OverflowExample {
	public static void main(String[] args) {
		try {
			// long r1 = add(30L, 20L);
			int r1 = add(Integer.MAX_VALUE, 20);
			System.out.println("결과: " + r1);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of prog.");
	}
	
	public static long add(long a, int b) {
		return a + b;
	}

	public static int add(int a, int b) {
		// a > max - b (b를 이항, 더한 값이 MAX값을 넘기면 - 값이 되므로)
		// a < min + b (b를 이항)
		if (a > Integer.MAX_VALUE - b) {
			throw new ArithmeticException("범위 밖의 값입니다.");
		} else if (a < Integer.MIN_VALUE + b) {
			throw new ArithmeticException("범위 밖의 값입니다.");
		}
		int result = a + b;
		return result;
	}
}
