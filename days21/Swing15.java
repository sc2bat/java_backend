package days21;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JTextFieldTextArea extends JFrame implements ActionListener{
	
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea(){
		// 객체 생성
		jtf = new JTextField(10); // 최대 표시 10글자 (가로크기).... 텍스트 필드
		jta = new JTextArea(7, 20); // 7행 20열(20글자)
		
		Font f = new Font("굴림", Font.BOLD, 20);
		jtf.setFont(f);
		jta.setFont(f);
		
		JButton k = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		k.addActionListener(this);
		
		con.add(jtf);
		con.add(jta);
		con.add(k);
		
		setTitle("텍스트 필드 텍스트 에일리어");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = jtf.getText();
		jta.append(s + "\n"); // 텍스트 필드의 텍스트 에이리어 뒤쪽에 내용을 이어붙이기
		jtf.setText("");
	}
	
}

public class Swing15 {

	public static void main(String[] argrs) {
		/**/
		//
		new JTextFieldTextArea();
	}

}
