package days13;
// Class0061 만들어서 올릴 것


// 생성자 메소드(Contructor)
// 객체가 생성될 때 호출되는 멤버메소드입니다
// new 명령과 함께 사용되어서 새로운 인스턴스가 새로운 공간에 생성되도록 해줍니다
// 클래스의 이름과 동일한 이름을 갖는 메소드입니다
// 리턴값이 없습니다
// 따로 정의하지 않아도 클래스 내부에 이미 존재하고 있는 메소드입니다
// new 클래스이름();  형태로 호출됩니다
// 객체가 생성될 때 한번호출되고, 그 이후 객체를 이용하여 다른 메소드들처럼
// 객체.메소드(); 형태의 호출이 불가능합니다

class Cat{
	private String name;
	private int age;
	private String phone;
	//원래 숨어있는 메소드이지만 필요에 따라 밖으로 꺼내어서 써놓기도 합니다
	public Cat() {
		// 밖으로 꺼내온 생성자의 내용이 아무것도 없다면, 꺼내지 않고 숨겨진 상태로
		// 있는 것과 다르지 않습니다
		// 보통 생성자 본래의 역할에 더하여 추가적인 명령을 쓰고자 할때, 이와 같이
		// 꺼내서 기술하곤 합니다
		//System.out.println("Cat 클래스의 생성자 호출~!");
		// 멤버변수의 값을 임의의값으로 초기화 하고자 할때도 사용합니다
		name = "야옹이";
		age = 10;
		phone = "010-8888-7777";
	}
	public Cat(int a, int b, int c, int d, String k) {
		//생성자 안에서 반드시 멤버변수들의 값을 대입해야하는건 아닙니다
		// 보통 멤버변수 값 대입 동작이 비교적 많이 사용될 뿐입니다
	}
	//생성자 또는 메소드의 오버로딩은 필요에 따라 제작하는 것을 권장하며,
	// 호출되지 않을 생성자와 메소드의 오버로딩은 만들지 않는 것을 권장합니다
	void prn() {
		System.out.println("이름 : " + name +" 나이 : " + age + " 전화번호 : " + phone);
	}
	void init(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
}
class Cat2{
	private String name;
	private int age;
	private String phone;
	public Cat2(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		// 생성자가 안에서 밖으로 꺼내져와서 매개변수가 있는 생성자로 재정의되는 순간
		// 매개변수가 없는 디폴트 생성자는 없어집니다.(매개변수 있는 생성자로 대체)
		// 매개변수가 없는 디폴트 생성자도 사용하려면 오버로딩해서 사용합니다
	}
	void prn() {
		System.out.println("이름 : " + name +" 나이 : " + age + " 전화번호 : " + phone);
	}
}

public class Class006 {

	public static void main(String[] argrs) {
		/**/
		//new Cat(); //에러는 안남 //주소는 마련해도 이름이 없기에 부를수가 없음
		// 
		Cat c1 = new Cat();
		c1.prn(); // 이름 : 야옹이 나이 : 10 전화번호 : 010-8888-7777
		// 고정된 값을 원하지 않을때 init 으로 값을 넣어준다
		Cat c2 = new Cat();
		c2.init("나비", 11, "010-1111-2222");
		Cat c3 = new Cat();
		c3.init("냥이", 9, "010-3333-4444");
		c2.prn(); // 이름 : 나비 나이 : 11 전화번호 : 010-1111-2222
		c3.prn(); // 이름 : 냥이 나이 : 9 전화번호 : 010-3333-4444
		
		Cat2 c4 = new Cat2("냥냥이", 8, "010-4545-5454");
		Cat c5 = new Cat(1, 2, 3, 4, "k");
	}

}
