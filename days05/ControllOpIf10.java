package days05;

import java.util.Scanner;

public class ControllOpIf10 {

	public static void main(String[] args) {
		// 시험에 유용할 예제 
		// 2021년 1월 1일은 금요일입니다.
		// 2021년에 한해서 월과 일을 입력 받고,
		// 요일을 출력하세요
		// 1월 10일 입력했다면 1월 1일부터 10일까지 10일의 날짜가 계산됩니다
		// 그를 7로 나눈 나머지를 구하면 3이고, 1: 금, 2: 토, 3: 일....
		// 위와 같이 요일을 계산합니다
		
		// 2월 5일 입력했다면 - 1월에 해당하는 31일 + 입력한 일 5 -> 36
		// 36을 7로 나눈 나머지를 구하면 1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.println("일을 입력하세요 : ");
		int date = sc.nextInt();
		int x = 31, y = 30, z = 28;
		int days = 0;
		if (month == 1) days = 0;
		else if (month == 2) days = x; // 1
		else if (month == 3) days = x + z; // 1 2
		else if (month == 4) days = x*2 + z; // 1 2 3 
		else if (month == 5) days = x*2 + y + z; // 1 2 3 4
		else if (month == 6) days = x*3 + y + z;
		else if (month == 7) days = x*3 + y*2 + z;
		else if (month == 8) days = x*4 + y*2 + z;
		else if (month == 9) days = x*4 + y*3 + z;
		else if (month == 10) days = x*5 + y*3 + z;
		else if (month == 11) days = x*5 + y*4 + z;
		else if (month == 12) days = x*6 + y*4 + z;
		
 		//위에서 합산된 날짜에 입력한 일을 더합니다
		days = days + date;
		//System.out.println(days);
		int t = days % 7;
		//System.out.println(t);
		if (t == 1) System.out.println("금요일");
		else if (t == 2) System.out.println("토요일");
		else if (t == 3) System.out.println("일요일");
		else if (t == 4) System.out.println("월요일");
		else if (t == 5) System.out.println("화요일");
		else if (t == 6) System.out.println("수요일");
		else if (t == 7) System.out.println("목요일");
		
		
		

	}

}
