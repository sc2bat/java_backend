package days09;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] argrs) {
		/**/
		//
		//
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생이 몇명입니까?");
		//int std = sc. nextInt();
		//sc.nextLine(); // enter 키입력을 대신 담음
		
		// 대신 정수와 문자를 모두 받을 수 있게
		// 
		//String tmp = sc.nextLine();
		//int std = Integer.parseInt(tmp);
		
		// 최종
		int std = Integer.parseInt(sc.nextLine());
		
		// int kor1, kor2 .. kor100; X
		int [] kor = new int[std]; // 국어점수들 저장용 배열
		int [] eng = new int[std]; // 영어점수들 저장용 배열
		int [] mat = new int[std]; // 수학점수들 저장용 배열
		int [] tot = new int[std]; // 총점 저장용 배열
		double  [] avg = new double[std]; // 평균용
		
		// 원래는 아래와 같이 하나하나 입력받았으나
//		System.out.printf("1번 학생의 국어 점수 : ");
//		kor[0] = sc.nextInt();
//		System.out.printf("1번 학생의 영어 점수 : ");
//		eng[0] = sc.nextInt();
//		System.out.printf("1번 학생의 수학 점수 : ");
//		mat[0] = sc.nextInt();
		String [] name = new String[std]; 
		
		
		// nextLine 과 nextInt 같이쓰면 종종 오류가 남
		// nextInt 는 딱 정수만 받음
//		for(int i = 0; i < std; i++) {
//			System.out.printf("%d 번 학생의 이름 : ", i+1);
//			name[i] = sc.nextLine(); // enter 라는 키입력 역시 값이 저장이되어버림
//			System.out.printf("%d 번 학생의 국어점수 : ", i+1);
//			kor[i] = sc.nextInt();
//			System.out.printf("%d 번 학생의 영어점수 : ", i+1);
//			eng[i] = sc.nextInt();
//			System.out.printf("%d 번 학생의 수학점수 : ", i+1);
//			mat[i] = sc.nextInt();
//			sc.nextLine();
//		}
		
		// 
//		for(int i = 0; i < std; i++) {
//			System.out.printf("%d 번 학생의 이름 : ", i+1);
//			name[i] = sc.nextLine(); // enter 라는 키입력 역시 값이 저장이되어버림
//			System.out.printf("%d 번 학생의 국어점수 : ", i+1);
//			kor[i] = Integer.parseInt(sc.nextLine());
//			System.out.printf("%d 번 학생의 영어점수 : ", i+1);
//			eng[i] = Integer.parseInt(sc.nextLine());
//			System.out.printf("%d 번 학생의 수학점수 : ", i+1);
//			mat[i] = Integer.parseInt(sc.nextLine());
//			//sc.nextLine();
//		}
//				
//		for(int i = 0; i < std; i++) {
//			tot[i] = kor[i] + eng[i] + mat[i];
//			avg[i] = tot[i] / 3.0;				
//		}
		
		for(int i = 0; i < std; i++) {
			System.out.printf("%d 번 학생의 이름 : ", i+1);
			name[i] = sc.nextLine(); // enter 라는 키입력 역시 값이 저장이되어버림
			System.out.printf("%d 번 학생의 국어점수 : ", i+1);
			kor[i] = Integer.parseInt(sc.nextLine());
			System.out.printf("%d 번 학생의 영어점수 : ", i+1);
			eng[i] = Integer.parseInt(sc.nextLine());
			System.out.printf("%d 번 학생의 수학점수 : ", i+1);
			mat[i] = Integer.parseInt(sc.nextLine());
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;				
		}
						
		System.out.println("\t\t###성적표###");
		System.out.println("-------------------------------------------------");
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		//for(int i = 0 ; i < std; i++)
		for(int i = 0 ; i < kor.length; i++)
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", i+1, name[i], kor[i], eng[i], mat[i], tot[i], avg[i]);
		System.out.println("-------------------------------------------------");
		
		// 배열의 크기 : 배열 크기는 프로그램에서 중요한 정보입니다.
		// 배열의 크기에 따라 반복의 횟수나, 특정 인덱스의 값을 참조하는 것이 수시로 바뀌기 때문입니다.
		// 배열을 이렇나 문제를 해결하기 위해 length 라는 속성을 제공합니다
		// 배열의 이름.length -> 배열의 크기, 정수 타입의 데이터를 얻습니다.
		
		
		
		

	}

}
