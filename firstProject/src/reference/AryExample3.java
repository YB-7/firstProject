package reference;

public class AryExample3 {
	public static void main(String[] args) {
		// 크기순 정렬하기
		int num1 = (int) (Math.random() * 25);
		int num2 = (int) (Math.random() * 25);
		int num3 = (int) (Math.random() * 25);

		int[] intAry = new int[3]; // 기본값 = 0

		if (num1 > num2) {
			if (num1 > num3) {
				intAry[0] = num1;
				if (num2 > num3) { // num1 > num2 > num3
					intAry[1] = num2;
					intAry[2] = num3;
				} else { // num1 > num3 > num3
					intAry[1] = num3;
					intAry[2] = num2;
				}
			} else { // num3 > num1 > num2
				intAry[0] = num3;
				intAry[1] = num1;
				intAry[2] = num2;
			}
		} else {
			if (num2 > num3) {
				intAry[0] = num2;
				if (num3 > num1) { // num2 > num3 > num1
					intAry[1] = num3;
					intAry[2] = num1;
				} else { // num2 > num1 > num3
					intAry[1] = num1;
					intAry[2] = num3;
				}
			} else { // num3 > num2 >num1
				intAry[0] = num3;
				intAry[1] = num2;
				intAry[2] = num1;
			}
		}

		for (int num : intAry) {
			System.out.println(num);
		}

	} // End of main()
} // End of class
