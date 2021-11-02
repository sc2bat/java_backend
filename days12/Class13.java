package days12;

// 멤버메소드의 오버로딩
class Sum {
	private int a;
	private int b;
	Sum(int c, int d){
		a = c;
		b = d;
	}
	public int add() {
		return a+b;
	}
//	public int add(int c) {
//		return a+b+c;
//	}
//	public int add(int c, int d) {
//		return a+b+c + d;
//	}
//	public int add(int c, int d, int e) {
//		return a+b+c + d + e;
//	}
	// 한번에 해결 전달인수 매개변수 ....
	public int add(int... c) {
		int tot = 0;
		for (int i = 0; i < c.length; i++) {
			tot += c[i];
		}
		return a+b+tot;
	}
	
}

public class Class13 {

	public static void main(String[] argrs) {
		/**/
		//
		Sum s = new Sum(25, 36);
		System.out.println("s.add() 의 결과 : " + s.add()); // 정수형 데이터 리턴값 // s.add() 의 결과 : 61
		System.out.println("s.add(23) 의 결과 : " + s.add(23)); // s.add(23) 의 결과 : 84
		System.out.println("s.add(59, 65) 의 결과 : " + s.add(59, 65)); // s.add(59, 65) 의 결과 : 185
		System.out.println("s.add(59, 65, 85) 의 결과 : " + s.add(59, 65, 85)); // s.add(59, 65, 85) 의 결과 : 270
		System.out.println("s.add(58, 98, 78, 36, 59) 의 결과 : " + s.add(58, 98, 78, 36, 59)); // s.add(58, 98, 78, 36, 59) 의 결과 : 390
	}

}
