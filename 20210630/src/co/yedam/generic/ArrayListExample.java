package co.yedam.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("권가영");
		names.add("김유리");
		names.add("김유리");	// 중복된 값도 허용
		names.add("김지연");
		names.add(1, "박라원");
//		names.add(5, "박주현"); 인덱스 범위 내에서만 추가가능
		names.remove(0);
//		names.remove("김유리");
//		names.clear();

		System.out.println("크기 " + names.size());
		// java.lang.String 모든 패키지는 java.lang 패키지가 기본패키지므로 import 없이 사용가능

		for (int i = 0; i < names.size(); i++) {
			System.out.println("i: " + i + ", names: " + names.get(i));
		}

		names = new LinkedList<String>();
		
	}
}
