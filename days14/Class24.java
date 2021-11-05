package days14;

class StaticD{
	//private 으로 지정된 static 멤버는 클래스의 내부에서만 사용이 가능한 멤버입니다
	private static int count;
	
	//static 멤버는 static 메소드와 인스턴스 메소드 둘에서 모두 접근이 간으하므로
	// private 으로 지정된 static 멤버를 이용하고자 한다면, public 으로 지정된 
	// 멤버메소드 (static, 인스턴스) 로 이용합니다
	public static void setCount( int count ) { StaticD.count = count; }
	public static int getCount() { return count; }
	
	// 다만 인스턴스 메소드는 객체 생성 후 이용이 가능합니다
	public void setCount1( int count ) { StaticD.count = count; }
	public static int getCount1() { return StaticD.count; }
}

public class Class24 {

	public static void main(String[] argrs) {
		/**/
		// private 으로 지정된 static 멤버는 클래스의 외부에서 접근이 차단됩니다
		// StaticD.count = 100; // 에러
		// public 접근 지정자를 사용하는 static 메소드로 private 으로 지정된 static 멤버의 값을 이요할 수 있습니다
		System.out.printf("StaticD.count = %d\n", StaticD.getCount());
		StaticD.setCount(15);
		System.out.printf("StaticD.count = %d\n", StaticD.getCount());
		//  인스턴스 메소드는 객체 생성 후 사용이 가능합니다
		StaticD d1 = new StaticD();
		System.out.printf("StaticD.count = %d\n", d1.getCount1());
		d1.setCount1(20);
		System.out.printf("StaticD.count = %d\n", d1.getCount1());
		
		
	}

}
