package days22;

// 프로그램의 수행 중 동시에 처리하고자 하는 작업이 생겼을때는 원래 갖고 있는 메인 Thread 외에
// Thread 클래스를 추가사용하여 실행시킬 수 있ㅅ브니다
// Thread Class : 프로그램 실행의 흐름을 분기할 수 있는 방법을 제공하는 클래스.

// 구현방법
// 1. Thread 클래스를 상속받는 방법
// 		1-1. Thread 클래스를 상속받아 public void run() 메소드를 오버라이딩 합니다
// 			public void run() : 쓰레드가 생성되어 수행할 작업을 정의하는 메소드
// 		1-2. 해당 클래스의 객체를 생성하고, start 메소드를 호출(실행)합니다
// 			만약 오버라이딩된 run 메소드를 호출하면, 쓰레드 생성실행이 아니라, 일반 메소드 호출이
// 			되므로 반드시 start 메소드를 통해 run 으로 이어지게 호출합니다
// 			start 메소드 : Thread 클래스(부모 클래스) 에 있는 메소드로, 자체적으로 쓰레드 추가
// 				생성 후 run 메소드를 재호출하는 역할을 합니다. (상속된 메소드로 메소드가 표면에 보여지지는 않은채 사용됩니다)
// 2. Runnable 인터페이스를 implements(구현) 하는 방법
//		2-1. Thread 클래스를 상속하는 방법과 같고 효과도 거의 같습니다.

class ThreadB1 extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("ThreadB1 : i -> %d\n", i);
			//3초간 멈추기 실행관련이라 예외처리를 해줘야함
			try {
				//Thread.sleep(300);
				sleep(300); // 0.3 초간 실행을 멈추라는 명령
				// sleep 메소드는 Thread 클래스에 있느 static 메소드입니다
				// 사용할 때 Thread.sleep() 으로 사용해야 하지만 현재 위치는 자기 자신의 클래스 내부이기도하므로
				// sleep() 으로만 사용해도 됩니다
				// 또한 프로세서 실행에 관여하는 명령이라서 예외처리가 따라다닙니다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB2 extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("ThreadB2 : i -> %d\n", i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread02 {

	public static void main(String[] argrs) {
		/**/
		//
		ThreadB1 b1 = new ThreadB1();
		ThreadB2 b2 = new ThreadB2();
		//b1.run(); // 이렇게만 하면 Thread 생성하지 않고 run 을 호출할 뿐
		b1.start(); // start 메소드가 Thread 클래스에서 상속
		b2.start();
		
		// main Thread 따로 있으니
		for (int i = 1; i <= 10; i++) {
			System.out.printf("main : i -> %d\n", i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 순서가 뒤바뀜
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
//		ThreadB2 : i -> 1
//		ThreadB2 : i -> 2
//		ThreadB2 : i -> 3
//		ThreadB2 : i -> 4
//		ThreadB2 : i -> 5
//		ThreadB2 : i -> 6
//		ThreadB2 : i -> 7
//		ThreadB2 : i -> 8
//		ThreadB2 : i -> 9
//		ThreadB2 : i -> 10
//		ThreadB1 : i -> 1
//		ThreadB1 : i -> 2
//		ThreadB1 : i -> 3
//		ThreadB1 : i -> 4
//		ThreadB1 : i -> 5
//		ThreadB1 : i -> 6
//		ThreadB1 : i -> 7
//		ThreadB1 : i -> 8
//		ThreadB1 : i -> 9
//		ThreadB1 : i -> 10
		
		// sleep 적용 후 
//		main : i -> 1
//		ThreadB2 : i -> 1
//		ThreadB1 : i -> 1
//		main : i -> 2
//		ThreadB2 : i -> 2
//		ThreadB1 : i -> 2
//		main : i -> 3
//		ThreadB2 : i -> 3
//		ThreadB1 : i -> 3
//		main : i -> 4
//		ThreadB2 : i -> 4
//		ThreadB1 : i -> 4
//		main : i -> 5
//		ThreadB2 : i -> 5
//		ThreadB1 : i -> 5
//		main : i -> 6
//		ThreadB2 : i -> 6
//		ThreadB1 : i -> 6
//		main : i -> 7
//		ThreadB2 : i -> 7
//		ThreadB1 : i -> 7
//		main : i -> 8
//		ThreadB2 : i -> 8
//		ThreadB1 : i -> 8
//		main : i -> 9
//		ThreadB2 : i -> 9
//		ThreadB1 : i -> 9
//		main : i -> 10
//		ThreadB2 : i -> 10
//		ThreadB1 : i -> 10
		
		
	}

}
