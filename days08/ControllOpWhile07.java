package days08;

import java.util.Scanner;

public class ControllOpWhile07 {

	public static void main(String[] args) {
		/**/
		// while 과 for를 섞어서
		// 년과 월을 입력받아서 그 년도 달의 달력을 출력 
		// 그 년도 월의 1일이 무슨 요일인지 알아야함
		Scanner sc = new Scanner(System.in);
		System.out.printf("년 입력 : "); 
		int y = sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		// 일 입력 생략
		
		int days = 365 * (y -1);
		for(int i = 1; i < y; i++) {
			if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0)days++;
		}
		switch(m) {
			case 12: days = days + 30; 
			case 11: days = days + 31; 
			case 10: days = days + 30; 
			case 9: days = days + 31;
			case 8: days = days + 31;
			case 7: days = days + 30;
			case 6:	days = days + 31;
			case 5:	days = days + 30;
			case 4:	days = days + 31;
			case 3:
				if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0) days = days +29;
				else days = days + 28;
			case 2: days = days + 31;
		}
		
		//int lastDay = 0;
		/*
		switch(m) {
			case 1: lastDay = 31;break;
			case 2:
				if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0) lastDay = 29;
				else lastDay = 28;break;
			case 3: lastDay = 31;break;
			case 4: lastDay = 30;break;
			case 5: lastDay = 31;break;
			case 6: lastDay = 30;break;
			case 7: lastDay = 31;break;
			case 8: lastDay = 31;break;
			case 9: lastDay = 30;break;
			case 10: lastDay = 31;break;
			case 11: lastDay = 30;break;
			case 12: lastDay = 31;break;
		}
		 */
		int lastDay = 0;
		switch(m) {
		case 1: 	case 3:	case 5:	case 7:	case 8:	case 10: case 12: 
			lastDay = 31;break; // break 가 없다면 아래의 내용 출력
		case 2:
			if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0) lastDay = 29;
			else lastDay = 28;
			break;
		case 4: case 6: case 9: case 11: 
			lastDay = 30;break;
			}
				
		days = days +1; // 입력한 년, 월의 1일자의 요일을 계산하기위해 1합산
		int t = days %7;
		// t: 0-일 , 1-월 , 2-화 , 3-수 , 4-목 , 5-굼 , 6-토  
		
		// 달력 모양
		System.out.println();
		System.out.println(y + " 년 "+ m + "월");
		System.out.println("------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("------------------------------------------------");
		
		// 달마다 28 29 30 31일 다르므로 switch 와 if 를 활용
		// 변수를 만들어 각 월의 마지막 숫자를 변수에 저장
		
		
		
		
		// 빈칸실행문 까지하면 123456숫자가 그냥 밀려나있기만함
		int k = 0;
		for(k = 1; k <= t; k++)System.out.printf("\t");
		// k 값을 확인해서 빈칸이 생성되니 k 값을 이용해서 줄바꿈
		
		
		//for(int i =1; i <= 31; i++) {
		//마지막 날짜를 넣어주면됨
		for(int i =1; i <= lastDay; i++) {
			System.out.printf("%2d\t", i);
//			if(i % 7 == 0)System.out.println();
			// k값을 늘리면서 줄바꿈
			if(k++ % 7 == 0)System.out.println();
		}
		
		

	}

}
