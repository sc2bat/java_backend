package days17;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass05 {

	public static void main(String[] argrs) {
		/**/
		int year, month;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도 입력 : ");
		year = Integer.parseInt( sc.nextLine() );
		System.out.printf("월 입력 : ");
		month = Integer.parseInt( sc.nextLine() );
		
		Calendar sDay = Calendar.getInstance(); // 출력할 달력의 시작날짜(1일)
		Calendar eDay = Calendar.getInstance(); // 출력할 달력의 끝날짜(말일)
		
		while(true) {
			// month-1 이번달 
			// month 다음달
			sDay.set( year, month-1, 1); // 입력한 년, 월, 1일로 시작일설정
			eDay.set( year, month, 1); // 다음달 1일
			eDay.add( Calendar.DATE, -1); // -1일을 계산해서 이달 말일로 설정
				
			// sDay (1일)의 요일 계산
			int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			
			System.out.println("\n" + year + "년 " + month + "월 ");
			System.out.println("-----------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("-----------------------------------------");
			//1일자까지 빈칸
			for (int i = 1; i < START_WEEK; i++) {
				System.out.printf("\t");
			}
			for (int i = 1; i <= eDay.get( Calendar.DATE); i++) {
				System.out.printf("%2d\t", i);
				if(START_WEEK++ % 7 == 0)System.out.println();
			}
			
			System.out.println("\n-----------------------------------------");
			System.out.print("\n[이전달(1)] | [다음달(2)] | [종료(3)]");
			input = Integer.parseInt( sc.nextLine() );
			if(input == 3)break;
			// 이전달 다음달 처리
			//set 과 add 메소드를 이용해서 이전달 다음달을 계산합니다
			if( input == 1) {
				if(month == 1) {
					year--;
					month =12;
				}else {
					month--;
				}
			}else if(input ==2) {
				if(month ==12) {
					year++;
					month= 1;
				}else {
					month++;
				}
			}
		}
		
	}

}

