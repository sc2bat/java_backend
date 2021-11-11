package days19;

import java.text.ParseException;

public class Exception04 {

	public static void main(String[] argrs) {
		/**/
		try {
			// 클래스니까 객체를 만들 수 있음
			ArithmeticException a = new ArithmeticException("ArithmeticException 고의발생");
			throw a;
		} catch (ArithmeticException e) {  
			System.out.printf("ArithmeticException - ");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.printf("RuntimeException - ");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (Exception e) {
			System.out.printf("Exception - ");
			System.out.println("예외메세지 : " + e.getMessage());
		}
//		ArithmeticException - 예외메세지 : ArithmeticException 고의발생

		// runtime에러 유도
		try {
			RuntimeException a = new RuntimeException("RuntimeException 고의발생");
			throw a;
		} catch (ArithmeticException e) {  
			System.out.printf("ArithmeticException - ");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.printf("RuntimeException - ");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (Exception e) {
			System.out.printf("Exception - ");
			System.out.println("예외메세지 : " + e.getMessage());
		}
//		RuntimeException - 예외메세지 : RuntimeException 고의발생
		
		try {
			ParseException a = new ParseException("ParseException 고의발생", 0);
			throw a;
		} catch (ArithmeticException e) {  
			System.out.printf("ArithmeticException - ");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.printf("RuntimeException - ");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (Exception e) {
			System.out.printf("Exception - ");
			System.out.println("예외메세지 : " + e.getMessage());
		}
//		Exception - 예외메세지 : ParseException 고의발생
	}

}
