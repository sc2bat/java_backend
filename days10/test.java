package days10;

public class test {

	public static void main(String[] argrs) {
		/**/
		//
		// 행과 열
		int [] a = new int [4];
		int [] b = new int [4];
		int i = 0, j = 0;
		while (i ==  a.length && j ==  b.length) {
			for(i = 0; i < a.length; i++) {
				a[i] = 1 + i;
				if(i == a.length) {
					j++;
					System.out.printf("a[%d][%d] \ta[%d][%d] \ta[%d][%d] \ta[%d][%d]", b[j], a[i], b[j], a[i], b[j], a[i], b[j], a[i]);
				}
				//if(i ==  a.length && j ==  b.length)break;
			}
		}
		
//		for(int i = 0; i < a.length; i++) {
//			a[i] = i + 1;// Index 4 out of bounds for length 4 i <= a.length 하면 1개가 더 추가되어 배열 값에 넘쳐나 나는 오류
//		}
//		for(int i = 0; i < a.length; i++) System.out.printf("%d ", a[i]);
		
		

	}

}
