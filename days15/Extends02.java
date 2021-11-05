package days15;

// 상속의 구현
//extends 키워드의 사용
// class SubClass명 (자식 클래스) extends SuperClass명 (부모클래스)
// 상속을 받는 클래스 : 서브클래스, 자식클래스, 하위클래스
// 상속을 제공해주는 클래스 : 슈퍼클래스, 부모클래스, 상위클래스
// 부모클래스 선언
class Car{
	int 엔진;
	// private 를 붙이면 상속을 받을 순 있으나 사용은 안됨
	int 배기량;
	int 도어개수;
}
// 자식 클래스 선언
// 자식 클래스에서는 상속받은 멤버를 사용할 수 있음
class K7 extends Car {
	public void printInfo() {
		System.out.printf("엔진 : %d\n", this.엔진);
		System.out.printf("배기량 : %d\n", this.배기량);
		System.out.printf("도어개수 : %d\n", this.도어개수);
	}
}

public class Extends02 {

	public static void main(String[] argrs) {
		/**/
		//
		K7 k = new K7();
		k.엔진 = 6;
		k.배기량 = 3000;
		k.도어개수 = 5;
		k.printInfo();

	}

}
