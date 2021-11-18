package days23;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] argrs) {
		/**/
		//
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		Calendar c = Calendar.getInstance();
		Date now = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		String fileName = sdf.format(now) + ".dat";
		
		File file = new File(dir, fileName);
	}

}
