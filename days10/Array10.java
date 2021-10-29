package days10;

public class Array10 {

	public static void main(String[] argrs) {
		/**/
		//Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		//
		// 배열 a, b, c 생성 (각 갯수 10개)
		// a 배열에는 3의 배수들 10개 저장 - 반복실행문 이용
		// b 배열에는 5의 배수들 10개 저장 - 반복실행문 이용
		// c 배열에는 a배열과 b배열의 각 같은 인덱스 값들의 합을 저장
		// 반복 실행문 이용
		// ex) c[3] = a[3] + b[3];
		// 출력
		// a배열 -> 3, 6, 9, .... 
		// b배열 -> 5, 10, 15, ....
		// c배열 -> 8, 16, 24, ....
		
		int i, j;
		
		int [] a = new int [10];
		int [] b = new int [10];
		int [] c = new int [10];
		
		// 3의 배수 a 배열
		for(i = 0; i <= 9; i++) {
			if(a[i] < 0) a[i] *= -1;
			//a[i] = (a[i] % 3 + 1) *3;
			a[i] = 3 + i * 3;
			for(j = 0; j <= i; j++)
				if(a[i] == a[j])break;
			if(i != j) i--;
		}
		System.out.printf("1 %d 10 %d \n", a[0], a[9]);	
		
		// 5의 배수 b배열
		for(i = 0; i <= 9; i++) {
			if(b[i] < 0) b[i] *= -1;
			b[i] = 5 + i * 5;
			for(j = 0; j <= i; j++)
				if(b[i] == b[j])break;
			if(i != j) i--;
		}
		System.out.printf("1 %d 10 %d \n", b[0], b[9]);	
		
		//c[i] = a[i] + b[i];
		for(i = 0; i <= 9; i++) {
			c[i] = a[i] + b[i];
			System.out.printf("c %d = a %d + b %d \n", c[i], a[i], b[i]);			
		}
		// 굳이 랜덤하게 수를 받는게 아닌데 양수화 필요없었음
		
		
//		1 3 10 30 
//		1 5 10 50 
//		c 8 = a 3 + b 5 
//		c 16 = a 6 + b 10 
//		c 24 = a 9 + b 15 
//		c 32 = a 12 + b 20 
//		c 40 = a 15 + b 25 
//		c 48 = a 18 + b 30 
//		c 56 = a 21 + b 35 
//		c 64 = a 24 + b 40 
//		c 72 = a 27 + b 45 
//		c 80 = a 30 + b 50 
		
		
		
		// -----------------------------
		for(i = 0; i < a.length; i++) a[i] = (i+1) * 3;
		for(i = 0; i < b.length; i++) b[i] = (i+1) * 5;
		for(i = 0; i < c.length; i++) c[i] = a[i] + b[i];
		
		System.out.printf("\n a 배열 -> ");
		for(i = 0; i < a.length; i++) System.out.printf("%d ", a[i]);
		System.out.printf("\n b 배열 -> ");
		for(i = 0; i < b.length; i++) System.out.printf("%d ", b[i]);
		System.out.printf("\n c 배열 -> ");
		for(i = 0; i < c.length; i++) System.out.printf("%d ", c[i]);
		

//		 a 배열 -> 3 6 9 12 15 18 21 24 27 30 
//		 b 배열 -> 5 10 15 20 25 30 35 40 45 50 
//		 c 배열 -> 8 16 24 32 40 48 56 64 72 80 
		

	}

}
