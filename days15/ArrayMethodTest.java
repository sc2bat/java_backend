package days15;

public class ArrayMethodTest {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		int[][] a = new int[9][];
		// 그림과 같이 배열을 구성하고 값을 대입
		input(a);
		// 그림과 같이 출력
		prn(a);
	}
	
	private static void input(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int k = 1;
			int[][] b = new int[9][k];
			if(k < 5) {
				for (int j = 0; j < k; j++) {
				b[i][j] = 0;
				k++;
				if (k == 5) break;
				}
			}
			if(k == 5) {
				--k;
				for (int j = 5; j < k; j++) {
				b[i][j] = 0;
				if (k == 1) break;
				}
			}
			} return ;
		}
	
	public static void prn(int[][] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int[] k : a) {
				++cnt;
				System.out.printf("%d ", cnt);
			}
			System.out.println();
		}
	}

}
