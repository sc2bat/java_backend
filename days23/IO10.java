package days23;

import java.io.*;

public class IO10 {

	public static void main(String[] argrs) throws IOException {
		/**/
		//선거에 있어서 최고 득표자가 2인이상인 때에는 국회의 재적의원 과반수가 출석한 공개회의에서 다수표를 얻은 자를 당선자로 한다. 
		//이 헌법 시행 당시의 법령과 조약은 이 헌법에 위배되지 아니하는 한 그 효력을 지속한다.
		//
		//
		//국회의 회의는 공개한다. 다만, 출석의원 과반수의 찬성이 있거나 의장이 국강의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지
		//아니할 수 있다.
		
		// 파일 하나를 생성해서 파일 이름은 abc.txt 로 생성 위의 텍스트 작서
		// 한번의 명령으로 써넣으셔도 되고 파일 출력 명령 두번 또는 세번에 나눠서 실행하셔도 됩니다. 
		// 문단 간격 (두줄띄움)을 유지해서 출력해주세요
		
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file_txt = new File(dir, "abc.txt");
		
		FileWriter fw_txt = new FileWriter(file_txt);
		fw_txt.write("선거에 있어서 \"최고 득표자\"가 2인이상인 때에는 국회의 재적의원 과반수가\n"
				+ "출석한 공개회의에서 다수표를 얻은 자를 \"당선자\"로 한다. \n"
				+ "이 헌법 시행 당시의 법령과 조약은 이 헌법에 위배되지 아니하는 한 그 효력을 지속한다.\n\n\n");
		fw_txt.write("국회의 회의는 공개한다. 다만, 출석의원 50% 이상의 찬성이 있거나 의장이 \n"
				+ "국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있다.\n");
		fw_txt.close();
		
//		FileInputStream fr_txt= new FileInputStream(file_txt);
//		int data_txt;
//		//data_txt = fr_txt.read();
//		while((data_txt = fr_txt.read()) != -1) {
//			System.out.print((char)data_txt);
//		}
//		fr_txt.close();
		
		
	}

}
