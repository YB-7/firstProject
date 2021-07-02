package co.yedam.pilates;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		PilatesApp app = PilatesApp.getInstance();
		//app.main();
		
		PilatesApp app2 = PilatesApp.getInstance();
		// app2.main();
		
		System.out.println(app == app2);	// 주소값 비교
		// true => 같은 객체라는 뜻
	}
}
