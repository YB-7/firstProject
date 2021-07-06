package co.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
//		System.out.println("Student: " + std.getName() + "," + std.getStudNo());

		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
//		System.out.println(
//				"HighStudent: " + highStd.getName() + ", " + highStd.getStudNo() + ", " + highStd.getSchoolName());

		Student[] students = new Student[3];
		students[0] = std;
		students[1] = highStd;

		students[0].getName();
		students[0].getStudNo();
		if (students[0] instanceof HighStudent) {	// students[0]의 인스턴스가 HighStudent의 것인지 체크
			HighStudent hsx = (HighStudent) students[0];
			// 담겨져 있는 값이 부모클래스의 instance가 아니면 오류남 (실행해봐야 오류체크 가능)
			hsx.getSchoolName();
		}
		students[0].showInfo();
		System.out.println(students[0]);
		
		students[1].getName();
		students[1].getStudNo();
//		students[1].getSchoolName(); 부모클래스를 가지고 있으므로 수행이 안됨
		HighStudent hs = (HighStudent) students[1]; // 작은 것에서 큰 것으로 강제로 형변환을 해야함
		if (students[1] instanceof HighStudent) {
			hs.getSchoolName();
		}
		students[1].showInfo();
		// 부모클래스가 가지고 있는 메소드를 재정의(오버라이딩)하면 자식클래스의 메소드가 실행됨.
		System.out.println(students[1]);	// toString()을 쓰지 않아도 알아서 실행됨
		
	} // End of main()
} // End of class
