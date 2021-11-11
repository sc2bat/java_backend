package days19;

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

public class SwingEx {

	public static void main(String[] argrs) {
		/**/
		// 객체 생성
		WindowTest win = new WindowTest();
		

	}

}
