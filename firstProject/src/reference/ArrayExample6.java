package reference;

public class ArrayExample6 {
	public static void main(String[] args) {
		// 학생의 점수를 저장하는 배열 scores
		// 평균점수와 가장 높은 점수를 구하는 것
		int[] scores = new int[3];	// { 90, 80, 84 };
		scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 20) + 80;
		}

		double avg = 0.0;
		int maxValue = 0;

		for (int score : scores) {
			if (maxValue < score) {
				maxValue = score;
			}
			avg += score;
		}
		avg /= scores.length;

		System.out.printf("평균은 %.2f점 입니다.\n", avg);
		System.out.println("최고점수는 " + maxValue + "점 입니다.");
	} // End of main()
} // End of class
