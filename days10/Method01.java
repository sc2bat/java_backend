package days10;

// Method : Function 이라고도 부르며, 간헐적으로 반복되는 코드단위를 별도로 정의하고 그 이름 불러서 코드를 실행하는 단위코드입니다.
// Java 에서는 Function 이란 말보다 Method 라는 표현을 주로 사용합니다.

//특징
//1. 명령들이 모여서 기능을 정의 하는 단위
//2. 일련의 실행코드들을 묶어서 재활용
//3. 메서드는 각 메서드마드 고유한 이름이 있습니다
//4. 메서드가 이름이 불리워져서 실행되라는 명령(Call-호출)을 받으면, 그 메서드의 몸체를 이루는 코드들이 실행되는 형식입니다
//5. 자바의 메서드는 이름 옆에 항상 괄호 () 를 달고 나옵니다

// 메소드의 생성 : 반드시 클래스의 내부에서만 선언할 수 있습니다.

// 우리말로 함수

public class Method01 {

	public static void main(String[] argrs) {
		/**/
		//
		System.out.println("프로그램 시작");
		myPrint(); // 메소드의 이름만 불러서 호출
		//
		// 메소드가 하나 호출되면, 메소드 몸체로 포커스가 이동한 뒤 그 몸체를 모두 실행하고 원래 자리로 돌아옵니다
		//
		//System.out.printf("내가 만든");
		//System.out.println("Print 메서드 실행~~!!	");
		System.out.println("프로그램 실행중");
		myPrint(); // 메소드의 이름만 불러서 호출
		//System.out.printf("내가 만든");
		//System.out.println("Print 메서드 실행~~!!	");
		System.out.println("프로그램 실행중");
		myPrint(); // 메소드의 이름만 불러서 호출
		//System.out.printf("내가 만든");
		//System.out.println("Print 메서드 실행~~!!	");
		System.out.println("프로그램 종료");
		
		// 3번씩 반복되는 코드를 별도로 작성하고 이름을 붙여서 직접 작성이 아니라 이름을 호출해서 실행시키자
//		프로그램 시작
//		내가 만든Print 메서드 실행~~!!	
//		프로그램 실행중
//		내가 만든Print 메서드 실행~~!!	
//		프로그램 실행중
//		내가 만든Print 메서드 실행~~!!	
//		프로그램 종료
		
		

	}
	// 메소드의 정의(define)
	// 개발자가 정의한 메소드의 정의 위치는 main 의 위나 아래 모두 정의 가능합니다.
	
	//public static void 함수 앞에 붙이는 문법
	// myPrint : 메소드의 이름 ()가 달려있으면 함수 {}가 본체
	public static void myPrint() {
		System.out.printf("내가 만든");
		System.out.println("Print 메서드 실행~~!!	");
	} // 매개변수가 없다.
	
//	프로그램 시작
//	내가 만든Print 메서드 실행~~!!	
//	프로그램 실행중
//	내가 만든Print 메서드 실행~~!!	
//	프로그램 실행중
//	내가 만든Print 메서드 실행~~!!	
//	프로그램 종료
	
	

}
