package days23;

import java.io.*;

public class IO11 {

	public static void main(String[] argrs) throws IOException {
		/**/
		//D:\\JAVA01\\Java_se\\temp\\abc.txt
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file_txt = new File(dir, "abc.txt");
		
		FileReader fr_txt= new FileReader(file_txt);
		int data_txt;
		while((data_txt = fr_txt.read()) != -1) {
			System.out.print((char)data_txt);
		}
		fr_txt.close();

	}

}
