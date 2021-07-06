package co.yedam.modifier;

class Teacher{
	private String name;
	private String major;	// 동일한 클래스외에는 접근불가
	
	Teacher() {
		
	}
	
	String getName() {
		return name;
	}
}

public class Student {
	private String name;
	private String major;
	private int grade;
	
	private Student() {
		// private
	}
	
	protected Student(String name) {
		// protected
		this.name = name;
	}
	
	public Student(String name, String major) {
		// public
		this.name = name;
		this.major = major;
	}
}
