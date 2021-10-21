package days03;

import java.util.Scanner;

public class Varialbe07 {

	public static void main(String[] args) {
		// (입력) 사과 갯수 입력, 한 상자에 담길 사과의 갯수 입력
		// (출력) 입력 조건으로 포장했을 때, 포장된 박스갯수, 남은 사과 갯수 출력 몇 박스가 포장이 되고 몇 개의 사과가 남는가
		//
		
		Scanner sc = new Scanner(System.in);
		
		int apple;
		
		System.out.print("사과의 갯수를 입력하세요 : ");
		apple = sc.nextInt();
		
		int boxOneQuantity;
		System.out.print("한 상자에 포장될 사과의 갯수를 입력하세요: ");
		boxOneQuantity = sc.nextInt();
		
		// 계산
		// 정수의 나눗셈은 소수점이 나오지 않고 몫만 나옴
		int boxQuantity = apple / boxOneQuantity;
		int theRest = apple % boxOneQuantity;
		// 출력
		System.out.println("포장된 사과박스 : " + boxQuantity);
		System.out.println("남은 사과 갯수 : " + theRest);

	}

}
