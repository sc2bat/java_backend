package days11;

public class Method06 {

	public static void main(String[] argrs) {
		/**/
		//call by value
		//call by reference
		//
		int [] a = {56, 54, 87, 89, 25, 36, 57, 98, 59, 87};
		// 아래 명령 sum(a);이 정상 실행되어서 배열내의 값의 합계를 출력도록 sum 함수를 제작하세요
		sum(a);

	}
	/*
	public static void sum(int [] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			//System.out.println(sum+ " "+ a[i]);
		}
		System.out.printf("%d \t\n", sum); //648 	
	}
	*/
	//----------------------------------------------------------
	public static void sum(int [] a) {
		int total = 0;
		for(int i = 0; i < a.length; i++) {
			total += a[i];
			System.out.println("배열의 합계 : " + total);
		}
	}
//	배열의 합계 : 56
//	배열의 합계 : 110
//	배열의 합계 : 197
//	배열의 합계 : 286
//	배열의 합계 : 311
//	배열의 합계 : 347
//	배열의 합계 : 404
//	배열의 합계 : 502
//	배열의 합계 : 561
//	배열의 합계 : 648
	

}
