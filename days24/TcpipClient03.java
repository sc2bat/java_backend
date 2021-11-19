package days24;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient03 {

	public static void main(String[] argrs) {
		/**/
		//
		String serverIp = "192.168.0.3";
		try {
			Socket s = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다");
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// import 확실히 해줄것 
	// 다른이름으로 저장시 ANSI 확인할 것
	// 컴파일 후 서버를 열고 컴파일된 파일로 cmd 에서 접속
//	서버가 준비되었습니다. 연결을 기다립니다.
//	[/192.168.0.3:7777]하이
//	[/192.168.0.3:7777]반갑고
	
	// 자바 프로그래밍 마무리

}
