package co.yedam;

public class Student {
	private String name;
	private int grade;
	private int eng;
	private int math;

	public Student() { // 매개값이 없는 생성자: 기본 생성자

	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public Student(String name, int grade, int eng, int math) { // constructor: 생성자
		this.name = name;
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}

	public void setName(String name) { // 매개값을 가지는 생성자
		this.name = name; // 필드값을 초기화
	}

	public String getName() {
		return this.name;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return this.grade;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void showInfo() {
		System.out.println(
				"[이름: " + this.name + ", 학년: " + this.grade + " 영어점수: " + this.eng + " 수학점수: " + this.math + "]");
	}
}
