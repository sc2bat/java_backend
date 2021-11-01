package days11;

import java.util.Scanner;

// 리턴값이 존재하는 메소드의 선언
// 메소드 호출 후 메소드에서 계산되어진 결과를 호출한 지점에서 사용하고자 할때
// return 명령으로 호출된 지점으로 전달할 수 있습니다.
// Method06 에서 total 은 지역변수이기에 한번 출력되고 땡이지만 그 값을 다시 가져오는것


public class Method07 {

	public static void main(String[] argrs) {
		/**/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		squar(num); // 이 함수가 실행되고서 되돌아왔을때 가지고 올 값을 넣어줄 별도의 변수가 필요
		// 리턴된 값을 따로 변수에 저장하지 않는다고 해서 에러가 나진 않음
		// 함수의 설계 목적상 리턴값이 있다면 변수에 담아서 사용
		
		int sq = squar(num); // squar 함수의 sq 와 main 의 sq 는 다름

		System.out.printf("%d의 제곱은 %d 입니다\n", num, sq); // 3의 제곱은 9 입니다
		//리턴한다고 변수를 main 에서 사용할 수 있는 것은 아님
		
		// 
		
		int max_result = max(10, 34, 67);
		System.out.printf("가장 큰 숫자는? -> %d\n ", max_result); //가장 큰 숫자는? -> 67

	}
	// main.num -> squar.num
	// squar.num * squar.num -> squar.sq
	// squar.sq -> main.sq
	
	//public static void squar(int num) {
	public static int squar(int num) {
		int sq =	num * num;
		//System.out.printf("%d의 제곱은 %d 입니다", num, sq);
		// 여기서 출력이 아니라 메인에서 출력하고자
		return sq;
		// 전송해줄 값을 리턴
		// void methods cannot return a value
		// 리턴값이 있는 것은 void 자리에 자료형 타입을 작성
	}
	// 메소드의 호출과 실행, 리턴값의 구조가 반드시 리턴값을 별도의 변수에 저장되게 구성해야하는 것은 아님
	// sc.nextLine() 
	// 다만 리턴명령의 목적이 메소드 실행결과를 리턴받아 사용할 목적이었다면
	// 리턴값을 별도의 변수에 저장하는 것이 설계목적상 올바른 사용입니다
	// String k = sc.nextLine();
	
	public static int max(int a, int b, int c) {
		int result = 0;
		if( a>b ) result = a;
		else result = b;		
		if( result<c ) result = c;
		
		return result;
	}
	
	// 메소드 사용에 따른 메소드 형태
	// abc() - 전달인수 없고 리턴값도 없는 형태
	// abc(10, 20) - 전달인수 2개, 리턴값 없음
	//	k = abc()	- 전달인수 없고, 리턴값 있는 형태
	//	k = abc(10, 20) - 전달인수 2개, 리턴값 있는 형태
	
	//##############################
	// 개발자 필요에 의해 만들어지는 메소드는 반드시 클래스 안에 정의 되어야 하며
	// 생성된 메소드 간에는 자유롭게 서로를 ㅊ호출하여 사용할 수 있습니다
	// 그들은 그들을 둘러싼 클래스에 속해 있는 멤버들이라고도 부릅니다
	// 다만 서로를 자유롭게 호출하는 대상에서 main 메소드는 제외합니다
	// main 을 호출한다는건 프로그램을 시작한다는 뜻
	//##############################

}
