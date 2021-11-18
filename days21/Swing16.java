package days21;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JCheckBoxTest extends JFrame implements ItemListener {
	
	JTextField jtf;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	
	JCheckBoxTest(){
		
		jcb1 = new JCheckBox("JSP");
		jcb2 = new JCheckBox("PHP");
		jcb3 = new JCheckBox("ASP");
		jcb4 = new JCheckBox("SEREVLET");
		jtf = new JTextField(30);
		
		Font f = new Font("굴림", Font.BOLD, 20);
		jcb1.setFont(f);
		jcb2.setFont(f);
		jcb3.setFont(f);
		jcb4.setFont(f);
		jtf.setFont(f);
		
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
		con.add(jcb4);
		con.add(jtf);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		
		setTitle("체크박스 테스트");
		setSize(800, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 체크 되거나 안되는 것을 잡아내는 메소드
		String s = "";
		
		if (jcb1.isSelected()) {
			s = s + "JSP ";
		}
		if (jcb2.isSelected()) {
			s = s + jcb2.getActionCommand() + " ";
		}
		if (jcb3.isSelected()) {
			s = s + "ASP ";
		}
		if (jcb4.isSelected()) {
			s = s + jcb4.getActionCommand() + " ";
		}
		jtf.setText( "현재 선택 항목 : " + s );
	}
}

public class Swing16 {

	public static void main(String[] argrs) {
		/**/
		//
		new JCheckBoxTest();
	}

}