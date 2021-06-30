package co.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.setName("김길동");
		s1.setGrade(1);
		s1.setEng(95);
		s1.setMath(56);

		s2.setName("최길동");
		s2.setGrade(1);
		s2.setEng(83);
		s2.setMath(91);

		s3.setName("박길동");
		s3.setGrade(1);
		s3.setEng(77);
		s3.setMath(68);

		// 배열선언 후 s1, s2, s3값을 저장
		Student[] students = { s1, s2, s3 };
		int max = 0;
		Student maxStudent = null;
		// 배열의 요소 중에서 영어점수가 최고인 점수를 출력
		for (int i = 0; i < students.length; i++) {
			if (max < students[i].getEng() + students[i].getMath()) {
				max = students[i].getEng() + students[i].getMath();
				maxStudent = students[i];
			}
		}
		System.out.println("성적합이 최고인 학생의 이름: " + maxStudent.getName());
	} // End of main()
} // End of class
