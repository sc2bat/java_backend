package days08;

import java.util.Scanner;

public class ControllOpWhile03 {

	public static void main(String[] args) {
		/**/
		// 
		// 정수를 입력받아서 입력된 정수의 팩터리얼을 출력해주세요
		//while 문 이용
		// 6 입력 6! = 1x2x3x4x5x6 = 720
		Scanner sc = new Scanner(System.in);
		int num, fact = 1;
		System.out.println("팩터리얼을 계산할 정수 입력 : ");
		num = sc.nextInt();

		System.out.printf("%d! = ", num);
		int i = 1;
		while (i < num) {
			System.out.printf("%d x ", i);
			i++;
			fact = fact * i;
		}
		System.out.printf("%d = %d", num, fact);
		//-------------------------------------------------------------------
		System.out.println();
		
		fact = 1;
		System.out.printf("%d! = ", num);
		i = 1;
		while (i < num) {
			System.out.printf("%d x ", i);
			fact = fact * i;
			i++;
		}
		System.out.printf("%d = %d", num, fact*num);
		//-------------------------------------------------------------------
		// 	3! = 3 x 2 x 1 = 6
		System.out.println();
		
		fact = 1;
		System.out.printf("%d! = ", num);
		i = 1;
		while (1 < num) {
			System.out.printf("%d x ", num);
			fact = fact * num;
			num--;
		}
		System.out.printf("1 = %d", fact);
		
		
		
		
		
		

	}

}
