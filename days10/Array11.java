package days10;

public class Array11 {

	public static void main(String[] argrs) {
		/**/
		//Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		//
		// 2차원 배열
		// 행과 열의 개념을 사용하는 인덱스가 2개인 배열
		// 2차원 배열의 변수 선언 - 행과 열을 의미하는 [] 가 두개 사용됨
		int [][] arr;
		
		// 2차원 배열의 공간생성
		// 변수명 = new 자료형[행의 수][열의 수]
		// 3행 2열의 2차원 배열 생성
		// (2개의 요소를 가지는 일차원 배열을 3개 생성 - 3행 2열의 배열)
		arr = new int [3][2];
		// int [][] arr = new int[3][2]; 이와 같이 한번에 작성도 가능합니다
		// 1차원 배열과 마찬가지로 2차원도 HEAP 메모리에 생성되므로 초기화 값은 0입니다.
		
		// 5행 아래로 5줄 2열 우측으로 2줄
		// a[0] 123
		// a[1] 456
		// a[2] 789
		
		int [] a1 = {1, 2, 3, 4, 5};
		for(int k : a1) {
			System.out.print(k + " "); // 1 2 3 4 5 
		}
		
		System.out.println();
		System.out.println();
		//for 문과 배열의 이름을 이용한 배열의 접근
		// 위와 같이 for 명령 안에 배열의 요소 중 하나를 저장할 수 있는 변수를 선언하고 
		// 콜론(:) 과 함께 1차원 배열의 이름을 쓰면 배열의 요소하나를 변수에 넣고 반복실행 1회가 배열의 요소 갯수만큼 실행됩니다.
		
		System.out.println();
		int [][] b = { {1,2}, {3,4}, {5,6} }; 
		//int [][] b = new int[3][2];
		for(int k : b[1]) {
			System.out.print(k + " " ); // 3 4 
		}
		
		System.out.println();
		System.out.println();
		// 웹프로그래밍하면서 2차배열 나타날 경우가 없지만 알아는 놔야함
		
		// 위 두개의 배열 선언은 각 구성요소 값들은 다르지만 행열의 갯수는 같습니다
		// 이차원배열의 구조
//		b[0] : {1, 2}	 b[1] : {3, 4} b[2] : {5, 6}
//		b[0][0] : 1		b[0][1] : 2
//		b[1][0] : 3		b[1][1] : 4
//		b[2][0] : 5		b[2][1] : 6
		
		for(int k : b[1]) {
			System.out.print(k + " "); //3 4 
		}
		
		System.out.println();
		System.out.println();
		
		// 2차원 배열의 요소 접근 - 2개의 인덱스를 사용
		// 변수명[행의 인덱스 - 0부터 시작] [ 열의 인덱스 - 0부터시작] = 값;
		// arr 2차원 배열의 3번째 행의 두번째 요소에 10을 입력
		arr[2][1] = 10;
		// 세번째 행의 두번째 값 출력
		System.out.println(arr[2][1]); //10
		System.out.println();
		System.out.println();
		
		// 2차원의 배열의 배열을 생성하면서 초기화하는 방법
		// 초기화 값을 설정하는 방법
		// { {1번째 행의 초기화 값}, {2번째 행의 초기화 값} ... }
		// 2행 3열의 2차원 배열을 생성하면서
		// 1번째 행의 요소 값을 1, 2, 3 으로 2번째 행의 요소 값을 4, 5, 6 으로 지정
		int [][] arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
		// 2행 3열 2차원 배열
		System.out.println(arr3[0][2]); // 3
		System.out.println(arr3[1][1]); // 5
		int [][] arr4 = {{1, 2}, {4, 5}, {7, 8}}; // 3행 2열 2차원 배열
		System.out.println(arr4[0][1]); // 2
		System.out.println(arr4[1][1]); // 5
		
		// 2차원 배열 생성 후 2중 반복 실행문에 의한 값저장 & 출력
		int [][] a = new int[5][5];
		
		int k = 1;
		//for(int i = 0; i <= 4; i++) {
		for(int i = 0; i < a.length; i++) {
			//for(int j = 0; j <= 4; j++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = k++;
				// a[i][j] = 100;
			}
		}
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				System.out.printf("%d\t\t", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
//		1		2		3		4		5		
//		6		7		8		9		10		
//		11		12		13		14		15		
//		16		17		18		19		20		
//		21		22		23		24		25		
		
		int [] a2 = {1, 2, 3, 4, 5};
		for(int k3 : a2) {
			System.out.print(k3 + " ");
		}
		// a = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}...
		// a[0] : {1, 2, 3, 4, 5}, a[1] : {6, 7, 8, 9, 10}
		System.out.println();
		
		
		
		// a 도 주소가 있기에 변수도 주소를 저장하는 참조변수
		for(int [] k1 : a) { // 주소가 저장될 변수가 앞에 옵니다.
			for(int k2 : k1) { // k1 [1]: {1, 2, 3, 4, 5} k1 [2]: {6, 7, 8, 9, 10}
				System.out.printf("%d\t\t", k2);
			}
			System.out.println();
		}
		
//		1		2		3		4		5		
//		6		7		8		9		10		
//		11		12		13		14		15		
//		16		17		18		19		20		
//		21		22		23		24		25		

		
		
		
		
		
		

	}

}
