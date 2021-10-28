package days09;

import java.util.Random;
import java.util.Scanner;

public class Array09 {

	public static void main(String[] argrs) {
		/**/
		// 야구게임
		
		// 게임 방법 
		// 숫자3개를 기억
		// 기억하고 있는 세자리 숫자를 맞춰가기
		
		// 야구 게임 프로그램
		// 상대가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임입니다.
		// 나에게 알려주지 않은 숫자 : 6 5 7 같은 한자리 숫자 세개를 준비하고
		// 질분 : 3 6 7 같은 한자리 숫자 세 개를 입력하여 비교합니다.
		// 답변 : 같은 숫자가 자리수까지 같은 S 숫자만 같다면 B 를 출력합니다
		// 숫자 하나는 0~9까지... 세 개의 숫자 중 중복 숫자 없음
		//
		// 1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열생성
		// 2. 컴퓨터가 나에게 알려주지 않은 숫자 세 개를 결정 -> 생성한 배열에 저장
		// 3. 컴퓨터에게 사용자가 맞추고자 하는 숫자를 입력
		// 4. 입력 받은 숫자와 저장한 컴퓨터숫자를 비교해서 스트라이크와 볼 카운트
		// 5. 스크라이크와 볼을 출력
		// 6. 3~5까지를 컴퓨터 숫자와 동일한 숫자를 입력할때까지 반복
		
		// for 써서 3~5반복
		// rd 써서 컴퓨터 숫자 3개
		// 사용자에게 받을 입력칸
		//같은 숫자가 자리수까지 같은 S 숫자만 같다면 B 를 출력합니다
		// com[i] == user[i] && user.length =
		//Scanner sc = new Scanner(System.in);
		//Random rd = new Random();

		// 1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열생성
		int [] com = new int[3];		
		int [] user = new int[3];
		
		// 2. 컴퓨터가 나에게 알려주지 않은 숫자 세 개를 결정 -> 생성한 배열에 저장
		Random rd = new Random();
		int i, j;
		for(i = 0; i <= 2; i++) {
			com[i] = rd.nextInt();
			if(com[i] <= 0) com[i] *= -1; // 양수
			com[i] %= 10; // 10으로 나눈 나머지 수 = 한자리 수
			// 동일 숫자 발생시 재추첨
			for(j = 0; j < i; j++)
				if(com[i] == com[j])break;
			if(i != j)i--;
		}
		System.out.println(com[0] + " " + com[1] + " " + com[2]); // 테스트를 위해 com 숫자를 도출
		while(true) {
		// 3. 컴퓨터에게 사용자가 맞추고자 하는 숫자를 입력
			Scanner sc = new Scanner(System.in);
		// 방법 #1
//		System.out.println("입력1(반드시 한자리 숫자) : ");
//		user[0] = sc.nextInt();
//		System.out.println("입력2(반드시 한자리 숫자) : ");
//		user[1] = sc.nextInt();
//		System.out.println("입력3(반드시 한자리 숫자) : ");
//		user[2] = sc.nextInt();
		
		// 방법 #2 세개의 숫자를 한번에 입력받기
//		System.out.println("입력(세자리 숫자 - 중복되지 않게 한자리 숫자) : ");
//		int num = sc.nextInt();
//		user[0] = num / 100;
//		user[1] = (num % 100) / 10;
//		user[2] = num % 10;
		// 123 -> 1 2 3 각각 따로 출력되는지 확인할 것
		// enter 키입력이 되면 다음에 입력할 기회를 잃기에 안됨
		
		// 방법 #3 
			System.out.println("입력(세자리 숫자 - 중복되지 않게 한자리 숫자) : ");
			String num = sc.nextLine();
		// char at
			user[0] = num.charAt(0) - '0'; // '4'-'0' -> 4 아라비아숫자
			user[1] = num.charAt(1) - '0';
			user[2] = num.charAt(2) - '0';
		// 435 4 3 5
		
		// 사용자 입력 도출		
			System.out.println(user[0] + " " + user[1] + " " + user[2]);
		

		// 4. 입력 받은 숫자와 저장한 컴퓨터숫자를 비교해서 스트라이크와 볼 카운트
			int s = 0, b = 0;
			for(i = 0; i <= 2; i++) {
				for(j = 0; j <= 2; j++) {
					if(com[i] == user [j]) {
						if(i == j)s++;
						else b++;
					}
				}
			}
			// 5. 스크라이크와 볼을 출력
			System.out.println(s + " Strike " + b + " Ball ");
		

		// 6. 3~5까지를 컴퓨터 숫자와 동일한 숫자를 입력할때까지 반복
			if(s == 3)break;
		}
		
		
		
		
		
		

	}

}
