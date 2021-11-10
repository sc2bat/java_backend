package days18;

// 추상클래스
// 상속을 통한 다형성(type casting)의 구현에 강제성을 부여하기 위한 클래스
// 상속의 문제점 : 강제성의 부재
// 상속을 통해 다형성(부모클래스를 상속받아 여러 형태의 자식 클래스를 생성하고 활용함)을
// 구현하고자 하여도, 하위클래스에서 메소드 오버라이딩을 구현하지 않으면 다형성을 완벽히 구현할 수 없습니다
// 이때, 오버라이딩을 구현하지 않는 것이 문법상 문제가 없다는 점을 강제성의 부재라고 합니다

class Animal{
	public void sound() {
		System.out.println("울음 소리~");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("멍~ 멍~");
	}// 부모클래스의 sound 메소드를 오버라이딩한 강아지 클래스
}

class Cat extends Animal{
	
}// 부모클래스의 sound 메소드를 오버라이딩 하지 않은 고양이 클래스

public class Extends10_Abstract01 {

	public static void main(String[] argrs) {
		/**/
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("강아지 소리");
		dog.sound();
		System.out.println("고양이 소리");
		cat.sound();
		// 강제성이 부여되지 않았다
		// 오버라이딩 하지 않아도 프로그램상 문제는 없음
		// 이러한 현상을 해결하기 위해 추상 메소드를 씀
		
	}

}
