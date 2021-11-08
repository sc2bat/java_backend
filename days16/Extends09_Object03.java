package days16;

//Object 클래스의 equals 메소드 : 객체간의 비교를 위해서 사용되는 메소드
//Object 가 상속한 메소드들 중 toString 과 함께 가장 많이 오버라이딩 되는 메소드

public class Extends09_Object03 {

	public static void main(String[] argrs) {
		/**/
		//일반적, 기본 자료형들의 값의 비교는 비교연산자(==)를 사용합니다
		int n1 = 10;
		int n2 = 10;
		if( n1 == n2 )System.out.println("n1 변수와 n2 변수는 같습니다");
		else System.out.println("n1 변수와 n2 변수는 다릅니다");
		//n1 변수와 n2 변수는 같습니다
		
		// s1 에 문자열을 저장할 수는 없음 따라서 heap 에 저장하고 객체를 지정해 가져옴 
		String s1 = "Hello";
		String s2 = "Hello";
		if( s1 == s2 )System.out.println("s1 변수와 s2 변수는 같습니다");
		else System.out.println("s1 변수와 s2 변수는 다릅니다");
		//s1 변수와 s2 변수는 같습니다
		// 갖고 있는 레퍼런스 주소값이 같은건가 hello라는 값이 같은건가
		//s1, s2 둘이 갖고있는 참조변수가 같은것임
		//System.out.println(s1);
		// == 연산은 변수가 직적ㅂ적으로 저장한 값으로 비교해주는 연산자라는 것을 감안하면 s1==s2 는 두 개의 참조변수값(주소값)이 비교되었다라는 것을 알 수 있습니다
		// 현재 s1과 s2 는 같은 주소를 갖고 있다는 말이기도 합니다
		
		// 어떻게 같은 주소를 갖게 되었나
		// String s1 = "Hello"; 실행시에 Heap 영역에 Hello가 저장되고 그 주소가 s1 변수에 저장됩니다
		//String s2 = "Hello"; 실행시에는 새로운 영역에 Hello가 저장되는게 아니라 이미 존재하는 Hello의 주소를 s2 에 또 저장합니다
		
		// 이는 모두 new 키워드가 없어서 새로운 공간이 안생겼기때문에 일어나는 현상입니다
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if( s3 == s4 )System.out.println("s3 변수와 s4 변수는 같습니다");
		else System.out.println("s3 변수와 s4 변수는 다릅니다");
		// s3 변수와 s4 변수는 다릅니다
		//앞선 명령과 달리 이번엔 new 키워드를 사용하여 서로 다른 공간에 Hello 를 저장하고 각각의 주소를 s3과 s4에 저장합니다
		// 결국 (==) 이 연산자는 글자들의 비교가 아니라, 레퍼런스 주소들의 비교라는 의미입니다
		
		// 실제 객체의 값을 비교하기 위한 equals 메소드를 사용하면 참조값이 서로다른 객체의 실제 데이터를 비교하여 동일한 데이터를 가지고 있는지 확인할 수 있습니다
		if( s3.equals(s4) )System.out.println("s3 변수와 s4 변수는 같습니다equals");
		else System.out.println("s3 변수와 s4 변수는 다릅니다equals");
		// s3 변수와 s4 변수는 같습니다equals
		
		// 같은 패키지 내에서 사용가능
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		if( p1.equals(p2) )System.out.println("p1 변수와 p2 변수는 같습니다equals");
		else System.out.println("p1 변수와 p2 변수는 다릅니다equals");
		// p1 변수와 p2 변수는 다릅니다equals
		// Point 에는 equals 가 오버라이딩되어 있지 않기때문
		
		// equals 메소드는 Object 클래스의 메소드로서 최초는 레퍼런스값(주소)들의 비교를 정의하고 있습니다
		// String 클래스는 이미 equals 메소드를 실제값의 비교로 오버라이딩 되어있으며 기타 다른 사용자 정의 클래스에서는 별도로 equals 를 실제값으로 비교하도록
		// 오버라이딩 해줘야 합니다

	}

}
