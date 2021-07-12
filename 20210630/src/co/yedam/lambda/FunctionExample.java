package co.yedam.lambda;

@FunctionalInterface
interface Runnable { // 구현해야할 메소드가 하나만 있는 인터페이스
	String run(String name);
//	void swim();	안됨
}

class RunClass implements Runnable {
	@Override
	public String run(String name) {
		System.out.println(name + "가 달립니다.");
		return name + " 화이팅!!";
	}
}

public class FunctionExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		String result = runnable.run("철수");
		System.out.println(result);

		runnable = new Runnable() { // 익명구현객체: new 인터페이스() {};
			@Override
			public String run(String name) {
				System.out.println(name + "가 달립니다.");
				return name + " 화이팅~!";
			}
		};
		result = runnable.run("영희");
		System.out.println(result);

		// 람다표현식
		runnable = (String name) -> { // 매개변수는 다를 수 있으니 생략하지 않고
			System.out.println(name + "이가 달립니다.");
			return name + "이 화이팅!!!!!";
		}; // 실행이 한 줄이면 중괄호도 생략가능
		result = runnable.run("익명");
		System.out.println(result);
	}
}
