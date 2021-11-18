package days22;

import javax.swing.JOptionPane;

class ThreadE extends Thread{
	private boolean state = true; // 스레드 실행여부를 판단할 변수 생성
	// state 변수값을 변경할 수 있는 멤버 메소드 생성
	public void setState(boolean s) {
		this.state = s;
	}
	public void run() {
		// 수시로 state 변수를 확인하면서 스레드 실행을 계속할지를 검사합니다
		for (int i = 10; i > 0 && this.state == true; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

// 스레드를 계속할지 아니면 멈출지를 결정할 boolean 변수가 멤버변수로 추가됩니다
// 스레드를 계속하려면 true 멈추려면 false 로 값을 대입하는 setState 메소드도 추가됩니다.
// run 메소드는 실행 중간 중간 또는 반복실행의 조건에서 state 변수가 true 인지 검사합니다
// false 이면 멈추고, true 이면 계속합니다

public class Thread06 {

	public static void main(String[] argrs) {
		/**/
		//
		ThreadE t2 = new ThreadE();
		t2.start(); // 스레드는 시작되고, 
		String input = JOptionPane.showInputDialog("정답을 입력하세요");
		//필요한 입력이 완료되면 스레드 실행중이더라도 state 값을 false 로 바꿔줘서 멈추게 합니다
		t2.setState(false);
		// t2.stop() 은 사용하지 않습니다.
		System.out.println("입력하신 값은 " + input + "입니다.");
		
//		카운트 다운과 입력이 동시 실행되면서 입력이 완료되면 카운트다운도 멈춤
//		10
//		9
//		8
//		입력하신 값은 12입니다.
		
	}

}
