package days03;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께 출력하세요
		// 문자를 입력받는 명령 -> sc.nextLine()
		// 입력받을때 반드시 이름부터 입력받으세요 순서 : 이름, 국어, 영어, 수학
		// 평균은 소수점 첫째자리까지 printf, println 자유
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int a, b, c, d;
		double result;
		
		System.out.println("이름 :");
		name = sc.nextLine();
		System.out.println("국어 :");
		a = sc.nextInt();
		System.out.println("영어 :");
		b = sc.nextInt();
		System.out.println("수학 :");
		c = sc.nextInt();
		d = a+b+c;
		result = d / 3.0;
		
		System.out.printf("%s 의 총점은 %d이며, 평균은 %.2f 입니다\n", name , d, result);
		
		// int kor, eng, mat, total;
		// double average;
		// String name;
		
		// Scanner sc = new Scanner(System.in);
		// System.out.print("이름을 입력하세요 : ");
		// name = sc.nextLine();
		// System.out.print("국어 점수를 입력하세요 : ");
		// kor = sc.nextInt();
		// System.out.print("영어 점수를 입력하세요 : ");
		// eng = sc.nextInt();
		// System.out.print("수학 점수를 입력하세요 : ");
		// mat = sc.nextInt();
		// total = kor + eng + mat;
		// average = total / 3.0;
		// System.out.println("\t\t###성적표###");
		// System.out.println("------------------------");
		// System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		// System.out.println("------------------------");
		// System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n", 1, name, kor, eng, mat, total, average);
		// System.out.println("2\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + (int)(average*100)/100.0);
		// System.out.println("------------------------"); 
		
		
	}

}
