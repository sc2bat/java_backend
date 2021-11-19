package days24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 새로운 스레드를 만들어 일임
// 두 개의 클래스 두 개의 스레드
class Sender extends Thread{
	Socket socket; // 멤버변수로서의 소켓
	DataOutputStream out;
	String name;
	
	Sender(Socket s){
		this.socket = s;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]"; 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 메소드 오버라이드
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + sc.nextLine());
				// 화면에 입력한 내용을 만들어둔 말머리와 함께 전송
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Receiver extends Thread{
	Socket socket;
	DataInputStream in;
	
	Receiver(Socket s){
		this.socket = s;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		// 이곳에서 입력받기 기다리고 출력하면 또 기다리게끔 
		// 읽어온 것을 화면에 출력만
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class TcpipServer03 {

	public static void main(String[] argrs) {
		/**/
		//
		ServerSocket sS = null;
		Socket s = null;
		
		try {
			sS = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다. 연결을 기다립니다.");
			s = sS.accept(); //s 에 연결 및 상대 클라이언트 정보 저장
			
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
