package days20;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class ButtonTest2 extends JFrame {
	
	ButtonTest2(){
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multiply = new JButton("÷");
		JButton divide = new JButton("×");
		JButton equals = new JButton("=");
		JButton reset = new JButton("C");
		
		Container con = getContentPane(); 
		con.setLayout( new FlowLayout() );
		
		con.add(seven);		con.add(eight);		con.add(nine);		con.add(plus);
		con.add(four);		con.add(five);		con.add(six);		con.add(minus);
		con.add(one);		con.add(two);		con.add(three);		con.add(divide);
		con.add(equals);		con.add(zero);		con.add(reset);		con.add(multiply);
		
		setTitle("버튼 컴퍼넌트 테스트"); 
		setSize(220, 200); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
		
	}
}

public class Swing02 {

	public static void main(String[] argrs) {
		/**/
		new ButtonTest2();

	}

}
