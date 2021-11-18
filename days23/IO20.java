package days23;

import java.io.*;
import java.util.*;

public class IO20 {

	public static void main(String[] argrs) throws FileNotFoundException, IOException, ClassNotFoundException {
		/**/
		//
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "2021_11_17_14_10.dat");
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(file)));
		ArrayList<CalculatorResult> list = 
				(ArrayList<CalculatorResult>)ois.readObject();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d. %s\n", i+1, list.get(i));
		}
		
		ois.close();
		
		// 어떻게 해도 3개만 나옴
//		1. 41+54=95.00
//		2. 12+74=86.00
//		3. 15/5=3.00

		
	}

}
