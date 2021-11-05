package learningforjava;
import java.util.ArrayDeque;
import java.util.Scanner;
public class Blackjack {
	public static int playerssum;
	public String a;
	public boolean playerflag = true;
	public boolean dealerflag = true;
	public static void main(String[] args) {
		Scanner i1 = new Scanner(System.in);
		Scanner i3 = new Scanner(System.in);
		Judge i4 = new Judge();
		Blackjack i5 = new Blackjack();
		do {
			System.out.println("ブラックジャックへようこそ！");
			System.out.println("ブラックジャックを始めますか？y/n");
			i5.a = i1.next();
		}while(i5.a.equals("n"));
		System.out.println("山札を作成します");
		
		Card i2 = new Card();
		
		ArrayDeque<String> deck = i2.getDeck();
		limit:
		while(true) {
			
		while(i5.playerflag) {
		System.out.println("プレイヤーのターン");
		System.out.println("カードを引きますか？y/n");
		String a2 = i3.next();
		if(a2.equals("y")) {
			String playerscard = deck.pollFirst();
			System.out.println("引いたのは、" +playerscard);
			Blackjack.playerssum += Judge.judgeCard(playerscard);
			System.out.print("合計:");
			System.out.println(Blackjack.playerssum);
			break;
		}else {
			System.out.println("引かない！");
			i5.playerflag = false;
		}
		}
		while(i5.dealerflag) {
			System.out.println("ディーラーのターン");
			System.out.println("ディーラーがカードを");
			String dealerscard = deck.pollFirst();
			if(i4.dealerJudge(dealerscard)) {
				System.out.print("引いた！");
				System.out.println("引いたのは、" + dealerscard);
				System.out.print("合計:");
				System.out.println(Judge.sum);
				break;
			}else {
				System.out.println("引かない！");
				i5.dealerflag = false;
			}
		}
		if(!i5.dealerflag && !i5.playerflag) {
			break limit;
		}
		}
		if(Blackjack.playerssum <= 21 && Judge.sum <= 21) {
			if (Blackjack.playerssum <= Judge.sum) {
				System.out.print("相手の合計");
				System.out.println(Judge.sum);
				System.out.print("あなたの合計");
				System.out.println(Blackjack.playerssum);
				System.out.println("あなたの負けです...");
			}else if (Blackjack.playerssum>= Judge.sum) {
				System.out.print("あなたの合計");
				System.out.println(Blackjack.playerssum);
				System.out.print("相手の合計");
				System.out.println(Judge.sum);
				System.out.println("あなたの勝ちです！");
			}
			
			
		

		
	}else if(Blackjack.playerssum > 21 || Judge.sum > 21) {
		if(Blackjack.playerssum > 21) {
			System.out.println("バースト！");
			System.out.print("あなたの負けです...");
		}
		if(Judge.sum > 21) {
			System.out.println("バースト！");
			System.out.println("あなたの勝ちです！");
			
		}
		
		i1.close();
		i3.close();
		
		
		
	}
		
		
		
		
		
	}
}	
	

