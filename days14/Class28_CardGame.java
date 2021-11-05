package days14;

class CardDeck{
	private Card[] cards = new Card[52];
//	cards[0] = new Card(Card.spade, 1);
//	cards[1] = new Card(Card.spade, 2);
//	cards[2] = new Card(Card.spade, 3);
	
	CardDeck() {
		//card[0] = new Card(Card.spade, 1);
		//card[1] = new Card(Card.spade, 2);
		//card[2] = new Card(Card.spade, 3);
		//..
		int i = 0;
		for (int k = 1; k <= 4; k++) { // 카드 문양 1~4반복
			for (int n = 1; n <= 13; n++) { // 카드 번호 1~13 반복
				cards[i] = new Card(k, n); // 카드 장수 i 는 0~51
				i++;
			}
		}
	}
	public Card pick( int i ) {
		return cards[i]; // cards[i] 객체가 리턴
	}
	
	public void shuffle() {
		// n번째 카드와 random 으로 발생한 난수 숫자번째의 카드를 서로 자리 바꿈
		// 이 동작을 0~51의 카드를 대상으로 한번씩, 총 52번 반복
		for (int i = 0; i < 52; i++) {
			int r = (int)(Math.random() * 52);
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
		
	}
}

public class Class28_CardGame {

	public static void main(String[] argrs) {
		/**/
		//
		CardDeck d = new CardDeck();
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%s ", d.pick(i).toString());
//		}
		
		d.shuffle();
		/*
		System.out.printf("%s ", d.pick(0).toString());
		System.out.printf("%s ", d.pick(1));
		System.out.printf("%s ", d.pick(2));
		System.out.printf("%s ", d.pick(3));
		System.out.printf("%s ", d.pick(4));*/
		
		Card[] player1 = new Card[5];
		Card[] player2 = new Card[5];
		Card[] player3 = new Card[5];
		Card[] player4 = new Card[5];
		//카드를 1명당 5장씩 분배하고 한명당 1줄에 보유카드를 출력
		
//		for (int i = 0; i < player1.length; i++) {
//			player1[i] = d.pick(i);
//		}
//		for (int i = player1.length; i < player1.length + player2.length; i++) {
//			player2[i] = d.pick(i);
//		}
//		
//		System.out.println("Player1");
//		for (Card k : player1) {
//			System.out.printf("%s ", k);
//		}
//		System.out.println();
//		System.out.println("Player2");
//		for (Card k : player2) {
//			System.out.printf("%s ", k);
//		}
//		System.out.println();
//		System.out.println("Player3");
//		for (Card k : player3) {
//			System.out.printf("%s ", k);
//		}
//		System.out.println();
//		System.out.println("Player4");
//		for (Card k : player4) {
//			System.out.printf("%s ", k);
//		}
//		System.out.println();
		int k = 0;
		for (int i = 0; i < 5; i++) {
			player1[i] = d.pick(k++);
			player2[i] = d.pick(k++);
			player3[i] = d.pick(k++);
			player4[i] = d.pick(k++);
		}
		for (int i = 0; i < player1.length; i++) {
			System.out.printf("%s ", player1[i]);
		}
		System.out.println();
		for (int i = 0; i < player2.length; i++) {
			System.out.printf("%s ", player2[i]);
		}System.out.println();
		for (int i = 0; i < player3.length; i++) {
			System.out.printf("%s ", player3[i]);
		}System.out.println();
		for (int i = 0; i < player4.length; i++) {
			System.out.printf("%s ", player4[i]);
		}

	}

}
