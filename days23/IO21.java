package days23;

import java.io.*;
import java.io.File;
import java.util.Date;

public class IO21 {

	public static void main(String[] argrs) {
		/**/
		//특정 날짜를 입력 받아서 그 날짜 파일만 출력하세요
		// 날짜 입력 양식을 정해서 잘못된 입력은 다시 입력 받게 설정해주세요
		System.out.print("출력할 날짜를 입력하세요 (2020-01-01)");
		String inputDate;
		Date iDate;
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		while(true) {
			// 날짜를 양식대로 입력해주세요 try catch 사용ㄴ
			break;
		}
		
		// 읽어올 파일 경로 설정
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		// 폴더에서 모든 파일 목록을 불러옴
		String[] f = dir.list();
		System.out.println();
		for (String fn : f) {
			System.out.println(fn);
		}
		//
		// 파일명들을 이용한 반복실행문을 실행하여 입력한 파일만 대상으로 내용을 읽은 후 화면 출력
		for (int i = 0; i < f.length; i++) {
			// 파일이름과 입력한 날짜를 비교해서 같은 것만 출력해주세요
			// 2021_11_17까지만 비교해서
			//f[i] 의 일부와 inputDate와 비교...
		}

	}

}
