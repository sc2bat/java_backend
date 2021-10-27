package days08;

public class ControllOpWhile02 {

	public static void main(String[] args) {
		/**/
		// 
		// 1부터 100 사이의 짝수를 출력 : while 문 이용
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0)System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		int i;
		i = 1;
		while(i <= 100) {
			i++;
			if(i % 2 == 0)System.out.printf("%d ", i);
		}
		
		System.out.println();
		//
		i = 2;
		while(i <= 100) {
			System.out.printf("%d ", i);
			i += 2;
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
