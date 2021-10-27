package days08;

import java.util.Scanner;

public class ControllOpWhile01 {

	public static void main(String[] args) {
		// 
		// if 문에 switch 가 있었고 ? 도 있었고
		// 또 다른 형태의 반복 실행문
		
		// while 반복문
		//for 반복문은 정해진 횟수의 반복을 괄호안에 미리 정의 해놓고 반복하는 특징이 있습니다
		//while 문은 정해지지 않은 횟수의 반복을 처리하는데 주로 사용합니다.
		//특정 조건이 만족할 때까지 무한 수행합니다
		// while(true) {} -> 이 반복문은 종료되지 않습니다 -> 무한 반복
		
		// for 명령을 이용한 일반 반복실행 : 10번 반복
		/*
		int i;
		for(i = 1; i <= 10; i++) {
			System.out.printf("for ");
		}
		System.out.println();
		
		// 위 for 문을 while 문으로 변경한 예
		i = 1; // i 초기값 설정해서 조건이 무한정 true가 된다면 무한반복
		while(i <= 10) {
			System.out.printf("while ");
			i++; // i 값증가
		}*/
		
		// -> 끝나지 않고 무한 반복됨
		
		// 괄호 안의 관계연산식의 참/거짓 유무를 먼저 판단한 후 반복을 계속할지 결정합니다
		// while 문의 경우 윙에서 코딩한 것처럼 i++ 명령에 의해 반복 유지 유무가 결정되는 것보단 특정 조건에 의해 순서와 상관없이 반복이 결정되는 상황에 더 적절히 사용됩니다
		/*
		i = 1;
		for( ; ; ) {
			// 무한 반복실행
			// for 생략이 가능함
			i++;
			if(i > 0)break; // 반복실행을 유무를 결정
		} 
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		int input = sc.nextInt();
		
		while(input != 3 ) { // 3이 입력되면 이곳에서 명령이 멈춤
			// 필요한 명령들...
			System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			if(input == 3)System.out.printf("프로그램을 종료합니다");
			
		}
		
		/*
		while(true) {
			System.out.println("메뉴 선택: 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			
			if(input == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		while(true) {
			System.out.println("메뉴 선택: 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			
			if(input == 3)	break;
			}
		}
		System.out.println("프로그램 종료");
		*/
		
		/*
		while(true) {
			System.out.println("메뉴 선택: 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			
			if(input == 3)	break;
			switch(input){
				case 1:
				case 2:
			}
		}
		System.out.println("프로그램 종료");
		*/
		
		
		
		
		

	}

}
