package days05;

import java.util.Scanner;

public class ControllOpIf03 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		// 정수를 입력받고 양수인지 음수인지 0인지		
		/* if(a > 0) {
			System.out.println("입력한 정수는 양수입니다");
		}else {
			if(a < 0) {
			System.out.println("입력한 정수는 음수입니다");
			} else {
				System.out.println("입력한 정수는 0입니다");
					}
			} */
		
		 if(a > 0) {
				System.out.println("입력한 정수는 양수입니다");
			}else if(a < 0) {
				System.out.println("입력한 정수는 음수입니다");
				} else {
					System.out.println("입력한 정수는 0입니다");
					}
		 // 위에서 () 안의 연산식으로 계산한 결과가 true 경 {} 안의 명령이 실행됩니다.
		 // 중괄호 안의 명령이 한개라면 중괄호는 역시 생략가능합니다
//		 if(a > 0) System.out.println("입력한 정수는 양수입니다");
//		 else if(a < 0) System.out.println("입력한 정수는 음수입니다");
//		 else System.out.println("입력한 정수는 0입니다");
		
		 int kor = 70, eng = 98, mat = 95;
		 double avg = (kor+eng+mat) / 3.0;
		 // 평균점수가 80 이상이면 합격, 70이상 79이하면 대기순번, 나머지는 불합격을 출력해주세요
		 //avg = 75;
		 //avg = 30;
		 if(avg >= 80) {
				System.out.println("합격");
			}else if(avg >= 70 && avg <= 79) {
				System.out.println("대기순번");
				} else {
					System.out.println("불합격");
					}
		 // avg = 79.5 는 else 로 판단 불합격을 부여 
		 // 79.5 를 커버할려면 else if(avg >= 70 && avg <80) 로 수정해야함
		 
		// System.out.println();
		 // sysout hotkey ctrl + space
		 
		
	}

}
