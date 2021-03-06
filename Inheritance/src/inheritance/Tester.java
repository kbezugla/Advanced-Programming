package inheritance;

/**
 * A playground for testing different methods of the card super and subclasses, and the billfold class.
 *
 * @author Katya Bezugla
 */

public class Tester {

	public static void main(String[] args) {
		Billfold billfold = new Billfold();
		Card card1 = new CallingCard("Bob","123","456");
		Card card2 = new DriverLicense("Sue","2000","123456");
		Card card3 = new Card("Mary");
		Card card4 = new IDCard("John","654321");
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		System.out.println(card4.toString());
		
		billfold.addCard(card1);
		billfold.addCard(card2);
		
		System.out.println(billfold.formatCards());
		System.out.println("Amount of expired cards: " + billfold.getExpiredCardCount());

	}

}
