package days23;

public class Card24 {
	
	// final  : 변수의 값을 변경하지 못하도록 하는 키워드.
	
	private int kind;  //4:Spade  3:Diamond  2:Heart  1:Clover
	private int number;
	
	public Card24(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	// toString:호출되면 호출객체의 무늬와 숫자를  String 으로 리턴해주는 멤버매서드
	// kind : 4, number:13 이라면   문자열 "[Spade:K]" 라고 리턴
	public String toString() {
		String[] kinds = {"", "Clover", "Heart", "Diamond", "Spade"};
		String[] numbers = {"" , "A" , "2" , "3" , "4" , "5" , "6" , "7" , "8",
				"9","10", "J","Q","K"};
		String result = "[" + kinds[this.kind] + ":" 
								+ numbers[this.number] + "]";
		return result;
	} 

}
