import java.util.ArrayList;
import java.util.List;

/* AbstractUser and UserDirector is done.
 * Fix UserDecorator - look at slides
 * User purchasing an item goes to payment handler. Requesting goes to admin. Rent item is within this class
 * Finish all methods in User, StudentBuilder, UserBuilder, FacultyBuilder
 * 
 */

public abstract class AbstractUser {
	protected User user;
	public String type;
	protected String email;
	protected String password;
	public boolean rentEligible;
	List<Item> rentedItems = new ArrayList<>();
	List<Newsletter> subscriptions = new ArrayList<>();
	
	public abstract void buildType(String t);
	
	public abstract void buildEmail(String e);	
	
	public abstract void buildPassword(String p);
	
	public abstract void rentItem(Item i);
	
	public abstract void subscribe(Newsletter n);
	
	public abstract void cancel(Newsletter n);
	
	public abstract void requestItem (String s);
	
	public abstract void purchase(Item i);

	public User getUser() {
		return user;
	}
}

