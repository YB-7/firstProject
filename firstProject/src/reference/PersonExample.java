package reference;

public class PersonExample {
	public static void main(String[] args) {
		Person ohj = new Person(); // 실제 존재를 만드는 것: 인스턴스화(개체)
		ohj.name = "홍길동";
		ohj.age = 20;
		ohj.height = 167.4;
		ohj.weight = 50;
//		ohj.birthday = "2010010101";
		
		ohj.walk();
		ohj.sleep();
		ohj.showInfo();
		
		Person psy = null;
		psy.walk();
		
	}	// End of main()
}	// End of class
