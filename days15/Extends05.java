package days15;

// 안되는 규칙 반드시해야하는 규칙

class SuperC{
	public SuperC() {// #3
		System.out.println("부모클래스의 매개변수가 없는 생성자");
	}
	public SuperC(int num) {
		System.out.println("부모클래스의 매개변수가 있는 생성자");
	}
}

class SubC extends SuperC{
	// 부모클래스의 디폴트 생성자가 존재하지 않는 경우
	// 자식클래스의 생성자에서는 반드시 super 를 사용하여 명시적으로 매개변수가 있는
	// 부모클래스의 생성자를 호출해야합니다
	public SubC() {
		//this(10);  // #1
		//super(10); // #2 
	}
	
	public SubC(int n) {
		super(10); // super(); 와 함께 해당 값을 넣어줘야 에러 안뜸
	}
	// 자식클래스 생성자에서 super 를 호출했으면 "그에 맞는 부모 생성자가 있거나"
	// 없으면 "지금 존재하는 부모생성자에 맞춰서 호출하거나"...
	
	// 컴파일러에 의해서 자동으로 삽입되는 코드 super();
	// 부모클래스의 디폴트 생성자를 실행하는 코드이므로 디폴트 생성자가 없는 경우 에러가 발생
}

public class Extends05 {

	public static void main(String[] argrs) {
		/**/
		//
		//SubC c = new SubC(10, 20, 30); // 에러 전달인수3인 생성자가 없기에

	}

}
