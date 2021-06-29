package reference;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 33, 22, 17 };
		System.out.println("배열크기: " + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11;
		int sum = 0;
		int maxValue = 0;	// maxValue = intAry[0] 하면 음수값에서도 max값 찾을 수 있음
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값: " + intAry[i]);
			sum += intAry[i];
			// maxValue에 배열의 각 요소와 비교 후 큰 값을 maxValue에 대입
			if (maxValue < intAry[i]) {
				maxValue = intAry[i];
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("가장 큰 값: " + maxValue);

		double[] dblAry = { 1.0, 2.0, 3.0 };
		String[] names = { "Hong", "Kim", "Park" };
		names[0] = "Hwang";

		// 향상된 for문
		for (String name : names) {
			System.out.println(name);
		}

		for (double num : dblAry) {
			System.out.println(num);
		}
	} // End of main()
}
// End of class
