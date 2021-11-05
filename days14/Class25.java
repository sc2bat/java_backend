package days14;

// 초기화 블럭
class StaticF{
	private int number;
	private static int num = 1;
	//초기화 블럭 : 객체 생성시 실행 ( 생성자와 성격이 비슷 )
	// 단순 값으로 초기화하는 경우 대입연산자를 통해서 처리할 수 있지만,
	// 실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있음
	{	number = 100;
		System.out.println("인스턴스 변수 초기화용 초기화 블럭1");
	}
	
	//static 초기화 블럭 : static 멤버를 초기화하기 위한 영역
	// 단순 값으로 초기화하는 경우 대입연산자를 통해서 처리할 수 있지만,
	// 실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있음
	static {	System.out.println("StaticF 의 static 블럭 실행");
		num = 55;
	}
	// static 블럭은 객체 생성 이전에, 프로그램 시작시에 실행됩니다
	
	// 일반 초기화블럭에서는 스태틱 멤버에 접근이 자유롭게 가능합니다
	static int cnt = 0;
	int serialNo;
	{
		++cnt;
		serialNo = cnt;
		System.out.println("인스턴스 변수 초기화용 초기화 블럭2");
	}
	
}

public class Class25 {

	public static void main(String[] argrs) {
		/**/
		//
		StaticF f = new StaticF();
//		static 초기화 블럭 역시 객체가 없으면 안되지만 먼저 실행됨
//		StaticF 의 static 블럭 실행
//		인스턴스 변수 초기화용 초기화 블럭1

	}

}
