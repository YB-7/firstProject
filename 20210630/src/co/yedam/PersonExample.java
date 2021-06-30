package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		int num1 = 10;
		Person p1 = new Person(); // 이름, 나이, 키, 혈액형..
		p1.setName("홍길동"); // p1.name = "홍길동";
		p1.setAge(20); // p1.setAge = 20;
		p1.setHeight(175.5); // p1.height = 175.5;
		p1.setBloodType("O"); // p1.bloodType = "O";
		p1.setName("박길동"); // p1.name = "박길동";
		p1.setAge(22); // p1.age = 22;

		Person p2 = new Person();
		p2.setName("김길동"); // p2.name = "김길동";
		p2.setAge(30); // p2.age = 30;
		p2.setHeight(180.4); // p2.height = 180.4;
		p2.setBloodType("A"); // p2.bloodType = "A";

		Person[] persons = { p1, p2 };
		// 새로운 인스턴스 (사람) 선언: 내 정보를 담아서 p3 생성
		Person p3 = new Person();
		persons = new Person[] { p1, p2, p3 };
		p3.setName("은영빈"); // p3.name = "은영빈";
		p3.setAge(25); // p3.age = 25;
		p3.setHeight(-157.0); // p3.height = -157.0;
		p3.setBloodType("B"); // p3.bloodType = "B";

		for (int i = 0; i < persons.length; i++) {
			// 혈액행이 A인 사람만 조회
			if (persons[i].getAge() >= 25) {
//				persons[i].showInfo();
				System.out.println(persons[i].getInfo());
			}
		}
		// System.out.println(p1.name + ", " + p1.age + ", " + p1.height);
	} // End of main
} // End of class
