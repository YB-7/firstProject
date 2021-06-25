package conditions;

public class SwitchExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 5) + 1;
		switch (ran) {
		case 1:
			System.out.println("1값이 나왔습니다.");
			break;
		case 2:
			System.out.println("2값이 나왔습니다.");
			break;
		case 3:
			System.out.println("3값이 나왔습니다.");
			break;
		default:
			System.out.println("그외");
		}
	} // end of main()
} // end of class
