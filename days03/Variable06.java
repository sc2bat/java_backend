package days03;

public class Variable06 {
	// 정수형 : byte(1), short(2), int(4 - 기본형) -21억 ~21억, long(8)
	// 실수형 : float(4), double(8 - 기본형)
	// 문자형 : char(2 - 유니코드 지원)
	// 진위형 : boolean(1 - true/false 의 값만 저장할 수 있음)
	// 문자열 : String(클래스, 정해진 크기가 없음)
	public static void main(String[] args) {
		// 
		System.out.println(100); // 100 은 정수형의 기본형 int 
		System.out.println(12.345); // 12.345 실수형의 기본형인 double
		
//		int k = 100;
//		byte a = k; // int 의 k가 byte로 변경되면서 숫자의 크기에 따라 값의 누락이 생길수 있다
//		float t = 123.12f; // 기본형이 double 이 아니라 오류가 뜨므로 F or f 를 추가해줘야함
		
		// 변수의 다양한 선언(생성) 방법
		// 1. 변수 선언 후 값을 할당(대입)
		int n1;
		n1 = 10;
		// 2. 변수의 선언과 값의 대입을 동시에 처리
		int n2 = 20;
		// 3. 다수의 변수를 한번에 선언하는 방법 (동일한 자료형만 가능)
		int n3, n4, n5;
		// 4. 다수의 변수를 값을 대입하면서 생성하는 방법
		int n6 = 60, n7 = 7;
		// 5. 처음부터 모든 변수에 값을 대입할 필요는 없음
		int n8, n9 = 90, n10;
		
		// 변수의 선언 위치
		// 변수의 사용 전이라면 위치에 관계없이 변수를 선언할 수 있음
		// 변수는 반드시 선언(생성) 후에 사용할 수 있으며,
		// 선언전에 사용하는 변수는 오류
		int v1 = 10;
		System.out.println("프로그램 시작 v1 변수의 값: " + v1);
		// System.out.printf("v3  변수의 값 %d\n", v3); // 에러
		// v3 변수 생성 명령이 앞단에 없으므로 위 명령은 오류
		// 변수가 생성되지 않으면 cannot be resolved to a variable
		int v3 = 30;
		// v3 변수가 생성되었으므로 아래 코드는 정상 실행
		System.out.printf("v3  변수의 값 %d\n", v3);
		
		// 변수가 선언 이후라도, 값이 대입되지 않으면 사용이 불가합니다.
		int v4;
		// 아래코드는 v4 변수값이 하나도 저장되지 않았기 때문에 오류를 발생합니다
		// System.out.printf("v4 변수의 값 %d\n", v4); // 오류
		// 값이 부여되지 않으면 The local variable v4 may not have been initialized
		v4 = 40;
		System.out.printf("v4 변수의 값 %d\n", v4);
		
		// 변수의 값은 여러번 대입할 수 있으며, 저장되는 값은 가장 최근, 마지막에 저장한 값이 저장되어 사용됩니다
		// 그 이전에 저장되는 값은 소멸 - 한 번에 하나씩만 저장할 수 있는 단점이 있음
		n1 = 60;
		System.out.println("프로그램 실행중 변경된 n1 변수의 값 : " + n1);
		
		
	}

}
