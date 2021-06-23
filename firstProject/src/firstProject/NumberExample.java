package firstProject;

public class NumberExample {
	public static void main(String[] args) {
		byte math = 30;	// -128 ~ 127
		byte eng = 50;
		
		byte sum = (byte) (math + eng);
		System.out.println("두점수의 합: " + sum);
	}
}
