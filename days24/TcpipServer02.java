package days24;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.Date;

public class TcpipServer02 {

	public static void main(String[] argrs) {
		/**/
		//
		ServerSocket ss = null;
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		try {
			ss = new ServerSocket(7777);
			System.out.println(f.format(new Date()) + " 서버가 준비되었습니다");
		} catch (Exception e) {
			System.out.println("서버설정에 실패했습니다. 프로그램을 종료합니다");
			return;
		}
		
		while(true) {
			try {
				System.out.println(f.format(new Date()) + " 연결 요청을 기다립니다");
				ss.setSoTimeout(10000);
				// 서버 소켓이 클라이언트 요청을 기다리는 시간 설정
				// 설정된 시간이 지날때까지 요청이 없으면 SocketTimeoutException 예외가 발생합니다
				// 서버에 요청이 들어올때마다 시간 연장
				// 더이상의 요청이 없다면 정해진 시간 경과 뒤 종료
				Socket s = ss.accept();
				System.out.println(f.format(new Date()) + s.getInetAddress() 
				+ " 로부터 연결요청이 들어왔습니다");
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[공지] 안녕하세요");
				System.out.println(f.format(new Date()) + " 메세지를 전송했습니다.");
				dos.close();
				s.close();
			} catch (SocketTimeoutException e) {
				System.out.println(f.format(new Date()) 
						+ "접속시간 초과. 서버를 종료합니다");
				System.exit(0); // return 과 비슷한 프로그램 종료 명령
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
