package co.yedam.api;

class Apple implements Cloneable {
	int price;

	Apple(int price) {
		this.price = price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		Apple ap = (Apple) obj;
		return this.price == ap.price; // ((Apple) obj).price;
	}

}

public class ObjectExample {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.equals(new Object()));
		// 두 객체의 주소값을 비교

		Apple ap1 = new Apple(1500);
		Apple ap2 = new Apple(1000);

		try {
			Apple ap3 = (Apple) ap1.clone();
			System.out.println("ap3: " + ap3.price);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(ap1.equals(ap2));
	}
}
