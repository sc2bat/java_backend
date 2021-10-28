package days09;

import java.util.Scanner;

public class ControllOpDoWhile01 {

	public static void main(String[] args) {
		/**/
		// 달력 출력이 우선목표
		// 조건에 맞지 않기때문에 한번도 실행안함
		//for 반복 종료 후 i 변수 값 : 11
		int i;
		for (i = 11; i <= 10; i++)
			System.out.printf("%d ", i);
		System.out.println("\nfor 반복 종료 후 i 변수 값 : " + i);
		System.out.println("----------------------------------");
		
		// 역시 동일하게 한번도 실행안함
		//while 반복 종료 후 i 변수 값 : 11
		i = 11;
		while(i <= 10) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.println("\nwhile 반복 종료 후 i 변수 값 : " + i);
		System.out.println("------------------------------------");
		
		// 조건이 어떻게 됐든간에 한번 실행하고
		i = 11;
		do {
			System.out.printf("%d ", i); //11 
			i++;
		}while(i <= 10);
		System.out.println("\ndo-while 반복 종료 후 i 변수 값: " + i); //do-while 반복 종료 후 i 변수 값: 12
		
		// do while 의 특이점 while(조건) 을 후미에 기술합니다
		// while(조건) 뒤에 ';' 세미콜론을 찍습니다.
		// if (조건); X
		// for(int i = 1; i < 100; i++); X
		// while(i < 100); X
		//do {} while (조건); O
		//do 에 속한 {} 안의 명령을 한번 먼저 실행 후 조건을 테스트합니다	
		
		// 
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.println("정수를 입력 : ");
			input = sc.nextInt();			
		}while(input != 100);
		System.out.println("프로그램 종료");
		
		// 윈도우 프로그램은 우리가 종료를 시키기 전까지 계속 돌아감
		// 사용자의 키보드 마우스 입력을 항시 대기
		// 상황에 맞는 실행 루틴
		// 자바 프로그램을 윈도우 프로그램처럼 프로세싱하려면 do while 이 필수적
		
		
		
	}

}
