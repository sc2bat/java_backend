package days16;

public class ArrayMethodTest07 {

	public static void main(String[] argrs) {
		/**/

		int[][] a = new int[9][];
		// 그림과 같이 배열을 구성하고 값을 대입
		input(a);
		//ArrayMethodTest07.input(a); 로 써야하지만 같은 클래스 내에 있기에 생략해도됨 
		// 그림과 같이 출력
		prn(a);
		
//		1	
//		2	3	
//		4	5	6	
//		7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	
//		20	21	22	
//		23	24	
//		25	

	}
	
	public static void prn(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void input(int[][] a) {
		//배열생성
		for (int i = 0; i <= 4; i++) {
			a[i] = new int[i+1]; // 각행마다 +1
		}
		for (int i = 5; i <= 8; i++) {
			a[i] = new int[9-i];
		}
		//만들어진 배열에 값부여
		int k = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = k++;
			}
		}
	}

}
