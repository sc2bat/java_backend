package days10;

public class Method02 {
	// 매개변수 :
	// 매소드 호출시 메소드가 필요로 하는 데이터를 전달해 줄 수 있는 매개역할의 변수
	// 메소드 호출시 괄호 안에 넣어주는 데이터 : 전달인수
	// 메소드의 몸체에서 괄호 안에 위치하면 전달된 값을 받아주는 변수 : 매개변수
	
	// 매개 변수의 선언
	// public static void 메소드 이름 (자료형 매개변수, 자료형 매개변수 ...){
	
	// }
	// 매개변수 또한 필요한 갯수만큼 선언해서 사용할 수 있습니다.
	
	// String[] args : main 메소드의 매개변수
	// args 라는 String 형 변수
	public static void main(String[] args) {
		/**/
		//
		//System.out.println(args[0]); // 이클립스에서 실행 불가 cmd 에서 실행
		
		myPrint(100); //전달받은 매개변수의 값 n -> 100
		// 100 : 전달인수 -> 괄호 안에 전달된 인수는 메소드가 실행될 때 메소드 정의영역 괄호안에 선언된 n변수에 저장됩니다
		myPrint(200); //전달받은 매개변수의 값 n -> 200
		
		// 전달인수가 있다면, 매개변수도 있어야함 각각
		myPrintWith2Int(300, 400);

	}
	
	// 매개변수 int n
	public static void myPrint(int n) {
		System.out.println("전달받은 매개변수의 값 n -> " + n);
	}

	// 전달인수가 있다면, 매개변수도 있어야함 각각
	// 아래 메소드는 다수의 매개변수를 전달 받는 메소드의 형태 - 각 매개변수 별로 전달받을 변수를 선언합니다.
	// 동일한 타입이라도 자료형의 생략은 허용되지 않습니다. (int n1, n2) x
	
	public static void myPrintWith2Int(int n1, int n2) {
		System.out.println("전달받은 매개변수의 값 n -> " + n1 +", n2 -> " + n2);		
	}
	// 전달인수는 반드시 매개변수의 자료형과 일치하는 자료를 전달해줘야합니다.
	// 다수개의 값을 전달할 때는 자료형과 순서도 일치하게 전달해줘야 합니다
	// 매개변수 acb(int x, double y) 전달인수 abc (300.0, 500) X
	
	
}

// public : 공용이라는 의미로 누구나 사용할 수 있는 메소드의 앞에 표기
// static : 정적(처음부터 만들어지는) 이라는 의미로 추후 객체지향 프로그래밍의 단원에서 자세히 공부합니다.
// void : 리턴값이 없다는 의미이며, 메소드 관련 다음 예제에서 자세히 공부합니다



