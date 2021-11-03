package days13;

// this 의 용도 #1
// : 멤버메소드 내에 존재하면서, 메소드를 호출하는 호출객체의 레퍼런스 값을 저장하는 숨어있는 레퍼런스 변수

// this 의 용도 #2
// : 오버로딩 되어있는 생성자들 간 서로를 재호출 하기위한 이름으로 사용
// : 호출하는 형태 (매개변수의 형태)데로 생성자가 오버라이딩 되어있어야 사용가능

class ThisB{
	private int num1;
	private int num2;
	private int num3;
	ThisB(int n){
		num1 = n;
		System.out.println("ThisB클래스의 생성자1이 호출되었습니다");
	}
	ThisB(int n1, int n2){
		//num1 = n1;
		//ThisB(n1);
		this(n1);
		// this 라는 이름으로 자신의 형제 생성자 호출 // 객체가 만들어질때 호출
		num2 = n2;
		System.out.println("ThisB클래스의 생성자2이 호출되었습니다");
	}
	// 오버로딩된 생성자들이 갖고 있는 공통 코드들을 한쪽으로 일임하고, 
	// 그 코드 실행을 위해 형제 생성자를 호출하기 위한 용도
	ThisB(int n1, int n2, int n3){
		this(n1, n2);
		// this를 사용한 생성자간 호출코드는 반드시 생성자의 명령 중 첫번째 실행코드로만 사용 가능합니다
		num3 = n3;
		System.out.println("ThisB클래스의 생성자3이 호출되었습니다");
	}
}

public class Class16 {

	public static void main(String[] argrs) {
		/**/
		ThisB t1 = new ThisB(10);
		System.out.println();
		ThisB t2 = new ThisB(10, 20);
		System.out.println();
//		ThisB클래스의 생성자1이 호출되었습니다
//		ThisB클래스의 생성자1이 호출되었습니다
//		ThisB클래스의 생성자2이 호출되었습니다
		
		ThisB t3 = new ThisB(10, 20, 30);
//		ThisB클래스의 생성자1이 호출되었습니다
//
//		ThisB클래스의 생성자1이 호출되었습니다
//		ThisB클래스의 생성자2이 호출되었습니다
//
//		ThisB클래스의 생성자1이 호출되었습니다
//		ThisB클래스의 생성자2이 호출되었습니다
//		ThisB클래스의 생성자3이 호출되었습니다
		
		
	}

}
