package days16;

class Human{
	private String name;
	private int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		String info = "name = " + this.name + ", ";
		info += "age = " + this.age;
		return info; // "name = 홍길동, age = 26"
	}
	//-------------------------------------------
	// equals 를 오버라이딩해주세요 시험에 나옴
	//-------------------------------------------

	// Object 는 모든 클래스의 부모클래스
	// 어떤 클래스의 객체도 됨
	// s1.equals(s2)		this <- s1 obj <- s2
	public boolean equals( Object obj ) {
		//boolean result = true;
		//this.name 과 obj.name의 비교, this.age 와 obj.age의 비교를 해야하는데
		//obj는 부모클래스의 참조변수이므로 자식클래스(Human)의 멤버변수인 name과 age에는 access 할 수가 없습니다
		// 따라서 아래와 같이 형변환이 필요
		
		//전달된 obj 가 현재로선 어떤 인스턴스를 갖고있는지 모르기 때문에 instanceof 를 이용해서 형변환이 가능한지 보고 변환합니다
		// 이상한 클래스가 왔다면 그냥 바로 return false(메소드 종료)
		//강제캐스팅 여부 확인
		if( !(obj instanceof Human) ) return false;
		Human target = (Human)obj;
		
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age == target.age;
		boolean result = flag_name && flag_age;
		
		return result;
	}
}

public class Extends09_Object04 {

	public static void main(String[] argrs) {
		/**/
		//
		Human s1 = new Human("홍길동", 21);
		Human s2 = new Human("홍길동", 21);
		Human s3 = new Human("홍길남", 25);
		System.out.println("Human1 의 정보 : " + s1);
		System.out.println("Human2 의 정보 : " + s2);
		System.out.println("Human3 의 정보 : " + s3);
		
//		Human1 의 정보 : name = 홍길동, age = 21
//		Human2 의 정보 : name = 홍길서, age = 23
//		Human3 의 정보 : name = 홍길남, age = 25
		
		// 레퍼런스변수들간의 비교
		if( s1 == s2 ) System.out.println("s1 변수와 s2 변수는 같습니다 ( s1 == s2 ) ");		
		else System.out.println("s1 변수와 s2 변수는 다릅니다 ( s1 == s2 ) ");
		//s1 변수와 s2 변수는 다릅니다 ( s1 == s2 ) 
		
		// .equals 메소드를 사용하여 비교 (equals 메소드 오버라이딩 이전)
		if( s1.equals(s2) ) System.out.println("s1 변수와 s2 변수는 같습니다 ( s1.equals(s2) ) ");		
		else System.out.println("s1 변수와 s2 변수는 다릅니다 ( s1.equals(s2) ) ");
		//s1 변수와 s2 변수는 다릅니다 ( s1.equals(s2) ) 
		// Object 클래스의 equals 메소드는 기본적으로 두 객체의 레퍼런스 값을 비교하는 연산만을 수행합니다
		
		if( s1.equals(s3) ) System.out.println("s1 변수와 s3 변수는 같습니다 ( s1.equals(s3) ) ");		
		else System.out.println("s1 변수와 s3 변수는 다릅니다 ( s1.equals(s3) ) ");
		//s1 변수와 s3 변수는 다릅니다 ( s1.equals(s3) ) 
		
	}

}

