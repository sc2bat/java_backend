// 이미지 apple.jpg persimmon.jpg pear.jpg banana.jpg cherry.jpg
// 다섯 개의 이미지를 아이콘으로 만들고 버튼 다섯 개를 이미지와 함께 생성하세요
// 그리드 레이아웃을 이용하여 3행 2열로 배치하고
// 액션 리스너를 붙여서 버튼 클릭시에 이미지에 해당하는 과일 이름이 result 라벨에 나오도록 작성하세요
// 생성할 클래스 이름은 GridFruits입니다

// 버튼을 클릭하면 과일 이름이 result 라벨에 표시되도록 해주세요
// "사과를 선택하셨습니다"

package days20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GridFruits extends JFrame implements ActionListener{
	JLabel result;
	
	GridFruits(){
		
		// 이미지 아이콘
		ImageIcon fi1 = new ImageIcon("images/apple.jpg");
		ImageIcon fi2 = new ImageIcon("images/persimmon.jpg");
		ImageIcon fi3 = new ImageIcon("images/pear.jpg");
		ImageIcon fi4 = new ImageIcon("images/banana.jpg");
		ImageIcon fi5 = new ImageIcon("images/cherry.jpg");
		// 버튼
		JButton b1 = new JButton("사과", fi1);
		JButton b2 = new JButton("감", fi2);
		JButton b3 = new JButton("배", fi3);
		JButton b4 = new JButton("바나나", fi4);
		JButton b5 = new JButton("체리", fi5);
		result = new JLabel("");
		
		//
		Container con = getContentPane(); 
		con.setLayout(new GridLayout(3, 2, 20, 20));
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		con.add(result);
		
		//
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		//
		setTitle("과일 선택 테스트"); 
		setSize(600, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand() + "을 선택하셨습니다");
	}
}

public class Swing09 {

	public static void main(String[] argrs) {
		/**/
		//
		new GridFruits();

	}

}
