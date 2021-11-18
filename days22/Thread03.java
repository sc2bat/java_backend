package days22;

import javax.swing.JOptionPane;

class ThreadC1 extends Thread{
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class ThreadC2 extends Thread{
	public void run() {
		String input = JOptionPane.showInputDialog("정답을 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

public class Thread03 {

	public static void main(String[] argrs) {
		/**/
		//
		ThreadC1 t1 = new ThreadC1();
		ThreadC2 t2 = new ThreadC2();
		t2.start();
		t1.start();
		// t1의 상태를 보고 종료시 t2도 종료되게 하면 될듯합니다.
		// 다만 종료 명령이 다소 복잡합니다.
		// 기존에 사용하던 t1.stop(); 이 있지만 Thread 의 stop() 메소드는 사용중이었던
		// 자원(변수, 메모리 등)의 불안정을 초래하기 때문에 지금은 사용하지 않습니다

	}

}
