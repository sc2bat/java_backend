package days23;

import java.io.*;

public class IO16 {

	public static void main(String[] argrs) throws IOException, ClassNotFoundException {
		/**/
		//
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "MyClass.dat");
		
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(file)));
			
		MyClass obj = (MyClass)ois.readObject();
		System.out.println(obj.name);
		ois.close();
	}

}
