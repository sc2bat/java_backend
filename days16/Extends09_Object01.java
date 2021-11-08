package days16;

//Object 클래스
// 사용자 정의 클래스를 생성하면서, extends(상속)을 구현하지 않으면 자동으로 java.lang.Object 클래스를 상속
// import 하지 않아도 항상 와있는 것 java.lang.Object 
// Object 클래스는 Java 에서 사용되는 모든 클래스들의 최상위 부모클래스입니다
// Subclass extends Super 라는 건 Subclass 는 Object 클래스를 상속하지않지만
// Super 클래스가 Object 클래스를 상속하므로, Subclass 는 Object 클래스를 상위의 상위로 상속한 것과 같은 의미입니다

class UserClass /* extends Object */{
	// 이렇게만해도 java.lang.Object 가 상속되어있음
}

public class Extends09_Object01 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		UserClass obj = new UserClass();
		//obj.변수 또는 obj.메소드 해야하는데
		System.out.println( obj.getClass() );
		// class days16.UserClass
		// getClass함수가 없는데도 불구하고 됨 
		//getClass메소드는 해당 객체의 클래스 이름을 리턴해주는 메소드이며, Object 클래스에서 상속 받은 메소드입니다.
		
		//hasCode 메소드는 해당 객체의 해쉬코드값(다른 객체와 구분하기 위한 고유값)을 리턴해주는 메소드 (JVM에 의해서 관리되고 있는 번호)
		System.out.println( obj.hashCode() );
		// 1365202186 // 10진수
		
		//toString 메소드는 해당 객체의 정보를 문자열로 리턴해주는 메소드
		System.out.println( obj.toString() );
		// 객체의 클래스명 + '@' + 해쉬코드값(16진수)
		// days16.UserClass@515f550a
		
		System.out.println( obj );
		// ==	System.out.println( obj.toString() ); 와 같음


	}

}
