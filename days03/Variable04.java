package days03;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		// 입력
		// 반지름을 입력하세요 : xx
		// 출력
		// 입력한 원의 넓이는 xx.xx 입니다
		// 입력한 원의 둘레는 xx.xx 입니다
		
		// 넓이 : 반지름 x 반지름 x 3.141592
		// 둘레 : 반지름 x 2 x 3.141592
		
		Scanner sc = new Scanner(System.in);

		int num1;
		double result1, result2;
		
		System.out.println("반지름을 입력하세요 :");
		num1 = sc.nextInt();
		result1 = num1 * num1 * 3.141592;
		result2 = num1 * 2 * 3.141592;
		System.out.printf("입력한 원의 넓이는 %.2f 입니다\n", result1);
		System.out.printf("입력한 원의 둘레는 %.2f 입니다\n", result2);
		
		// Scanner sc = new Scanner(System.in); import 해주고
		// int num;
		// double n, d;
		// System.out.print("반지름을 입력하세요 :");
		// num = sc.nextInt();
		// n = num * num * 3.141592;
		// d = num * 2 * 3.141592;
		// System.out.println("입력한 원의 넓이는 " + (int)(n*100) / 100.0 + "입니다");
		// System.out.println("입력한 원의 둘레는 " + d + "입니다");
		// 123.1234
		// 123.1234* 100 -> 12312.34
		// (int)12312.34 -> 12312
		// 12312 / 100.0 -> 123.12

	}

}
