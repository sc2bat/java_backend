package days07;

public class ControllOpFor14 {

	public static void main(String[] args) {
		/**/
		// 이중반복문을 이요해서 
		// 구구단 2단부터 9단까지 출력하세요
		// 한개의 단이 출력되는 방향은 세로이든 가로이든 상관없음
		int i, j;
		for(i = 2; i <=9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t\t", i, j, i*j);
			}
			System.out.println();
		}
		//-------------------------------------------------------
		/* 가로로
		for(i = 1; i <=10; i++) {
			for(j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %2d ", i, j, i*j);
			}
			System.out.println();
		}*/
		
		//세로로
		for(i = 1; i <=9; i++) {
			for(j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %2d ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		// 2단~ 6단~ 분리
		for(i = 1; i <=9; i++) {
			for(j = 2; j <= 5; j++) {
				System.out.printf("%d x %d = %2d ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(i = 1; i <=9; i++) {
			for(j = 6; j <= 9; j++) {
				System.out.printf("%d x %d = %2d ", j, i, i*j);
			}
			System.out.println();
		}
		
		
		
		
	}

}
