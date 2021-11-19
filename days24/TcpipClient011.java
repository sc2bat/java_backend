//package days24;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient011 {

	public static void main(String[] argrs) {
		/**/
		//
		String serverIp = "192.168.0.3";
		
		try {
			Socket s = new Socket(serverIp, 7777); // ������ ��û�մϴ�
			// Socket : Ŭ���̾�Ʈ�� ������ ��û�� ����Ʈ����
			// serverIp : Ŭ���̾�Ʈ�� ��û�� ������ ������ �ּ�
			// 7777 : �������� ������ ������ �׷��ȣ
			// �ش� �����ǿ� ��Ʈ��ȣ�� ������ ������ ��Ʈ��ũ�� �־
			// ������ �����ϸ� �Ʒ� ������ ����. �����ϸ� catch ���� ����
			
			// ���Ͽ��� �Է� ��Ʈ���� ���޹޾� ����µ����� ���
			InputStream in = s.getInputStream();
			// InputStream �� �ܼ� �ƽ�Ű�ڵ� ������� �����ڿ� ���� ����Ŭ���̾�Ʈ ��ſ�
			// ��밡���� ��Ʈ���� �����մϴ�
			
			DataInputStream dis = new DataInputStream(in);
			
			// ������ ��û�� �����κ��� ���޵� �޼����� �����մϴ�
			String m = dis.readUTF();
			
			// �������κ��� ���� �����͸� ����մϴ�
			System.out.println("���� �޼��� : " + m);
			System.out.println("������ �����մϴ�");
			// ��Ʈ���� ������ �ݽ��ϴ�
			dis.close();
			s.close();
			System.out.println("������ ����Ǿ����ϴ�");
			
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
