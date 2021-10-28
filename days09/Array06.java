package days09;

import java.util.Random;

public class Array06 {

	public static void main(String[] argrs) {
		/**/
		//지금은 단순히 자바 공부지만 차후 조별프로젝트를 할텐데
		// 문제가 그때엔 에러를 안잡아줌 모든 에러를 스스로 해결
		
		// 인터넷에 흔히 돌아다니는 로또번호 발생기 프로그램
		
		int [] a = new int[6];
		Random rd = new Random();
		
		a[0] = rd.nextInt();
		
//		if(a[0] < 0) a[0] *= -1;
//		a[0] = a[0] % 45 + 1; // 필요한 랜덤한 숫자 1부터 45
//
//		a[1] = rd.nextInt();
//		if(a[1] < 0) a[1] *= -1;
//		a[1] = a[1] % 45 + 1; 

		// 로또 번호 6개 반복실행문으로 발생해서 저장 
//		for(int i = 0; i <= 5; i++) {
//			if(a[i] < 0)	a[i] *= -1;
//				a[i] = a[i] % 45 +1;
//				a[i] *= -1;
//				a[i] = a[i] % 45 +1;	
//				a[i] = a[i]*-1 % 45 +1;
//			else a[i] = a[i] % 45 +1;	
//				
//			System.out.printf("%d ", a[i]);
//		}
		
//		for(int i = 0; i <= a.length; i++) {
//			
//		}
		
		//----------------------------------------------------------
		// 로또처럼 5세트가 나오게 5번 반복
		for(int l = 0; l < 5; l++) {
			for(int i = 0; i <= 5; i++) {
				a[i] = rd.nextInt();
				if(a[i] < 0) a[i] *= -1;
				a[i] = a[i] % 45 +1;
				// 번호 6개 반복실행문으로 발생해서 저장
				
				// 같은 숫자 중복 x
				int j;
				for(j = 0; j < i; j++)
					if(a[i] == a[j])break;
				// 같은값이 나오면 줄어들었다가 다시 올라가면서 번호발생
				if(i != j) i--;
				
				//System.out.printf("%d ", a[i]); // 37 42 10 15 31 2 
			}
			
			System.out.println();
			
				
			// 정렬합니다
			for(int i = 0; i < a.length; i++) {
				for(int j = i+1; j < a.length; j++) {
					if(a[j] > a[i]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						}
					}
				}
			// 출력합니다
			for(int i = 0; i < a.length; i++)
				System.out.printf("%d \t", a[i]); // 42 37 31 15 10 2 
		}
//		40 	36 	10 	9 	4 	3 	
//		38 	29 	27 	14 	12 	11 	
//		41 	31 	18 	16 	6 	2 	
//		28 	22 	21 	15 	12 	6 	
//		24 	22 	19 	16 	10 	3 
		

	}

}
