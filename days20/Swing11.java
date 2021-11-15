// 윈도우에 텍스트필드1 버튼1 버튼2 텍스트필드2
// 순서로 배치합니다
// 버튼1의 표면에는 ">" 글자 표시, 버튼2의 표면에는 "<" 글자를 표시합니다
// 버튼1을 클릭하면 텍스트필드1의 글자가 텍스트필드2로 옮겨지게
// 버튼2을 클릭하면 텍스트필드2의 글자가 텍스트필드1로 옮겨지게
// 글자가 없는 상태에서 버튼을 클릭하면 아무일도 안일어나게
// 윈도우클래스 이름은 TextFieldEx 로 제작해주세요
// 윈도우의 가로 세로 크기는 적절히 조절해주세요

package days20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TextFieldEx extends JFrame implements ActionListener{
	JTextField t1;
	JTextField t2;
	TextFieldEx(){
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		JButton b1 = new JButton(">");
		JButton b2 = new JButton("<");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(t1);
		con.add(b1);
		con.add(b2);
		con.add(t2);
		
		setTitle("텍스트 필드 예제 테스트"); 
		setSize(500, 100); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 동작은 하는데 어느 버튼을 누르던 이동함
		/*String s1 = t1.getText();
		String s2 = t2.getText();
		
		t1.setText(s2);
		t2.setText(s1);*/
		
		String s = e.getActionCommand();
		if ( s.equals(">") ) {
			if ( !(t1.getText().equals("")) ) {
				String s2 = t1.getText();
				t2.setText( s2 );
				t1.setText("");
			}
		}else {
			if ( !(t2.getText().equals("")) ) {
				t1.setText( t2.getText() );
				t2.setText("");
			}
		}
		
	}
	
}

public class Swing11 {

	public static void main(String[] argrs) {
		/**/
		//
		new TextFieldEx();

	}

}
