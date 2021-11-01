package days11;

import java.util.Scanner;

public class Method171 {

	public static void main(String[] argrs) {
		/**/
		//
		int [][] scores;
		double [] avg;
		// int s = getStudentNumber(); // 학생수를 입력받아서 리턴하는 메소드
		//int k = getSubjectNumber(); // 과목수를 입력받아서 리턴하는 메소드
		//scores = new int[s][k];
		scores = new int[getStudentNumber()][getSubjectNumber()+1];
		//3
		avg = new double[scores.length];
		input(scores); // s명의 학생의 k개의 과목수 입력
		cals(scores, avg); // 총점 평균 계산
		output(scores, avg); // 성적표 출력
	}
	//6 출력
	public static void output(int [][] s, double [] a) {
		int std = s.length;
		int sub = s[0].length;
		System.out.println("\t\t====성적표====");
		System.out.println("-------------------------------------");
		System.out.printf("번호\t");
		for (int i = 0; i < sub-1; i++) {
			System.out.printf("과목%d\t", i + 1);
		}
		System.out.printf("총점\t평균\n");
		System.out.println("-------------------------------------");
		for (int i = 0; i < std; i++) {
			System.out.printf("%d\t", i+1); // 번호
			for (int j = 0; j < sub; j++) {
				System.out.printf("%d\t", s[i][j]);
			}
			System.out.printf("%.1f\n", a[i]);
		}
		System.out.println("-------------------------------------");
	}
	//5
	public static void cals(int [][] s, double [] a) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length-1; j++) {
				// 총점 계산 최대과목수가 몇인지 모르기에
				s[i][s[i].length-1] += s[i][j];
			}
			// double 캐스팅해주고 총점으로 평균 구하기
			a[i] = s[i][s[i].length-1] / (double)(s[i].length-1);
		}
	}
	
	//4
	// 3 3 9개의 값을 동시에 입력받을 수는 없음
	// call by reference
	// scores 의 2차원 배열 주소를 받음
	public static void input(int [][] s) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length-1; j++) {
				// 총점 부분 제외 -1
				System.out.printf("%d번 학생 %d 과목 점수 : ", i+1, j+1);
				s[i][j] = sc.nextInt();
			}
		}
	}
	
	
	//2
	public static int getStudentNumber() {
		System.out.printf("학생 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	//1
	public static int getSubjectNumber() {
		System.out.printf("과목 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
}
