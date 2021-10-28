package days09;

import java.util.Scanner;

public class Array08 {

	public static void main(String[] argrs) {
		/**/
		// 점수를 입력받아서 해당 학점을 출력합니다
		// if 문 이용 x
		// 90점 이상 A, 80점 이상 B, 70점 이상 C,60점 이상 D, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요 (0 ~ 100) : ");
		int score = sc.nextInt();
		
		// 아래 배열을 이용해주세요
		char [] grade = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		// 							0 10 20 30 40 50 60 70 80 90 100
		//int i = 0;
		// 힌트 98 / 10 -> 9
		double i = score / 10;
		switch((int)i) {
//			case 0 : System.out.printf("학점은 %s %s입니다\n", "F", grade[(int)i]);break;
//			case 1 : System.out.printf("학점은 %s 입니다\n", "F");break;
//			case 2 : System.out.printf("학점은 %s 입니다\n", "F");break;
//			case 3 : System.out.printf("학점은 %s 입니다\n", "F");break;
//			case 4 : System.out.printf("학점은 %s 입니다\n", "F");break;
//			case 5 : System.out.printf("학점은 %s 입니다\n", "F");break;
//			case 6 : System.out.printf("학점은 %s 입니다\n", "D");break;
//			case 7 : System.out.printf("학점은 %s 입니다\n", "C");break;
//			case 8 : System.out.printf("학점은 %s 입니다\n", "B");break;
//			case 9 :	System.out.printf("학점은 %s 입니다\n", "A");break;
//			case 10 : System.out.printf("학점은 %s 입니다\n", "A");

			case 0 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 1 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 2 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 3 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 4 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 5 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 6 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 7 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 8 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 9 :	System.out.printf("학점은 %s 입니다\n", grade[(int)i]);break;
			case 10 : System.out.printf("학점은 %s 입니다\n", grade[(int)i]);
		}
		
		
		//----------------------------------------------------------------
		if(score == 0)System.out.println("학점 : " + grade[0]);
		else System.out.println("학점 : " + grade[score/10]);
		
		
		
		//System.out.printf("학점은 %s 입니다\n", grade[i]);
		
		
	}

}
