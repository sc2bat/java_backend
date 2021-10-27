package days07;

import java.util.Scanner;

public class ControllOpFor16 {

	public static void main(String[] args) {
		/**/
		// 
		// 1부터 100사이의 소수 prime number 를 출력해주세요
		// 소수(prime number) : 1과 자기 자신의 숫자로만 나누어 떨어지는 숫자
//		방법은 역시 단순 무식하게..args 하나의 숫자가 소수인지 알아보기위해..	
//		1부터 자기자신의 숫자 사이의 모든 숫자로 나눠보고
//		나눠 떨어진 횟수가 2회이면 소수인걸로 간주하여 출력
//		그렇지 않으면 다음숫자(다음 반복)로 넘어갑니다
//		이중반복문이 사용됩니다. 중간에 if 문도 사용됩니다.
//		cnt 변수를 만들어서, 나눠 떨어질때마다 cnt++ 연산을 하고
//		cnt 값이 2일때 소수인걸로 판단합니다
//		
//		int cnt = 0; 
//		for(int i = 1; i <= 100; i++) {
//			for(int j = 1; j <= i; j++) {
//				if(j % 1 ==0 || i % j != 0 && j % j == 0) cnt++;
//				System.out.printf("%d ", j);
//				}
//			}
//		int c = 0;
//		for(int a =1; a <=10; a++)	{
//			for(int b = 1; a%b >=0; b++)
//				if(a%b ==0) {
//					for(bc++;
//					if (c == 2)
//						System.out.printf("%d ", b);
//				}
//		}
		
		// 1부터 100까지 하나하나 판단하는 것이 어렵다면 숫자하나를 입력받고
		// 그 숫자가 소수인지 아닌지 판단하여 출력해보고, 대상을 1부터 100으로 늘리는 방식을 이용하면 조금 도움이 될듯합니다
		/*
		int cnt = 0;
		
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				int a;
				for(a=1; j%a >= 0; a++) {
					if (a == 100)break;
					else if (j%a == 0) {
						if(cnt == 2)break;
						else cnt++;
					}
				}
				}
			}
		*/
		/*
		System.out.println("test");
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
//				System.out.printf("%d %d ", i , j);
				if(i / 1 == i && i / j == 1) {
					System.out.printf("%d \n", i);
					int cnt = 0;
					cnt = cnt +1;
					if(cnt == 2)break;
				}
				}
			} */
		
		//--------------------------------------------------------------------------------------
		// 소수를 판단하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int i, cnt = 0;
		for(i = 1; i <= num; i ++) {
			if(num % i == 0) cnt ++;
		}
		if(cnt == 2)System.out.println("입력한 정수는 소수입니다. ");
		else System.out.println("입력한 정수는 소수가 아닙니다. ");
		*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("소수인지 판단할 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
		
		int i, j, cnt = 0;
		for(i = 1; i <= 100; i++) {
			// 임의 숫자 5가 소수인지 아닌지 판단 후 다시 돌아오면 cnt 가 초기화되기에
			cnt = 0; // 새로 설정
			for (j = 1; j <= i; j++) {
				if(i % j == 0)cnt++;
			}
			if(cnt == 2)System.out.printf("%d ", i);
		}
		// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
		
//		이렇게 해도됨	
//		int i, j= 0;
//		for(i = 1; i <= 100; i++) {
//			int cnt = 0; 
//			for (j = 1; j <= i; j++) {
//				if(i % j == 0)cnt++;
//			}
//			if(cnt == 2)System.out.printf("%d ", i);
//		}
		
		
		
		
	}

}
