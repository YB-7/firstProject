package co.yedam.common;

import co.yedam.modifier.Student;

public class HighStudent extends Student {
	
	HighStudent(String name) {	// protected는 상속의 관계가 되면 패키지가 다르더라도 접근가능
		super(name);
	}
}
