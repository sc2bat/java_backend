package days03;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		// 삼각형의 밑변을 입력하세요 : ㅁㅁ
		//삼각형의 높이를 입력하세요 : ㅁㅁ

		//입력한 삼각형의 넓이는 ㅁㅁ.ㅁ 입니다
		// 밑변 x 높이 x 0.5 or 밑변 x 높이 x 2.0
		
		int num1, num2;
		double result1;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변을 입력하세요 :");
		num1 = sc.nextInt();
		System.out.println("삼각형의 높이를 입력하세요 :");
		num2 = sc.nextInt();
		result1 = num1 * num2 * 0.5;
		System.out.printf("삼각형의 넓이는 " + "%d * %d * 0.5 = %.1f" + " 입니다\n", num1, num2, result1);
		// 결과값에 수식을 시각적으로 보여줄 필욘 없으니 num1, num2 치우기
		System.out.printf("입력한 삼각형의 넓이는 %.1f  입니다\n", result1);
		
		
		// Scanner sc = new Scanner(System.in);
		// int num1, num2;
		// double result;
		// System.out.print("삼각형의 밑변을 입력하세요 : ");
		// num1 = sc.nextInt();
		// System.out.print("삼각형의 높이를 입력하세요 : ");
		// num2 = sc.nextInt();
		// result = num1 * num2 * 0.5;
		// System.out.printf("입력한 삼각형의 넓이는 %.1f 입니다\n", result);
				
		
		
	}

}
