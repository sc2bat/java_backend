package days19;

// 예외(Exception) 처리
// 에러(Error) : 잘못된 것, 에러가 존재하는 경우 실행될 수 없음
// 예외(Exception) : 잘못된 것, 특정 상황 또는 조건이 만족되는 경우 프로그램이 종료되는 현상
// 예외는 다양한 상황에 대해서 발생하는 현상으로 모든 예외를 대처할 수 없습니다
// 다만, 예외가 발생한 경우 프로그램이 종료되지 않고 저장과 같은 기능을 제공할 수 잇어야 합니다
// (예외가 발생해도 프로그램이 강제종료되지 않고 사용자에게 선택권 또는 처리기회를 주는 것을 말합니다)
// 예외처리 : 예외가 발생한 경우 프로그램이 강제 종료되지 않도록 방지하는 것입니다

public class Exception01 {

	public static void main(String[] argrs) {
		/**/
//		int k = (int)(Math.random() *10);
//		int result = 100 / k;		
//		System.out.println(result);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero at days19.Exception01.main(Exception01.java:17)
		
		// 사용자 대신 실행해서
		for (int i = 1; i <= 10; i++) {
			int k = (int)(Math.random() *10);
			// 에러가 난 라인 24라인 예외처리
			try {
				int result = 100 / k;		
				System.out.println(result);
			} catch( ArithmeticException e ) { // 뭘 사용해야할지 모르겠다면 ArithmeticException 대신 Exception만 써도됨
				System.out.println("0으로 나눴습니다.");
			} // 에러 발생하면 catch 구문 안의 명령을 대신 실행하고 프로그램 실행을 계속합니다
		}
//		16
//		20
//		14
//		20
//		Exception in thread "main" java.lang.ArithmeticException: / by zero at days19.Exception01.main(Exception01.java:24)
		// 프로그램이 에러나면서 종료가 됨
		
		//예외 처리 후 
//		16
//		0으로 나눴습니다.
//		0으로 나눴습니다.
//		50
//		16
//		11
//		0으로 나눴습니다.
//		0으로 나눴습니다.
//		50
//		20
		
		//days17\FormatterClass02.java 참조
		

	}

}
