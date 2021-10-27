package days08;

import java.util.Random;

public class ControllOpWhile05 {

	public static void main(String[] args) {
		/**/
		// 
		//랜덤에 관련 잠깐
		// 무엇이 될지 모르는 난수 
		// 랜덤한 숫자(난수)를 얻기 위해서는 랜덤한 숫자를 발행해주는 도구가 필요합니다.
		
		Random rd = new Random(); // 랜덤 import 해줘야됨
		
		// Scanner 의 sc 를 이용하여 외부에서 자료를 입력받듯이
		// Random 의 rd를 이용해서 난수를 제공받습니다
		int num = rd.nextInt();
		System.out.println(num); 
		//-1964330892
		// 313348355
		
		// 음수 양수 관계없이 나옴
		// 양수만을 원한다면
		if(num < 0) num = num * -1;
		System.out.println(num); 
//		-560872900
//		560872900
		
		// num 에 있는 수를 한자리만 출력하려면 10으로 나눈 나머지
		num = num % 10;
		System.out.println(num); 
//		-439829408
//		439829408
//		8 끝자리만 남음
		
		int i = 0;
		while(i < 10) {
			num = rd.nextInt();
			if(num < 0) num = num * -1;
			num = num % 10;
			System.out.printf("%d \n", num);
			i++;
		}
		// 10번 랜덤한 한자리 숫자 출력
		//2 
		//9 
		//3 
		//2 
		//1 
		//7 
		//5 
		//5 
		//8 
		//4 
		
		
		
		
		
		
		
		
	}

}
