package days13;

class Complex{
	// 복소수 5 + 3i -> i : 루트-1(허수)
	int real;
	int image;
	private Complex temp;
	
//	public void init(int i, int j) {		
//		this.real = i;
//		this.image = j;
//		return;
//	}
//	
//	public void prn() {
//		System.out.printf("%d + %di \n", real, image);
//	}
	
	public void init(int real, int image) {
		this.real = real;
		this.image = image;
	}
	void prn() {
		System.out.printf("%d + %di \n", real, image);
	}

	//c3 = c1.add(c2);
	// this <- c1 // a <-c2
	Complex add( Complex a ) {
		Complex result = new Complex();
		result.real = this.real + a.real;
		result.image = this.image + a.image;
		return result;
	}
//	c3 = c1.subtract(c2);
	Complex subtract( Complex a ) {
		Complex result2 = new Complex();
		result2.real = this.real - a.real;
		result2.image = this.image - a.image;
		return result2;
	}

}


public class Class005 {

	public static void main(String[] argrs) {
		/**/
		Complex c1 = new Complex();
		c1.init(6, 8);
		Complex c2 = new Complex();
		c2.init(8, 9);
		 // x + yi 형태로 출력
		c1.prn(); // 6 + 8i
		c2.prn(); // 
		System.out.println();
		
		Complex c3 = new Complex();
		c3 = c1.add(c2);
		c1.prn(); // 6 + 8i
		c2.prn(); // 8 + 9i
		c3.prn(); // 14 + 17i
		System.out.println();
		
		c2.init(2, 3);
		c3 = c1.subtract(c2);
		c1.prn(); // 6 + 8i
		c2.prn(); // 2 + 3i
		c3.prn(); // 4 + 5i

	}

}
