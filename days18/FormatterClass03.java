package days18;

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
		df = new DecimalFormat("0.000"); // 없어지는것이 아니라 보여줄때만 이렇게
		System.out.printf("%19s : %f --> %s\n", "0.000",
				number, df.format(number));
		//              0.000 : 123456.712890 --> 123456.713
		
		
		number = 123456789.0;
		// 천단위 구분기호 표시 패턴 0,000,000
		df = new DecimalFormat("0,000");
		System.out.printf("%19s : %f --> %s\n", "0,000",
				number, df.format(number));
		//              0,000 : 123456789.000000 --> 123,456,789
		
		number = 89.0;
		// 천단위 구분기호 표시 패턴 0,000,000
		df = new DecimalFormat("0,000");
		System.out.printf("%19s : %f --> %s\n", "0,000",
				number, df.format(number));
		//              0,000 : 89.000000 --> 0,089
		
		// 0,089 에서 앞의 0이 무효라면 # 
		// 무효의 0을 표시하지 않는 #을 0대신 사용
		df = new DecimalFormat("#,###");
		System.out.printf("%19s : %f -> %s\n",
				"#,###", number, df.format(number));
		//              #,### : 89.000000 -> 89
		// 10의 자리든 100의 자리든 표시할 숫자가 있을때만 표시 - 강제 0표시 안함
		// 표시할 숫자가 1000을 넘어갈때만 (,)를 표시
		number = 123456.0;
		System.out.printf("%19s : %f -> %s\n",
				"#,###", number, df.format(number));
		//              #,### : 123456.000000 -> 123,456
		
		// #을 이용한 소수점 표시 : #의 갯수보다 표시할 숫자가 많으면 # 갯수만큼 표시
		// # 의 갯수보다 표시할 숫자가 적으면 숫자있는만큼만 표시
		number = 123456.7128;
		df = new DecimalFormat("#,###.###");
		System.out.printf("%19s : %f -> %s\n",
				"#,###.###", number, df.format(number));
		//          #,###.### : 123456.712800 -> 123,456.713
		
		number = 123456.7;
		df = new DecimalFormat("#,###.###");
		System.out.printf("%19s : %f -> %s\n",
				"#,###.###", number, df.format(number));
		//          #,###.### : 123456.700000 -> 123,456.7
		
		//단위 또는 기호 첨가
		number = 1234;
		df = new DecimalFormat("$#,###원");
		System.out.printf("%19s : %f -> %s\n",
				"#,###원", number, df.format(number));
		//             #,###원 : 1234.000000 -> $1,234원
		
		// 음수와 양수 표시
		// (;) 을 기준으로 양수 음수 구분
		number = -1234;
		df = new DecimalFormat("#,###.##+;#,###.##-");
		System.out.printf("%19s : %f -> %s\n",
				"#,###.##+;#,###.##-", number, df.format(number));
		// #,###.##+;#,###.##- : -1234.000000 -> 1,234-
		
		//100 을 곱해서 % 로 표시
		number = 0.8539;
		df = new DecimalFormat("#.#%");
		System.out.printf("%19s : %f -> %s\n",
				"#.#%", number, df.format(number));
		//               #.#% : 0.853900 -> 85.4%
		
		
		number =123.172839;
		System.out.println("123.172839 -> " + (int)(number*10)/10.0);
		//123.172839 -> 123.1 버림
		df = new DecimalFormat("0.0");
		System.out.println("123.172839 -> " + df.format(number));
		//123.172839 -> 123.2 반올림
	}

}
