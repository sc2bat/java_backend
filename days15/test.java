package days15;

public class test {

	public static void main(String[] argrs) {
		/**/
		//
		int sum = cals("sum", 32, 23);
		System.out.println();
		int ave = cals("avg", 33, 42);

	}
	public static int cals(String op, int... a){
		int total = 0;
		double avg = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
			avg = (double)total / a.length;
		}
		if(op.equals("sum")) {
			System.out.println("sum : " + total);
			return total;
		}
		
		else {
			System.out.println("ave : " + avg);
			return (int)avg;
		}
		
	}

}
