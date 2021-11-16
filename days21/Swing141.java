package days21;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

// 년월 칸에 직접 기입해서 확인 버튼으로 달력이 업데이트 되게끔 

class Calendars141 extends JFrame implements ActionListener {

	static int year = 0;
	static int month = 0;
	static JTextField[] jt = new JTextField[42];
	
	JTextField y;
	JTextField m;

	Calendars141() {

		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel(); // 요일
		JPanel jp2 = new JPanel(); // 6행7열 날짜
		JPanel jp3 = new JPanel(); // 이전달 다음달 등등

		jp1.setLayout(new GridLayout(1, 7));
		jp2.setLayout(new GridLayout(6, 7));
		jp3.setLayout(new FlowLayout());
		
		jp1.add(new JButton("일")).setForeground(Color.RED);
		jp1.add(new JButton("월"));
		jp1.add(new JButton("화"));
		jp1.add(new JButton("수"));
		jp1.add(new JButton("목"));
		jp1.add(new JButton("금"));
		jp1.add(new JButton("토")).setForeground(Color.BLUE);
		
		Font f = new Font("굴림", Font.BOLD, 20);
		
		for (int i = 0; i < 42; i++) {
			jt[i] = new JTextField();
			jt[i].setFont(f);
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT);
			jt[i].setEditable(false);
			jt[i].setBackground(Color.WHITE);
			//
			if (i % 7 == 6) {
				jt[i].setForeground(Color.BLUE);
			}else if (i % 7 == 0) {
				jt[i].setForeground(Color.RED);
			}else jt[i].setForeground(Color.BLACK);
			
			jp2.add(jt[i]);
		}
		
		y = new JTextField(4);
		y.setFont(f);
		y.setHorizontalAlignment(SwingConstants.CENTER);
		// 마우스 키보드 설정 해제
		//y.setEditable(false);
		y.setBackground(Color.WHITE);
		
		m = new JTextField(4);
		m.setFont(f);
		m.setHorizontalAlignment(SwingConstants.CENTER);
		//m.setEditable(false);
		m.setBackground(Color.WHITE);
		
		Calendar today = Calendar.getInstance();
		y.setText(String.valueOf(today.get(Calendar.YEAR)));
		m.setText(String.valueOf(today.get(Calendar.MONTH)+1));
		
		JButton b = new JButton("확인");
		JButton b1 = new JButton("이전달");
		JButton b2 = new JButton("다음달");
		
		jp3.add(b1);
		jp3.add(y);
		jp3.add(new JLabel("년 "));
		jp3.add(m);
		jp3.add(new JLabel("월 "));
		jp3.add(b);
		jp3.add(b2);
		
		//
		b1.addActionListener(this);
		b2.addActionListener(this);
		// 확인버튼 활성화
		b.addActionListener(this);
		
		con.add(jp1, BorderLayout.NORTH);
		con.add(jp2, BorderLayout.CENTER);
		con.add(jp3, BorderLayout.SOUTH);
		
		setTitle("스윙 캘린더");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		year = Integer.parseInt(y.getText());
		month = Integer.parseInt(m.getText());
		
		drawCalendar();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		switch (s) {
		case "이전달":
			if ( month == 1) {
				year--; 
				month = 12;
			}else {
				month--;
			}
			y.setText( String.valueOf(year));
			m.setText( String.valueOf(month));
			break;
		case "다음달":
			if ( month == 12) {
				year++; 
				month = 1;
			}else {
				month++;
			}
			y.setText( String.valueOf(year));
			m.setText( String.valueOf(month));
			break;
		// 확인버튼 
		case "확인":
			y = new JTextField(4);
			m = new JTextField(4);
			y.setText(String.valueOf(y));
			m.setText( String.valueOf(m));
			break;
		}
		
//		y.setText( String.valueOf(year));
//		m.setText( String.valueOf(month));
		
		for (int i = 0; i < jt.length; i++) {
			jt[i].setText("");
		}
		drawCalendar();
		
	}

	private void drawCalendar() {
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1); 
		eDay.set(year, month, 1); // 
		eDay.add(Calendar.DATE, -1);
		
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		for (int i = START_WEEK -1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			int day = sDay.get(Calendar.DATE);
			jt[i++].setText(String.valueOf(day));
				
		}
				
	}
	
}

public class Swing141 {

	public static void main(String[] argrs) {
		/**/
		//
		new Calendars141();
	}

}
