package days06;

public class ControllOpFor02 {

	public static void main(String[] args) {
		// 
		int i;
		// 1부터 100사이의 정수 출력
		System.out.println("정수 출력------------------------------------");
		for(i = 1; i <= 100; i++) {
			System.out.printf("%d ", i);		
		}
		System.out.printf("\n반복 실행후의 i 변수 값 : %d\n", i);
		System.out.println("\n 1부터 100사이의 짝수 출력 #1------------");
		for(i = 1; i < 100; i++) {
			if(i %2 ==0) System.out.printf("%d ", i);
		}
		System.out.printf("\n반복 실행후의 i변수 값 : %d\n", i);
		System.out.println("\n 1부터 100사이의 짝수 출력 #2------------");
		for(i = 2; i <=100; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.printf("\n반복 실행 후의 i 변수 값 : %d\n", i);
		
		System.out.println("\n 1부터 100사이의 짝수 출력 #1------------");
		for(i = 1; i <= 100; i++)
			if(i % 2 == 1) System.out.printf("%d ", i);
		System.out.println();
		
		System.out.println("\n 1부터 100사이의 짝수 출력 #2------------");
		for(i =1; i <= 100; i += 2) System.out.printf("%d ", i);
		System.out.println();
		
		// 반복문 대략 어느정도 반복이 되고 대략적인 값이 어느정도인지 예측이 될 정도로 연습
		
		
		
		
	}

}
