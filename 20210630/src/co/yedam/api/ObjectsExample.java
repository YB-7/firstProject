package co.yedam.api;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String sno;
	String name;
	int grade;

	Student(String sno, int grade) {
		this.sno = sno;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {
//		return this.sno.compareTo(o.sno); // -1(음의값) a - b = -1 (ASCII 코드로 비교했을 때) -> a 다음으로 b가 옴
		// 가나다 순으로 순위를 정함
		return this.grade - o.grade;
		// 학년을 기준으로 순위를 정함
	}
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.grade - o2.grade;
	}
	
}

public class ObjectsExample {
	public static void main(String[] args) {
		Student s1 = new Student("a001", 2);
		Student s2 = new Student("b001", 1);
		Student s3 = new Student("c001", 3);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.println(ts.first().sno);
	}
}
