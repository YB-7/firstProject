package conditions;

public class WhileExample2 {
	public static void main(String[] args) {

		while (true) {
			System.out.println("안녕하세요.");
			int ran = (int) (Math.random() * 3) + 1;
			System.out.println("생성된 값: " + ran);

			if (ran == 3) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	} // End of main()
} // End of Class
