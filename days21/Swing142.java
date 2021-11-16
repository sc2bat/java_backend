package days21;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

class Calendars142 extends JFrame implements ActionListener {

	static int year = 0;
	static int month = 0;
	static JTextField[] jt = new JTextField[42];
	
	JTextField y;
	JTextField m;

	Calendars142() {

		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel(); 
		JPanel jp2 = new JPanel(); 
		JPanel jp3 = new JPanel(); 

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
		//
		//y.setEditable(false);
		y.setBackground(Color.WHITE);
		
		m = new JTextField(4);
		m.setFont(f);
		m.setHorizontalAlignment(SwingConstants.CENTER);
		// 
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
		// 확인 활성화
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
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
			break;
		case "다음달":
			if ( month == 12) {
				year++; 
				month = 1;
			}else {
				month++;
			}
			break;
			// 확인 버튼
		case "확인":
			int tempy = Integer.parseInt(y.getText());
			int tempm = Integer.parseInt(m.getText());
			// 유효한 년월 
			if( tempy >= 1 && tempy <= 3000) {
				year = Integer.parseInt(y.getText());
			}else return;
			
			if( tempm >= 1 && tempm <= 12) {
				month = Integer.parseInt(m.getText());
			}else return;
			
			break;
		}
		
		y.setText( String.valueOf(year));
		m.setText( String.valueOf(month));
		
		for (int i = 0; i < jt.length; i++) {
			jt[i].setText(""); 
		}
		drawCalendar();
		
	}

	private void drawCalendar() {
		//
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

public class Swing142 {

	public static void main(String[] argrs) {
		/**/
		//
		new Calendars142();
	}

}
