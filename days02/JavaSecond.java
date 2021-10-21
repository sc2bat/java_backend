package days02;
// 클래스 이름은 영문과 숫자가 조합되어서 만들어질수도 있습니다.
// 반드시 첫글자가 영문이어야 합니다
// 이름 중간에 공백 또는 특수기호가 들어갈 수 없습니다.
// 사용가능한 특수기호가 있다면 언더바(_) 정도만 사용합니다
public class JavaSecond {

	public static void main(String[] args) {
//		파일에 저장된 클래스는 여러개일 수 있고 그들 중 하나는 반드시 public을 붙이고 있어야함
		System.out.printf("겁나 쉬운 자바 프로그래밍~!\n");
		System.out.printf("1\t겁나 쉬운 자바 프로그래밍~!\n");
		System.out.printf("12\t겁나 쉬운 자바 프로그래밍~!\n");
		System.out.printf("123\t겁나 쉬운 자바 프로그래밍~!\n");
		System.out.printf("1234567890\t겁나 쉬운 자바 프로그래밍~!\n");
//		\t 사용하면 항목을 나누기 편리함
//		System.out.printf("번호국어영어수학총점평균\n");
		System.out.printf("\n"); 
		System.out.printf("--------------------------------\n");
		System.out.printf("번호 \t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("--------------------------------\n");
		System.out.printf("1\t89\t87\t56\t254\t81.5\n");
		System.out.printf("2\t89\t87\t56\t254\t81.5\n");
		System.out.printf("3\t89\t87\t56\t254\t81.5\n");
		System.out.printf("--------------------------------\n");
		
//		System.out.printf("겁나 쉬운 자바 프로그래밍~!\n");
//		System.out.printf("겁나 쉬운 자바 프로그래밍~!\n");
		/*
		\t: Tab 을 누른 것처럼 일정간격을 띄움 보통 8칸
		\' : 작은 따옴표 출력
		\" : 큰 따옴표 출력
		%% : % 출력
		\\ : 백슬래쉬 출력
		\b : 백스페이스 - 커서 왼쪽으로 이동하면서 앞글자를 한글자씩 삭제
		 			 - 다만 이클립스 콘솔창에서는 정상작동하지 않습니다. */
		System.out.printf("\n"); // 한 줄 다음으로
		System.out.printf("겁나 쉬운 \"자바\" 프로그래밍~!\n");
//		큰따옴표를 화면에 직접 출력하면 \"라고 써야 큰따옴표만 출력됨
//		\없이 "만 사용한다면 끝나는 따옴표로 인식되어 오류를 발생시킵니다.
		System.out.printf("겁나 쉬운 \'자바\' 프로그래밍~!\n");
		System.out.printf("겁나 쉬운 '자바' 프로그래밍~!\n");
		System.out.printf("대통령은 조약을 \"체결-비준\"하고,\n");
		System.out.printf("외교사절을 \"신임-접수\" 또는 \"파견\"하며,\n");
		System.out.printf("\'선전포고\'와 \'강화\'를 한다.\n\n");
		System.out.printf("대통령의 임기가 만료되는 때에는 \n");	
		System.out.printf("임기만료 70%% 내지 40%% 전에 후임자를 선거한다\n\n");	
		
		

	}

}
