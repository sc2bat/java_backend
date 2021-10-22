package days05;

import java.util.Scanner;

public class ControllOpIf09 {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		
		// a.equals(b)
		Scanner sc = new Scanner(System.in);
		String user;
		System.out.println("가위 / 바위 / 보 중 하나를 입력하세요");
		user = sc.nextLine();
		String com = "가위"; // 컴퓨터의 답은 임의로 지정 기본은 랜덤으로
		// 사용자 입력과 컴퓨터가 가진 테스트를 각각 비교해서 이겼다, 졌다, 비겼다 출력
		/*
		 // 졌다로 오류가 남
		 
		if (com.equals("보")) {
			if (user.equals("가위")){
				System.out.println("이겼다");				
			}else System.out.println("졌다");			
		} else if (com.equals("가위")) {
			if (user.equals("바위")){
				System.out.println("이겼다");				
			}else System.out.println("졌다");			
		} else if (com.equals("바위")) {
			if (user.equals("보")){
				System.out.println("이겼다");				
			}else System.out.println("졌다");			
		} else System.out.println("비겼다");
		*/
		
		//----------------------------------------------
		// 비겼다를 앞으로 땡겨서 해결
		if(com.equals(user)) {
			System.out.println("비겼다");
		}else if (com.equals("보")) {
			if (user.equals("가위")){
				System.out.println("이겼다");				
			}else System.out.println("졌다");			
		} else if (com.equals("가위")) {
			if (user.equals("바위")){
				System.out.println("이겼다");				
			}else System.out.println("졌다");			
		} else if (com.equals("바위")) {
			if (user.equals("보")){
				System.out.println("이겼다");				
			}else System.out.println("졌다");			
		}
		
		//--------------------------------------
		
		
		
		
		
		
	}

}
