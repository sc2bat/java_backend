package days23;

import java.io.*;

public class IO141 {

	public static void main(String[] argrs) throws IOException {
		/**/
		//이진 형식, text 형식 모두 가능지만 가능하다면 이진형식으로 실습해주세요
		// exe 파일은 윈도우 형태 자바는 class 형태
		//"D:\\JAVA01\\Java_se\\temp" 폴더 안의 
		// "eclipse-inst-jre-win64.exe" 를 이진형태로 읽어서 copy 폴더를 만들고 
		//"D:\\JAVA01\\Java_se\\copy" 폴더로 복사
		// 이진 형식으로 읽어.. 바로 써넣는 방식
		
		File dir2 = new File("D:\\JAVA01\\Java_se\\copy");
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		File file_exe_binary = new File(dir2, "exe_binary.dat");
		
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file_exe = new File(dir, "eclipse-inst-jre-win64.exe");
		
		BufferedInputStream bis_bynary = new BufferedInputStream(new FileInputStream(file_exe));
		FileOutputStream fos_binary = new FileOutputStream(file_exe_binary);
		int input;
		while((input = bis_bynary.read()) != -1) {
			fos_binary.write((char)input);
		}
		System.out.println();
		fos_binary.close();
		bis_bynary.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
