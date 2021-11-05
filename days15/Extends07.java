package days15;

// 상속문법
// 1. 각각의 클래스에서 발견되는 공통변수, 메소드등을 하나의 클래스로 선언하여 물려받는 문법입니다
// 2. 상속은 모든 클래스의 공통되는 속성, 기능을 정의된 부모클래스를 자식클래스에게 물려주는 방식입니다
// 3. 부모클래스 정의되는 속성, 또는 기능들은 모든 자식클래스에서 동작해야 하므로 일반적인 정의만 사용할 수 있습니다
// 4. 상속 받은 메소드들은 자식 클래스의 생성 목적이나 용도에 따라 사용이 어울리지 않은 메소드일 가능성이 있습니다

class Animal {
	public void crying() {
		System.out.println("소리를 냅니다");
	}
}
// 자식 클래스는 부모클래스에서 물려받은 메소드를 자신의 용도에 맞게 재정의(overriding) 할 수 있습니다
// 메소드 오버라이딩ㅇ은 자식클래스에서 부모클래스의 메소드의 원형을 다시 정의하는 문법입니다
// 메소드 오버라이딩을 구현하면, 부모클래스에서 물려받은 메소드는 무시되고, 새롭게 정의한 메소드가 사용됩니다

class Dog extends Animal{
	public void sound() {
		System.out.println("멍멍~!");
	}
	public void crying() {
		System.out.println("멍멍~!");
	}
	
}

class Cat extends Animal{
	public void sound() {
		System.out.println("냥냥~!");
	}
	public void crying() {
		// 오버라이딩이라 해서 전혀 사용못하는 것은 아님
		super.crying(); // 부모의 crying() 호출
		System.out.println("멍멍~!");
	}
	
}

public class Extends07 {

	public static void main(String[] argrs) {
		/**/
		Dog d = new Dog();
		Cat c = new Cat();
		d.crying();
		c.crying();
		// 단순히 상속받은것만
//		소리를 냅니다
//		소리를 냅니다
		System.out.println();
		d.sound();
		d.crying();
		c.sound();
		c.crying();
//		멍멍~!
//		소리를 냅니다
//		냥냥~!
//		소리를 냅니다
		
//		멍멍~!
//		멍멍~!
		
		//c.super.crying(); <- 에러
	}

}
// 메소드 오버라이딩
// 1. 메소드으이 이름이 동일해야합니다
// 2. 메소등의 매개변수타입, 개수, 순서가 다를 경우 같은 이름의 메소드라도 다른 메소드로 인식합니다
// 3. 상속관계에서만 사용할 수 있습니다
// 4. 부모클래스의 메소드의 원형과 반드시 일치해야합니다 (리턴값의 타입, 메소드이름, 매개변수)
// 5. 접근지정자는 축소될 수 없습니다(다형성의 구현때문에..)
// 6. 부모클래스의 final 로 정의된 메소드는 오버라이딩 할 수 없습니다
// 7. 오버라이딩된 자식 클래스의 메소드에서 super.crying(); 이란 명령으로 부모클래스의 메소드를 호출할 수 있습니다
// 8. 클래스의 외부에서는 super 라는 말을 쓸수 없으므로 생성된 객체를 통한 super 사용은허용하지 않습니다
//		c.super.crying(); <- 에러
