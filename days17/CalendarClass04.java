package days17;

import java.util.Calendar;

public class CalendarClass04 {

	public static void main(String[] argrs) {
		/**/
		//
		Calendar date = Calendar.getInstance();
		date.set(2021, 10, 30);
		System.out.println( toDate(date) ); //2021년 11월 30일 
		
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println( toDate(date) );
//		= 1일 후 =
//		2021년 12월 1일 
		//add메소드의 증감은 하나의 요소를 변경하지만, 그로인해 다른 필드에 영향을 줄 수 있습니다
		// 일을 변경하여 달이 바뀌거나, 월을 변경하여 년도가 바뀌는 변경 등

		System.out.println("= 6달 후 =");
		date.add(Calendar.MONTH, 6);
		System.out.println( toDate(date) );
//		= 6달 후 =
//		2022년 6월 1일
		
		System.out.println("= 40일 후(roll) =");
		date.roll(Calendar.DATE, 40);
		//다른 필드에 영향을 주지 않고 해당 필드만으로 더하고 빼는 메소드
		// 3월 1일에서 30일 더하면 3월 31일(30일)이 되고, 이후 10일이 더해져
		// 다시 10이 나옴 월에는 영향을 주지 않음 결과 3월 10일
		System.out.println( toDate(date) );
//		= 40일 후(roll) =
//		2022년 6월 11일
		
	}
	
	public static String toDate(Calendar c) {
		String cDate = c.get(Calendar.YEAR) + "년 "	
				+ (c.get(Calendar.MONTH) +1) + "월 "
				+ c.get(Calendar.DATE) + "일 ";
		return cDate;
	}

}
