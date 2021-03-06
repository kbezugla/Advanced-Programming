package inheritance;
import java.util.GregorianCalendar;

/**
 * Used to create a driver license with an owner, an ID number, and an expiration year.
 *
 * @author Katya Bezugla
 */

public class DriverLicense extends IDCard{
	
	/**
	 * Represents the license's expiration year.
	 */
	
	private String expire;
	
	/**
	 * Constructs the object, setting the owner's name, and the license's ID number and expiration year.
	 *
	 * @param  n license owner's name.
	 * @param expiration license's expiration year.
	 * @param id license's ID number.
	 */
	
	public DriverLicense(String n, String expiration, String id) {
		super(n, id);
		expire = expiration;
	}
	
	/**
	 * Checks whether the license is expired.
	 *
	 * @return true or false.
	 */
	
	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();
		int current = calendar.get(GregorianCalendar.YEAR);
		int expire = Integer.parseInt(this.expire);
		
		if (expire < current) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Returns a formatted version of the license's information.
	 *
	 * @return  Card holder: card owner's name, ID Number: card's ID number, Expiration Date: license's expiration year.
	 */
	
	public String format() {
		return super.format() + ", Expiration Date: " + expire;
	}
	
	/**
	 * Returns a formatted version of the license's instance fields, including the class name it belongs to.
	 *
	 * @return DriverLicense[name=license's owner's name][idNum=license's ID number][expire=license's expiration year].
	 */
	
	public String toString()
    {
    	return super.toString() + "[expire=" + expire + "]";
    }
	
	/**
	 * Gets the arraylist of cards.
	 *
	 * @return  an arraylist of cards.
	 */
	
	/**
	 * Gets license's expiration year.
	 *
	 * @return  an expiration year.
	 */
	
	public String getExpiration() {
		return expire;
	}
}
