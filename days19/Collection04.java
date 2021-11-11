package days19;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Vector;
import java.util.*;

// HashSet 클래스
// 데이터의 중복을 허용하지 않고 저장하는 클래스 
// - 검색을 위해서 사용되는 클래스 
// (저장할 때 hash 연산의 결과로 저장하니, 검색할 때도 hash 연산 결과로 검색하여 빠른 검색이 가능)
// hash 연산 : 클래스 내에서 유일한 값을 얻어낼 수 있는 고유 알고리즘 연산
// - 중복된 값을 제거하면서 데이터를 저장하기 위해 사용

public class Collection04 {

	public static void main(String[] argrs) {
		/**/
		//
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(2);
		System.out.println(v.size()); // 중복을 허용하기 때문에 3이 반환
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(2);
		System.out.println(a.size()); // 중복을 허용하기 때문에 3이 반환
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(2);
		System.out.println(l.size()); // 중복을 허용하기 때문에 3이 반환
		
		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(2);
		System.out.println(h.size()); // 중복을 허용하지 않기 때문에 2이 반환
		
		HashSet<Integer> lotto = new HashSet<>();
		while( lotto.size() < 6) {
			lotto.add( (int)(Math.random() * 45) + 1);
		}
		for (Integer i : lotto) {
			System.out.printf("%d ", i);
		}
		//1 18 2 7 26 28 
		System.out.println();
		
		// 해쉬세트 콜렉션에는 sort 메소드가 없습니다. 따라서 링크드 리스트
		// 부모클래스인 List 클래스에 전해줘서 리스트변환과정을 거치고,
		// Collections.sort 로 정렬을 수행하여야 합니다
		List<Integer> list = new LinkedList(lotto);
		Collections.sort(list);
		System.out.println(list);
		// [4, 15, 22, 40, 41, 45]
		
		//HashSet 타입의 객체 내부를 순회하는 방법
		// 1. Iterator 객체를 사용하는 방법
		// - Iterator 객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
		Iterator<Integer> iter = lotto.iterator();
		Iterator<Integer> iter2 = list.iterator();
		while( iter.hasNext() ) // iter.hasNext() 다음으로 가는것이 아니라 다음 데이터가 존재하는지 확인 후 true 리턴
			System.out.printf("%d ", iter.next() ); //iter.next() 다음으로 이동
		while( iter.hasNext() ) 
			System.out.printf("%d ", iter2.next() ); 
		// 제어권을 넘겨받아서 위와 같이 한번 리스트를 모두 순회하면,
		// iter = lotto.iterator(); 를 통해서 다시 방문 필요할 때 제어권을 다시 얻어내야합니다
		System.out.println();
		
		//2. for 문을 사용하는 방법(개선된 형태)
		// - for(자료형 변수명 : 순회할 수 있는 타입 (배열, 컬렉션) )
		// 배열 /컬렉션 으로부터 추출한 변수를 사용하는 코드
		for (Integer i : lotto) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		for (Integer i : list) {
			System.out.printf("%d ", i);
		} // type missmatch 로 오류 
		// lotto 는 제네릭으로 integer 가 맞지만 list 는 그 부모클래스인 object 이기에 안됨
		//List<Integer> list = new LinkedList(lotto); 제네릭을 해주면 사용가능
		
		// Integer i 부분 : 오른쪽의 배열이나 리스트의 아이템 하나를 저장할 변수선언
		// lotto 부분 : 왼쪽 변수에 차례로 하나씩 전닿래 줄 수 있는 아이템을 보유한 컬레션 또는 배여러
		// 오른쪽 리스트 또는 배열의 값을 차례로 하나씩 왼쪽 변수에 값을 전달하면서 1회의 반복실행을 진행합니다
		System.out.println();
		// 출력 결과 정렬이 안된 것은 lotto 정렬이 된 것은 list 를 출력한것
		
	}

}
