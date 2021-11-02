package days12;

// int 형 데이터 하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 갖는 클래스 제작
// 멤버필드로는 int dan; 하나 생성
// 멤버 메소드 : dan 값이 0이면 2~9단의 구구단 모두 출력, 0이 아니면 해당 구구단만 출력하는 메소드 제작: print()
// 디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 있는 생성자는 dan 변수를 전달인수 값으로 저장
// 클래스 이름 Gugudan

class Gugudan {
	public Gugudan() {
	}
	public Gugudan(int d) {
		dan = d;
	}
	public void print() {
		if(dan == 0) {
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					System.out.printf("%d x %d = %d", i, j, i*j);
				}
				System.out.println();
			}
		}else {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d x %d = %d", dan, i, dan*i);
			}
		}
	}
}

public class Class12 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		Gugudan();
		print();

	}

}
