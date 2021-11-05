package days15;

public class test02 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		
		int[] a = {34, 52};
		int tot = 0;
		double ave;
		tot = sum(a);
		System.out.println("dd " + tot + "dd");
		//ave = average(a);
		System.out.println("dd " + tot + "dd");
		//

	}
	public static int sum(int... a) {
		for (int i = 0; i < a.length; i++) {
			int total =0;
			total += a[i];
		}
	}

}
