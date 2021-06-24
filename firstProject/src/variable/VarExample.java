package variable;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 30;
		System.out.println(var1);
		var1 = 60;
		System.out.println(var1);

		long var2 = 100;
		var2 = 200;

		int sum = var1 + (int) var2; // byte, char, short, int, long
		String name = "Hong";
		char chr = 'A';
		chr++;
		chr++;
		System.out.println((int) chr + ", " + chr);
	}

}
