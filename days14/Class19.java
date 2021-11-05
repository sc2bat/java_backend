package days14;

// 스태틱변수는 클래스내부에 존재하지만, 객체 생성과 상관없이 프로그램 시작전 한번만 생성되고
// 프로그램 종료시까지 변수가 갖는 값을 일관되게 유지 또는 변경 관리합니다

class StaticB{
	int bunho;
	static int count = 0;
	StaticB(){
		count++;
		bunho = count;
		// 생성자 메소드에서 count 값을 1씩 증가시키며, 그 값을 bunho 에 저장
	}
}

public class Class19 {

	public static void main(String[] argrs) {
		/**/
		System.out.printf("count = %d\n", StaticB.count);
		StaticB b1 = new StaticB();
		System.out.printf("b1.bunho = %d, count = %d\n", b1.bunho, StaticB.count);
		StaticB b2 = new StaticB();
		System.out.printf("b2.bunho = %d, count = %d\n", b2.bunho, StaticB.count);
		StaticB b3 = new StaticB();
		System.out.printf("b3.bunho = %d, count = %d\n", b3.bunho, StaticB.count);
		
//		count = 0
//		b1.bunho = 1, count = 1
//		b2.bunho = 2, count = 2
//		b3.bunho = 3, count = 3
	}

}
