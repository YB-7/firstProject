package conditions;

public class Exercise04 {
	public static void main(String[] args) {
		int sum = 0;
		int fir, sec;
		
		while (sum != 5) {
			fir = (int) (Math.random() * 5) + 1;
			sec = (int) (Math.random() * 5) + 1;
			System.out.println("(" + fir + ", " + sec + ")");
			sum = fir + sec;
		}
	} // End of main()
} // End of class
