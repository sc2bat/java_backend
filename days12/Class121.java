package days12;

//int 형 데이터 하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 갖는 클래스 제작
//멤버필드로는 int dan; 하나 생성
//멤버 메소드 : dan 값이 0이면 2~9단의 구구단 모두 출력, 0이 아니면 해당 구구단만 출력하는 메소드 제작: print()
//디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 있는 생성자는 dan 변수를 전달인수 값으로 저장
//클래스 이름 Gugudan

class Gugudan1{
	int dan;
	Gugudan1(){
		dan = 0;
	}
	Gugudan1(int d){
		dan = d;
	}
	public void print1() {
		if(dan == 0) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j < 9; j++) {
					System.out.printf("%d x %d = %d ", j, i, j * i);
				}
				System.out.println();
			}
		}else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d ", dan, i, dan * i);
			}
		}
	}
}


public class Class121 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		Gugudan1 g1 = new Gugudan1(8);
		Gugudan1 g2 = new Gugudan1();
		g1.print1();
		g2.print1();

	}

}
