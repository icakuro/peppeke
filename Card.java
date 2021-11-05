package learningforjava;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
public class Card {
	enum CardInfo{
		spade("スペード","1","2","3","4","5","6","7","8","9","10","11","12","13"),
		diamond("　ダイヤ","1","2","3","4","5","6","7","8","9","10","11","12","13"),
		heart("　ハート","1","2","3","4","5","6","7","8","9","10","11","12","13"),
		club("　クラブ","1","2","3","4","5","6","7","8","9","10","11","12","13");
		public String Markname;
		public String [] num;
		private CardInfo(String name, String... num) {
			this.Markname = name;
			this.num = num;
			
		}
		public String getMark() {
			
			return this.Markname;
		}
		public String[] getNumber() {
			
			return this.num;
		}
		
	}
	public ArrayDeque<String> getDeck () {
		var deck = new ArrayDeque<String>();
		for(int i = 0; i < 13; i++) {
			deck.addLast(CardInfo.spade.getMark() +"の"+ CardInfo.spade.getNumber()[i]);	
		}
		for(int i = 0; i < 13;  i++) {
			deck.addLast(CardInfo.diamond.getMark() + "の"+CardInfo.diamond.getNumber()[i]);
		}
		for(int i = 0; i < 13;  i++) {
			deck.addLast(CardInfo.heart.getMark() + "の" +CardInfo.heart.getNumber()[i]);
		}
		for(int i = 0; i < 13;  i++) {
			deck.addLast(CardInfo.club.getMark() + "の"+CardInfo.club.getNumber()[i]);
		}
		var deck2 = new ArrayList<String>();
		deck2.addAll(deck);
		Collections.shuffle(deck2);
		var deck3 = new ArrayDeque<String>(52);
		deck3.addAll(deck2);
        
		
		return deck3;
		
	}
	
	

}
