package days19;

import java.util.*;

public class Collection06 {

	public static void main(String[] argrs) {
		/**/
		//
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		ht.put("One", 1);
		ht.put("Two", 2);
		ht.put("Three", 3);
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		
		System.out.printf("ht.size() -> %d\n", ht.size());
		System.out.printf("hm.size() -> %d\n", hm.size());
//		ht.size() -> 3
//		hm.size() -> 3
		
		// 중복되지 않은 키 값으로 데이터를 추가
		ht.put("Four", 4);
		ht.put("Five", 5);
		hm.put(4, "Four");
		hm.put(5, "Five");
		System.out.printf("ht.size() -> %d\n", ht.size());
		System.out.printf("hm.size() -> %d\n", hm.size());
//		ht.size() -> 5
//		hm.size() -> 5
		
		//키 값은 중복이 없고 밸류값은 중복되게 추가
		ht.put("Six", 1);
		ht.put("Seven", 2);
		hm.put(6, "One");
		hm.put(7, "Two");
		System.out.printf("ht.size() -> %d\n", ht.size());
		System.out.printf("hm.size() -> %d\n", hm.size());
//		ht.size() -> 7
//		hm.size() -> 7
		for (String k : ht.keySet()) {
			System.out.printf("k(%s) = v(%d)", k, ht.get(k));
		}
		System.out.println();
		for (Integer k : hm.keySet()) {
			System.out.printf("k(%d) = v(%s)", k, hm.get(k));
		}
		System.out.println();
//		k(One) = v(1)k(Seven) = v(2)k(Three) = v(3)k(Four) = v(4)k(Six) = v(1)k(Five) = v(5)k(Two) = v(2)
//		k(1) = v(One)k(2) = v(Two)k(3) = v(Three)k(4) = v(Four)k(5) = v(Five)k(6) = v(One)k(7) = v(Two)
		
		// 동일한 키값으로 다른 Value 가 입력되는 경우 기존의 Value 값이 수정됩니다
		ht.put("Six", 6);
		ht.put("Seven", 7);
		hm.put(6, "Six");
		hm.put(7, "Seven");
		System.out.printf("ht.size() -> %d\n", ht.size());
		System.out.printf("hm.size() -> %d\n", hm.size());
//		ht.size() -> 7
//		hm.size() -> 7
		for (String k : ht.keySet()) {
			System.out.printf("k(%s) = v(%d)", k, ht.get(k));
		}
		System.out.println();
		for (Integer k : hm.keySet()) {
			System.out.printf("k(%d) = v(%s)", k, hm.get(k));
		}
		System.out.println();
//		k(One) = v(1)k(Seven) = v(7)k(Three) = v(3)k(Four) = v(4)k(Six) = v(6)k(Five) = v(5)k(Two) = v(2)
//		k(1) = v(One)k(2) = v(Two)k(3) = v(Three)k(4) = v(Four)k(5) = v(Five)k(6) = v(Six)k(7) = v(Seven)
		
		
		
	}

}
