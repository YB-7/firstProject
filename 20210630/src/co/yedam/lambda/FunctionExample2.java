package co.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int eScore;
	int mScore;

	public Student(String name, int eScore, int mScore) {
		super();
		this.name = name;
		this.eScore = eScore;
		this.mScore = mScore;
	}

	public String getName() {
		return name;
	}

	public int geteScore() {
		return eScore;
	}

	public int getmScore() {
		return mScore;
	}

}

public class FunctionExample2 { // 매개값 있음, 반환값 있음
	static List<Student> list = Arrays.asList(new Student("Hong", 80, 90), //
			new Student("Park", 85, 95)//
	);

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static void printString(Function<Student, String> func) {
		// 매개값으로 Student 출력으로 String값을 가진 Function이라는 인터페이스를 매개변수로
		for (Student student : list)
			System.out.println(func.apply(student)); // main()에서 apply()가 정의됨. 익명클래스의 일종이니까
	}

	public static void main(String[] args) {
		printString((Student t) -> {
			return t.getName();
		});

		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student t) {
				return t.geteScore();
			}

		});
		// 기능을 받아와서 람다식으로 표현
	}
}
