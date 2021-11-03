package days13;

class Animal {
	String name;
	int age;
	String phone;
	
	// 	a1.output(); 
	//	객체에 의해 메소드가 호출되면 메소드를 호출한 객체(호출객체)의
	// 참조값(주소)이 메소드에 숨어 있는 this 참조변수에 전달되어,
	// 누가 호출햇는지를 구분하여 사용하게 도와줍니다
	// this <- a1; 
	public void output(/* Animal this */) {
		// 매개변수가 멤버 변수와 이름이 중복되어 구분되지 않는 상황이 아니더라도,
		// this 는 사용되고 있으며 아래와 같이 생략 또는 명시가 모두 가능합니다
		System.out.println("이름 : "+ this.name + " 나이 : " + age + " 전화번호 : " + phone);
	}
	
	void input(String n, int a, String p) {
		// 특히 아래와 같이 매개변수와 멤버변수 이름이 중복된다면, this 는 반드시 명시하여 사용합니다
		// name = name;
		// this.name = name;
		name = n;
		age = a;
		phone = p;
	}
	//Animal a3 = a1.copy1();
	Animal copy1() {
		//리턴값 존재 전달인수는 없음
		// 새로운 공간을 만들고 그 공간에 복사한 값을 리턴
		Animal temp = new Animal();
		// this <- a1
		temp.name = this.name;
		temp.age = this.age;
		temp.phone = this.phone;
		return temp;
	}
	//a4.copy2(a2); 리턴값은 없음 전달인수 있음
	// tmep <- a2 // this <- a4
	void copy2( Animal temp ) {
		this.name = temp.name;
		this.age = temp.age;
		this.phone = temp.phone;
	}
}

public class Class003 {

	public static void main(String[] argrs) {
		/**/
		//
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1.name = "a";
		a2.name = "b";
		// new 에 의해서 다른 공간에 만들어진 a1과 a2는 당연히 멤버변수들도 제각각
		// 공간을 따로 차지하고 있습니다
		// 그래서 위처럼 변수의 값을 따로 다른 값으로 대입하는 동작에 전혀 문제가 없음
		
		// 하지만 멤버메소드는 정의된 메소드가 하나만 존해하고 각 개체들이 공유하여 사용함
		// 따라서 어떤 객체가 해당 멤버 메소드를 호출했는지, 메소드 내에서 구분될 필요가 있음
		// 그것을 구분해주는 참조변수가 this 입니다
		
		a1.input("홍길동", 30, "010-0000-1111");
		a2.input("홍길서", 40, "010-2222-3333");
		
		a1.output();
		a2.output();
		
		//Animal a3 = a1;
		//이는 참조값의 복사이므로, 완벽한 객체생성과 복사가 이루어지지 않습니다
		//새로운 객체 생성(저장공간생성포함)과 복사가 이루어지려면
		//어디선가 new Animal() 명령이 반드시 있어야함
		// 객체가 복사보다 멤버변수간 값의 복사가 이루어져야 합니다
		// 그 복합 동작들을 메소드로 정의하고 실행하게 합니다
		Animal a3 = a1.copy1();
		a3.output(); // a1과 같은 값이 출력
		
		Animal a4 = new Animal();
		//a4 = a2; // 참조값의 복사
		a4.copy2(a2);
		a4.output();

	}

}
