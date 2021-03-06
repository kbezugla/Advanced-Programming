package inheritance;
import java.util.*;

/**
 * Stores an certain amount of cards.
 *
 * @author Katya Bezugla
 */

public class Billfold {
	
	/**
	 * Represents the cards stored.
	 */
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	/**
	 * Will construct the object, and set the amount of cards one can store as 2.
	 *
	 */
	
	public Billfold() {
		this(2);
	}
	
	/**
	 * Will construct the object, and set the amount of cards one can store as the inputed amount.
	 * @param cardAmount the amount of cards one can store.
	 *
	 */
	
	public Billfold(int cardAmount) {
		for (int i=0;i<cardAmount;i++) {
			cards.add(null);
		}
	}
	
	/**
	 * Adds a card to the first available slot.
	 * @param card the card that will be added.
	 *
	 */
	
	public void addCard(Card card) {
		for (int i=0;i<cards.size();i++) {
			if (cards.get(i) == null) {
				cards.set(i, card);
				break;
			}
		}
	}
	
	/**
	 * Gets the amount of expired cards stored.
	 * @return the amount of expired cards.
	 *
	 */
	
	public int getExpiredCardCount() {
		int amount = 0;
		for (int i=0;i<cards.size();i++) {
			if (cards.get(i).isExpired() == true) {
				amount++;
			}
		}
		return amount;
	}
	
	/**
	 * Returns the formatted version of the information of all the cards stored.
	 *
	 * @return  the formatted version of the cards' information.
	 */

	public String formatCards() {
		String card_str = "";
		for (int i=0;i<cards.size();i++) {
			if (cards.get(i) != null) {
				card_str += cards.get(i).format() + "\n";
			}
		}
		return card_str;
	}
	
	/**
	 * Gets the arraylist of cards.
	 *
	 * @return  an arraylist of cards.
	 */
	
	public ArrayList<Card> getCards() {
		return cards;
	}
}
