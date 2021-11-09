package days17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatterClass01 {

	public static void main(String[] argrs) {
		/**/
		// 날짜 데이터 클래스, Calendar 와는 다름
		Date today = new Date();
		System.out.println(today); // Tue Nov 09 15:07:28 KST 2021

		// 날짜 서식 클래스
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
		//날짜 데이터를 서식 데이터에 맞춰서 적용후 출력
		System.out.println( sdf1.format(today)); // 21-11-09
		
		//String 이 아님 정수로 살아있음
		//valueOf 랑도 다름
		//날짜 서식 레퍼런스 변수들
		SimpleDateFormat sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;
		//서식 인스턴스 생성 및 저장
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//today 적용후 출력
		System.out.println( sdf2.format(today)); // 21년 11월 09일 화요일
		System.out.println( sdf3.format(today)); // 2021-11-09 15:13:05.643
		System.out.println( sdf4.format(today)); // 2021-11-09 03:13:05 오후
		
		// y : 년도를 표시할 자리수 문자 (yyyy : 2020 yy: 20)
		//M : 월을 표시할 자리수 문자 (MM : 01~12 M: 1~12)
		//d : 일을 표시하는 자리수 문자 (dd : 01~31 d:1~31)
		//H : 시에 해당하는 자리수 문자 (HH : 01~23 H: 1~23)
		//h : 시에 해당하는 자리수 문자  (hh : 01~12 h: 1~12)
		//m : 분 //s : 초 // S : 밀리초 // a : 오전/오후

		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 날입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 날입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일 날입니다.");
		System.out.println( sdf5.format(today)); // 오늘은 올 해의 313번째 날입니다.
		System.out.println( sdf6.format(today)); // 오늘은 이 달의 9번째 날입니다.
		System.out.println( sdf7.format(today)); // 오늘은 올 해의 46번째 날입니다.
		System.out.println( sdf8.format(today)); // 오늘은 이 달의 2번째 날입니다.
		System.out.println( sdf9.format(today)); // 오늘은 이 달의 2번째 화요일 날입니다.
		
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println( sdf1.format(day)); //format(Date d) // 2021-11-09
		System.out.println( sdf2.format(day));  // 21년 11월 09일 화요일
		System.out.println( sdf3.format(day));  // 2021-11-09 15:23:47.323
		System.out.println( sdf4.format(day));  // 2021-11-09 03:23:47 오후
		
		
	}

}
