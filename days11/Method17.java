package days11;

import java.util.Scanner;

public class Method17 {

	public static void main(String[] argrs) {
		/**/
		Scanner sc = new Scanner(System.in);
		//
		int [][] scores;
		double [] avg;
		// int s = getStudentNumber(); // 학생수를 입력받아서 리턴하는 메소드
		//int k = getSubjectNumber(); // 과목수를 입력받아서 리턴하는 메소드
		//scores = new int[s][k];
		scores = new int[getStudentNumber()][getSubjectNumber()+1];
		avg = 
		input(scores); // s명의 학생의 k개의 과목수 입력
		cals(scores, avg); // 총점 평균 계산
		output(scores, avg); // 성적표 출력

	}
	public static int getStudentNumber() {
		System.out.printf("학생 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	public static int getSubjectNumber() {
		System.out.printf("과목 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		return b;
	}
	
	
	public static void input(int a, int b) {
		int a = getStudentNumber();
		int b = getSubjectNumber();
		int [][] scores = new int [a][b];
		return;
	}
	
	public	static void output(int [][] scores) {
		
	}
	
	public static void cals(int [a][b] scores) {
		int [] tot = new int [scores[i].length];
		double [] avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				tot[i] = tot[i] + scores[i][j];
			}
			avg[i] = tot[i] / scores[i].length;
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 총점 %d 평균 %.2f", i, tot[i], avg[i]);
		}
	}
	
	
	// 새로 작성해보기 
	// 꼭 subject 에 +1 해야하는지 확인
	
	
	
	

}
