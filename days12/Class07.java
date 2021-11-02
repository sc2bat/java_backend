package days12;

// 멤버메소드의 주된 목적은 멤버변수의 값을 대입 저장 세팅하거나 얻어오거나....
// 그 둘의 목적이 비교적 큽니다
// 때문에 특정멤버메소드(저장하고 얻어오는 메소드)를 별도의 사유가 없어도 멤버변수에 따라 필요한만큼 만들고 시작하는 경우가 많습니다
// 메소드의 이름은 setter와 getter 라는 이름을 사용하는 두 개의 메소드입니다

class GetSetTest{
	private int intVar;
	private double doubleVar;
	private String stringVar;
	
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	
	// 멤버 변수가 하나 만들어지면, 그 변수에 전달값을 저장할 수 있는 메소드와 값을 얻어낼 수 있는 메소드를 생성합니다
	// 멤버 변수의 값을 저장하는 메소드 이름 : setIntVar
//	public void setIntVar(int n) {
//		intVar = n;
//	}
	// 멤버 변수의 값을 리턴해주는 메소드 이름 : getIntVar
//	public int getIntVar() {
//		return intVar;
//	}
//	public void setDoubleVar(double d) {
//		doubleVar = d;
//	}
//	public Double getDoubleVar() {
//		return doubleVar;
//	}
//	public void setStringVar(String s) {
//		stringVar = s;
//	}
//	public String getStringVar() {
//		return stringVar;
//	}
	// 빈 공간에서 우클릭 Source alt shift s
	// Generate Getters and Setters 각각 체크박스에 체크하여 혹은 select all -> Generate 클릭
	
	
}

public class Class07 {

	public static void main(String[] argrs) {
		/**/
		//
		GetSetTest gs = new GetSetTest();
		gs.setIntVar(123);
		System.out.println("멤버변수 intVar 의 값은 "+ gs.getIntVar() );

	}

}
