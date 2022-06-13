import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	ArrayList<Card> cards = new ArrayList<Card>();
	String[] value = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};

    public Deck() {
    	for(int i = 0; i < suit.length; i++) {
    		for(int j = 0; j < value.length; j++) {
    			cards.add(new Card(value[j] + " of " + suit[i], i+2));
    		}
    	}
    }
    
    public void Shuffle () {
    	Collections.shuffle(cards);
    }

    public Card Draw() {
    	Card draw = cards.get(0);
    	cards.remove(0);
    	return draw;
    }
    
    public ArrayList<Card> getDeck(){
    	return cards;
    }
    
    
}
