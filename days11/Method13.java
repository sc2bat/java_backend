package days11;

public class Method13 {

	public static void main(String[] argrs) {
		/**/
		//메소드 오버로딩
		// 메소드 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면 서로 다른 메소드로 인지하는 문법
		// 일관된 메소드 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 합니다
		// 전달인수(매개변수)의 자료형, 순서 등이 서로 달라도 가능
		
		int max_result = max(10, 50, 6);
		max_result = max(56, 87);
		//System.out.printf(); 역시 오버로딩 되어있음 %d, %s, %f 같이
		double max_resultD = max(123.45, 456.56); 
		// 정의된 메소드들의 매개변수들과 맞지 않은 호출은 에러입니다
		//System.out.println("세 개의 정수 중 큰 값 "+ max(11, 33, 55, 44));// 에러
		//System.out.println("세 개의 실수 중 큰 값 " + max(11.0, 33, 33.5)); //에러

	}

	private static double max(double d, double e) {
		double maxValue = (d > e)? d : e;
		return maxValue;
	}

	private static int max(int i, int j) {
		int mv = (i > j)? i : j;
		return mv;
	}

	// 여기서만 쓸 함수라면 private 상관없음
	public static int max(int i, int j, int k) {
		int mv = max(i, j);
		mv = max(mv, k);
		return mv;
	}

}
