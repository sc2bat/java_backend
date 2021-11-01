package days11;

import java.util.Scanner;

public class Method11 {

	public static void main(String[] argrs) {
		/**/
		//
		int kor, eng, mat, tot;
		double ave;
		String grade;
		kor = myInput(1); // 점수 입력
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor, eng, mat); // 총점 계산
		ave = avg(kor, eng, mat); // 평균계산
		prn(tot, ave); // 총점 평균 학점 출력
		

	}
	
	public static int myInput(int i) {
		Scanner sc = new Scanner(System.in);
		if(i == 1)System.out.println("국어 점수를 입력하세요 : ");
		else if (i == 2)System.out.println("영어 점수를 입력하세요 : ");
		else System.out.println("수학 점수를 입력하세요 : ");
		i = sc.nextInt();
		return i;
		// return = sc.nextInt();
	}
	public static int sum(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		return tot;
		// return kor + eng + mat;
	}
	public static double avg(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		double ave = tot / 3.0;
		return ave;
		// return tot / 3.0;
	}
	public static void prn(int tot, double ave) {
		System.out.printf("총점 %d 평균 %.2f", tot, ave);
		//return; // void 출력할건데 return 안써도됨
	}

}
