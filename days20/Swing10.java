package days20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JTextFieldTest extends JFrame implements ActionListener{
	
	JTextField jtf;
	
	JTextFieldTest(){
		//JTextField jtf = new JTextField(30);
		jtf = new JTextField(30);
		// 30 글자를 써넣을 수 있는 텍스트 상자를 생성합니다
		
		JButton bt1 = new JButton("반갑습니다");
		JButton bt2 = new JButton("안녕하세요");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(jtf);
		
		setTitle("텍스트 필드 테스트"); 
		setSize(500, 100); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 텍스트 필드의 값을 넣는 메소드 jtf.setText("문자들");
		// 텍스트 필드에서 쓰여진 String 을 가져오는 메소드 String str = jtf.getText();
		String s1 = jtf.getText();
		String s = e.getActionCommand();
		jtf.setText(s1 + s);		
	}
}

public class Swing10 {

	public static void main(String[] argrs) {
		/**/
		//
		new JTextFieldTest();

	}

}
