package days23;

import java.io.*;

public class IO11test {

	public static void main(String[] argrs) throws IOException {
		/**/
		//
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file_txt = new File(dir, "iotest.txt");
		
		FileWriter fw_txt = new FileWriter(file_txt);
		fw_txt.write("테스트\n");
		fw_txt.write("test\n");
		fw_txt.close();
		
//		FileInputStream fr_txt= new FileInputStream(file_txt);
		FileReader fr_txt= new FileReader(file_txt);
		int data_txt;
		while((data_txt = fr_txt.read()) != -1) {
			System.out.print((char)data_txt);
		}
		fr_txt.close();
		
		System.out.println("테스트");
		
		//FileInputStream가 아닌 FileReader 로하면 한글 안깨짐

	}

}
