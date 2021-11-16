package days21;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator132 extends JFrame implements ActionListener{
	
	JTextField jt;
	// 기입한 수를 기억할 변수
	int firstNumber;
	int secondNumber;
	int result1;
	double result2;
	int operator = 0;
	
	Calculator132(){
		jt = new JTextField(15);
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성.
		jt.setFont(f);
		
		//JButton b = new JButton("폰트");
		//b.setFont(f);	// 버튼에 폰트 적용
		
		Container con = getContentPane(); 
		con.setLayout(new GridLayout(5, 1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setLayout( new FlowLayout( FlowLayout.CENTER ) );
		jt.setText("0");
		jt.setHorizontalAlignment( SwingConstants.RIGHT ); // 텍스트 필드 오른쪽 정렬
		jt.setEditable(false); // 마우스 키보드로 편집 못하게 설정
		p1.add(jt);
		con.add(p1);
		
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bp = new JButton("+");
		
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		bp.setFont(f);
		p2.setLayout(new GridLayout(1, 4));
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bp);
		con.add(p2);
		
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton bm = new JButton("-");
		
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		bm.setFont(f);
		p3.setLayout(new GridLayout(1, 4));
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(bm);
		con.add(p3);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton bmulty = new JButton("×");
		
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		bmulty.setFont(f);
		p4.setLayout(new GridLayout(1, 4));
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);
		p4.add(bmulty);
		con.add(p4);
		
		JButton bc = new JButton("C");
		JButton b0 = new JButton("0");
		JButton be = new JButton("=");
		JButton bd = new JButton("÷");
		
		bc.setFont(f);
		b0.setFont(f);
		be.setFont(f);
		bd.setFont(f);
		p5.setLayout(new GridLayout(1, 4));
		p5.add(bc);
		p5.add(b0);
		p5.add(be);
		p5.add(bd);
		con.add(p5);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		//
		bp.addActionListener(this);
		bm.addActionListener(this);
		bmulty.addActionListener(this);
		bd.addActionListener(this);
		bc.addActionListener(this);
		be.addActionListener(this);
		
		setTitle("계산기 테스트"); 
		setSize(300, 300); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		String oldText = jt.getText(); // 원래 있던 글자를 얻어옴
//		String newText = oldText + s;
//		jt.setText(newText);
		//String newText;
		
		// 스위치 케이스 특성상 같은 코드가 반복되기에 하나로 줄임
		// newText 날리고 jt.setText(oldText + s);
		switch (s) {
		case "+" :
			operator = 1;
			firstNumber = Integer.parseInt(jt.getText());
			jt.setText("0");
			break;
		case "-" :
			operator = 2;
			firstNumber = Integer.parseInt(jt.getText());
			jt.setText("0");
			break;
		case "×" :
			operator = 3;
			firstNumber = Integer.parseInt(jt.getText());
			jt.setText("0");
			break;
		case "÷" :
			operator = 4;
			firstNumber = Integer.parseInt(jt.getText());
			jt.setText("0");
			break;
		case "=" :
			switch (operator) {
			case 1:
				secondNumber = Integer.parseInt(jt.getText());
				result1 = firstNumber + secondNumber;
				jt.setText( String.valueOf(result1));
				break;
			case 2:
				secondNumber = Integer.parseInt(jt.getText());
				result1 = firstNumber - secondNumber;
				jt.setText( String.valueOf(result1));
				break;
			case 3:
				secondNumber = Integer.parseInt(jt.getText());
				result1 = firstNumber * secondNumber;
				jt.setText( String.valueOf(result1));
				break;
			case 4:
				secondNumber = Integer.parseInt(jt.getText());
				result2 = firstNumber / (double)secondNumber;
				jt.setText( String.valueOf(result2));
				break;
			}
			break;
		case "C" :
			jt.setText("0");
			break;
		case "0" :		case "1" :		case "2" :		case "3" :		case "4" :
		case "5" :		case "6" :		case "7" :		case "8" :		case "9" :
			if ( oldText.equals("0") ) {
				oldText = "";
			}
			jt.setText(oldText + s);
			break;
		}
		
	}
}

public class Swing132 {

	public static void main(String[] argrs) {
		/**/
		//
		new Calculator132();

	}

}
