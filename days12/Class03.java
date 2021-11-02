package days12;

class Animal {
	String name;
	int age;
	
	// 멤버 메소드 : 클래스에 소속되어 클래스 객체에 종속된 메소드 입니다
	// 멤버 메소드의 일반적인 사용은 static 을 사용하지 않습니다
	public void output() {
		System.out.printf("나의 이름은 %s, 나의 나이는 %d 입니다\n", name, age);
	}
	// 멤버메소드는 클래스형으로 생성된 객체"전용" 메소드입니다
	// 메소드의 실행이 객체전용으로만 사용이 된다는 뜻입니다
	// 멤버메소드의 내용을 객체와 상관없는 명령이 들어갈 수도 있지만
	// 보통은 멤버변수들의 조작, 출력, 입력을 위한 명령들로 주로 구성됩니다
	public void input(String n, int a) {
		name = n;
		age = a;
	}
	// 현재 프로그램에 (패키지내의 같은 파일) 서만 사용한다는 가정하에 public 도 생략 가능합니다
	//public String getName() {
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}

public class Class03 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		// 이번 주 금요일 다음주 월요일 이틀에 걸쳐 시험
		// 난이도는 살짝 높음
		// if 배열 반복 class 등등
		
		//---------------------------------------------------
		// 알고있는 자료형 중에 필요한 자료형을 모아 복합적으로
		//System.out.printf("멤버변수 값 %d 입니다\n", a);
		
		Animal a1 = new Animal();
		Animal a2 = new Animal(); // 객체의 생성
		//멤버변수가 어떤 객체의 변수인지 구분하기 위해, 변수이름 앞에 (객체이름.)을
		// 붙여서 사용하듯이 멤버메소드도, 호출의 주체가 되는 객체이름을 반드시 써야합니다
		a1.name = "댕댕이";
		a1.age = 20;
		a1.output(); // 나의 이름은 댕댕이, 나의 나이는 20 입니다\
		System.out.println("이름 : " + a1.name + " 나이 :" + a1.age); // 이름 : 댕댕이 나이 :20
		
		a2.input("바둑이", 25);
		a2.output();// 나의 이름은 바둑이, 나의 나이는 25 입니다
		System.out.println("이름 : " + a2.name + " 나이 :" + a2.age); // 이름 : 바둑이 나이 :25
		
		String n = a1.getName();
		int a = a1.getAge();
		System.out.println("이름 : " + n + " 나이 :" + a); // 이름 : 댕댕이 나이 :20이름 : 댕댕이 나이 :20
		// 리턴된 값이 이어붙이기 되서 이자리로 옴
		System.out.println("이름 : " + a1.getName() + " 나이 :" + a1.getAge()); // 이름 : 댕댕이 나이 :20
		//
		// 어떤 멤버 메소드를 만들고 사용해야하는가에 대한 정답은 없습니다
		// 개발자 판단 및 프로그램의 필요성에 의해 설계하고 제작되는 메소드를 
		// 잘 만들고 잘 사용하면 됩니다

	}
	public void prn() {
		System.out.printf("멤버변수 값 %d 입니다\n", a);
	}

}
