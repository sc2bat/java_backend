package days22;

import java.io.*;

public class IO06 {

	public static void main(String[] argrs) throws IOException {
		/**/
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//InputStreamReader a = new InputStreamReader(System.in);
		//BufferedReader b = new BufferedReader(a);
		String input;
		//BufferedReader 클래스의 객체를 사용하여 String 타입 자료를 읽어온 후 형변환을 시행합니다
		System.out.print("정수 입력하세요 : ");
		input = br.readLine();
		int num = Integer.parseInt(input); // 입력된 문자열을 정수로 변환
		System.out.printf("입력된 정수 : %d\n", num);
		System.out.print("실수 입력하세요 : ");
		input = br.readLine();
		double d = Double.parseDouble(input); // 입력된 문자열을 실수로 변환
		System.out.printf("입력된 실수 : %.2f\n", d);
		System.out.print("문자 입력하세요 : ");
		char ch = (char)br.read();
		System.out.printf("입력된 문자 : %c\n", ch);
		br.close();
		
//		정수 입력하세요 : 123
//		입력된 정수 : 123
//		실수 입력하세요 : 123.456
//		입력된 실수 : 123.46
//		문자 입력하세요 : ABCD
//		입력된 문자 : A
		
	}

}
