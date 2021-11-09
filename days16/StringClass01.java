package days16;

public class StringClass01 {

	public static void main(String[] argrs) {
		/**/
		//0.
		// 가용한 HEAP 공간에 "Hello"를 저장하고 그 주소를 s에 전달
		String s = "Hello";
		// 이미 저장된 "Hello"가 있다면 그 주소를 전달합니다
		//System.out.println("0. " + s.toString() );
		System.out.println("0. " + s);
		// 단점 : 같은 문자열 Hello 를 다른 변수에 저장하려한다면 새로운 공간이 할당되지 않습니다
		
		// 1.
		// new 에 의해 새로운 HEAP 공간에 "Hello"를 저장, 그 주소를 s에 전달
		s = new String("Hello");
		System.out.println("1. " + s);
		//System.out.println("1. " + s.toString() );
		// String 클래스는 Object 클래스를 상속받고 이미 toString 과 equals 가 자신에게 적합하게 오버라이딩 되어있습니다
		
		// 2.
		// 한글자만을 하나의 데이터로 갖는 char 형 배열
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c); // 배열주소를 초기값으로 문자열 구성.
		System.out.println("2. " + s2);
		
		//3.
		String n = "0123456789";
		char c1 = n.charAt(0);
		char c2 = n.charAt(5);
		System.out.println("3. " + c1 + "" + c2);

		
//		0. Hello
//		1. Hello
//		2. Hello
//		3. 05

	}

}
