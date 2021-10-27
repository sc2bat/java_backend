package days07;

import java.util.Scanner;

public class ControllOpFor10 {

	public static void main(String[] args) {
		// 
		//
		int sum =0, i, num;
		Scanner sc = new Scanner(System.in);
		//10개의 정수를 입력받아 그들의 합게를 출력하세요
		// 10개를 입력하는 중간에 종료를 원하면 0을 입력하여 입력을 종료하고
		// 최종 합계를 출력합니다
		// 입력 양식  
		// 입력1: XX
		// 입력2: XX
		// 입력3: XX
		// 입력10: XX
		// 출력양식 
		// 입력한 정수들의 합계 : XXX
		
		for(i=1; i <= 10; i++) {			
			System.out.printf("입력 %d : ", i);
			num = sc.nextInt();
			sum = sum + num;
			if (num == 0) break;
		}
		System.out.println("입력한 정수들의 합계 : " + sum);
		
		//-----------------------------------

		for(i=0; i <= 9; i++) {			
			System.out.printf("입력 %d : ", i+1);
			num = sc.nextInt();
			sum += num;
			if (num == 0) break;
		}
		System.out.println("입력한 정수들의 합계 : " + sum);
		
		

	}

}
