package days06;

import java.util.Scanner;

public class ControllOpFor06 {

	public static void main(String[] args) {
		// 
		// 팩토리얼
		Scanner sc = new Scanner(System.in);
		int i, k;
		int result = 1;
		System.out.printf("출력할 팩토리얼을 입력하세요 : ");
		k = sc.nextInt();
		// 6을 입력했다면 6! = 1x2x3x4x5x6 = 720
		
		System.out.printf("%d! = ", k);
		for (i=1; i <= k; i++) {
			result = result * i;
			if(i < k) {
				System.out.printf("%d x ", i);
			}else  System.out.printf("%d ", i);
		}
		System.out.printf("= %d \n", result);

		//------------------------------
		int fact = 1;
		System.out.printf("%d! = ", k);
		for (i=1; i < k; i++) {
			System.out.printf("%dx", i);
			fact = fact * i;
		}
		System.out.printf("%d = %d \n", k, fact*k);
		
		

	}

}
