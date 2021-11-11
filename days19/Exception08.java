package days19;

import java.io.File;
import java.io.IOException;

public class Exception08 {
	
	static int cnt = 0; // 제목없음cnt 을 여러개 만든다면
	
	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		File f1 = createFile("");
		File f2 = createFile("abc.txt");
		File f3 = createFile("");

	}

	// return 자료형 File
	public static File createFile(String fileName) {
		File f = null;
		try {
			if( fileName == null || fileName.equals(""))
				throw new IOException("파일이름이 유효하지 않습니다");
			//f = new File(fileName);
			//f.createNewFile();
		} catch (IOException e) {
			//System.out.printf("IOException - ");
			//e.printStackTrace();
			//
			fileName = "제목없음" + ++cnt + ".txt";
		}
		catch (Exception e) {
			//System.out.printf("Exception - ");
			e.printStackTrace();
		} finally {
			// 예외 처리가 생겼든 안생겼든 반드시 실행하고 지나갈 영역 : finally
			f = new File(fileName);
			try {
				f.createNewFile();
			} catch (Exception e) {
				System.out.println("파일 생성에 실패했습니다");
			}			
		}
		return f;
	}
	
	// 예외처리로 가운데 abc.txt 가 D:\JAVA01\workspace\JavaProject 생성됨
	
//	java.io.IOException: 지정된 경로를 찾을 수 없습니다
//	at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
//	at java.base/java.io.File.createNewFile(File.java:1043)
//	at days19.Exception08.createFile(Exception08.java:22)
//	at days19.Exception08.main(Exception08.java:13)
	
	// 

}
