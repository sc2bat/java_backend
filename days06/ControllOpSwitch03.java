package days06;

import java.util.Scanner;

public class ControllOpSwitch03 {

	public static void main(String[] args) {
		// 

		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		
		int days = 0;
		
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
			days = days + 28;
		case 2:
			days = days + 31;
		//case 1:
		}
		
		days = days + d;
		
		int t = days % 7;
		switch(t) {
			case 1 : System.out.println("금요일");
			break;
			case 2 : System.out.println("토요일");
			break;
			case 3 : System.out.println("일요일");
			break;
			case 4 : System.out.println("월요일");
			break;
			case 5 : System.out.println("화요일");
			break;
			case 6 : System.out.println("수요일");
			break;
			case 7 : System.out.println("목요일");
			break;			
		}
		// 서기 1년 1월 1일은 월요일임
		

	}

}
