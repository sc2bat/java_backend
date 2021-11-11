package days19;

public class Exception05 {

	public static void main(String[] argrs) {
		/**/
		// main 에서는 프로그램을 실행시킨다는 의미가 크기에  throws Exception 사용 잘 안함
		// try catch 로 
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// throw Exception 꼬리표가 붙은 메소드를 호출하면, 호출하는 지점에 빨간줄(에러)표시가 표시됩니다
	// 그럼 다시 add throw declaration/ surround with try-catch 중 하나를 
	// 선택할 수 있습니다
	public static void method1() throws Exception {
		method2();
		
		/*try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	// 현재 예외처리를 해결하는 방법 #2
	// throw 마우스 클릭 
	// add throw declaration 메뉴 사용
	// "현재 메소드의 명령 중에는 에러(예외)가 발생할 가능성이 있는 명령이 포함되어 있습니다"
	// 라고 메소드에 꼬리표(throws Exception) 를 붙입니다 -> method2(); 가 호출되는 곳에 에러발생
	public static void method2() throws Exception {
		
		throw new Exception(); // 강제 예외발생
		
		// 현재 예외처리를 해결하는 방법 #1
		/*try {
			throw new Exception();
		} catch (Exception e) {
			
		}*/
		
	}
}
