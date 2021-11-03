package days13;

class Dog{
	//대부분의 멤버변수에는 private가 붙기에 
	private String name;
	private int age;
	private String phone;
	// 멤버메소드의 생성 주된 목적 : 멤버 변수에 값을 대입하고 연산하고 출력하기 위해
	// 목적대로 한다면 d1.name = "댕댕이"; 연산이 가능하므로, 메소드가 필요없어도됨
	// 다만 멤버변수에 private 가 붙어있다면 d1.name = "댕댕이"; 가 불가능
	// public 형태의 멤버 메소드를 생성하여 사용합니다
	// 그 중에서도 이클립스에서 자동으로 생성되는 메소드 (getter/ setter)를 자주 사용
	// 현위치 우클릭 Source -> Generate Getters and Setters 선택
	//selectAll 클릭 -> Generate 클릭
	//alt shift s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

public class Class004 {

	public static void main(String[] argrs) {
		/**/
		//
		Dog d1 = new Dog();
		// private 이 붙으면 에러가 남
		//d1.name = "댕댕이";
		d1.setName("댕댕이");
		d1.setAge(6);
		d1.setPhone("010-5555-8888");
		
		System.out.println("이름 : " + d1.getName()+" 나이 : "+d1.getAge()+" 전화번호 : "+d1.getPhone());
		//이름 : 댕댕이 나이 : 6 전화번호 : 010-5555-8888
		
		
	}

}
