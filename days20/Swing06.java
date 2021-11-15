package days20;

import java.awt.*;

import javax.swing.*;

// 배치 관리자
class JFlowLayout extends JFrame{
	JFlowLayout(){
		// 배치관리자 없이 버튼을 컨테이너에 무작정 올린 형태
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		Container con = getContentPane();
		
		con.add(btn1);
		con.add(btn2);
		con.add(new JButton("버튼3"));
		
		setTitle("배치관리자 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class Swing06 {

	public static void main(String[] argrs) {
		/**/
		//
		new JFlowLayout();

	}

}
