package inheritance;

/**
 * Used to create a card with an owner.
 *
 * @author Katya Bezugla
 */

public class Card {
	
	/**
	 * Represents the card owner's name.
	 */
	
	protected String name; 
	
	/**
	 * Will construct the object, and set the name of the card's owner to john.
	 *
	 */
	
    public Card() 
    { 
        this("john"); //calling the other constructor using 
                      //  the keyword �this� 
    } 
    
	/**
	 * Will construct the object, and set the name of the card's owner to the string given.
	 *
	 * @param  n The name of the person who owns the card.
	 */
    
    public Card(String n) 
    { 
        name = n; 
    } 
    
    /**
	 * Gets the name of the card's owner.
	 *
	 * @return  The name of the person who owns the card.
	 */

    public String getName() 
    { 
        return name; 
    } 
    
    /**
	 * Gets whether the card is expired, which it never is.
	 *
	 * @return  false.
	 */
    
    public boolean isExpired() 
    { 
        return false; 
    } 
    
    /**
	 * Returns a formatted version of the card's information.
	 *
	 * @return  Card holder: card owner's name.
	 */
    
    public String format() 
    { 
        return "Card holder: " + name; 
    }
    
    /**
	 * Returns a formatted version of the card's instance fields, including the class name it belongs to.
	 *
	 * @return Card[name=card owner's name].
	 */
    
    public String toString()
    {
    	return this.getClass().getSimpleName() + "[name=" + name + "]";
    }
    
    /**
	 * Compares whether two cards are equal in classes and aspects - the card the method is called on and the card
	 * which is inputed as a parameter.
	 *
	 * @param  card1 the card to be compared to.
	 * @return true or false.
	 */
    
    public boolean equals(Card card1) {
    	if (this.toString().equals(card1.toString())) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
