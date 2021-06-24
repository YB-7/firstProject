package operator;

public class BitReverseExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;	//-11
		int v3 = ~v1 + 1;	//-10
		System.out.println("이진수 " + toBinaryString(v1) + ", 십진수: " + v1);
		System.out.println("이진수 " + toBinaryString(v2) + ", 십진수: " + v2);
		System.out.println("이진수 " + toBinaryString(v3) + ", 십진수: " + v3);
		System.out.println();
	}

	public static String toBinaryString(int value) {
		// 십진수 값 => 이진수 값 보여주는 메소드
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
