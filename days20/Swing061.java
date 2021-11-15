package days20;

import java.awt.*;

import javax.swing.*;

// 배치 관리자
class JFlowLayout2 extends JFrame{
	JFlowLayout2(){
		// 배치관리자 없이 버튼을 컨테이너에 무작정 올린 형태
		/*JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		Container con = getContentPane();
		
		con.add(btn1);
		con.add(btn2);
		con.add(new JButton("버튼3"));*/
		
		Container con = getContentPane();
		con.setLayout( new FlowLayout( FlowLayout.RIGHT, 50, 10));
		//con.setLayout( new FlowLayout( FlowLayout.LEFT, 50, 10));
		// 50 : 컨트롤끼리의 가로 방향 간격 10 : 컨트롤끼리의 세로 방향 간격
		// FlowLayout.RIGHT : 정렬방식
		
		for (int i = 1; i <= 15; i++) {
			con.add(new JButton("버튼" + i));
			}
		// 버튼 생성과 동시에 바로 적재
		// 버튼을 위한 레퍼런스 변수가 없어서 이후 제어는 불가. 적재 모슨만 보여주기 위한 예제입니다.
		// 적재 모습만 보여주기 위한 예제입니다
		
		setTitle("배치관리자 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class Swing061 {

	public static void main(String[] argrs) {
		/**/
		//
		new JFlowLayout2();

	}

}
