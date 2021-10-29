package days10;

import java.util.Scanner;

public class Array13 {

	public static void main(String[] argrs) {
		/**/
		//Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		//
		// 3명 학생의 3과목 점수 저장 배열. 마지막 열은 총점
		int [][] score = new int[3][4];
		String [] name = new String[3];
		double [] avg = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d 번 이름 : ", (i + 1));
			name [i] = sc.nextLine();
			// 각각의 점수를 반복실행문으로
			// score[i].length - 1 총점은 계산 안하기에
			for(int j = 0; j < score[i].length - 1; j++) {
				if(j == 0) System.out.printf("국어점수 입력 : ", i + 1);
				else if(j == 1) System.out.printf("영어점수 입력 : ", i + 1);
				else System.out.printf("수학점수 입력 : ", i + 1);
				score[i][j] = Integer.parseInt(sc.nextLine());
				score[i][3] += score[i][j]; // 입력한 점수 총점에 누적				
			}
			avg[i] = score[i][3] / 3.0; // 1명의 입력종료후 바로 평균 계산
		}
		System.out.println("\t\t=====성적표=====");
		System.out.println("-----------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------");
		
		
//		for(int i = 0; i < score.length; i++) {
//			System.out.printf("%s %d %d %d %d %.2f", i+1, name[i], score[i][j],);
//		}
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", i + 1); // 번호
			System.out.printf("%s\t\t", name[i]); // 이름
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			//System.out.printf("%d\t", score[i][3]);
			System.out.printf("%.2f\n", avg[i]);
		}
		
		System.out.println("-----------------------------------------------------------");
		
//									=====성적표=====
//				-----------------------------------------------------------
//				번호	성병		국어	영어	수학	총점	평균
//				-----------------------------------------------------------
//				1		a			89		36		64		189	63.00
//				2		b			34		55		90		179	59.67
//				3		c			86		88		49		223	74.33
//				-----------------------------------------------------------
		
		
		

	}

}
