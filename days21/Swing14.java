package days21;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

class Calendars extends JFrame implements ActionListener {

	static int year = 0;
	static int month = 0;
	// 참조 변수 배열
	static JTextField[] jt = new JTextField[42];
	
	// 텍스트 필드 변수가 아님
	JTextField y;
	JTextField m;

	Calendars() {

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
		
		// 각 날짜가 나올 텍스트 필드
		Font f = new Font("굴림", Font.BOLD, 20);
		
		for (int i = 0; i < 42; i++) {
			// 객체부터 만들기
			jt[i] = new JTextField();
			// 폰트
			jt[i].setFont(f);
			// 오른쪽 정렬
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT);
			// 마우스 키보드 불가
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
		y.setEditable(false);
		y.setBackground(Color.WHITE);
		
		m = new JTextField(4);
		m.setFont(f);
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setEditable(false);
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
		
		con.add(jp1, BorderLayout.NORTH);
		con.add(jp2, BorderLayout.CENTER);
		con.add(jp3, BorderLayout.SOUTH);
		
		setTitle("스윙 캘린더");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		// 년과 월 정수입력
		year = Integer.parseInt(y.getText());
		month = Integer.parseInt(m.getText());
		
		//이전달 다음달 실행에 따라 반복 생성하기에 함수 생성
		drawCalendar();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼에 따라서 year 변수와 month 변수 계산하고 drawCalendar() 호출
		// 이전달인지 다음달인지 받고
		String s = e.getActionCommand();
		// 스위치 케이스로 확인
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
		}
		
		// 변경된 년월 값 업데이트
		y.setText( String.valueOf(year));
		m.setText( String.valueOf(month));
		
		for (int i = 0; i < jt.length; i++) {
			jt[i].setText(""); // 생성되어있는 칸을 지우고
		}
		// 달력을 새로 그림
		drawCalendar();
		
	}

	private void drawCalendar() {
		// 해당 년월의 달력을 화면에 표시
		//
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1); // 오늘 날짜 월의 1일로
		eDay.set(year, month, 1); // 
		eDay.add(Calendar.DATE, -1); // 오늘 날짜 월의 말일로
		
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		// sDay 의 요일 계산
		
//		int k;
//		for (k = 1; k < START_WEEK; k++) {
//			// START_WEEK 요일이 1이면 한번도 실행안함 k : 1
//			// START_WEEK 요일이 2이면 한 번 실행 k : 2
//			// START_WEEK 요일이 3이면 두 번 실행 k : 3
//			//...
//		}
		
		// TextField 가 다 비워져 있는 상태에서 시작
		// 1일자의 요일 (1, 2, 3, 4..) 번째( START_WEEK -1 )의 TextField 부터 날짜 표시
		// 이전 칸들은 비워둔채로 시작
		// 각 TextField 에 sDay 의 값들을 표시 -> 일짜만 표시
		// sDay 의 값들을 표시 -> 날짜만 표시, 한 번 반복마다 날짜는 1일씩 늘어납니다.
		// eDay 보다  sDay 가 작거나 같은때까지 반복
		for (int i = START_WEEK -1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			int day = sDay.get(Calendar.DATE);
			jt[i++].setText(String.valueOf(day));
				
		}
				
	}
	
}

public class Swing14 {

	public static void main(String[] argrs) {
		/**/
		//
		new Calendars();
	}

}
