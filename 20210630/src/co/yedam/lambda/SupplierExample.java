package co.yedam.lambda;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

// 람다식으로 표현가능한 fuctional class
public class SupplierExample { // 매개값은 없음, 반환값은 있음
	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			return "Hello World";
		};
		System.out.println(sup.get());

		IntSupplier intSup = () -> {
			return new Random().nextInt(40);
		};
		System.out.println(intSup.getAsInt());
		
		DoubleSupplier dsup = null;	// LongSupplier도 있음
	}
}
