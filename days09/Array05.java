package days09;

public class Array05 {

	public static void main(String[] argrs) {
		/**/
		// 배열에 있는 값들 중 최대값과 최소값을 찾아서 출력하세요
		//
		int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		
		//int max = 0; // 지금까지 나왔던 숫자 중 가장 큰 값을 저장해둘 변수
		// 0으로 값을 지정해두면 배열 내에 음수 값들과 비교하면 안되기에
		// int max = -999999999; // 웬만한 숫자보다 작은 숫자로 지정 or ㄹㅇ 최소값 -21억 하지만 약간의 숫자보다 작은수가 존재할 수도 있음
		int max = a[0]; // 으로 첫 배열부터 하나하나 비교하기  
		for(int i = 0; i < a.length; i++) {
			if (max < a[i]) 
				max = a[i];
		}
		System.out.println("최대값 : " + max); // 최대값 : 98
		
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(min > a[i])
				min = a[i];
		}
		System.out.println("최소값 : " + min); // 최소값 : 13
		
		// 확장시켜 배열의 값들을 오름차순 내림차순으로 재배치 (정렬)
		// 이중 반복문이 사용됩니다
		// 첫번째 반복문의 첨자 i
		// 두번째 반복문의 첨자 j 
		// i = 0 일때 j 는 1~9 로 반복시켜서 a[i] 와 a[j] 둘을 비교하고 
		// a[j] 값이 더 작으면 a[i]와 a[j] 의 값을 오름 차순에 맞게 맞바꿉니다
		// 그 동작을 j가 끝까지 갈때까지 반복하면 a[i]에는 배열중 가장 작은 값이 저장되게 됩니다.
		
		// 맞바꾸기
		int x = 20, y = 30;
		//x = y; // y의 값이 이미 x에 담겼기에
		//y = x; // 불가
		// 임시변수를 하나 생성
		int temp;
		temp = x; //임시 복사본
		x = y; 
		y = temp;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[i]) {
					// a[i]와 a[j]의 값을 바꿉니다
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					}
				}
			}
		for(int i = 0; i < a.length; i++)System.out.printf("%d ", a[i]);
		// 13 36 45 56 69 87 87 89 96 98 
		System.out.println();
		
		// 반대로 내림차순
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				// 부등호만 바꿔주면됨
				if(a[j] > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					}
				}
			}
		for(int i = 0; i < a.length; i++)System.out.printf("%d ", a[i]);
		System.out.println();
		// 98 96 89 87 87 69 56 45 36 13 

		

	}

}
