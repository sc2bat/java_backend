package days15;

// 접근지정자와 상속
// 부모클래스의 private 멤버는 아무리 자식 클래스여도 접근할 수 없는 멤버입니다 

class SuperA {
	//private : 현재 클래스 내에 있는 멤버 메소드를 통해서만 접근 가능한 완전 은닉 멤버변수 - n1
	private int n1;
	public int n2;
	//디폴트 접근 지정자 : 동일한 패키지 내부에서는 public 으로 동작, 
	// 다른 패키지에서는 private 으로 동작 - n3
	int n3;
	// 자신의 클래스에 있는 private 멤버에 access 하는 멤버 메소드
	
	public int getN1() {
		return n1;
	}
	// 자식 클래스에서는 public과 같으며, 외부로부터는 private 로 동작
	protected int n4;
}

class SubA extends SuperA {
	//부모 클래스의 생성자는 숨어있음
	
	public void printInfo() {
		// 부모 클래스의 private 멤버에는 access 할 수 없습니다 
		//System.out.println(this.n1); // 에러
		// 부모 클래스의 public 멤버에는 access 할 수 있습니다 
		System.out.println(this.n2);
		// 부모 클래스의 디폴트접근지정자는 동일한 패키지 내에서 public 과 같으므로
		// access 가 가능합니다
		System.out.println(this.n3);
		
		// public 으로 선언된 멤버메소드를 이용하면, 부모클래스의 private 멤버에도
		// access 가능합니다
		System.out.println(this.getN1());
		
		// 부모클래스의 protected 는 자식클래스에게 public 과 같습니다
		System.out.println(this.n4);
	}
}

public class Extends03 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		SubA k = new SubA();
		k.printInfo();
	}

}
