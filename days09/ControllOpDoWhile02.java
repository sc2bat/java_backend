package days09;

import java.util.Scanner;

public class ControllOpDoWhile02 {

	public static void main(String[] args) {
		/**/
		// 
		//
		Scanner sc = new Scanner(System.in);
//		int n1, n2, result = 0, operator;
//		System.out.print("1번째 정수를 입력하세요 : ");
//		n1 = sc.nextInt();
//		System.out.print("2번째 정수를 입력하세요 : ");
//		n2 = sc.nextInt();
//		System.out.print("계산에 사용할 부호를 입력하세요 [+ : 1], [- : 2], [* : 3], [/ : 4]");
//		operator = sc.nextInt();
//		
//		switch(operator)	{
//			case 1 : result = n1 + n2; break;
//			case 2 : result = n1 - n2; break;
//			case 3 : result = n1 * n2; break;
//			case 4 : result = n1 / n2; break;
//		}
//		System.out.printf("result = %d\n", result);
		
//		1번째 정수를 입력하세요 : 2
//		2번째 정수를 입력하세요 : 3
//		계산에 사용할 부호를 입력하세요 [+ : 1], [- : 2], [* : 3], [/ : 4]1
//		result = 5
		
		int n1, n2, result = 0, operator;
		int isExit;
		do {
				System.out.print("1번째 정수를 입력하세요 : ");
				n1 = sc.nextInt();
				System.out.print("2번째 정수를 입력하세요 : ");
				n2 = sc.nextInt();
				System.out.print("계산에 사용할 부호를 입력하세요 [+ : 1], [- : 2], [* : 3], [/ : 4]");
				operator = sc.nextInt();
				
				switch(operator)	{
					case 1 : result = n1 + n2; break;
					case 2 : result = n1 - n2; break;
					case 3 : result = n1 * n2; break;
					case 4 : result = n1 / n2; break;
				}
				System.out.printf("result = %d\n", result);
				System.out.print("계속하시겠습니까? (y : 1 / n : 2) : ");
				isExit = sc.nextInt();
		}while(isExit != 2);
		System.out.println("프로그램 종료");
		
		
		//
//		1번째 정수를 입력하세요 : 1
//		2번째 정수를 입력하세요 : 2
//		계산에 사용할 부호를 입력하세요 [+ : 1], [- : 2], [* : 3], [/ : 4]3
//		result = 2
//		계속하시겠습니까? (y : 1 / n : 2) : 1
//		1번째 정수를 입력하세요 : 3
//		2번째 정수를 입력하세요 : 4
//		계산에 사용할 부호를 입력하세요 [+ : 1], [- : 2], [* : 3], [/ : 4]3
//		result = 12
//		계속하시겠습니까? (y : 1 / n : 2) : 2
//		프로그램 종료
		
		// 상황에 따라 for do-while while 선택적으로 사용하면됨
		// 

		
	}

}
