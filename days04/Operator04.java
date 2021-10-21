package days04;

public class Operator04 {

	public static void main(String[] args) {
		// 논리연산자 &&(AND), ||(OR), !(NOT)
		// 다수개의 관계(비교) 연산식 결과를 조합하여 하나의 boolean 값을 결과로 얻는 연산
		int a = 80;
		// 피연산자 : boolean, 연산의 결과 : boolean
		boolean b = true && false;
		boolean b1 = a > 70;
		boolean b2 = a < 100;
		b = b1 && b2;
		
		
		// a 변수의 값이 70보다 크고 100보다 작으면 true, 아니면 false 출력
		b = (70 < a) && (a < 100); // 70 < a < 100 는 불가
		System.out.println("70 < a 이면서 a < 100 : " + b); // 70 < a 이면서 a < 100 : true
		
		a = 30;
		// a 변수의 값이 70보다 크거나 40보다 작으면 true, 아니면 false 출력
		b = (70 < a) || (a < 40);
		System.out.println("70 < a 이거나 a < 40 : " + b); // 70 < a 이거나 a < 40 : true

		// AND 연산자 (&&)
		// 좌항과 우항의 관계(비교)식 결과 또는 boolean 값이 모두 true인 경우 true가 좌항과 우항 중 하나라도 false 경우 false 가 결과값
		// 좌항의 비교연산 결과가 false 인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F && F = %b\n", false && false); //F && F = false
		System.out.printf("T && F = %b\n", true && false);  // T && F = false
		System.out.printf("F && T = %b\n", false && true); // F && T = false
		System.out.printf("T && T = %b\n", true && true); // T && T = true
		
		// OR 연산자 (||)
		// 좌항과 관계식 결과 또는 boolean 값이 하나라도 결과가 true 인 경우 true 가 결과
		// 좌항과 우항 모두 false 경우 false 가 결과
		// 좌항의 결과가 true 인 경우 우항의 식을 비교하지 않습니다
		System.out.printf("F || F = %b\n", false || false); // F || F = false
		System.out.printf("T || F = %b\n", true || false); // T || F = true
		System.out.printf("F || T = %b\n", false || true); // F || T = true
		System.out.printf("T || T = %b\n", true || true); // T || T = true
		
		// NOT 연산자 (!)
		// 단항연산자 (피연산자가 1개임)
		// 관계식의 결과를 반대값으로 결과를 냄 true -> false, false -> true
		System.out.printf("Not-%b = %b\n", false, !false); // Not-false = true
		System.out.printf("Not-%b = %b\n", true, !true); // Not-true = false
		
		// 점수가 80 점 이상이면서 90점 이하라면 true, 아니면 false 출력
		int number = 80; // (이면서, 그리고 , ~이고)
		boolean result = (number >= 80) && (number <= 90);
		// result = 80 <= number <= 90 X 오류
		System.out.printf("result = %b\n", result); // result = true
		
		// 점수가 100 이상이거나 50미만 이면 true, 아니면 false (이거나, 또는)
		number = 150;
		result = (number >= 100) || (number < 50);
		// result = 100 >= number < 50 // 오류
		System.out.printf("result = %b\n", result); // result = true
		
		int kor = 35, eng = 98, mat =95;
		double avg;
		avg = (kor + eng + mat) / 3.0;
		// 평균이 80 이상이면서 영어점수가 75점 이상이면 true 출력, 아니면 false 출력
		result = avg >= 80 && eng >= 70;
		//result = (avg >= 80) && (eng >= 70);
 		System.out.printf("result = %b\n", result); // result = false
		// 국어 : 50 이상, 영어 : 60 이상, 수학 : 70 이상이면 true, 아니면 false 출력
		result = kor >= 50 && eng >= 60 && mat >= 70;
		//result = (kor >= 50) && (eng >= 60) && (mat >= 70);
		System.out.printf("result = %b\n", result); // result = false
		
		// 세과목 중 한 과목이라도 40 미만이라면 true, 모두 40 이상 false 출력
		result = (kor < 40) || (eng < 40) || (mat < 40);
		// 40 미만 = 모두 40이상이 아니라는뜻
		// result = !( (kor >= 40) && (eng >= 40) && (mat >= 40);
		System.out.printf("result = %b\n", result); // result = true
		// 평균 60 이상 모든 과목 40 이상이라면 true, 아니면 false 출력
		result = (avg >= 60) && (kor >= 40) && (eng >= 40) && (mat >= 40); 
		System.out.printf("result = %b\n", result); // result = false
		// 국어점수가 짝수이면 true, 홀수이면 false 출력
		result = (kor % 2) < 1;		
		System.out.printf("result = %b\n", result); // result = false
		
		int re = kor %2;
		result = re == 0;
		System.out.printf("result = %b\n", result); // result = false
		
		// year 변수에 저장된 년도가 윤년이면 true, 평년이면 false 를 출력
		int year = 2020;
		// 윤년의 조건 : 해당 년도가 4의 배수 이면서, 100의 배수가 아니거나, 400의 배수인 해
		int year4, year100, year400;
		year4 = year % 4;
		year100 = year % 100;
		year400 = year % 400;
		result = (year4 == 0) || (year100 != 0) || (year400 == 0);
		System.out.printf("result = %b\n", result);
		
	}

}
