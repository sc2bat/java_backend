//package days24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.net.UnknownHostException;

class Sender extends Thread{
	Socket socket; // ��������μ��� ����
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
	// �޼ҵ� �������̵�
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + sc.nextLine());
				// ȭ�鿡 �Է��� ������ ������ ���Ӹ��� �Բ� ����
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
		// �̰����� �Է¹ޱ� ��ٸ��� ����ϸ� �� ��ٸ��Բ� 
		// �о�� ���� ȭ�鿡 ��¸�
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
			System.out.println("������ ����Ǿ����ϴ�");
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
