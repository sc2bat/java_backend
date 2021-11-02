package days12;

// 생성자 Constructor
// 클래스의 객체가 생성될 때, 멤버필드의 초기화를 위해서 사용되는 메소드
// 각각의 개체가 생성될 때, 서로 다른 메모리를 가지는 객체를 생성할 수 있게 합니다
// 생성자의 특징
//1. 메소드입니다 (특별한 멤버메소드 - 처음 객체 생성시만 호출, 중간에 호출되지 않습니다)
//2. 클래스의 이름과 동일한 이름을 갖는 메소드입니다
//3. 리턴값이 없는 메소드입니다
//4. 따로 정의(생성)하지 않아도 이미 클래스 내부에 존재하는 메소드입니다
//5. 생성자는 각각의 객체가 생성될 때마다 호출되는 메소드입니다
//6. 주로 하는 일은 new 와 함께 객체가 저장될 Heap 메모리를 할당하고 그 안에 멤버변수를 만드는 일을 합니다
class Aclass {
	private int age;
	//필요에 다라 숨어있는 생성자를 꺼내놓고, 메모리확보하는 동작 외에 다른 일을 시킬 수 있습니다
	Aclass() {
		System.out.println("Aclass 의 생성자 호출~!");
		age = 100;
	}// 없어도 되지만 있으면 추가적으로 
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
}

public class Class08 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		Aclass a = new Aclass();
		// 객체가 만들어질때만 호출되기 때문에 다른 메소드처럼 호출객체와 함께 사용되지 않습니다
		// a1.Aclass(); //에러
		
		System.out.println("나이 : " + a.getAge());
		Aclass b = new Aclass();
		b.setAge(200);
		System.out.println("나이 : " + b.getAge());

	}

}
