package days06;

import java.util.Scanner;

public class ControllOpFor07 {

	public static void main(String[] args) {
		// 
		//

		Scanner sc = new Scanner(System.in);
		int i, k;
		System.out.printf("출력할 팩토리얼을 입력하세요 : ");
		k = sc.nextInt();
		// 6을 입력했다면 6! = 6x5x4x3x2x1 =720

		int fact = 1;
		System.out.printf("%d! = ", k);
		for (i=1; i < k; k--) {
			System.out.printf("%dx", k);
			fact = fact * k;
		}
		System.out.printf("%d = %d \n", k, fact*k);
		/**/
		//---------------------------
		/*
		System.out.printf("%d! = ", k);
		for (i=k; i > 1; i--) {
			System.out.printf("%dx", i);
			fact = fact * i;
		}
		System.out.printf("1 = %d \n", fact);
		*/
		
	}
	
}
