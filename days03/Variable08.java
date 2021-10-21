package days03;

public class Variable08 {

	public static void main(String[] args) {
		// char 형 변수의 값 대입 : 하나의 글자를 다른 글자와 구분하기 위해(' ') 사용합니다
		// 작은 따옴표 ('', 'A', ' ' 등)를 사용합니다
		// String 형 데이터는 큰 따옴표로 표현 ("", "A", "ABCD", " " 등)
		char ch = 'A';
		// printf 에서 문자데이터에 쓰이는 이스케이프 문자는 %c
		System.out.printf("ch -> %c\n", ch);
		
		// char 형 데이터는 컴퓨터 저장장치에 저장될때, 이진수 코드로 저장됩니다.
		// 문자를 저장하기 위한 코드체계에 의해 조합된 코드입니다.
		// 이를 십진수로 변화하면 정수로도 변환이 가능합니다
		// 위의 내용을 기초로 한 결과 정수와 문자간 호환성이 발생됩니다
		int intchar = ch;
		System.out.printf("ch -> 정수형 변수에 저장 %d\n", intchar); //65
		System.out.printf("ch -> 정수형 변수로 캐스팅 %d\n", (int)ch); // 65
		ch = 'B';
		System.out.printf("'B' -> 정수값으로 캐스팅 %d\n", (int)ch); // 66
		System.out.printf("'B' -> 정수값으로 캐스팅 %d\n", (int)'B'); // 66
		System.out.printf("'C' -> 정수값으로 캐스팅 %d\n", (int)'C'); // 67
		System.out.printf("'Z' -> 정수값으로 캐스팅 %d\n", (int)'Z'); // 90
		System.out.printf("'a' -> 정수값으로 캐스팅 %d\n", (int)'a'); // 97
		System.out.printf("'z' -> 정수값으로 캐스팅 %d\n", (int)'z'); // 122
		System.out.printf("'0' -> %d, '9' -> %d\n", (int)'0', (int)'9'); // 0 -> 48, 9 -> 57
		
		// 대문자 B 값에 32를 더하여 소문자 b로 변경
		System.out.printf("%c + 32 -> %c\n", ch, ch +32); //B + 32 -> b
		
		// 아라비아 기호 '8'에서 아라비아 기호 '0'을 빼면, 정수 8이 결과로 나옴
		System.out.printf(" '8'-'0' -> %d\n", '8'-'0'); // '8'-'0' -> 정수 8
		System.out.printf(" '8'-'0' -> %d\n", (int)'8'); //  '8'-'0' -> 56
		
		// 실수형 변수의 초기화
		// 자바에서 모든 실수들은 기본적으로 double 타입으로 인식합니다
		// float 타입으로 값을 저장하기 위해서는 float 형 변수를 선언하고 float 형 테이터를 저장합니다
		// float 변수에 double 형 데이터 입력 -> 에러
		// float f1 = 1.123; // 에러
		float f2 = 1.123f; // f or F 를 넣어줘야됨 
		float f3 = (float)1.123;
		
		// 용량이 큰 자료형에 작은 자료형 데이터 대입
		double f4 = f1;
		// 출력형식은 double 과 같은 형식이 사용됩니다.
		System.out.printf("%.1f\t%.1f\n", f2, f4);
		
		// 정수들의 값의 대입
		int a = 100;
		byte b1 = (byte)a;
		byte b2 = 123; //기본형이 int 라서 실수형처럼 (byte)123 이 필요할듯하지만, 정수 데이터에 한해서 생략하고 사용이 가능하빈다
		a = b2; // 용량이 작은 자료형을 큰 자료형에 대입은 정상실행
		
		// 용량이 큰 변수값을 용량이 작은 변수값으로 넣으려고 하면 캐스팅 연산필요
		// 반대의 경우는 문제없이 모든 실행이 가능합니다.
		
		
		
		
		
	}

}
