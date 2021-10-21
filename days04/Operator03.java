package days04;

public class Operator03 {

	public static void main(String[] args) {
		// 관계연산자 (비교연산자)
		// 좌항 기준 >(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지않다)
		// 좌항과 우항의 크기를 비교하여 true/false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 관계식이 틀린 경우 false 가 연산의 결과가 됩니다
		
		int n1 = 10;
		int n2 = 5;
		boolean result; // true or false
		
		result = n1 > n2; // n1 은 n2 보다 크다 - 맞으면 true 틀리면 false
		System.out.printf("%d > %d -> %b\n", n1, n2, result); // 10 > 5 -> true
		result = n1 < n2; //
		System.out.printf("%d < %d -> %b\n", n1, n2, result); // 10 < 5 -> false
		result = n1 >= n2; //
		System.out.printf("%d >= %d -> %b\n", n1, n2, result); // 10 >= 5 -> true
		result = n1 <= n2; //
		System.out.printf("%d <= %d -> %b\n", n1, n2, result); // 10 <= 5 -> false
		result = n1 == n2; //
		System.out.printf("%d == %d -> %b\n", n1, n2, result); // 10 == 5 -> false
		result = n1 != n2; //
		System.out.printf("%d != %d -> %b\n", n1, n2, result); // 10 != 5 -> true
		
		// 문자 (char) 데이터의 비교 : 각 데이터가 갖는 아스키 코드 값으로 비교
		char c1 = 'A', c2 = 'B';
		result = c1 > c2;
		System.out.printf("%c > %c -> %b\n", c1, c2, result); // A > B -> false
		result = c1 < c2;
		System.out.printf("%c < %c -> %b\n", c1, c2, result); // A < B -> true
		
		// String 데이터의 비교
		String s1 = "1234", s2 = "987";
		//result = s1 > s2; // error 문자열끼리 비교자체가 불가
		//System.out.println(s1 + ">" + s2 + "->" + (s1 > s2));
	
		// s1 과 s2 는 String 자료형이며, 다른 자료형과 다르게 이 두 변수가 직접 문자들을 저장하고 있지 않습니다.
		// 문자들은 별도의 자옷에 저장되고, 변수는 저장위치 값(주소 or 번지라고도 불림 address)만 저장하고 있습니다.
		// 따라서 변수들 간의 비교(s1>s2) 는 저장위치정보의 비교이므로 연산이 의미가 있지도 않고 가능하지도 않습니다
		
		// String 의 크다 작다를 판단해주는 compareTo()
		// String 의 같다 다르다를 판단해주는 equals()
		// String 자료간의 비교는 대부분 위의 두 도구를 이용합니다.
		
		int r = s1.compareTo(s2); // 두 개를 비교해보고 다른 형식으로 나옴
		// s1 이 크면 양수를, s2 가 크면 음수를 발생. & 변수 r에 저장. 같으면 0이 발생
		// 앞글자(s1)에서 뒷글자 (s2) 의 아스키 코드값을 뺀 값(정수)을 결과로 얻음
		System.out.printf("%s > %s => %d\n", s1, s2, r); // 1234 > 987 => -8
		r = s2.compareTo(s1);
		System.out.printf("%s > %s => %d\n", s1, s2, r); // 1234 > 987 => 8
		
		boolean b = s1.equals(s2); // 둘이 같으면 true, 다르면 false
		System.out.printf("%s == %s => %b\n", s1, s2, b);
		
		
		
	}

}
