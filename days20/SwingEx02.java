package days20;

import javax.swing.JFrame;

// JFrame 상속
class WindowTest extends JFrame {
	// 화면구성 생성자에서 시작
	WindowTest(){
		setTitle("윈도우 테스트");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // 생성된 윈도우의 화면 표시
	}
}

public class SwingEx02 {

	public static void main(String[] argrs) {
		/**/
		// 객체 생성
		//WindowTest win = new WindowTest();
		// win 사용할 일이 거의 없으니 아래처럼 해도됨
		new WindowTest();
	}

}
