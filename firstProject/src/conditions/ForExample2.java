package conditions;

public class ForExample2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int val = 5;
			System.out.println(val + " * " + i + " = " + (val * i));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end of main()
} // end of class
