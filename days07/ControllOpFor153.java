//package days07;

public class ControllOpFor153 {

	public static void main(String[] args) {
		/**/
		// 
		System.out.println("\n//9--------------------------------------------------------");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i+9; j++) {
				if(j >= 11-i)System.out.printf("#");
				else System.out.printf(" ");
			}
			System.out.println();
		}

		System.out.println("\n//10--------------------------------------------------------");
	}

}
