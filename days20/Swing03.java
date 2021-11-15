package days20;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ButtonEvent extends JFrame implements ActionListener{
	// 1. ActionListener 를 implements 합니다
	// 2. 적용할 컨트롤에 addActionListener 메소드로 감시설정을 합니다
	// 3. 해당 컨트롤에 이벤트가 발생하면 호출된 ActionPerformed 메소드를 오버라이드합니다
	
	JLabel result; // 전역변수
	
	ButtonEvent(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		//JLabel result = new JLabel(""); // 버튼 클릭에 의해서 실행 결과가 담길 라벨
		result = new JLabel(""); // 지역 변수를 전역변수로
		
		Container con = getContentPane(); 
		con.setLayout( new FlowLayout() );
		
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		// 이벤트를 설정하고 감시할 리스너를 적용하고자하는 컨트롤에 붙여둡니다
		// 해당 컨트롤에 클릭 등의 이벤트가 발생하면 자동으로 actionPerformed 메소드가 호출됩니다
		male.addActionListener(this);
		female.addActionListener(this);
		
		setTitle("버튼 이벤트 테스트"); 
		setSize(300, 200); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 클릭된 컨트롤의 표시된 값이 문자변수 s에 저장
		String s = e.getActionCommand();
		result.setText(s);
	}
}

public class Swing03 {

	public static void main(String[] argrs) {
		/**/
		//
		new ButtonEvent();

	}

}
