package days19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception06 {

	public static void main(String[] argrs) {
		/**/
		//
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		System.out.print("날짜를 예와 같이 입력해주세요. (입력예 : 2015-12-31) ");
		//String s = sc.nextLine();
		
		// 잘못입력했는지부터 확인 입력받은 s를 date로
		// 입력양식에 올바르게 입력될때까지 반복
		while(true){
			try {
				String s = sc.nextLine(); // 다시 입력받기
				inDate = sdf.parse(s);
				break; //Exception 이 생기면 catch 로 넘어가고 그렇지 않다면 break 로 멈춤
				} catch (ParseException e) {
				System.out.println("예와 같이 다시입력해주세요 (입력예: YYYY-MM-DD)");
				}
			}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sdf2.format(inDate));
		
//		날짜를 예와 같이 입력해주세요. (입력예 : 2015-12-31) 11111111
//		예와 같이 다시입력해주세요 (입력예: YYYY-MM-DD)
//		1111-11-11
//		1111년11월11일
		
	}

}
