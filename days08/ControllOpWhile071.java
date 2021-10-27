package days08;

import java.util.Scanner;

public class ControllOpWhile071 {

	public static void main(String[] args) {
		/**/
		// 이전달과 다음달 출력
		// 1월 전달은 12월 12월 다음달은 1월임을 
		// 입력받은 값에 +1을 하는데 13이되면 1로 치환 -1하는데 1보다작으면 12로 치환
		//
		Scanner sc = new Scanner(System.in);
		System.out.printf("년 입력 : "); 
		int y = sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		int input;
		while(true) {
			
			
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
			
			int lastDay = 0;
			switch(m) {
			case 1: 	case 3:	case 5:	case 7:	case 8:	case 10: case 12: 
				lastDay = 31;break; 
			case 2:
				if(y % 4 ==0 && y % 100 != 0 || y % 400 ==0) lastDay = 29;
				else lastDay = 28;
				break;
			case 4: case 6: case 9: case 11: 
				lastDay = 30;break;
			}
			
			days = days +1; 
			int t = days %7;
			
			System.out.println();
			System.out.println(y + " 년 "+ m + "월");
			System.out.println("------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("------------------------------------------------");
			
			int k = 0;
			for(k = 1; k <= t; k++)System.out.printf("\t");
			for(int i =1; i <= lastDay; i++) {
				System.out.printf("%2d\t", i);
				if(k++ % 7 == 0)System.out.println();
			}
			
			System.out.printf("[1.이전달]\t[2.다음달]\t[3.종료]");
			input = sc.nextInt();
//			if(input == 1) {
//				if(m < 1) {m = 12; y--;}
//				else m--;
//				}
//			else if(input == 2) {
//				if(m > 12) {m = 1;y++;}
//				else m++;
//				}
//			else if(input == 3)break;
//			
			
			if(input == 3)break;
			
			switch(input) {
				case 1:
					if(m == 1) { m = 12; y--;}
					else {m--;}
					break;
				case 2:
					if(m == 12) { m = 1; y++;}
					else {m++;}
					break;
				}
			}

			
		System.out.println("프로그램 종료");
			
			
//		

	}

}
