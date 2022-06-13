import java.util.ArrayList;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
		
	}
	
	public void describe() {
		System.out.println("Player: " + name + " has these cards in their hand: ");
		for (int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i).describe());
		}
;		
	}
	
	public Card flip(Deck deck) {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
		
	}
	
	public void draw(Deck deck) {
		hand.add(deck.Draw());
	}
	
	public void incrementScore() {
		score += 1;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
