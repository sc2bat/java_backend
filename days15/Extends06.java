package days15;

//
class SuperD{
	public SuperD() { // 전달인수가 없는 디폴트 생성자
		this(1);
		System.out.println("SuperD()");
	}
	public SuperD(int arg) { // 정수값을 매개변수로 갖는 생성자
		this(1.1);
		System.out.println("SuperD(int)");
	}
	public SuperD(double arg) { // 실수값을 매개변수로 갖는 생성자
		this("");
		System.out.println("SuperD(double)");
	}
	public SuperD(String arg) { // 문자열 자료를 매개변수로 갖는 생성자
		System.out.println("SuperD(String)");
	}
}

class SubD extends SuperD{
	public SubD() { 
		this(1);
		System.out.println("SubD()");
	}
	public SubD(int arg) { 
		this(1.1);
		System.out.println("SubD(int)");
	}
	public SubD(double arg) {
		this("");
		System.out.println("SubD(double)");
	}
	public SubD(String arg) {
		// super(); 가 생략되어있음
		System.out.println("SubD(String)");
	}
}


public class Extends06 {

	public static void main(String[] argrs) {
		//실행순서는 어떻게 되는가
		/**/ //시험에 꼭 나옴
		// 다음을 보고 실행순서를 맞추기
		SuperD k = new SuperD();
		// 디폴트 생성자를 호출
//		SuperD(String)
//		SuperD(double)
//		SuperD(int)
//		SuperD()
		System.out.println();
		
		SubD j = new SubD();
//		SuperD(String)
//		SuperD(double)
//		SuperD(int)
//		SuperD()
//		SubD(String)
//		SubD(double)
//		SubD(int)
//		SubD()
		System.out.println();
	}

}
