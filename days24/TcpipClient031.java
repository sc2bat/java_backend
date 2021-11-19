//package days24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.net.UnknownHostException;

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

public class TcpipClient031 {

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

}
