package days04;

public class Operator02 {

	public static void main(String[] args) {
		int n = 50;
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		n = n + 10; // n 변수에 10을 누적
		// 1. 현재 n 값(50) 과 두번째 피연산자인 10이 cpu로 전달되어 덧셈됩니다
		// 2. 연산결과가 돌아와서 다시 n 변수에 저장됩니다
		// 연산에 참여했던 n 값 50은 사라지고, 연산의 결과인 60이 n 변수에 남습니다
		// 간략하게 다음과 같이도 사용합니다 n += 10;
		
		System.out.println("n = n + 10 -> n : " + n); // n = n + 10 -> n : 60
		n = n - 10; // n -= 10;
		System.out.println("n = n - 10 -> n : " + n); //n = n - 10 -> n : 50
		n = n * 10; // n *= 10;
		System.out.println("n = n * 10 -> n : " + n); // n = n * 10 -> n : 500
		double d = 50.0;
		System.out.println("d의 최초값 : " + d); // d의 최초값 : 50.0
		d = d / 10.0; // d /= 10;
		System.out.println("d = d + 10 -> d : " + d); // d = d + 10 -> d : 5.0
		n = n % 10; // n %= 10;
		System.out.println("n = n % 10 -> n : " + n); // n = n % 10 -> n : 0
		
		// n = n + 1; n = n - 1;
		// 1씩 증가 또는 감소하는 증가/감소 연산자 ++, --
		// 특정 변수의 값을 1 증가하거나, 감소시킬 수 있는 연산자
		// 대입연산자(=)를 사용하지 않고 값을 변경합니다
		n = 50;
		n++; // n += 1; n = n + 1;
		System.out.println("n++ -> n : " + n); // n++ -> n : 51
		++n;
		System.out.println("++n -> n : " + n); // ++n -> n : 52
		// 위와 같은 단항연산일때는 ++나 --를 앞 또는 뒤에 어느 곳에 붙여도 똑같이 연산됩니다
				
		// ----------------------------------test-----------------
		// ++, -- 연산기호가 앞 또는 뒤에 있을 때 차이가 나는 경우는 다른연산과 섞여있을 때 입니다
		n = 10;
		System.out.println("현재 n값: " + n);
		// ++, -- 연산이 뒤 쪽에 있는 경우 : 현재값으로 속해 있는 연산에 참여 후, 1 증가
		int k = n++;
		System.out.println("k : " + k); // 10 출력
		System.out.println("n : " + n); // 11 출력
		
		n = 10;
		System.out.println("현재 n값: " + n);
		// ++, -- 연산이 뒤 쪽에 있는 경우 : 현재값으로 속해 있는 연산에 참여 후, 1 증가
		k = ++n;
		System.out.println("k : " + k); // 11 출력
		System.out.println("n : " + n); // 11 출력
		
		
	}

}
