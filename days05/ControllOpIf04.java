package days05;

import java.util.Scanner;

public class ControllOpIf04 {

	public static void main(String[] args) {
		// 
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		a = sc.nextInt();
		
		// 90 이상 A학점, 80~89 B, 70~79 C, 60~69 D, 60미만 F
		if(a >= 90) System.out.println("A학점");
		else if(a >= 80 && a <= 89) System.out.println("B학점");
		// else if(a >= 80 && a < 90) System.out.println("B학점"); // 소수점 대비
		else if(a >= 70 && a <= 79) System.out.println("C학점");
		else if(a >= 60 && a <= 69) System.out.println("D학점");
		else System.out.println("F학점");
		
		//--------------------------------------------------------------
		if(a >= 90) System.out.println("A학점");
		else if(a >= 80) System.out.println("B학점");
		else if(a >= 70) System.out.println("C학점");
		else if(a >= 60) System.out.println("D학점");
		else System.out.println("F학점");
		// 어차피 if 구문에서 90이상은 다 걸러졌으니까 아래쪽에 추가적으로 작성하지 않아도 됨 90미만의 소수점까지 커버가능
		//--------------------------------------------------------------
		// 잘못된 예
		if(a < 60) System.out.println("F학점");
		else if(a >= 60) System.out.println("D학점");
		else if(a >= 70) System.out.println("C학점");
		else if(a >= 80) System.out.println("B학점");
		else System.out.println("A학점");
		// 60보다 큰점수 80이 들어가더라도 D학점이 출력됨
		//--------------------------------------------------------------
		// 미만으로 한다면 아래처럼
		if(a < 60) System.out.println("F학점");
		else if(a < 70) System.out.println("D학점");
		else if(a < 80) System.out.println("C학점");
		else if(a < 90) System.out.println("B학점");
		else System.out.println("A학점");
		
		

	}

}
