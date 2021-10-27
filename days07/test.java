package days07;

public class test {

	public static void main(String[] args) {
		/**/
		// 
		//
		
		
		for(int i = 1; i <= 100; i++) {
			for (int j =1; i % j >= 0; j++) {
				if (i % j == 0)System.out.printf("%d", j);continue;
			}
		}
				

	}

}
