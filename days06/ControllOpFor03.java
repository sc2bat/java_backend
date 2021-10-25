package days06;

public class ControllOpFor03 {

	public static void main(String[] args) {
		// 
		// 1부터 10까지의 합
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("덧셈 결과 : " + sum);				
		
		/*
		int i, result;
		for(i=1; i <= 10; i++) {
			result = i;
		}
		System.out.println("덧셈 결과 : " + result);
		*/
		
		int sum1 = 0; // 0 변수에 값을 넣어줘야함
		int i;
		for(i=1; i <= 10; i++) {
//			System.out.printf("%d ", i);
			sum1 = sum1 + i;
			System.out.println(i + " 덧셈 결과 : " + sum1);
			System.out.println();
		}
		System.out.println("덧셈 결과 : " + sum1);
		
		int sum2 = 0; // 0 변수에 값을 넣어줘야함
		int j;
		for(j=1; j <= 100; j++) {
//			System.out.printf("%d ", i);
			sum2 = sum2 + j;
			System.out.println(j + " 덧셈 결과 : " + sum2);
			System.out.println();
		}
		System.out.println("덧셈 결과 : " + sum2);
		
		// 조건문에 10000 값을 넣어서 1부터 10000까지 합한 수를 출력하게되면
		// sum 은 int 라 일정수준의 값을 출력못함
		
		
		
		
		
		
		

	}

}
