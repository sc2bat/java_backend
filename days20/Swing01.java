package days20;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 윈도우 프로그래밍에 필요한 윈도우 구성요소를 보유한 클래스(JFrame)를 상속받아 추가기능 탑재 형식의 개발을 진행합니다
class ButtonTest extends JFrame{
	// 윈도우 최초 화면의 구성은 대부분 생성자 메소드에서 구성합니다
	ButtonTest(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		// 생성자에 입력된 텍스트를 한가운데 표시한 버튼을 생성합니다
		// 아직 화면에 버튼이 보이는 상태는 아닙니다. 생성만 해서 아직 배치하거나 보여주는 단계는 아닙니다
		// 버튼 또는 그 외 컨트롤들은 윈도우에 배치되고 위치를 잡아 올라가고 윈도우가 화면에 보일 때 같이 표시됩니다
		
		// 안내문구 표시용 텍스트 도구
		JLabel label = new JLabel("당신의 성별은?");
		
		// 윈도우 위에 생성된 컨트롤 객체들을 올려놓을 수 있게 해주는 객체
		// 싱글톤방식 // 스태틱 메소드임 // JFrame.getContentPane() 같은것임
		Container con = getContentPane(); 
		
		// 윈도우에 올라갈 컨트롤들을 담을 바구니 - 담으면 윈도우에 표시될 준비가 완료됩니다
		// 컨테이너에 add되어지는 순서로 한줄로 화면구성
		con.setLayout( new FlowLayout() );
		// 줄맞춤 설정
		
		// 컨테이너에 생성된 컨트롤을 순서에 맞춰 올려놓으면 화면에 표시될 준비가 완료됩니다
		con.add(label);
		con.add(male);
		con.add(female);
		
		setTitle("버튼 컴퍼넌트 테스트"); // 윈도우 좌측 상단에 표시된 타이틀 내용설정
		setSize(300, 200); //윈도우 크기 설정 : 단위 (픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//현재 윈도우 종료시 프로그램까지 종료 설정
		setVisible(true); // 화면에 윈도우를 출현시키는 메소드
		
	}
	
}

public class Swing01 {

	public static void main(String[] argrs) {
		/**/
		//
		new ButtonTest();

	}

}
