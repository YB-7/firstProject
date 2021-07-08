package co.yedam.generic;

import co.yedam.common.Main;

class Orange {
	int price;
}

public class BoxExample {
	public static void main(String[] args) {
		// 제너릭: 모든 유형의 데이터타입을 사용하는 시점에
		// 지정해서 Casting을 하지 않아도 타입오류를 일으키지 않게 해줌.
		Box<Integer> box = new Box<Integer>(); // 사용하는 시점에 타입을 정의할 수 있음
		box.setObj(10);
		Integer val = box.getObj();

//		box.setObj(10); // box.setObj(new Integer(10)); 과 같음
//		Integer val1 = (Integer) box.getObj();

		Box<String> boxx = new Box<String>();
		boxx.setObj("10");
		String val2 = boxx.getObj();

		Box<Orange> box1 = new Box<Orange>();
		box1.setObj(new Orange());
		Orange ora = box1.getObj();

		// int => Integer
		// byte => Byte
		// double => Double
	} // End of main()
} // End of class
