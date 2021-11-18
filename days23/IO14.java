package days23;

import java.io.*;

public class IO14 {

	public static void main(String[] argrs) throws IOException {
		/**/
		//이진 형식, text 형식 모두 가능지만 가능하다면 이진형식으로 실습해주세요
		// exe 파일은 윈도우 형태 자바는 class 형태
		//"D:\\JAVA01\\Java_se\\temp" 폴더 안의 
		// "eclipse-inst-jre-win64.exe" 를 이진형태로 읽어서 copy 폴더를 만들고 
		//"D:\\JAVA01\\Java_se\\copy" 폴더로 복사
		// 이진 형식으로 읽어.. 바로 써넣는 방식
		
		String CopyPath = "D:\\JAVA01\\Java_se\\copy"; // 사본 파일 경로
		String Originalpath = "D:\\JAVA01\\Java_se\\temp"; // 원본 파일 경로
		String Filename = "eclipse-inst-jre-win64.exe";
		File originDir = new File(Originalpath); // 읽어올 파일 경로 설정
		File fileOriginal = new File(originDir, Filename); // 읽어올 파일 설정
		
		File copyDir = new File(CopyPath); // 경로 설정
		if(!copyDir.exists()) { // 경로 생성
			copyDir.mkdir();
		}
		File fileCopy = new File(copyDir, Filename); // 파일 설정
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileOriginal));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy));
		
		// 1byte 씩
//		int data;
//		while((data=bis.read()) != -1) {
//			bos.write(data);
//		}
		
		// 1kb 씩
		byte[] data = new byte[1024];
		int size;
		while((size=bis.read(data)) != -1) {
			bos.write(data, 0, size);
		}
		
		
		bis.close();
		bos.close();
		
		// exe 파일을 복사하는 것 
		// run 후 파일 실행까지 되야함
		
		
		
		
//		File dir2 = new File("D:\\JAVA01\\Java_se\\copy");
//		if(!dir2.exists()) {
//			dir2.mkdirs();
//		}
//		File file_exe_binary = new File(dir2, "exe_binary.dat");
//		
//		File dir = new File("D:\\JAVA01\\Java_se\\temp");
//		if(!dir.exists()) {
//			dir.mkdirs();
//		}
//		File file_exe = new File(dir, "eclipse-inst-jre-win64.exe");
//		
//		BufferedInputStream bis_bynary = new BufferedInputStream(new FileInputStream(file_exe));
//		FileOutputStream fos_binary = new FileOutputStream(file_exe_binary);
//		int input;
//		while((input = bis_bynary.read()) != -1) {
//			//fos_binary.write(input);
//			fos_binary.write((char)input);
//		}
//		System.out.println();
//		fos_binary.close();
//		bis_bynary.close();
		
	}

}
