package days13;

//각각 호출되는 생성자에서 scores 변수에 3개짜리 배열의 주소를 저장하는 명령을 공통으로 넣어주세요
//매개변수가 없는 생성자는 모든 변수값을 임의의 값으로
//매개변수에 이름만 전달되는 생성자는 점수만 임의의 값으로
//이름과 점수가 전달되는 생성자는 전달값으로 변수에 대입해주세요
//prn() 메소드는 멤버변수들의 값을 출력하되 양식은 임의로 설정해주세요
//전달인수가 객체인 경우 새 객체에 각 멤버변수 값을 복사한 객체가 만들어지게 하세요
class Std1{
	private int bun;
	private String name;
	private int[] scores;		
	
	public Std1() {
	}
	
	public Std1(String n, int... s) {
		this.name = n;
		this.scores = s;
		return;
	}
	
	
	public Std1(Std1 temp) {
		this.name = temp.name;
		for (int i = 0; i < scores.length; i++) {
				this.scores[i] = temp.scores[i];
				}
		}

	public void prn(){
		System.out.print(name);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]);
		}
		System.out.println();
	}
}

public class Class007 {

	public static void main(String[] argrs) {
		/**/
		//
		Std1 s1 = new Std1();
		Std1 s2 = new Std1("홍길동");
		Std1 s3 = new Std1("홍길동", 98, 69, 87);
		Std1 s4 = new Std1(s3);
		s1.prn();
		s2.prn();
		s3.prn();
		s4.prn();

	}

}
