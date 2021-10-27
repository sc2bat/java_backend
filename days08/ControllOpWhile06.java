package days08;

import java.util.Random;
import java.util.Scanner;

public class ControllOpWhile06 {

	public static void main(String[] args) {
		/**/
		// 
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 선택(종료-0) : ");
		Random rd = new Random();
		
		int user = sc.nextInt();
		
		int com;
		
		//컴퓨터에 난수로 발생한 숫자 하나(1 or 2 or 3) 를 저장하고
		// 사용자가 입력한 숫자와 비교해서 가위바위보의 결과를 출력하세요
		/*
		while(user == 0) {
			if(com < 0) com = com * -1;
			if(com )
			com = rd.nextInt();
			System.out.printf("컴퓨터 %d 사용자 %d", com, user);
			
		}
			System.out.println("가위 바위 보 게임을 종료합니다");
		
		*/
		com = rd.nextInt();
		if(com < 0)com *= -1;
		com = com % 3 + 1;
		
		if(com == 1)System.out.printf("컴퓨터 : %s", "가위");
		else if(com == 2)System.out.printf("컴퓨터 : %s", "바위");
		else System.out.printf("컴퓨터 : %s", "보");
		
		if(user == 1)System.out.printf("\t\t나 : %s", "가위");
		else if(user == 2)System.out.printf("\t\t나 : %s", "바위");
		else System.out.printf("\t\t나 : %s", "보");
		
		if(com == user) System.out.println("\n무승부입니다");
		else if(com == 1 && user == 2)System.out.println("\n이겼습니다");
		else if(com == 2 && user == 3)System.out.println("\n이겼습니다");
		else if(com == 3 && user == 1)System.out.println("\n이겼습니다");
		else System.out.println("\n졌습니다");
		
		while(user == 0) {
			
		}
		System.out.println();	
		

	}

}
