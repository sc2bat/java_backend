package days17;

import java.util.Calendar;

public class CalendarClass03 {

	public static void main(String[] argrs) {
		/**/
		//
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		printTime(time1);
		printTime(time2);
//		time : 10시 20분 30초 257(1/1000 초) 
//		time : 20시 30분 10초 277(1/1000 초)
		
		System.out.println(time1.getTimeInMillis());
		System.out.println(time2.getTimeInMillis());
		long dif = (time2.getTimeInMillis() - time1.getTimeInMillis()) /1000;
		System.out.println("time1 과 time2의 차이는 " + dif + "초 입니다");
		
//		1636420830478
//		1636457410498
//		time1 과 time2의 차이는 36580초 입니다
		

	}
	
	public static void printTime(Calendar c) {
		System.out.println("time : "
				+ c.get(Calendar.HOUR_OF_DAY) + "시 "
				+ c.get(Calendar.MINUTE) + "분 "
				+ c.get(Calendar.SECOND) + "초 "
				+ c.get(Calendar.MILLISECOND) + "(1/1000 초) ");
	}

}
