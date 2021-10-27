package days08;

import java.util.Scanner;

public class ControllOpWhile04 {

	public static void main(String[] args) {
		/**/
		// 사용자에게서 단을 입력 받아 구구단을 출력합니다
		// 사용자가 0을 입력할때까지 출력할 단을 연이어 입력받고 구구단을 출력합니다 입력- 출력-입력-출력
		// while 문을 이용해서 작성해주세요
		// for 문의 경우는 한 번 출력하고 끝이였지만 while 문을 통해 반복
		
		int i, g;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단 입력 (종료-0) : ");
		g = sc.nextInt();

		while(g != 0) {
			i = 1;
			while(i <= 9) {
				System.out.printf("%d x %d = %d \n", g, i, g*i);
				i++;			
			}
			System.out.println("출력할 구구단의 단 입력 (종료-0) : ");
			g = sc.nextInt();
		}
		System.out.printf("구구단을 종료합니다 \n");
		
		//-----------------------------------------
		/*
		while(g != 0) {			
			for(i = 1;i <= 9; i++) // 입력한 단의 구구단 출력	
				System.out.printf("%d x %d = %d \n", g, i, g*i);
			// 다음 출력할 구구단의 단 입력
			System.out.println("출력할 구구단의 단 입력 (종료-0) : ");
			g = sc.nextInt();
		}
		System.out.printf("프로그램 종료");
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
