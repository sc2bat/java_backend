package days20;

import java.awt.*;

import javax.swing.*;

class JBorderLayout extends JFrame{
	JBorderLayout(){
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout(10, 10));
		//각 지역 (동서남북중앙) 간의 간격 가로세로 10px
		
		JButton b1 = new JButton("동쪽 버튼");
		con.add(b1, BorderLayout.EAST);
		con.add(new JButton("서쪽 버튼"), BorderLayout.WEST);
		con.add(new JButton("남쪽 버튼"), BorderLayout.SOUTH);
		con.add(new JButton("북쪽 버튼"), BorderLayout.NORTH);
		con.add(new JButton("중앙 버튼"), BorderLayout.CENTER);
		// 중앙버튼을 비우면 중앙을 비우고 버튼이 생성됨
		// 동서남북은 비우면 다른 버튼이 그 자리를 채움
		// Center 는 정의하지 않으면 자리가 남지만 이외의 영역은 정의하지 않으면 다른 영역으로 포함되어져 표시됩니다
		
		setTitle("보더 레이아웃 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class Swing07 {

	public static void main(String[] argrs) {
		/**/
		//
		new JBorderLayout();

	}

}
