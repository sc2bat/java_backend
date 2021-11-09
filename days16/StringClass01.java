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
		
		//4. 
		//첫글자부터 차례로 같은 자리의 글자와 비교
		// 크기를 결정하는 방법은 비교되는 두글자들의 뺄셈을 연산하여, 결과가 음수이면
		// 두번째 글자가 크다고 하고 양수이면 앞쪽그랒가 크다고 한다
		// ex) 'A' - 'B' => -1 뒤에서 빼려는 글자가 크다
		// 앞쪽부터 비교해서 같은 글자가는 지나치는 방식으로 크기가 결정되면 뒤에 글자들은 비교하지 않습니다
		// 결과가 0이면 다음 글자로 비교하고 끝까지 0이면 같은 글자
		String a1 = new String("ABCD");
		String a2 = new String("CCD");
		String a3 = new String("ABCD");
		System.out.println("4. a1.compareTo(a2) ? " + a1.compareTo(a2) );
		System.out.println("4. a2.compareTo(a3) ? " + a2.compareTo(a3) );
		System.out.println("4. a1.compareTo(a3) ? " + a1.compareTo(a3) );
//		4. a1.compareTo(a2) ? -2
//		4. a2.compareTo(a3) ? 2
//		4. a1.compareTo(a3) ? 0
		
		// 비교해서 정렬
		String[] k = {"Korea", "Japan", "Canada", "China", "Brazil", "Kenya", "Jamaica" };
		for (int i = 0; i < k.length; i++) {
			for (int j = i +1; j < k.length; j++) {
				if ( k[i].compareTo(k[j]) > 0) {
					String temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		for (int i = 0; i < k.length; i++) {
			System.out.printf("%s ", k[i]);
		}
		System.out.println();
//		Brazil Canada China Jamaica Japan Kenya Korea 
		
		
		
		//5.  s: Hello
		s2 = s.concat(" World");
		// concat 메소드는 원본 s에 있는 문자열에 World 를 이어붙이기하고 s에 업데이트해서 저장하는 것이 아니라
		// 이어붙이기된 새로운 문자열 객체를 만들어서 새로운 레퍼런스 변수에 저장할 수 있게 리턴해줍니다
		// String 클래스의 특성상 s에 있는 Hello 원본은 보호되고 있습니다
		System.out.println("5. " + s2);
		System.out.println("5. " + s);
//		5. Hello World
//		5. Hello
		
		//6. 
		s = new String("abcdefg");
		boolean b = s.contains("bc");
		//괄호 안의 문자열이 메소드 호출 객체가 갖고 잇는 문자열의 일부로 포함되어
		// 있다면 true 를 리턴해주는 메소드
		// boolean b = new String("abcdefg").contains("bc");
		System.out.println("6. 문자열 " + s + "에는 \"bc\" 가 포함되어 있다? " + b);
//		6. 문자열 abcdefg에는 "bc" 가 포함되어 있다? true
		
		//7.
		s = new String("Hello.txt");
		b = s.endsWith("txt"); // s.startWith(); 도 있음
		//메소드 호출 객체가 갖고 있는 문자열이 괄호 안의 문자열로 끝나면 true 를 리턴해주는 메소드
		System.out.println("7. 문자열 " + s + "에는 \"txt\" 가 포함되어 있다? " + b );
//		7. 문자열 Hello.txt에는 "txt" 가 포함되어 있다? true
		
		//8.
		s = new String("Hello");
		// 대소문자 구분해서 비교
		System.out.println("8. " + s + "는 \"Hello\" 와 같다 ? " + s.equals("Hello") );
		System.out.println("8. " + s + "는 \"hello\" 와 같다 ? " + s.equals("hello") );
//		8. Hello는 "Hello" 와 같다 ? true
//		8. Hello는 "hello" 와 같다 ? false
		// 대소문자 구분하지 않고 비교
		System.out.println("8. " + s + "는 \"HELLO\" 와 같다 ? " + s.equalsIgnoreCase("HELLO") );
		System.out.println("8. " + s + "는 \"Hello\" 와 같다 ? " + s.equalsIgnoreCase("Hello") );
//		8. Hello는 "HELLO" 와 같다 ? true
//		8. Hello는 "Hello" 와 같다 ? true
		
		//9. indexOf 몇번째에 있느냐
		System.out.println("\n9. " + s + "의 문자중 \'o\' 의 위치 " + s.indexOf('o') );
		System.out.println("9. " + s + "의 문자중 \'k\' 의 위치 " + s.indexOf('k') );
		// 메소드 호출 객체의 문자열 중에 괄호 안에 있는 문자가 몇 번째로 위치하는지를 구해줍니다
		// 있으면 위치값 (0부터 시작하는 정수), 없으면 -1
		System.out.println("9. " + s + "s.indexOf(\'e\', 1)-> " + s.indexOf('e', 1) );
		System.out.println("9. " + s + "s.indexOf(\'o\', 3)-> " + s.indexOf('o', 3) );
		System.out.println("9. " + s + "s.indexOf(\'e\', 2)-> " + s.indexOf('e', 2) );
		// 찾고자 하는 문자가 지정한 정수(0부터 시작) 번째부터 시작해서 몇 번째 글자로 위치하는지를 구해줍니다
		// 첫번째 사용예 : 알파벳 'e' 가 문자열 s의 0번째부터 찾아서 전체 글자의 몇번째 글자인지 구함: 1리턴
		// 두번째 사용예 : 알파벳 'e' 가 문자열 s의 2번째(0부터 시작)부터 찾아서 전체 글자의 몇 번째 글자인지 구함, 없으므로 -1 리턴
//		9. Hello의 문자중 'o' 의 위치 4
//		9. Hello의 문자중 'k' 의 위치 -1
//		9. Hellos.indexOf('e', 1)-> 1
//		9. Hellos.indexOf('o', 3)-> 4
//		9. Hellos.indexOf('e', 2)-> -1
		
		
	}

}
