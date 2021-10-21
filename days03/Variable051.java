package days03;

import java.util.Scanner;

public class Variable051 {

	public static void main(String[] args) {
		
		 int kor, eng, mat, total;
		 double average;
		 String name;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("이름을 입력하세요 : ");
		 name = sc.nextLine();
		 System.out.print("국어 점수를 입력하세요 : ");
		 kor = sc.nextInt();
		 System.out.print("영어 점수를 입력하세요 : ");
		 eng = sc.nextInt();
		 System.out.print("수학 점수를 입력하세요 : ");
		 mat = sc.nextInt();
		 total = kor + eng + mat;
		 average = total / 3.0;
		 System.out.println("\t\t###성적표###");
		 System.out.println("------------------------");
		 System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		 System.out.println("------------------------");
		 System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n", 1, name, kor, eng, mat, total, average);
		 System.out.println("2\t" + name + "\t\t" + kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + (int)(average*100)/100.0);
		 System.out.println("------------------------"); 
		
		
	}

}
