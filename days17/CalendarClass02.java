package days17;

import java.util.Calendar;



public class CalendarClass02 {
	
	static String[] weekday = {"", "일", "월", "화", "수", "목", "금", "토"};

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		String[] weekday = {"", "일", "월", "화", "수", "목", "금", "토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// date1 달력객체의 오늘 날짜를 2015년 8월 15일로 설정
		date1.set(2015, 7, 15);
		//set : 원하는 특정 날짜로 객체내 날짜구성을 재설정, date2 는 아직 오늘 날짜
		// set 메소드에 필드명과 값을 넣어주면 해당 필드값만 변경됩니다
		date2.set(Calendar.MONTH, 6); //-> 월만 7월로 변경
		
		// 위 date1과 date2에 설정된 날짜를 "0000년 0월 0일 0요일" 형식으로 출력해주세요
		//System.out.println(); 안에 한번에 구성해서 출력
		// date1->
		int y = date1.get(Calendar.YEAR);
		int m = date1.get(Calendar.MONTH) +1;
		int d = date1.get(Calendar.DATE);
		int day = date1.get(Calendar.DAY_OF_WEEK);
		String days = null;
		switch (day) {
		case 1: days = "일요일";
			break;
		case 2: days = "월요일";
			break;
		case 3: days = "화요일";
			break;
		case 4: days = "수요일";
			break;
		case 5: days = "목요일";
			break;
		case 6: days = "금요일";
			break;
		case 7: days = "토요일";
			break;
		}
		System.out.printf("%d년 %d월 %d일 %s \n", y, m, d, days);
		//date2->
		int y2 = date2.get(Calendar.YEAR);
		int m2 = date2.get(Calendar.MONTH)+1;
		int d2 = date2.get(Calendar.DATE);
		int day2 = date2.get(Calendar.DAY_OF_WEEK);
		String days2 = null;
		switch (day2) {
		case 1:days2 = "일요일";
			break;
		case 2:days2 = "월요일";
			break;
		case 3:days2 = "화요일";
			break;
		case 4:days2 = "수요일";
			break;
		case 5:days2 = "목요일";
			break;
		case 6:days2 = "금요일";
			break;
		case 7:days2 = "토요일";
			break;
		}
		System.out.printf("%d년 %d월 %d일 %s \n", y2, m2, d2, days2);
		
		prnDate(date1);
		prnDate(date2);
		

	}

	public static void prnDate(Calendar c) {
		System.out.println( c.get(Calendar.YEAR) + "년"
				+ (c.get(Calendar.MONTH) + 1) + "월"
				+ c.get(Calendar.DATE) + "일"
				+ weekday[ c.get(Calendar.DAY_OF_WEEK) ] + "요일" );
		
	}
	
	

}
