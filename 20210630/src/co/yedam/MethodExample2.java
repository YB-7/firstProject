package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		String name = p1.getName();

		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);
		System.out.println("결과: " + result);

		int result2 = p1.getSum(p1.getSum(10, 20), p1.getSum(5, 5)); // 위에 것과 같은 의미

		// 10 ~ 20
		n1 = p1.getFrom10To20();
		System.out.println("10 ~ 20: " + n1);

		n2 = p1.getFromTo(10, 30);
		System.out.println("10 ~ 30: " + n2);

		System.out.println(p1.getNameAndAge("홍길동", 20));

		Person newPerson = p1.createNewPerson("오혜지", 20);	//p1의 기능만 사용한 것!
		newPerson.setHeight(167.8);
		newPerson.setBloodType("AB");
		System.out.println(newPerson.getInfo());
		
		//
		Person anotherPerson = p1.createNewPerson("권가영", 20, 165.3);
		anotherPerson.setBloodType("A");
		System.out.println(anotherPerson.getInfo());
		
		Person theOtherPerson = p1.createNewPerson("안의정", 20, 166.6, "O");
		System.out.println(theOtherPerson.getInfo());
	} // End of main()
} // End of class
