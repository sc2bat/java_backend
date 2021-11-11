package days19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception07 {
	
	// 순수하게 숫자만으로 이루어진 정수를 입력 받는 while 과 try-catch 를 제작하세요
	// sc.nextInt() 는 입력 내용에 문자가 섞이면 (InputMismatchException 에러가 발생)
	// 에러가 발생하면, 입력 버퍼를 sc.next(); 를 실행해서 비우고
	// 잘못입력했습니다 메세지를 출력 후 정상 입력까지 입력을 반복하는 코들르 작성합니다
	// 문자를 입력받아 날짜로 변환하는 코드 참조

	public static void main(String[] argrs) {
		/**/
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		/*while (true) {
			try {
				System.out.println("정수를 입력해주세요");
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못입력했습니다 다시 입력하세요");
				// 키보드 버퍼에 남아있는 문자열(엔터 등)의 값을 제거
				sc.next(); // 입력 버퍼를 비움
			}
			
		}*/
		//같은 원리 sc.next(); 안쓰는것
		System.out.println("정수를 입력해주세요");
		while (true) {
			try {
				num = Integer.parseInt( sc.nextLine() );
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못입력했습니다 다시 입력하세요");
			}
			
		}
		System.out.println("입력된 정수 : " + num);
		
//		잘못입력했습니다 다시 입력하세요
//		23f
//		잘못입력했습니다 다시 입력하세요
//		43
//		입력된 정수 : 43

	}

}
