package conditions;

public class IfExample {
	public static void main(String[] args) {
		// System.out.println((int) (Math.random() * 6) + 1);
		int ran = (int) (Math.random() * 6) + 1;
		// 0< x <1 이므로 (x*6) + 1을 하면 1< 6x + 1 <7 범위의 수가 나옴
		if (ran == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (ran == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (ran == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (ran == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (ran == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (ran == 6) {
			System.out.println("6번이 나왔습니다.");
		}

		// 1 ~ 100 까지의 임의의 수.
		// score 변수에 담아서...
		// score => 80 B. 90 A.
		int score = (int) (Math.random() * 100) + 1; // 1

		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
	}	//end of main()
}	//end of class
