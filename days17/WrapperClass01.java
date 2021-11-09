package days17;

public class WrapperClass01 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// 참조변수( 레퍼런스 변수)들의 비교
		if (i1 == i2 )System.out.println("i1 과 i2 값이 같습니다.");
		else System.out.println("i1 과 i2 값이 다릅니다.");
		System.out.println("i1==i2 " + (i1 == i2));
//		i1 과 i2 값이 다릅니다.
//		i1==i2 false
		
		//실제 인스턴스에 저장된 값들의 비교
		if (i1.equals(i2)) System.out.println("i1 과 i2 값이 같습니다.(equals)");
		else System.out.println("i1 과 i2 값이 다릅니다.(equals)");
		System.out.println("i1.equals(i2)= " + i1.equals(i2));
//		i1 과 i2 값이 같습니다.(equals)
//		i1.equals(i2)= true
		
		System.out.println("i1.compareTo(i2)= " + i1.compareTo(i2));
//		i1.compareTo(i2)= 0
		// 실제 인스턴스에 저장된 값들의 비교 - 뺄셈연산으로 비교 앞에 숫자가 크면 양수
		// 뒤에 숫자가 크면 음수반환 같으면 0반환
		
		//Object 부모 클래스의 메소드 오버라이딩
		System.out.println("i1.toString()= " + i1.toString());
		System.out.println("i2 = " + i2);
//		i1.toString()= 100
//		i2 = 100
		//toString() 의 리턴값은 String 입니다
		
		//표현가능한 가장 큰값(스태틱 변수)
		System.out.println("MAX_VALUE= " + Integer.MAX_VALUE);
		//표현가능한 가장 작은 값(스태틱 변수)
		System.out.println("MIN_VALUE= " + Integer.MIN_VALUE);
//		MAX_VALUE= 2147483647
//		MIN_VALUE= -2147483648
		
		// 비트 바이트로 표현한 저장 크기
		System.out.println("SIZE= " + Integer.SIZE+ " bits"); // SIZE= 32 bits
		System.out.println("BYTES= " + Integer.BYTES+ " bytes"); // BYTES= 4 bytes
		//자료형
		System.out.println("TYPE= " + Integer.TYPE); // TYPE= int
		
		int i = 10;
		Integer inti = (Integer)i; // Integer inti = Integer.valueOf(i);
		
		int i3 =  inti + 10;
		System.out.println(i3); // 20
		
		Integer inti2 = new Integer(20);
		System.out.println("inti2 = " + inti2); // inti2 = 20
		int i4 = (int)inti2; //참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		System.out.println("i4 = " + i4); // i4 = 20
		
		Integer inti3 = inti2 + i3;
		System.out.println("inti2 + i3 = " + inti3); // inti2 + i3 = 40

	}

}
