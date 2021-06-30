package co.yedam;

public class Student {
	private String name;
	private int grade;
	private int eng;
	private int math;

	public void setName(String name) {
		this.name = name;
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
