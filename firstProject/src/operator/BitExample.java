package operator;

public class BitExample {
	public static void main(String[] args) {
		int numb1 = 10;
		numb1 = -numb1;
		
		System.out.println("numb1의 값: " + (~numb1 + 1));
		
		int var1, var2, result;
		var2 = var1 = 10;
		
		result = var1 + var2;
		result = sum(var1, var2);
		System.out.println("결과값: " + result);
		
		String name = "김민수";
		String str = welcomeMessage(name);
		System.out.println(str);
	}
	
	public static int sum(int a, int b) {
		int val = a + b - 5;
		return val;
	}
	
	public static String welcomeMessage(String n) {
		String name = "Welcome " + n;
		return name;
	}
}
