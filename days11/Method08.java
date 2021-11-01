package days11;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] argrs) {
		/**/
		//
		int ban;
		double n, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 : ");
		ban = sc.nextInt();
		n = calculate1(ban); // 원의 넓이를 구하는 메소드
		d = calculate2(ban); // 원의 둘레를 구하는 메소드
		prn(n, d); // 넓이와 둘레를 출력하는 메소드

	}
	/*
	public static double calculate1(int ban) {
		ban *= 3.14;
		return ban;
	}
	public static double calculate2(int ban) {
		double k = ban * 3.14 * 2 ;
		return k;
	}
	public static void prn(double n, double d) {
		System.out.printf("반지름 의 넓이는 %.1f 둘레는 %.1f 입니다", n , d);
	}*/
	
	// ---------------------------------------------------------
	public static double calculate1(int b) {
//		double n;
//		n = b * b * 3.141592;
//		return n;
		// 위 3줄
		// 한줄로
		 return b * b * 3.141592;
	}
	public static double calculate2(int b) {
		double d;
		d = b * 2 * 3.141592;
		return d;
	}
	public static void prn(double n, double d) {
		System.out.printf("입력한 원의 넓이 : %.2f 입니다", n);
		System.out.printf("입력한 원의 둘레 : %.2f 입니다", d);
	}
	
	

}
