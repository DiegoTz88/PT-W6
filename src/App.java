

public class App {
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player("Jim");
		Player player2 = new Player("Rick");
		

		
		deck.Shuffle();
		
		for(int i=0; i<52; i++) {
			if(i %2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}

			
		}
		player1.describe();
		player2.describe();
		
		
		for(int i=0; i<26; i++) {
			
			Card player1Card = player1.flip(deck);
			Card player2Card = player2.flip(deck);
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else {
				player2.incrementScore();
			}
				
			
		}
		
		if (player1.getScore()>player2.getScore()) {
			System.out.println("Winner: " + player1.getName() + " wins with a score of " + player1.getScore() + "\n" + "Loser: " + player2.getName() + " had a score of " + player2.getScore());
		} else if(player2.getScore()>player1.getScore()) {
			System.out.println("Winner: " + player2.getName() + " wins with a score of " + player2.getScore() + "\n" + "Loser: " + player1.getName() + " had a score of " + player1.getScore());
		} else {
			System.out.println("It's a tie, with scores of " + player1.getScore() + " and " + player2.getScore());
		}
		
	}
	
}

