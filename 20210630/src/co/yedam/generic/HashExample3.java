package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExample3 {
	public static void main(String[] args) {
		int[] intAry = { 2, 3, 4, 5, 6, 7, 3, 4, 5 };

		for (int i = 0; i < intAry.length; i++) {
			int temp = intAry[i];
			for (int j = i; j < intAry.length; j++) {

			}
		}
		// 만약 hashset을 쓰지 않고 중복을 걸러낸다면

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < intAry.length; i++) {
			set.add(intAry[i]);	// 중복값을 허용하지 않음
		}
		int[] newAry = new int[set.size()];	// set컬렉션의 size(); 로 배열의 크기 지정
		Iterator<Integer> iter = set.iterator();
		int i = 0;
		while (iter.hasNext()) {
			newAry[i] = iter.next();
			i++;
		}
		// hashset을 이용해 새로운 배열에 중복되지 않게 저장
		for (int j = 0; j < newAry.length; j++) {
			System.out.println(newAry[j]);
		}
		// 출력
	} // End of main()
} // End of class
