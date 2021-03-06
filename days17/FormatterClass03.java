package days17;

import java.text.DecimalFormat;

public class FormatterClass03 {

	public static void main(String[] argrs) {
		/**/
		//10진수
		DecimalFormat df = new DecimalFormat("0000");
		double number = 123.123456;
		System.out.printf("%19s : %f --> %s\n", "0000",
				number, df.format(number));
		//                0000 : 123.123456 --> 0123
		DecimalFormat df2 = new DecimalFormat("0000.00");
		double number2 = 123.123456;
		System.out.printf("%19s : %f --> %s\n", "0000.00",
				number2, df2.format(number2));
		//            0000.00 : 123.123456 --> 0123.12
		DecimalFormat df3 = new DecimalFormat("0.00");
		double number3 = 123.123456;
		System.out.printf("%19s : %f --> %s\n", "0.00",
				number3, df3.format(number3));
		//               0.00 : 123.123456 --> 123.12
		
		// 양식문자 0 : 표시할 숫자들의 자리표현. 0: 숫자한자리 00: 숫자 두자리 등
		// 표시할 숫자는 많은데 0의 갯수가 모자르면 필요한만큼 0의 갯수를 자동 추가 적용
		// 숫자 12345, 양식 "000" -> 표시 12345
		// 숫자자리수보다 0의 갯수가 많으면 많은 만큼 0으로 채워서 표시
		// 숫자 123, 양식 "00000" -> 표시 00123
		// 소수점 아래에 대해서는 반대로 0의 갯수만큼만 소수점 아래 자리수를 표시.
		// 0갯수로 인해 표시되지 못하는 소수점 자리 중 가장 윗자리에서 반올림
		// 남는 자리에 강제로 0으로 채우는 방식은 동일
		// 0.1264(0.00) -> 0.13		0.1(0.00) -> 0.10
		number = 123456.71289;
		df = new DecimalFormat("0.000");
		System.out.printf("%19s : %f --> %s\n", "0.000",
				number, df.format(number));
		//              0.000 : 123456.712890 --> 123456.713
		
		
	}

}
