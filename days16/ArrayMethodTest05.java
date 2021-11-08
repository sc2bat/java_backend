package days16;

public class ArrayMethodTest05 {

	public static void main(String[] argrs) {
		
		int[][] a = new int[9][];
		input(a);
		prn(a);

	}
	
	private static void input(int[][] a) {
		int[][] a2 = new int[9][4];
		for (int i = 0; i < a2.length; i++) {
			if( i < 4) {
				for (int j = 0; j < a[i].length; j++) {
					a2[i][j] = 0;
				} 
			}else {
				for (int j = 4; j < a[i].length; j--) {
					a2[i][j] = 0;
					}
				}
			}
	}
	
	public static void prn(int[][] a) {
		int cnt = 1;
		for (int i = 0; i < a.length; i++) {
			int j = 0;
			if( j ==0 && j<4 )j++;
			else j--;
			a[i][j] = cnt++;
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				System.out.printf("%d \t", a[i][j]);
			System.out.println();
		}
	}

}
