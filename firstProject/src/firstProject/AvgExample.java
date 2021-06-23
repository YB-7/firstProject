package firstProject;

public class AvgExample {
	public static void main(String[] args) {
		// 국어, 영어, 수학 0 ~ 100
		int kor, math, eng;
		// 국어: 85, 수학: 88, 영어 83
		kor = 75;
		math = 88;
		eng = 83;
		// 합계, 평균
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		// 학생이름: 은영빈
		String name = "은영빈";
		
		System.out.println(name + "의 점수합계는 " + sum + ", 평균은 " + avg + " 입니다.");
	}
}
