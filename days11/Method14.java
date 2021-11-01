package days11;

public class Method14 {

	public static void main(String[] argrs) {
		/**/
		//전달인수의 갯수가 일정치 않아서 오버로딩으로는 해결할 수 없을 때
		//
		int c ;
		c = max(50, 60, 80, 60 , 54, 60);
		System.out.println("입력값 중 큰 값은 : " + c + "입니다");
		c = max(50, 60, 80, 60 , 54, 60, 56, 87, 69);
		System.out.println("입력값 중 큰 값은 : " + c + "입니다");

	}
	// 매개변수를 int ...
	// 참조변수 a를 이름으로 한 배열이 생성됩니다.
	public static int max(int... a) {
		// 배열의 크기는 전달되는 전달인수의 갯수로...
		// 전달되는 전달인수들은 배열의 구성요소로 전달됩니다
		// 배열의 첫번째 값을 넣고 두번째값들과 비교
		int max = a[0];
		for(int i = 1; i < a.length; i++)
			if(max < a[i]) max = a[i];
		return max;
	}
//	입력값 중 큰 값은 : 80입니다
//	입력값 중 큰 값은 : 87입니다

}
