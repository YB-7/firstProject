package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Apple {
	String group;
	int price;

	Apple(String group, int price) {
		this.group = group;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return this.group.hashCode() + this.price; // String타입.hashCode()는 같은 문자면 같은 값을 return
		// 동일한 종류, 동일한 가격이면 같은 값을 return
	}

	@Override
	public boolean equals(Object obj) {
		Apple other = (Apple) obj;
		return this.group.equals(other.group) && this.price == other.price; // super.equals(obj);
	}
	// hashCode값이 같고 equals()리턴값이 true면 같은 객체로 판단
}

public class HashSetExample2 {
	public static void main(String[] args) {
		// Set : 중복된 값을 허용하지 않음
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("부사", 1000));
		set.add(new Apple("부사", 1000));
		set.add(new Apple("부사", 1500));
		set.add(new Apple("아오리", 1000));

		Iterator<Apple> iter = set.iterator();
		while (iter.hasNext()) {
			Apple app = iter.next();
			System.out.println("종류: " + app.group + ", 가격: " + app.price);
		}
	}
}
