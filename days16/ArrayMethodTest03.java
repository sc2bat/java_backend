package days16;

public class ArrayMethodTest03 {

public static void main(String[] argrs) {
		
		int[][] a = new int[9][5];
		input(a);
		prn(a);

	}
	
	private static void input(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				//a[i][j] = new int[i][j];
				}
			}
		}
		
	
	public static void prn(int[][] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if( i < 5) a[i][j] = cnt++;
				else a[i][j] = cnt--; 
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				System.out.printf("%d \t", a[i][j]);
			System.out.println();
		}
	}
	
//	0 	1 	2 	3 	4 	
//	5 	6 	7 	8 	9 	
//	10 	11 	12 	13 	14 	
//	15 	16 	17 	18 	19 	
//	20 	21 	22 	23 	24 	
//	25 	24 	23 	22 	21 	
//	20 	19 	18 	17 	16 	
//	15 	14 	13 	12 	11 	
//	10 	9 	8 	7 	6


}
