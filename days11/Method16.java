package days11;

public class Method16 {

	public static void main(String[] argrs) {
		/**/
		//cals 메소드 생성(전달된 문자열에 따라 입력된 숫자들의 평균 또는 합계를 출력하는 메소드)
		
		cals("합계", 98, 78, 45, 12, 23, 87, 69, 59); // 471 
		System.out.println();
		cals("평균", 98, 78, 45, 12, 23, 32, 98, 63, 25, 87);
	}
	public static void cals(String a, int... b) {
		int sum = 0;
		if(a.equals("합계")) {
			for (int i = 0; i < b.length; i++) {
				sum += b[i];
			}
			System.out.printf("%d \n", sum);
		}
		else {
			double ave = 1.0;
			int total = 0; 
			for (int i = 0; i < b.length; i++) {
				//total += b[i];
//				ave = total * 1.0 / b.length;
				total = total + b[i];
			}
			ave = total / (double)b.length;
			System.out.printf("%.2f \n", ave);
		}
		
		//-----------------------------------------------------
		
		int tot = 0;
		if(a.equals("합계")) {
			for (int i = 0; i < b.length; i++) {
				tot = tot + b[i];
			}
			System.out.printf("합계 : %d", tot);
		}else {
			for (int i = 0; i < b.length; i++) {
				tot = tot + b[i];
			}
			System.out.printf("평균 : %.1f", tot/(double)b.length);
		}
		
//		471 
//		합계 : 471
//		56.10 
//		평균 : 56.1
		
		
		
		
		
		
		
	}
}
