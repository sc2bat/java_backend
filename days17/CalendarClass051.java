package days17;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass051 {

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
		
			sDay.set( year, month-1, 1);
			eDay.set( year, month, 1); 
			eDay.add( Calendar.DATE, -1);
				
			while(true) {
				int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
				System.out.println("\n" + year + "년 " + month + "월 ");
				System.out.println("-----------------------------------------");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				System.out.println("-----------------------------------------");
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
				//set 과 add 메소드를 이용해서 이전달 다음달을 계산합니다
				if( input == 1) {
					sDay.add(Calendar.MONTH, -1); // 11월 1일에서 10월 일
					eDay.add(Calendar.DATE, 1); // 원래 월의 1일자로 변경(11월30에서 12월 1일로 변경)
					eDay.add(Calendar.MONTH, -1); // 이전달 1일자로 이동 (12월 1일에서 11월 1일로 변경)
					eDay.add(Calendar.DATE, -1); // 그전달 말일로 이동 (11월1일에서 10월31일로 변경)
				}else if(input ==2) {
					sDay.add(Calendar.MONTH, 1);
					eDay.add(Calendar.DATE, 1);
					eDay.add(Calendar.MONTH, 1);
					eDay.add(Calendar.DATE, -1);
					
				}
				year = sDay.get(Calendar.YEAR);
				month = sDay.get(Calendar.MONTH) +1;
		}
		
	}

}

