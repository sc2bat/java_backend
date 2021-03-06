package days06;

public class ControllOpFor01 {

	public static void main(String[] args) {
		// 
		
		System.out.println("겁나 쉬운 자바 프로그래밍~~!!");
		System.out.println("겁나 쉬운 자바 프로그래밍~~!!");
		System.out.println("겁나 쉬운 자바 프로그래밍~~!!");
		
		// for 명령 : 반복 실행 명령
		// 괄호 안에 ; 으로 구분해서 세가지 내용을 기술해줍니다
		// for(ㅁ1;ㅁ2;ㅁ3){ }
		// 작성되는 세가지 내용은 반복횟수를 제어할 구성요소들로 채워집니다
		// 또한 반복되는 횟수는 특정 변수값을 통해서 제어됩니다.
		// 첫번째 요소 ㅁ1 : 반복을 제어하는 변수의 최초값 대입 또는 변수의 생성영역입니다 변수를 만들어 쓸수도 있긴함
		// 두번째 요소 ㅁ2 : 다음 반복을 계속 할지 안할지에 대한 관계(비교)연산식입니다
		//		(결과 true/false) - 비교연산식의 결과가 true 이면 반복을 계속하고, false 이면 반복을 멈추고 for 영역을 빠져나옵니다
		// 세번째 요소 ㅁ3 : 반복제어 변수의 증감 연산
		System.out.println();
		
		// 반복실행을 제어할 변수를 하나 생성합니다
		int i;
		for( i=1 ; i <= 10 ; i++) {
			System.out.println("겁나 쉬운 자바 프로그래밍~~!!"+i);
		}
		System.out.println();
		// 첫번째 요소 : i 변수가 1을 최초로 갖고 반복이 시작됩니다
		// 두번째 요소 : i 값이 10보다 작거나 같은 경우 현재의 반복실행을 진행
		// 세번째 요소 : 계산할 i 변수의 증감 연산을 실행
		// 1 증가 i++ // 1감소 i-- // 2증가 i=i+2 (i+=2) // 2감소 i=i-2 (i-=2)
		// 매 반복마다 i++ 이 실행되서 i <= 10 이 false 가 되는 순간 반복이 멈춥니다
		
		//-----------------------------------------------------------------------------
		//열번의 반복실행을 위해서 i 변수 값이 반드시 1부터 10으로 설정할 필요는 없음
		for( i=11 ; i <= 20 ; i++) {
			System.out.println("1겁나 쉬운 자바 프로그래밍~~!!"+i);
		}
		System.out.println();
		for( i=101 ; i <= 110 ; i++) {
			System.out.println("2겁나 쉬운 자바 프로그래밍~~!!"+i);
		}
		System.out.println();
		for( i=10 ; i >= 1 ; i--) {
			System.out.println("3겁나 쉬운 자바 프로그래밍~~!!"+i);
		}
		System.out.println();
		
		// for 문에 속한 밥복대상 명령이 하나라면 중괄호 생략가능합니다
		for( i=0 ; i <= 9 ; i++)System.out.println("4겁나 쉬운 자바 프로그래밍~~!!"+i);
		System.out.println();
		for( i=0 ; i < 10 ; i++)System.out.println("5겁나 쉬운 자바 프로그래밍~~!!"+i);
		System.out.println();
		// 변수 이름 반드시 i일 필요도 없음
		int j;
		for( j=0 ; j <= 9 ; j++)System.out.println("6겁나 쉬운 자바 프로그래밍~~!!"+j);
		System.out.println();
		
		//--------------------------------------------------------------------------------
		// 반복을 제어하는 변수의 반복실행문 안쪽 선언
		for(int k = 101; k <= 110; k++) {
			System.out.println("7겁나 쉬운 자바 프로그래밍~~!!"+k);
		}
		// System.out.println(k); // 111
		// 변수의 수명 : 자신을 생성한 영역 {} 이 끝나면 변수도 소멸
		// System.out.println("반복실행변수의 최종값 : " +k); // 에러
		// 안쪽 변수는 반복실행후 제어변수를 더이상 사용치 않을 때 사용합니다
		// 반복 실행 후 반복제어 변수의 값이 필요하다면
		// for 문 안쪽에 변수를 선언하면 안됩니다.
		// 반드시 반복 실행문 위에 별도로 선언 후 사용하여야합니다
		
		
		
		
		
	}

}
