package days16;

public class ArrayMethodTest04 {

	public static void main(String[] argrs) {
			
			int[][] a = new int[9][];
			input(a);
			prn(a);
	
		}
		
		public static void input(int[][] a) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++); 
				}
			}
			
		
		public static void prn(int[][] a) {
			int cnt = 1;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < 4; j++) {
					if( i <= 5) a[i][j] = cnt++;
					else a[i][j] = cnt--; 
				}
			}
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++)
					System.out.printf("%d \t", a[i][j]);
				System.out.println();
			}
		}

}
