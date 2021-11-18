package days22;

//Thread : 프로그램의 명령을 실행하게끔 해주는 실행 주체
// 개발자가 별도의 Thread 를 생성하지 않는다면,
// 한 프로그램에 하나의 Thread 가 존재하여 해당 명령을 차례차례 순서대로 실행시킴

class ThreadA1{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("ThreadA1 : i -> %d\n", i);
		}
	}
}

class ThreadA2{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("ThreadA2 : i -> %d\n", i);
		}
	}
}

public class Thread01 {

	public static void main(String[] argrs) {
		/**/
		//
		
		ThreadA1 t1 = new ThreadA1();
		ThreadA2 t2 = new ThreadA2();
		
		t1.run();
		t2.run();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("main : i -> %d\n", i);
		}
		
//		ThreadA1 : i -> 1
//		ThreadA1 : i -> 2
//		ThreadA1 : i -> 3
//		ThreadA1 : i -> 4
//		ThreadA1 : i -> 5
//		ThreadA1 : i -> 6
//		ThreadA1 : i -> 7
//		ThreadA1 : i -> 8
//		ThreadA1 : i -> 9
//		ThreadA1 : i -> 10
//		ThreadA2 : i -> 1
//		ThreadA2 : i -> 2
//		ThreadA2 : i -> 3
//		ThreadA2 : i -> 4
//		ThreadA2 : i -> 5
//		ThreadA2 : i -> 6
//		ThreadA2 : i -> 7
//		ThreadA2 : i -> 8
//		ThreadA2 : i -> 9
//		ThreadA2 : i -> 10
//		main : i -> 1
//		main : i -> 2
//		main : i -> 3
//		main : i -> 4
//		main : i -> 5
//		main : i -> 6
//		main : i -> 7
//		main : i -> 8
//		main : i -> 9
//		main : i -> 10

	}

}
