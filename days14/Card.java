package days14;

// 카드
public class Card {
	final static int clover = 1;
	final static int heart = 2;
	final static int diamond = 3;
	final static int spade = 4;
	// final : 변수의 값을 변경하지 못하도록 하는 키워드
	
	private int kind; 
	// 1: Clover 2: Heart 3: Diamond 4: Spade
	private int number;
	//

	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){// 디폴트 생성자
		this(spade, 1);
	}
	
	// 호출되면 호출객체의 무늬와 숫자를 String 으로 리턴해주는 멤버메소드
	//kind : 4, number : 13 이라면 문자열 "[Spade:K]"  라고 리턴
	public String toString() {
		String[] kinds = { "", "Clover", "Heart", "Diamond", "Spade" };
		String[] numbers = { "", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String result = "[" + kinds[this.kind] + " : " + numbers[this.number] + "]";
		return result;
	}
	
	// toString 은 다소 좀 특별한 메소드입니다
	// toString 메소드가 포함된 클래스로 만든 객체를 
	//System.out.println( 객체이름( 참조변수 이름 ) ); 으로 출력하면 
	//이전에 봤던 것처럼 패키지.클래스이름@해쉬코드 가 출력되는게 아니라
	// toString 메소드에서 리턴해주는 값이 출력됩니다
	// 이는 System.out.println( 객체이름( 참조변수 이름 ).toString() ); 라고
	// 한것과 같은 출력이 있다는 뜻입니다.
	
	//Card c = new Card(4, 13);
	//System.out.println( c ); -> 출력 : [Spade : K]
	//System.out.println( c.toString() ); -> 출력 : [Spade : K]
	// String result = "카드 1 : " +c;
	//String result = "카드 1 : " +c.toString();
	
	
}

