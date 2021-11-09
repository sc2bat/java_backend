package days17;

import java.math.BigInteger;

public class WrapperClass02 {

	public static void main(String[] argrs) {
		/**/
		//Integer 은 java.lang.Object 에 있기에 import 별도로 하지않아도됨
		BigInteger fact = BigInteger.ONE; //fact = 0; , fact = 1; 에러
		//System.out.println(fact); // 1
		BigInteger k = BigInteger.ONE;
		//System.out.println(k); // 1
		//k = k.add(fact);
		//System.out.println(k); // 2
		int n = 15;
		for (n = 1; n <= 40; n++) {
			fact = BigInteger.ONE;
			for (k = BigInteger.ONE; k.compareTo( BigInteger.valueOf(n) ) <= 0; k=k.add(BigInteger.ONE)) {
				fact = fact.multiply(k);
			}
			System.out.printf("%d! = %s\n", n, fact.toString() ); // 15! = 1307674368000
		}
	}

}
