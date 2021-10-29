package days10;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] argrs) {
		/**/
		// 아래 실행이 정상 동작하도록 해당 매소드를 제작하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력할 단을 입력하세요 : ");
		
		int k = sc.nextInt();
		gugudan(k);
		
//		출력할 단을 입력하세요 : 4
//		4 X 1 = 4
//		4 X 2 = 8
//		4 X 3 = 12
//		4 X 4 = 16
//		4 X 5 = 20
//		4 X 6 = 24
//		4 X 7 = 28
//		4 X 8 = 32
//		4 X 9 = 36

	}
	public static void gugudan(int k) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", k, i, k*i);
		}
	}

}
