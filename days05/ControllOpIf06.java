package days05;

import java.util.Scanner;

public class ControllOpIf06 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		int a; // 기본급 저장 변수
		double b; // 총지급액 저장 변수
		System.out.println("기본급을 입력하세요 : ");
		a = sc.nextInt();
		// 기본급이 백만원 이상이라면 기본급의 50% 를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60% 를 보너스로 합산
		// 총지급액을 출력하세요
		
				
		if (a < 1000000 && a >0) {
			b = a + a*0.6;
			System.out.printf("총지급액은 %.1f 입니다\n", b);
		}else if (a >= 1000000){
			b = a + a*0.5;
			System.out.printf("총지급액은 %.1f 입니다\n", b);
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		
		/*
		if(a >= 1000000)
			b = a + a*0.5; 
		// b = a * 1.5;
		else
			b = a + a * 0.6;
		*/
		//-------------
		double r;
		if(a >= 1000000) r = 0.5;
		else r = 0.6;
		double bonus = a*r;
		b = a + a * r;
		// b = a + bonus;
		System.out.println("총지급액 : " + (int)b + "원");
		System.out.println("추가보너스 : " + (int)bonus + "원");
		
		
	

	}

}
