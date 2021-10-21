package days02;

public class Printf03 {

	public static void main(String[] args) {
		// JavaSecond.java 에 출력했던 성적표를 정확한 총점과, 평균을 계산하여 출력하세요.
		// 평균을 출력할때 소수점은 한자리만 출력하세요
		// 국어 영어 수학 점수는 임의 점수를 사용하되, 총점 평균은 정확한 값으로 계산합니다
		// 각 항목은 모두 오른쪽 정렬되게 출력해주세요
		// (같은 과목의 점수가 89점과 100점이라면 두 점수의 소수점을 같은 위치에 맞춰지게 출력해주세요
		//  89
		// 100
		
		System.out.printf("\t\t###성적표###\n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%3s\t%10s\t%3s\t%s\t%s\t%s\t%5s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%5.1f\n", 1, "가나다", 89, 87, 56, (89+87+56), (89+87+56)/3.0);
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%5.1f\n", 1, "라마바", 87, 89, 54, (87+89+54), (87+89+54)/3.0);
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%5.1f\n", 1, "아자차", 56, 58, 58, (56+58+58), (56+58+58)/3.0);
		System.out.printf("-------------------------------------------\n");
	}

}

//
//System.out.printf("\n"); 
//System.out.printf("--------------------------------\n");
//System.out.printf("번호 \t국어\t영어\t수학\t총점\t평균\n");
//System.out.printf("--------------------------------\n");
//System.out.printf("1\t89\t87\t56\t89+87+56\t81.5\n");
//System.out.printf("2\t87\t89\t54\t234\t83.5\n");
//System.out.printf("3\t56\t58\t58\t244\t85.5\n");
//System.out.printf("--------------------------------\n");