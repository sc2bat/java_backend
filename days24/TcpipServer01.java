package days24;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.Date;

public class TcpipServer01 {

	public static void main(String[] argrs) {
		/**/
		// 서버와 통신
		// 단방향 양방향 
		// 
		// 네이버 다음 검색창 '내 아이피 주소확인' 하면 아이피뜸
		// cmd ipconfig IPv4 주소확인ㅡㅇ
		
		//String serverIp = "192.168.0.3";
		//Socket s = new Socket(serverIp, 7777);
		// Socket : 클라이언트가 연결을 요청할 소프트웨어
		// serverIp : 클라이언트가 요청할 연결의 목적지 주소
		// 7777 : 서버에서 관리할 연결의 그룹번호
		
		// 서버의 정보 설정
		ServerSocket ss = null;
//		ServerSocket ss = new ServerSocket(7777);
		// 연결 시간확인
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		try {
			ss = new ServerSocket(7777);
			//System.out.println("서버가 준비되었습니다");
			System.out.println(f.format(new Date()) + " 서버가 준비되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("서버설정에 실패했습니다. 프로그램을 종료합니다");
			return;
		}
		
		while(true) {
			// 서버가 클라이언트의 요청을 기다리기 시작하는 명령
			try {
				System.out.println(f.format(new Date()) + " 연결 요청을 기다립니다");
				Socket s = ss.accept();
				// 현재 명령에서 마치 sc.nextLine() 이 사용자의 화면 입력을 기다리듯이
				// 클라이언트의 연결요청을 기다립니다.
				// ServerSocket 이 클라이언트의 연결요청이 오면
				// 클라이언트 소켓과 서버에서 통신할 새로운 통신용 소켓을 연결합니다.
				// 이때 서버에서 사용하는 통신소켓이 클라이언트 정보를 이용하여 생성됩니다
				// 여기서 말하는 클라이언트 정보라는 것은 클라이언트의 아이피와 포터 번호 등입니다.
				System.out.println(f.format(new Date()) + s.getInetAddress() + " 로부터 연결요청이 들어왔습니다");
				// s.getInetAddress() : 클라이언트의 아이피주소를 추출하는 메소드
				
				// 클라이언트에게 메세지를 전송(출력)할 수 있는 권한을 Socket s 로부터 얻어서
				// OutputStream 객체에 저장합니다
				OutputStream out = s.getOutputStream();
				
				// 권한에 실제 출력 도구를 포함하려면 out을 생성자로 전달한 DataOutputStream 객체가 필요합니다
				
				DataOutputStream dos = new DataOutputStream(out);
				//최종 통신 출력 도구 : dos
				
				// dos 를 통해서 클라언트에게 간단 메세지를 전송합니다
				dos.writeUTF("[공지] 연결 성공~!!! 204호 00번 서버에 접속되셨습니다.");
				
				System.out.println(f.format(new Date())+"메세지를 전송했습니다");
				dos.close();
				s.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				ss.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			// 끝낼때는 터미널 정지해줘야함
			
		}
		
			
	}

}
