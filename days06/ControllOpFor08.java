package days06;

import java.util.Scanner;

public class ControllOpFor08 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.printf("년 입력 : "); // 추가
		int y = sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		
		// 서기 1년 1월 1일은 월
		// 4년마다 윤년 365 366
		
		//1 입력받은 년도의 전년도까지 지나온 날짜수 합산
		// -- 2021년 입력했다고 가정
		// -- 2020년까지 지나온 날짜수를 계산
		// 365*2020 + 2020 까지 있었던 윤년의 횟수
		int days = 365 * (y -1);
		for(int i = 1; i < y; i++) {
			if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0) {
				days++; // 서기 1년도부터 2020년까지 모두 윤년이었는지 검사
				// 윤년이라면 +1				
			}
		}
		// 2 입력받은 월의 전월까지 지나온 날짜수 합산
		switch(m) {
			case 12:
				days = days + 30; // 11월의 날짜수 30일을 days 에 합산
			case 11:
				days = days + 31; // 10월의 날짜수 30일을 days 에 합산
			case 10:
				days = days + 30; // ...
			case 9:
				days = days + 31;
			case 8:
				days = days + 31;
			case 7:
				days = days + 30;
			case 6:
				days = days + 31;
			case 5:
				days = days + 30;
			case 4:
				days = days + 31;
			case 3:
				// 입력된 년도 y 가 윤년이라면 2월을 29일로
				if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0)
					days = days +29;
				else 
					days = days + 28;
			case 2:
				days = days + 31;
		}
		// 3 입력받은 일을 날짜수에 합산
		days = days +d;
		int t = days %7;
		switch(t) {
			case 1 : System.out.println("월요일");
			break;
			case 2 : System.out.println("화요일");
			break;
			case 3 : System.out.println("수요일");
			break;
			case 4 : System.out.println("목요일");
			break;
			case 5 : System.out.println("금요일");
			break;
			case 6 : System.out.println("토요일");
			break;
			case 7 : System.out.println("일요일");
	}
		
		

	}

}
