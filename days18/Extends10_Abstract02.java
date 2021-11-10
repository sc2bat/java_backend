package days18;

// 추상 클래스 (Abstract Class)
// 상속을 통한 다형성의 구현(메소드 오버라이드)에 강제성을 부여하기 위한 클래스
// 추상메소드를 포함한 클래스: 추상 메소드를 하나이상 포함하면 추상 클래스라고 부릅니다
// 추상메소드 : 메소드의 원형만 존재하고 실제 내용이 없는 메소드

abstract class AbstractAnimal{
	public abstract void sound();
	// 메소드의 정의만 있고, 메소드의 body(몸체)구현은 없습니다
}

// 추상메소드의 작성방법
// 접근지정자 abstract 리턴값의타입 메소드명(매개변수);
// 추상 클래스는 일반 클래스와 동일하게 일반 멤버변수 일반 메소드, 생성자 등을 포함할 수 있습니다
// 단, 추상 메소드를 포함할 수 있는 특징이 추가된 클래스입니다
// 추상클래스는 상속을 통한 다형성 구현을 위해서 생성됩니다

class DogA extends AbstractAnimal{
	// 에러
	//1 add unimpleemnted methods 반드시 오버라이딩 
	//2 maketype DogA Abstract
	public void sound() { // 쓰는 순간 에러 없어짐
		System.out.println("멍~멍~");
	}
}

class CatA extends AbstractAnimal{

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
}

public class Extends10_Abstract02 {

	public static void main(String[] argrs) {
		/**/
		// 추상클래스는 상속전용으로 만들어지므로, 아래와 같이 단독으로 객체 생성을 하지 못합니다
		//AbstractAnimal a = new AbstractAnimal(); // 에러
				
		// 추상메소드를 오버라이딩한 자식클래스는 일반클래스로 사용될 수 있습니다.
		// 추상클래스로 추상클래스만의 객체를 만들수는 없지만
		// 추상클래스(부모)의 레퍼런스 변수로, 자식클래스의 인스턴스 주소는 저장할 수 있습니다
		// AbstractAnimal a = new AbstractAnimal(); X
		// 추상클래스는 내부에 완전치못한 ㅜ상메소드가 있으므로 객체생성이 안되지만
		// AbstractAnimal b = new DogA();	O
		// AbstractAnimal c = new CatA();		O
		// 자식들의 인스턴스를 저장할 레퍼런스 변수로는 사용이 가능하빈다.(다형성의 구현)
		AbstractAnimal dog = new DogA();
		AbstractAnimal cat = new CatA();
		System.out.println("강아지 소리");
		dog.sound();
		System.out.println("고양이 소리");
		cat.sound();
		
//		강아지 소리
//		멍~멍~
//		고양이 소리
//		야옹~
		
		
	}

}
